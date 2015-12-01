package com.almightyamir.assignment4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layoutMain = new LinearLayout(this);
        layoutMain.setOrientation(LinearLayout.VERTICAL);
        layoutMain.setGravity(Gravity.CENTER);

        Button btn1 = new Button(this);
        btn1.setWidth(10);
        btn1.setGravity(Gravity.CENTER);
        btn1.setText("Click here to Enter");
        layoutMain.addView(btn1);

        btn1.setOnClickListener(enterListener);

        setContentView(layoutMain);
    }

    private View.OnClickListener enterListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            Intent intent = new Intent(MainActivity.this, WorkingActivity.class);
            startActivity(intent);
        }
    };

    }
