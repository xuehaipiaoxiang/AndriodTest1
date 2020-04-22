package com.example.mybmi_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    TextView showName, showBMI;
    String name;
    Float bmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initMyCpnt();
        controller();
    }

    private void initMyCpnt() {
        showName = findViewById(R.id.idShowName);
        showBMI = findViewById(R.id.idShowBMI);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        name = bundle.getString("name");
        bmi = bundle.getFloat("bmi");
    }
    private void controller(){
        showName.setText(this.getString(R.string.asatci)+": "+name);
        showBMI.setText(this.getString(R.string.asatci)+": "+String.format(" your BMI is %3.1f",bmi));
    }
}
