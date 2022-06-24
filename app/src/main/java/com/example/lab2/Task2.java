package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;

public class Task2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button btnTask2 = findViewById(R.id.button3);
        setContentView(R.layout.activity_task2);
    }

    @SuppressLint("SetTextI18n")
    public void onClick2(View view)
    {
        int[][] arr = new int[4][5];

        Random rand = new Random();
        int ceiling = 100;
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                arr[i][j] = rand.nextInt(ceiling);

            }

        }
        int[] arrB = new int[5];
        for (int j = 0; j < 5; j++)
        {
            int k = 0;
            for (int i = 0; i < 4; i++)
            {
                if (arr[i][j] > 10 && arr[i][j] < 100)
                {
                    k++;
                }
            }
            arrB[j] = k;
            ((TextView) findViewById(R.id.textView28)).setText(arrB[0] + " " + arrB[1]+ " " + arrB[2]+ " " + arrB[3]+ " " + arrB[4]);
            //Log.d("ADebugTag", "Value: " + Float.toString(k));
        }
        ((TextView) findViewById(R.id.textView8)).setText(arr[0][0]+ "");
        ((TextView) findViewById(R.id.textView9)).setText(arr[0][1]+ "");
        ((TextView) findViewById(R.id.textView10)).setText(arr[0][2]+ "");
        ((TextView) findViewById(R.id.textView11)).setText(arr[0][3]+ "");
        ((TextView) findViewById(R.id.textView12)).setText(arr[0][4]+ "");
        ((TextView) findViewById(R.id.textView13)).setText(arr[1][0]+ "");
        ((TextView) findViewById(R.id.textView14)).setText(arr[1][1]+ "");
        ((TextView) findViewById(R.id.textView15)).setText(arr[1][2]+ "");
        ((TextView) findViewById(R.id.textView16)).setText(arr[1][3]+ "");
        ((TextView) findViewById(R.id.textView17)).setText(arr[1][4]+ "");
        ((TextView) findViewById(R.id.textView18)).setText(arr[2][0]+ "");
        ((TextView) findViewById(R.id.textView19)).setText(arr[2][1]+ "");
        ((TextView) findViewById(R.id.textView21)).setText(arr[2][2]+ "");
        ((TextView) findViewById(R.id.textView20)).setText(arr[2][3]+ "");
        ((TextView) findViewById(R.id.textView22)).setText(arr[2][4]+ "");
        ((TextView) findViewById(R.id.textView23)).setText(arr[3][0]+ "");
        ((TextView) findViewById(R.id.textView24)).setText(arr[3][1]+ "");
        ((TextView) findViewById(R.id.textView26)).setText(arr[3][2]+ "");
        ((TextView) findViewById(R.id.textView25)).setText(arr[3][3]+ "");
        ((TextView) findViewById(R.id.textView27)).setText(arr[3][4]+ "");

    }
    public void goToTask3Activity(View view)
    {
        Intent i = new Intent(this, activity_task3.class);
        startActivity(i);
    }
}