package com.sdp.demo.transition_anim;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.widget.Button;

import com.sdp.demo.R;
import com.sdp.demo.transition_anim.transition_new.NextNewExplodeActivity;
import com.sdp.demo.transition_anim.transition_new.NextNewFadeActivity;
import com.sdp.demo.transition_anim.transition_new.NextNewShareActivity;
import com.sdp.demo.transition_anim.transition_new.NextNewSlideActivity;

public class MainTransitionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_transition);

        Button oldBtn = findViewById(R.id.transition_old);
        oldBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, NextOldActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.transition_in, R.anim.transition_out);
        });

        showNewMethodOfTransition();

    }

    private void showNewMethodOfTransition() {

        Button explodeBtn = findViewById(R.id.transition_new_explode);
        explodeBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, NextNewExplodeActivity.class);
            startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
        });

        Button slideBtn = findViewById(R.id.transition_new_slide);
        slideBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, NextNewSlideActivity.class);
            startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
        });

        Button fadeBtn = findViewById(R.id.transition_new_fade);
        fadeBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, NextNewFadeActivity.class);
            startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
        });

        Button shareBtn = findViewById(R.id.transition_new_share);
        shareBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, NextNewShareActivity.class);
            startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this,
                    Pair.create(explodeBtn, "explode"),
                    Pair.create(slideBtn, "slide"),
                    Pair.create(fadeBtn, "fade"),
                    Pair.create(shareBtn, "share")).toBundle());
        });
    }
}
