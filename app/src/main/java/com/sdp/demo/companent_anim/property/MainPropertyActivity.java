package com.sdp.demo.companent_anim.property;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sdp.demo.R;
import com.sdp.demo.companent_anim.property.object.MainObjectActivity;
import com.sdp.demo.companent_anim.property.value.MainValueActivity;
import com.sdp.demo.companent_anim.property.viewPropertyAnimator.MainViewPropertyAnimatorActivity;

public class MainPropertyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_property);

        findViewById(R.id.property_value).setOnClickListener(v -> {
            Intent intent = new Intent(this, MainValueActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.property_object).setOnClickListener(v -> {
            Intent intent = new Intent(this, MainObjectActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.property_google).setOnClickListener(v -> {
            Intent intent = new Intent(this, MainViewPropertyAnimatorActivity.class);
            startActivity(intent);
        });

    }
}
