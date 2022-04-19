package com.kiralydavid.kiralydavid_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class InsertActivity extends AppCompatActivity {
    private EditText editTextNev, editTextOrszag, editTextLakossag;
    private Button felvetelButtonClick, visszaButton;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
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

        felvetelButtonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nev, orszag, lakossag;
                nev = editTextNev.getText().toString();
                orszag = editTextOrszag.getText().toString();
                lakossag = editTextLakossag.getText().toString();
                if (nev.isEmpty()){
                    Toast.makeText(InsertActivity.this, "Hozzáadás sikertelen!", Toast.LENGTH_SHORT).show();
                    editTextNev.setError("Nem lehet üres!");
                }else if (orszag.isEmpty()){
                    Toast.makeText(InsertActivity.this, "Hozzáadás sikertelen!", Toast.LENGTH_SHORT).show();
                    editTextOrszag.setError("Nem lehet üres!");
                } else if(lakossag.isEmpty()){
                    Toast.makeText(InsertActivity.this, "Hozzáadás sikertelen!", Toast.LENGTH_SHORT).show();
                    editTextLakossag.setError("Nem lehet üres!");
                }else{
                    firebaseDatabase = FirebaseDatabase.getInstance();
                    databaseReference = firebaseDatabase.getReference("városok");
                    Varosok varosok = new Varosok(nev, orszag, lakossag);
                    databaseReference.child(nev).setValue(varosok);
                    Toast.makeText(InsertActivity.this, "Hozzáadás sikeres!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
    public void init(){
        editTextNev = findViewById(R.id.editTextNev);
        editTextOrszag = findViewById(R.id.editTextOrszag);
        editTextLakossag = findViewById(R.id.editTextLakossag);
        felvetelButtonClick = findViewById(R.id.felvetelButtonClick);
        visszaButton = findViewById(R.id.visszaButtonClick);
    }
}
