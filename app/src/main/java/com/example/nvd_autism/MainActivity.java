package com.example.nvd_autism;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAssessment(View view) {
        int score = calculateScore();
        displayResult(score);
    }

    private int calculateScore() {
        int score = 0;
        CheckBox response1_1 = findViewById(R.id.response1_1);
        CheckBox response1_2 = findViewById(R.id.response1_2);
        CheckBox response1_3 = findViewById(R.id.response1_3);
        CheckBox response1_4 = findViewById(R.id.response1_4);
        CheckBox response2_1 = findViewById(R.id.response2_1);
        CheckBox response2_2 = findViewById(R.id.response2_2);
        CheckBox response2_3 = findViewById(R.id.response2_3);
        CheckBox response3_1 = findViewById(R.id.response3_1);
        CheckBox response3_2 = findViewById(R.id.response3_2);
        CheckBox response3_3 = findViewById(R.id.response3_3);
        CheckBox response3_4 = findViewById(R.id.response3_4);
        CheckBox response4_1 = findViewById(R.id.response4_1);
        CheckBox response4_2 = findViewById(R.id.response4_2);
        CheckBox response5_1 = findViewById(R.id.response5_1);
        CheckBox response5_2 = findViewById(R.id.response5_2);

        if (response1_1.isChecked()) {
            score += 1;
        }
        if (response1_2.isChecked()) {
            score += 1;
        }
        if (response1_3.isChecked()) {
            score += 1;
        }
        if (response1_4.isChecked()) {
            score += 1;
        }
        if (response2_1.isChecked()) {
            score += 1;
        }
        if (response2_2.isChecked()) {
            score += 1;
        }
        if (response2_3.isChecked()) {
            score += 1;
        }
        if (response3_1.isChecked()) {
            score += 1;
        }
        if (response3_2.isChecked()) {
            score += 1;
        }
        if (response3_3.isChecked()) {
            score += 1;
        }
        if (response3_4.isChecked()) {
            score += 1;
        }
        if (response4_1.isChecked()) {
            score += 1;
        }
        if (response4_2.isChecked()) {
            score += 1;
        }
        if (response5_1.isChecked()) {
            score += 1;
        }
        if (response5_2.isChecked()) {
            score += 1;
        }

        return score;
    }

    private void displayResult(int score) {
        String message;
        if (score >= 10) {
            message = "High Likelihood of Autism. Please consult a specialist";
        }
        else if (score >= 5) {
            message = "Moderate Likelihood of Autism. Consider seeking professional advice";
        }
        else {
            message = "Low Likelihood of Autism, keep monitoring development";
        }

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}