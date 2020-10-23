package com.example.ratingimages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView cnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Button(View view){
       // EditText text = (EditText) findViewById(R.id.edit_message);
       // String str = text.getText().toString().trim();
        //Toast toast = Toast.makeText(getApplicationContext(), "Привет"+" "+str, Toast.LENGTH_SHORT);
        //toast.show();
    }
    public void imageButton(View view) {
        cnt = (TextView) findViewById(R.id.textView2); //cnt - обьект "надпись"
        CharSequence zz = cnt.getText(); // получем содержимое обьекта
        int pz= Integer.valueOf(zz.toString()); // преобразовываем в число
        pz++; // прибавляем 1
        cnt.setText(Integer.toString(pz)); // преобразовываем в строку и возвращаем в обьект "надпись"
        Toast.makeText(this, "Нравится", Toast.LENGTH_SHORT).show();
    }
    public void imageButton2(View view) {
        cnt = (TextView) findViewById(R.id.textView3); //cnt - обьект "надпись"
        CharSequence zz = cnt.getText(); // получем содержимое обьекта
        int pz= Integer.valueOf(zz.toString()); // преобразовываем в число
        pz++; // прибавляем 1
        cnt.setText(Integer.toString(pz)); // преобразовываем в строку и возвращаем в обьект "надпись"
        Toast.makeText(this, "Не нравится", Toast.LENGTH_SHORT).show();
    }

}
