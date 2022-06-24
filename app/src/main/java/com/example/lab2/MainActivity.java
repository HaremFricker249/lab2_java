package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnTask1 = findViewById(R.id.button);
        Button btnGoToTask2 = findViewById(R.id.button2);
        btnTask1.setOnClickListener(this);
    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View view) {
//НЕ ЗАБЫТЬ ОБНУЛИТЬ МАССИВ(?)
        int negative = 0;
        int positive = 0;
        int product3 = 1;
        int positive2 = 0;
        String x = ((EditText) findViewById(R.id.editText)).getText().toString();
        String[] numberStrs = x.split(",");
        int[] numbers = new int[numberStrs.length];
        int[] numbers2 = new int[numberStrs.length];
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = Integer.parseInt(numberStrs[i]);
            numbers2[i] = Integer.parseInt(numberStrs[i]);
            //Log.d("ADebugTag", "Value: " + Float.toString(numbers[i]));
            if (numbers[i] > 0) {
                positive++;
            } else {
                negative++;
            }
            ((TextView) findViewById(R.id.textView3)).setText((positive + " " + negative));

            if (numbers[i] % 2 != 0 && numbers[i] % 3 == 0) {
                product3 *= numbers[i];
                ((TextView) findViewById(R.id.textView4)).setText(product3 + "");
            }

            if (numbers[i] > 0 && numbers[i] % 3 == 0)
            {
                positive2++;
                if (positive2 == 4) {
                    ((TextView) findViewById(R.id.textView2)).setText(numbers[i] + "");
                } else {
                    ((TextView) findViewById(R.id.textView2)).setText("Такого элемента нет");
                }
            }
        }

        for (int j = numbers.length-1; j >= 0; j--)
            {
               if(numbers[j] > 0 && numbers[j] % 2 != 0)
               {
                   numbers[j] = 0;
                   ((TextView) findViewById(R.id.textView5)).setText(Arrays.toString(numbers));
                   break;
               }
            }

        int max = numbers2[0], min = numbers2[0], maxIndex = 0, minIndex = 0;
            for(int index = 1; index < numbers2.length; index++)
            {
                if (numbers2[index] > max)
                {
                max = numbers2[index];
                maxIndex = index;
                }
            if (numbers2[index]<min)
            {
                min = numbers2[index];
                minIndex = index;
            }
        }
        numbers2[maxIndex] = min;
        numbers2[minIndex] = max;
        ((TextView) findViewById(R.id.textView6)).setText(Arrays.toString(numbers2));
    }

    public void goToTask2Activity(View view)
    {
    Intent i = new Intent(this, Task2.class);
    startActivity(i);
    }



}