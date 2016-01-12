package com.schibsted.introducingandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View image = findViewById(R.id.iv_example);
        final Button button = (Button) findViewById(R.id.bt_example);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = getString(R.string.you_tapped_me);
                button.setText(text);

                if (image.getVisibility() == View.VISIBLE) {
                    image.setVisibility(View.INVISIBLE);
                    image.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.fade_out));
                } else {
                    image.setVisibility(View.VISIBLE);
                    image.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.fade_in));
                }
            }
        });
    }
}
