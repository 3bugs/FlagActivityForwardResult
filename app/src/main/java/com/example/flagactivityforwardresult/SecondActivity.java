package com.example.flagactivityforwardresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        findViewById(R.id.next_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // start C
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_FORWARD_RESULT); // *อย่าลืมกำหนด flag นี้
                startActivity(intent);
                // finish B
                finish();
            }
        });
    }
}
