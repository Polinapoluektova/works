package com.example.myapplicationclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counter = 0;
    int count = 1;
    Button next_coffee;

    TextView countCoffee;
    int maximum = 4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView myImageView = (ImageView) findViewById(R.id.imageView);
        myImageView.setImageResource(R.drawable.android_background);

        next_coffee = (Button) findViewById(R.id.next_coffee);
        countCoffee = (TextView) findViewById(R.id.countCoffee);
        Next_coffee();


    }

    void Next_coffee() {
        next_coffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter += count;
                countCoffee.setText(counter + "");

                if (counter >= maximum) {
                    countCoffee.setText("много вредно");
                }
            }
        });
    }


}
