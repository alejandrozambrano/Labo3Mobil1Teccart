package com.example.labo3teccart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Map;

public class MainActivity2 extends AppCompatActivity {

    private EditText id, montant;
    private RadioButton rev, Char;
    private Button add, update, delete;
    private Context ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        this.ctx = this;

        this.id = (EditText)findViewById(R.id.txtId);
        this.montant = (EditText)findViewById(R.id.txtMontant);

        this.rev = (RadioButton)findViewById(R.id.radRev);
        this.Char = (RadioButton)findViewById(R.id.radCharge);

        this.add = (Button)findViewById(R.id.btnAdd);
        this.update = (Button)findViewById(R.id.btnUpdate);
        this.delete = (Button)findViewById(R.id.btnDelete);

        this.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    Entry e = new Entry(getType(),Double,parseDouble(montant.getText().toString()));
                    if (e.isType())
                    {
                        Finance.addRevenu(e);
                    }
                    else
                    {
                        Finance.addCharge(e);
                    }
                }
                catch (Exception ex)
                {
                    Toast.makeText(ctx,ex.getMessage(),Toast.LENGTH_LONG).show();
                }

            }
        });

        this.update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try
                {
                    if(getType())
                    {
                        Finance.modifierRevenu(Integrer.parseInt(id.getText().toString()),
                                Double.parseDouble(montant.getText().toString()));
                    }
                    else
                    {
                        Finance.modifierChare(Integrer.parseInt(id.getText().toString()),
                                Double.parseDouble(montant.getText().toString()));
                    }
                }
                catch (Exception ex)
                {
                    Toast.makeText(ctx,ex.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });

        this.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try
                {
                    if (getType())
                    {
                        Finance.effacerRevenue(Integer.parseInt(id.getText().toString()));
                    }
                    else
                    {
                        Finance.effacerCharge(Integer.parseInt(id.getText().toString()));
                    }
                }
                catch (Exception ex)
                {
                    Toast.makeText(ctx,ex.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });

        int a = 0;
    }

    private boolean getType()
    {
        if (rev.isChecked())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void gotoRapport(View view) {

        Intent i = new Intent(this, Rapport.class);
        startActivity(i);
    }


}