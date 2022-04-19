package com.kiralydavid.kiralydavid_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class InsertActivity extends AppCompatActivity {
    private EditText editTextNev, editTextOrszag, editTextLakossag;
    private Button felvetelButton, visszaButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        init();
        visszaButton.setOnClickListener(view -> {
            Intent visszaGomb = new Intent(InsertActivity.this, MainActivity.class);
            startActivity(visszaGomb);
            finish();
        });
    }
    public void init(){
        editTextNev = findViewById(R.id.editTextNev);
        editTextOrszag = findViewById(R.id.editTextOrszag);
        editTextLakossag = findViewById(R.id.editTextLakossag);
        felvetelButton = findViewById(R.id.felvetelButtonClick);
        visszaButton = findViewById(R.id.visszaButtonClick);
    }
}
