package com.sdp.demo.companent_anim.property.object;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.sdp.demo.R;

import java.sql.BatchUpdateException;

/**
 * url : https://www.jianshu.com/p/2412d00a0ce4
 *          https://www.jianshu.com/p/48554844a2db?utm_source=desktop&utm_medium=timeline
 *
 */

public class MainObjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_object);

        ImageView demoIv = findViewById(R.id.object_iv);

        Button codeBtn = findViewById(R.id.object_code);
        codeBtn.setOnClickListener(v -> {
            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(demoIv, "rotation", 0, 180, 0);
            objectAnimator.setDuration(2000);
            objectAnimator.start();
        });

        Button codesBtn = findViewById(R.id.object_codes);
        codesBtn.setOnClickListener(v -> {
            ObjectAnimator animator1 = ObjectAnimator.ofFloat(demoIv, "rotationX", 0, 360);
            ObjectAnimator animator2 = ObjectAnimator.ofFloat(demoIv, "alpha", 1, 0, 1);
            ObjectAnimator animator3 = ObjectAnimator.ofFloat(demoIv, "scaleX", 1, 3, 1);
            ObjectAnimator animator4 = ObjectAnimator.ofFloat(demoIv, "scaleY", 1, 3, 1);
//            animator3.setDuration(2000);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(3000);
            animatorSet.play(animator3).with(animator4).before(animator2).after(animator1);
            animatorSet.start();
        });

        Button xmlBtn = findViewById(R.id.object_xml);
        xmlBtn.setOnClickListener(v -> {
            Animator animator = AnimatorInflater.loadAnimator(this, R.animator.object_rotate);
            animator.setTarget(demoIv);
            animator.start();
        });

        Button xmlsBtn = findViewById(R.id.object_xmls);
        xmlsBtn.setOnClickListener(v -> {
            AnimatorSet animatorSet = (AnimatorSet)AnimatorInflater.loadAnimator(this, R.animator.object_animator_set);
            animatorSet.setTarget(demoIv);
            animatorSet.start();
        });
    }
}
