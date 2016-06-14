package com.example.laado.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import com.example.laado.R;

public class HomeFragment extends Fragment {

    TextView notice1, notice2, notice3;
    View rootView;
    ImageView slide_images;
    // Timer timer;
    // TimerTask task;
    public int currentimageindex = 0;
    Handler mHandler = new Handler();
    Runnable mUpdateResults;

    private int[] IMAGE_IDS = {R.drawable.slide_one, R.drawable.slide_two,
            R.drawable.slide_three, R.drawable.slide_four, R.drawable.slide_five};

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_home, container, false);

        loadui();

        int delay = 1000; // delay for 1 sec.

        int period = 2000; // repeat every 4 sec.
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                mHandler.post(mUpdateResults);
            }
        }, delay, period);

        mUpdateResults = new Runnable() {
            @Override
            public void run() {

                try {
                    AnimateandSlideShow();
                } catch (Exception e) {

                    e.printStackTrace();
                }

            }

        };


        // Inflate the layout for this fragment
        return rootView;
    }

    private void loadui() {
        notice1 = (TextView) rootView.findViewById(R.id.notice1);
        notice1.setSelected(true);
        notice2 = (TextView) rootView.findViewById(R.id.notice2);
        notice2.setSelected(true);
        notice3 = (TextView) rootView.findViewById(R.id.notice3);
        notice3.setSelected(true);
        slide_images = (ImageView) rootView.findViewById(R.id.slide_images);

    }

    protected void AnimateandSlideShow() {

        try {
            slide_images.setImageResource(IMAGE_IDS[currentimageindex
                    % IMAGE_IDS.length]);

            currentimageindex++;
            Animation rotateimage = AnimationUtils.loadAnimation(getActivity()
                    .getBaseContext().getApplicationContext(), R.anim.fade);
            slide_images.startAnimation(rotateimage);
        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
