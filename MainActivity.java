package com.example.application4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=new Toast(getApplicationContext());

                // set View
                LayoutInflater layoutInflater=LayoutInflater.from(MainActivity.this);
                View view=layoutInflater.inflate(R.layout.toast_view,null);

                //set details
                ImageView imageView=view.findViewById(R.id.imageView);
                TextView textView=view.findViewById(R.id.textView);
                imageView.setImageResource(R.drawable.z5);
                textView.setText("hello ");

                toast.setView(view);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.show();

            }
        });

    }


}
