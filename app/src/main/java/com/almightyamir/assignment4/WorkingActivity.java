package com.almightyamir.assignment4;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WorkingActivity extends Activity implements View.OnClickListener {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layoutMain = new LinearLayout(this);
        layoutMain.setOrientation(LinearLayout.VERTICAL);
        layoutMain.setBackgroundColor(Color.CYAN);

        LinearLayout layoutTitle = new LinearLayout(this);
        layoutTitle.setOrientation(LinearLayout.VERTICAL);
        layoutTitle.setGravity(Gravity.TOP);
        layoutMain.addView(layoutTitle);

        TextView heading = new TextView(this);
        heading.setText("DETECTING INPUT EVENTS \n (Click Or Long Press)");
        heading.setHeight(100);
        heading.setGravity(Gravity.TOP | Gravity.CENTER);
        heading.setBackgroundColor(Color.YELLOW);
        heading.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25);
        heading.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);
        layoutTitle.addView(heading);

        LinearLayout layoutBody = new LinearLayout(this);
        layoutBody.setOrientation(LinearLayout.VERTICAL);
        layoutBody.setGravity(Gravity.CENTER_HORIZONTAL);
        layoutMain.addView(layoutBody);

        Button btn1 = new Button(this);
        btn1.setWidth(10);
        btn1.setGravity(Gravity.CENTER);
        btn1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25);
        btn1.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);
        btn1.setText("Click Me With Any Style");
        layoutBody.addView(btn1);

        btn1.setOnClickListener(this);
        btn1.setOnLongClickListener(new View.OnLongClickListener(){
            public boolean onLongClick(View v) {
                result.setText("You long pressed the button !!");
                return true;
            }
        });

        result = new TextView(this);
        result.setHeight(200);
        result.setGravity(Gravity.CENTER);
        result.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        result.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);
        layoutBody.addView(result);

        setContentView(layoutMain);

    }

    @Override
    public void onClick(View v) {

        result.setText("You clicked the button !!");

    }
}
