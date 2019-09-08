package com.example.xuly2activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText txtHoTen,txtNamSinh;
    Button btnXuat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtHoTen = (EditText) findViewById(R.id.txtHoTen);
        txtNamSinh = (EditText) findViewById(R.id.txtNamSinh);

        btnXuat = (Button) findViewById(R.id.btnXuat);
        btnXuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                String hoTen = txtHoTen.getText().toString();
                String namSinh = txtNamSinh.getText().toString();

                if(namSinh.equals("")) {
                    Toast.makeText(Main2Activity.this,"Năm sinh không tỗng",Toast.LENGTH_SHORT).show();
                }else{
                    intent.putExtra("ht",new String(hoTen));
                    intent.putExtra("ns",new String(namSinh));
                    setResult(RESULT_OK,intent);
                    finish();
                }
            }
        });
    }
}
