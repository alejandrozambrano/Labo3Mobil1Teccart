package com.example.labo3teccart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private Button start;
    private Context ctx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        this.ctx = this;
        this.name = (EditText)findViewById(R.id.txtName);
        this.start = (Button)findViewById(R.id.btnStart);

        this.start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                public void onClick(View view) {
                    Finance.setNom(name.getText().toString());
                    Intent i = new Intent((ctx, MainActivity.class);
                    startActivity(i);
                }
            }
        });

    }


}