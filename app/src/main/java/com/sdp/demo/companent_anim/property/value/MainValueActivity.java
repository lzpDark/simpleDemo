package com.sdp.demo.companent_anim.property.value;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;

import com.sdp.demo.R;

public class MainValueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_value);

        ImageView demoIv = findViewById(R.id.value_iv);

        Button codeBtn = findViewById(R.id.value_code);
        codeBtn.setOnClickListener(v -> {
            ValueAnimator valueAnimator = ValueAnimator.ofFloat(0, 360);
            valueAnimator.setDuration(2000);
            valueAnimator.setRepeatMode(ValueAnimator.REVERSE);
            valueAnimator.setRepeatCount(1);
            valueAnimator.setInterpolator(new AccelerateInterpolator());
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator animation) {
                    float value = (float)animation.getAnimatedValue();
                    demoIv.setRotationX(value);
                    demoIv.setRotationY(value);
                }
            });
            valueAnimator.start();
        });


        Button xmlBtn = findViewById(R.id.value_xml);
        xmlBtn.setOnClickListener(v -> {
            ValueAnimator valueAnimator = (ValueAnimator)AnimatorInflater.loadAnimator(this, R.animator.value_animator);
            valueAnimator.setTarget(demoIv);
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator animation) {
                    float value = (float)animation.getAnimatedValue();
                    demoIv.setRotationX(value);
                    demoIv.setTranslationX(value);
                }
            });
            valueAnimator.start();
        });
    }
}
