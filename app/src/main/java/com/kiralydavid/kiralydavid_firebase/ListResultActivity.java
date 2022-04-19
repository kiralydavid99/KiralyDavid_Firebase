package com.kiralydavid.kiralydavid_firebase;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;



import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class ListResultActivity extends AppCompatActivity {

    private ListView listViewOrszag;
    private Button buttonVissza;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
    private ArrayList<String> orszagok = new ArrayList<>();

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
        databaseReference=FirebaseDatabase.getInstance().getReference("orszagok");
        listViewOrszag=(ListView) findViewById(R.id.listViewOrszag);

    }


    public void init(){
        listViewOrszag = findViewById(R.id.listViewOrszag);
        buttonVissza = findViewById(R.id.buttonVissza);

    }
}
