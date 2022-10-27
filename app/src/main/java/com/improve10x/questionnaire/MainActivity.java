package com.improve10x.questionnaire;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submitBtn = findViewById(R.id.submit_btn);
        submitBtn.setOnClickListener(v -> {
            // 1. Create objects for each radio button and call isChecked
            RadioButton maleRb = findViewById(R.id.male_rb);
            if(maleRb.isChecked()) {
                Toast.makeText(this, "Male", Toast.LENGTH_SHORT).show();
            }

            RadioButton femaleRb = findViewById(R.id.female_rb);
            if(femaleRb.isChecked()) {
                Toast.makeText(this, "Female", Toast.LENGTH_SHORT).show();
            }

            // 2. Using Radio Group and get selected radio button id
            RadioGroup genderRg = findViewById(R.id.gender_rg);
            int selectedButtonId = genderRg.getCheckedRadioButtonId();
            if(selectedButtonId == R.id.male_rb) {
                Toast.makeText(this, "Male", Toast.LENGTH_SHORT).show();
            } else if(selectedButtonId == R.id.female_rb) {
                Toast.makeText(this, "Female", Toast.LENGTH_SHORT).show();
            }
        });
    }
}