package com.sdp.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.sdp.demo.companent_anim.MainCompanentActivity;
import com.sdp.demo.transition_anim.MainTransitionActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button companentBtn = findViewById(R.id.companent);
        companentBtn.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this, MainCompanentActivity.class);
            startActivity(intent);
        });

        Button transitionBtn = findViewById(R.id.transition);
        transitionBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainTransitionActivity.class);
            startActivity(intent);
        });
    }
}
