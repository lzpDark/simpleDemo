package com.sdp.demo.companent_anim.property.viewPropertyAnimator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.sdp.demo.R;

public class MainViewPropertyAnimatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_view_property_animator);

        ImageView imageView = findViewById(R.id.viewPropertyAnimator_iv);
        imageView.animate()
                .rotationXBy(180).rotationYBy(180)
                .translationXBy(300).translationYBy(300)
                .alpha(0.5f)
                .scaleX(2).scaleY(2)
                .setDuration(2000)
                .withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        imageView.animate()
                                .rotationXBy(-180).rotationYBy(-180)
                                .translationXBy(-300).translationYBy(-300)
                                .alpha(1f)
                                .scaleX(1).scaleY(1)
                                .setDuration(2000)
                                .start();
                    }
                })
                .start();
    }
}
