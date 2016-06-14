package com.example.laado.activity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.laado.R;
import com.example.laado.fragment.ContactUsFragment;
import com.example.laado.fragment.FragmentDrawer;
import com.example.laado.fragment.HolidaysFragment;
import com.example.laado.fragment.LibraryFragment;
import com.example.laado.fragment.MyClassFragment;
import com.example.laado.fragment.HomeFragment;
import com.example.laado.fragment.MySubjectsFragment;
import com.example.laado.fragment.TimetableFragment;
import com.example.laado.utils.SharedPreferenceManager;

public class MainActivity extends AppCompatActivity implements FragmentDrawer.FragmentDrawerListener {

    private static String TAG = MainActivity.class.getSimpleName();

    private Toolbar mToolbar;
    private FragmentDrawer drawerFragment;
    public Dialog dialog;
    public Button Yes, No;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        drawerFragment = (FragmentDrawer)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), mToolbar);
        drawerFragment.setDrawerListener(this);

        // display the first navigation drawer view on app launch
        displayView(0);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        if(id == R.id.action_search){
            Toast.makeText(getApplicationContext(), "Search action is selected!", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onDrawerItemSelected(View view, int position) {
        displayView(position);
    }

    private void displayView(int position) {
        Fragment fragment = null;
        String title = getString(R.string.app_name);
        switch (position) {
            case 0:
                fragment = new HomeFragment();
                title = getString(R.string.title_home);
                break;
            case 1:
                fragment = new MySubjectsFragment();
                title = getString(R.string.title_my_subject);
                break;
            case 2:
                fragment = new MyClassFragment();
                title = getString(R.string.title_my_class);
                break;
            case 3:
                fragment = new TimetableFragment();
                title = getString(R.string.title_timetable);
                break;
            case 4:
                fragment = new HolidaysFragment();
                title = getString(R.string.title_material);
                break;
            case 5:
                fragment = new LibraryFragment();
                title = getString(R.string.title_library);
                break;
            case 6:
                fragment = new ContactUsFragment();
                title = getString(R.string.title_contactus);
                break;
            case 7:
                title = getString(R.string.title_louout);

                dialog = new Dialog(MainActivity.this, R.style.PauseDialog);
                dialog.setContentView(R.layout.custom_dialog);
                dialog.setTitle("Log out");

                // set the custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.textDialog);
                text.setText("ARE YOU SURE WANT TO LOG OUT?");
                // ImageView image = (ImageView)
                // dialog.findViewById(R.id.imageDialog);
                // image.setImageResource(R.drawable.image0);
                dialog.show();

                Yes = (Button) dialog.findViewById(R.id.btn_dialog_Yes);
                // if button is clicked, close the custom dialog
                Yes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        try {
                            LoginActivity.settings.edit().clear().commit();
                            SharedPreferenceManager.ClearAllPreferences(getApplicationContext());
                            Intent intent = new Intent(getApplicationContext(),
                                    LoginActivity.class);
                            // Here we start the next activity, and then call finish()
                            // so that our own will stop running and be removed from the
                            // history stack
                            // set the new task and clear flags
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);

//                        finish();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });

                No = (Button) dialog.findViewById(R.id.btn_dialog_no);
                // if button is clicked, close the custom dialog
                No.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                break;
            default:
                break;
        }

        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_body, fragment);
            fragmentTransaction.commit();

            // set the toolbar title
            getSupportActionBar().setTitle(title);
        }
    }
}