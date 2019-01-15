package com.example.sarthak.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {
        int score=0;
        boolean ischecked1=((CheckBox) findViewById(R.id.checkBox1)).isChecked();
        boolean ischecked2=((CheckBox) findViewById(R.id.checkBox2)).isChecked();
        boolean ischecked3=((CheckBox) findViewById(R.id.checkBox3)).isChecked();
        boolean ischecked4=((CheckBox) findViewById(R.id.checkBox4)).isChecked();
        if((ischecked1==true)&&(ischecked2==true)&&(ischecked3==false)&&(ischecked4==false))
        {
            score++;
        }
        boolean select1=((RadioButton) findViewById(R.id.radiobutton1)).isChecked();
        boolean select2=((RadioButton) findViewById(R.id.radiobutton2)).isChecked();
        boolean select3=((RadioButton) findViewById(R.id.radiobutton3)).isChecked();
        boolean select4=((RadioButton) findViewById(R.id.radiobutton4)).isChecked();
        if((select1==true)&&(select2==false)&&(select3==false)&&(select4==false))
        {
            score++;
        }
        TextView edit1 = findViewById(R.id.edittext11);
        String text1=edit1.getText().toString();
        TextView edit2 = findViewById(R.id.edittext2);
        String text2=edit2.getText().toString();
        String verify1="29";
        String verify2="Do or Die";
        if(text1.equals(verify1))
        {
            score++;
        }
        if(text2.equals(verify2))
        {
            score++;
        }
        TextView answer= findViewById(R.id.answer);
        answer.setText("Score=" + score);
        Context context=getApplicationContext();
        CharSequence toastmsg=("Score=" + score);
        Toast.makeText(context,toastmsg,Toast.LENGTH_SHORT).show();
    }
}