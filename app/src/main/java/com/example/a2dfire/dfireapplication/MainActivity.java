package com.example.a2dfire.dfireapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.a2dfire.base.SchemaRouter;

public class MainActivity extends AppCompatActivity {
    private Button businessABt;
    private Button businessBBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        businessABt = (Button) findViewById(R.id.businessa_bt);
        businessBBt = (Button) findViewById(R.id.businessb_bt);
        businessABt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SchemaRouter.startActivityWithUri(MainActivity.this, "dfire://danggui:8888/businessaa?name=参数A");
            }
        });
        businessBBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SchemaRouter.startActivityWithUri(MainActivity.this, "dfire://danggui:8888/businessb?name=参数B");
            }
        });
    }
}
