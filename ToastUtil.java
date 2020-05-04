package com.example.application4;


import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ToastUtil {
    private static Toast toast;
    //private static Context context;
    private static View view;
    public static void showMsg(Context context,String string){

        if (view==null){
            // set View
            LayoutInflater layoutInflater=LayoutInflater.from(context);
            view=layoutInflater.inflate(R.layout.toast_view,null);
        }


        if(toast==null){
            toast=new Toast(context);

            //set details
            ImageView imageView=view.findViewById(R.id.imageView);
            TextView textView=view.findViewById(R.id.textView);
            imageView.setImageResource(R.drawable.z5);
            textView.setText(string);
        }else {
            TextView textView=view.findViewById(R.id.textView);
            textView.setText(string);
        }

        initToast();
        toast.show();


    }

    public static void initToast(){
        toast.setView(view);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);


    }
}
