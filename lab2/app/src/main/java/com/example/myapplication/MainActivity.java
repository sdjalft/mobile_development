package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button toast, zero, count;
    TextView numberShower;
    Integer cur_num;
    Context that = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cur_num = 0;
        setContentView(R.layout.activity_main);
        toast = (Button)findViewById(R.id.button3);
        zero = (Button)findViewById(R.id.button2);
        count = (Button)findViewById(R.id.button);
        numberShower = (TextView) findViewById(R.id.textView);
        numberShower.setText(cur_num.toString());
        numberShower.setBackgroundColor(Color.CYAN);
        setState();
    }

    public void toastOnClick(View v) {
        Toast.makeText(that, "Hello Toast!", Toast.LENGTH_SHORT).show();
    }

    public void zeroOnClick(View v) {
        cur_num = 0;
        setState();
    }

    public void countOnClick(View v) {
        cur_num++;
        setState();
    }

    void setState() {
        numberShower.setText(cur_num.toString());
        if (cur_num == 0) {
            zero.setBackgroundColor(Color.GRAY);
        } else {
            zero.setBackgroundColor(Color.RED);
        }
        if (cur_num % 2 == 0) {
            count.setBackgroundColor(Color.BLUE);
        } else {
            count.setBackgroundColor(Color.MAGENTA);
        }
    }
}