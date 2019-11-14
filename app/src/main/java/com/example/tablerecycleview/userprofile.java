package com.example.tablerecycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class userprofile extends AppCompatActivity {

    ImageView Image;
    TextView Name,Dob,Email,Gender,Country,Phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofile);
        Name = findViewById(R.id.name);
        Dob = findViewById(R.id.dob);
        Email=findViewById(R.id.email);
        Gender = findViewById(R.id.gender);
        Country = findViewById(R.id.country);
        Phone =findViewById(R.id.phone);
        Image = findViewById(R.id.imagee);

        Bundle bundle =getIntent().getExtras();
        Name.setText(bundle.getString("name"));
        Dob.setText(bundle.getString("dob"));
        Email.setText(bundle.getString("email"));
        Gender.setText(bundle.getString("gender"));
        Country.setText(bundle.getString("country"));
        Phone.setText(bundle.getString("phone"));
        Image.setImageResource(bundle.getInt("image"));

    }
}
