package com.sdp.demo.companent_anim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.sdp.demo.R;
import com.sdp.demo.companent_anim.property.MainPropertyActivity;
import com.sdp.demo.companent_anim.tween.MainTweenActivity;

public class MainCompanentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_companent);

        Button tweenBtn = findViewById(R.id.comp_tween);
        tweenBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainTweenActivity.class);
            startActivity(intent);
        });

        Button propertyBtn = findViewById(R.id.comp_property);
        propertyBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainPropertyActivity.class);
            startActivity(intent);
        });
    }
}
