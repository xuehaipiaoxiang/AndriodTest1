package com.example.application4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

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
//                Toast toast=new Toast(MainActivity.this);
//
//                // set View
//                LayoutInflater layoutInflater=LayoutInflater.from(MainActivity.this);
//                View view=layoutInflater.inflate(R.layout.toast_view,null);
//
//                //set details
//                ImageView imageView=view.findViewById(R.id.imageView);
//                TextView textView=view.findViewById(R.id.textView);
//                imageView.setImageResource(R.drawable.z5);
//                textView.setText("hello ");
//
//                toast.setView(view);
//                toast.setGravity(Gravity.CENTER,0,0);
//                toast.setDuration(Toast.LENGTH_SHORT);
//                toast.show();
//            ToastUtil.showMsg(MainActivity.this,"hello");


//                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//                builder.setTitle("Tiltle").setMessage("Main Message").setPositiveButton("ok", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        ToastUtil.showMsg(MainActivity.this,"ok");
//                    }
//                }).show();

                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                final View view=LayoutInflater.from(MainActivity.this).inflate(R.layout.alert_view,null);
                Button button2=view.findViewById(R.id.button2);
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView textView =view.findViewById(R.id.editText);
                        String str =textView.getText().toString();
                        Log.e(str,str);
                    }
                });
                builder.setView(view);
                builder.setTitle("Cus");
                builder.show();
                //builder.setPositiveButton("")

            }
        });

    }


}
