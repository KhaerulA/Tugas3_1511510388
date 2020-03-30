package com.example.tugas3_1511510388;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edt_panjang,edt_lebar,edt_luas,edt_kel;
    private Button btn_hitung,btn_clear;
    private double p,l,luas,kel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_panjang = (EditText) findViewById(R.id.editTextPanjang);
        edt_lebar = (EditText) findViewById(R.id.editTextLebar);
        btn_hitung= (Button) findViewById(R.id.buttonHitung);
        btn_clear=(Button)findViewById(R.id.buttonClear);
        edt_luas = (EditText) findViewById(R.id.editTextLuas);
        edt_kel= (EditText) findViewById(R.id.editTextKel);

        btn_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isipanjang = edt_panjang.getText().toString();
                String isilebar = edt_lebar.getText().toString();
                p = Double.parseDouble(isipanjang);
                l = Double.parseDouble(isilebar);

                luas = p * l;
                kel=2*(p+l);
                edt_luas.setText(""+luas);
                edt_kel.setText(""+kel);
            }
        });

        btn_clear.setOnClickListener(new  View.OnClickListener() {
         @Override
            public void onClick(View view){
                edt_panjang.setText("");
                edt_lebar.setText("");
                edt_luas.setText("");
                edt_kel.setText("");
            }
        }
        );
    }
}
