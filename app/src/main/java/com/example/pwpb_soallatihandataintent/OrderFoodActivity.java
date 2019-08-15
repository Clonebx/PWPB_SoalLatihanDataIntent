package com.example.pwpb_soallatihandataintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OrderFoodActivity extends AppCompatActivity implements View.OnClickListener{

    EditText txtNama, txtAlamat, txtPesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_food);

        txtNama = findViewById(R.id.edit_nama_orderfood);
        txtAlamat = findViewById(R.id.edit_alamat_orderfood);
        txtPesan = findViewById(R.id.edit_pesan_orderfood);

        Button btnOrder = findViewById(R.id.btn_order_orderfood);
        btnOrder.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(OrderFoodActivity.this, DelivActivity.class);

        i.putExtra(DelivActivity.EXTRA_NAMA, txtNama.getText().toString());
        i.putExtra(DelivActivity.EXTRA_ALAMAT, txtAlamat.getText().toString());
        i.putExtra(DelivActivity.EXTRA_PESAN, txtPesan.getText().toString());

        String nama = txtNama.getText().toString().trim();
        String alamat = txtNama.getText().toString().trim();
        String pesan = txtNama.getText().toString().trim();

        if(nama.isEmpty()){
            txtNama.setError("Nama tidak boleh kosong");
            txtNama.requestFocus();
            return;
        }else if(alamat.isEmpty()) {
            txtNama.setError("Alamat tidak boleh kosong");
            txtNama.requestFocus();
            return;
        }else if(pesan.isEmpty()) {
            txtNama.setError("Pesanan tidak boleh kosong kosong");
            txtNama.requestFocus();
            return;
        }else {
            startActivity(i);
        }
    }
}