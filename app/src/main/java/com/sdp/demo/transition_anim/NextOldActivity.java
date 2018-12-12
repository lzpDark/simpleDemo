package com.sdp.demo.transition_anim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sdp.demo.R;

public class NextOldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_old);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.transition_in, R.anim.transition_in);
    }
}
