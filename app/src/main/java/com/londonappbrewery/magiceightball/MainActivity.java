package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Integer> ballArray = new ArrayList<>(Arrays.asList(
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5 )
        );

        ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);

        Button myButton = (Button) findViewById(R.id.askButton);

        myButton.setOnClickListener(v-> {
            Log.d("Ask Button", "clicked.");
            Random randomNumberGenerator = new Random();
            int number = randomNumberGenerator.nextInt(5);
            Log.d("Ball number:", String.valueOf(number));
            ballDisplay.setImageResource(ballArray.get(new Integer(number)));

        });

    }
}
