package com.example.myapplication;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView n1,n2;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        n1 =findViewById(R.id.n1);
        n2 =findViewById(R.id.n2);
        button =findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int v1=Integer.parseInt(n1.getText().toString());
                int v2=Integer.parseInt(n2.getText().toString());
                int sum=v1+v2;
                Toast.makeText(getApplicationContext(),"sum = "+sum,Toast.LENGTH_LONG).show();
            }
        });

    }
}
