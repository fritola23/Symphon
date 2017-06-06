package com.example.fritola.symphony;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText celsi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button conv;
        final EditText celsi;
        final int c;

        conv = (Button)findViewById(R.id.conv);
        celsi = (EditText)findViewById(R.id.celsi);
        //final String strCelsi = celsi.getText().toString();
        conv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int c = Integer.parseInt(celsi.getText().toString());
                int result = c + 273;
                String resu = Integer.toString(result);
                Toast.makeText(MainActivity.this, resu+"ºK", Toast.LENGTH_SHORT).show();
                //if(TextUtils.isEmpty(strCelsi)){
                    //celsi.setError("Valor nulo");
                    //return;
                //}
            }
        });
    }
}
