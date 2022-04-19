package com.kiralydavid.kiralydavid_firebase;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ListResultActivity extends AppCompatActivity {

    private TextView textViewOrszag;
    private Button buttonVissza;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listresult);
        init();



        buttonVissza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainActivityre = new Intent(ListResultActivity.this, MainActivity.class);
                startActivity(mainActivityre);
                finish();
            }
        });

    }


    public void init(){
        textViewOrszag = findViewById(R.id.textViewOrszag);
        buttonVissza = findViewById(R.id.buttonVissza);

    }
}
