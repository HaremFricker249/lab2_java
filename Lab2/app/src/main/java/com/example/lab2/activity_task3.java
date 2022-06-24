package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;

public class activity_task3 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Button btnTask3 = findViewById(R.id.button5);
        setContentView(R.layout.activity_task3);
    }

        @SuppressLint("SetTextI18n")
        public void onClick3(View view)
        {
            String temp = "";
            int[][] arr3 = new int[4][4];
            Random rand = new Random();
            for (int j = 0; j < 4; j++)
            {
                for(int i=0; i<4; i++)
                {
                    arr3[i][j] = rand.nextInt(21) - 10;
                    if(arr3[i][j] < 0 && arr3[i][j] % 5 == 0)
                    {
                        //Log.d("ADebugTag", "Value: " + Float.toString(arr3[i][j]));
                        temp+=j+" ";
                        ((TextView) findViewById(R.id.textView46)).setText("Столбец в массиве имеющий отрицательное число кратное 5: " + temp + " ");
                    }
                }
            }
            ((TextView) findViewById(R.id.textView30)).setText(arr3[0][0]+ "");
            ((TextView) findViewById(R.id.textView31)).setText(arr3[0][1]+ "");
            ((TextView) findViewById(R.id.textView32)).setText(arr3[0][2]+ "");
            ((TextView) findViewById(R.id.textView33)).setText(arr3[0][3]+ "");
            ((TextView) findViewById(R.id.textView34)).setText(arr3[1][0]+ "");
            ((TextView) findViewById(R.id.textView35)).setText(arr3[1][1]+ "");
            ((TextView) findViewById(R.id.textView36)).setText(arr3[1][2]+ "");
            ((TextView) findViewById(R.id.textView37)).setText(arr3[1][3]+ "");
            ((TextView) findViewById(R.id.textView38)).setText(arr3[2][0]+ "");
            ((TextView) findViewById(R.id.textView39)).setText(arr3[2][1]+ "");
            ((TextView) findViewById(R.id.textView40)).setText(arr3[2][2]+ "");
            ((TextView) findViewById(R.id.textView41)).setText(arr3[2][3]+ "");
            ((TextView) findViewById(R.id.textView42)).setText(arr3[3][0]+ "");
            ((TextView) findViewById(R.id.textView43)).setText(arr3[3][1]+ "");
            ((TextView) findViewById(R.id.textView44)).setText(arr3[3][2]+ "");
            ((TextView) findViewById(R.id.textView45)).setText(arr3[3][3]+ "");
        }
}