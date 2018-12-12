package com.sdp.demo.transition_anim.transition_new;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Slide;

import com.sdp.demo.R;

public class NextNewSlideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setEnterTransition(new Slide());

        setContentView(R.layout.activity_next_new_slide);
    }
}
