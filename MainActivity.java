package com.example.mybmi_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText height, weight, name;
    private Button computing, reset;
    private RadioGroup sex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initMyCpnt();
    }

    @Override
    public void onClick(View v) {
        int i=v.getId();
        switch (i){
            case R.id.idCmp:
                Bundle ans=computing();
                emitMsg(ans);
                break;
            case R.id.idRST:
                Toast.makeText(this,"reset",Toast.LENGTH_SHORT);
                break;

             default:

        }
    }

    private void initMyCpnt(){

        name=findViewById(R.id.idName);
        height=findViewById(R.id.idHeight);
        weight=findViewById(R.id.idWeight);
        computing=findViewById(R.id.idCmp);
        reset=findViewById(R.id.idRST);
        sex=findViewById(R.id.idBGroup);

        computing.setOnClickListener(this);
        reset.setOnClickListener(this);


    }
    private void emitMsg(Bundle bundle){
        Intent intent=new Intent();
        intent.setClass(this,Second.class);
        intent.putExtras(bundle);
        startActivity(intent);

    }
    private Bundle computing(){
        float numH=Float.parseFloat(height.getText().toString());
        float numW=Float.parseFloat(weight.getText().toString());
        String _name=name.getText().toString();

        Bundle bundle=new Bundle();
        float ans =numW/numH*numH;
        bundle.putString("name",_name);
        bundle.putFloat("bmi",ans);
        return  bundle;
    }
}
