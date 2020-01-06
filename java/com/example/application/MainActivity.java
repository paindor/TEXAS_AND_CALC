package com.example.application;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
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
        class Calc{
            int num;
            int getNum(){return num;}
            void setNum(int num){this.num = num;}
        }
        final Calc calc = new Calc();

        findViewById(R.id.btn_plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setNum(Integer.parseInt(etext.getText().toString()));
                etext.setText("");
                Log.d("입력된 숫자 >>>>>>>>>> ", calc.getNum()+"");
                Toast.makeText(ctx,
                        "입력된 숫자 " + calc.getNum()+"",Toast.LENGTH_LONG).show();
            }
        });

        findViewById(R.id.btn_equal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num2 = Integer.parseInt(etext.getText().toString());
                etext.setText((calc.getNum()+ num2)+"");
            }
        });
    }
}
