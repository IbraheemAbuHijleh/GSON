package com.example.josnexample;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;


public class MainActivity extends AppCompatActivity {

    private Button btn;
    private Button btnload;
    private TextView txt;
    private SharedPreferences sh;
    private SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btnsave);
        btnload=findViewById(R.id.btnsave2);
        txt=findViewById(R.id.txtv);
         sh= PreferenceManager.getDefaultSharedPreferences(this);
         editor=sh.edit();
    }

    public void btload(View view) {
        Gson gson=new Gson();
        String data= sh.getString("BOOK","");
        Book BOOK[]=gson.fromJson(data, Book[].class);
        txt.setText(BOOK.toString().toString());
    }

    public void btnsave(View view) {
        Book book[]= new Book[2];
        book[0]=new Book("C",2);
        book[1]=new Book("Java",2);

       Gson gson=new Gson();

       String bookdat=gson.toJson(book);
       editor.putString("BOOK",bookdat);
       editor.commit();

    }
}