package com.example.chapter13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper myDB;

    EditText productQuantity,productName;
    TextView productID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bttnAdd=(Button)findViewById(R.id.bttnAdd);
        Button bttnFind=(Button)findViewById(R.id.bttnFind);
        Button bttnDelete=(Button)findViewById(R.id.bttnDelete);

        myDB=new DatabaseHelper(this);



        productQuantity=(EditText)findViewById(R.id.productQuantity);
        productName=(EditText)findViewById(R.id.productName);
        productID=(TextView) findViewById(R.id.productID);



        bttnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!myDB.addData("First insert","32"))
                    Toast.makeText(MainActivity.this,
                            "Insertion failed", Toast.LENGTH_SHORT).show();


            }
        });

        bttnFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bttnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}