package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText heightTextView;
    private EditText weightTextView;
    private Button calculate_button;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, StartActivity.class);
        startActivity(intent);
        finish();

        heightTextView = (EditText) findViewById(R.id.heightText);
        weightTextView = (EditText) findViewById(R.id.weightText);
        calculate_button = findViewById(R.id.calculateBMIButton);
        result = (TextView) findViewById(R.id.resultBMI);

        calculate_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float height = Float.parseFloat(heightTextView.getText().toString());
                float weight = Float.parseFloat(weightTextView.getText().toString());


                Float BMI = weight / (height * height) *10000;

                String formattedBMI = String.format("%.1f", BMI);

                result.setText(formattedBMI);

            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
