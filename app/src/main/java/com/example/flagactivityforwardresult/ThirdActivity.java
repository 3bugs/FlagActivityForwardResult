package com.example.flagactivityforwardresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        findViewById(R.id.finish_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // กำหนด result ที่จะส่งกลับไปให้ A
                Intent intent = new Intent();
                intent.putExtra("RESULT", "This is a result from C.");
                setResult(RESULT_OK, intent);
                // finish C
                finish();
            }
        });
    }
}
