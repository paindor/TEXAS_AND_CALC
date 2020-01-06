package com.example.application;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this;
        final EditText etext = findViewById(R.id.etext);
        final Button btnPlus = findViewById(R.id.btn_plus);
        Button btnMinus = findViewById(R.id.btn_minus);
        Button btnMulti = findViewById(R.id.btn_multi);
        Button btnDivid = findViewById(R.id.btn_divid);
        Button btnEqual = findViewById(R.id.btn_equal);
        TextView result = findViewById(R.id.result);
        class Calc{
            int num, result;
            String op;
            public void execute(){

            }
            int getNum(){return num;}
            void setNum(int num){this.num = num;}
        }


        findViewById(R.id.btn_plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calc c = new Calc();
                c.setNum(Integer.parseInt(etext.getText().toString()));
                Log.d("입력된 숫자 >>>>>>>>>> ", c.getNum()+"");
                Toast.makeText(ctx,
                        "입력된 숫자 " + c.getNum()+"",Toast.LENGTH_LONG).show();
            }
        });


    }
}
