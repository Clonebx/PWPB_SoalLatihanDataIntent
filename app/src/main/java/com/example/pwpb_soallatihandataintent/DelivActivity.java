package com.example.pwpb_soallatihandataintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DelivActivity extends AppCompatActivity implements View.OnClickListener {

    public static String EXTRA_NAMA = "extra nama";
    public static String EXTRA_ALAMAT = "extra alamat";
    public static String EXTRA_PESAN = "extra pesan";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deliv);

        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString(EXTRA_NAMA);
        String alamat = bundle.getString(EXTRA_ALAMAT);
        String pesan = bundle.getString(EXTRA_PESAN);

        TextView txtNama = findViewById(R.id.txt_nama_deliv);
        txtNama.setText(nama);
        TextView txtAlamat = findViewById(R.id.txt_alamat_deliv);
        txtAlamat.setText(alamat);
        TextView txtPesan = findViewById(R.id.txt_pesan_deliv);
        txtPesan.setText(pesan);
        Button btnOk = findViewById(R.id.btn_ok);
        btnOk.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_ok:
                Intent intent = new Intent(DelivActivity.this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}