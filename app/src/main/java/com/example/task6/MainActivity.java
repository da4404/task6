package com.example.task6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button button;
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.albert1);
        button = findViewById(R.id.button);
        random = new Random ();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                int randomNumber = random.nextInt(3) + 1;
                button.setText(String.valueOf(randomNumber));
                imageView.setImageResource(R.drawable.albert);
                switch (randomNumber) {
                    case 1:
                        imageView.setImageResource(R.drawable.albert);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.haha);
                        break;
                    case 3:
                        imageView.setImageResource(R.drawable.mini);
                        break;
                }
            }
        });
    }
}

