package com.example.tablerecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.tablerecycleview.Module.User;

import java.util.ArrayList;
import java.util.List;

public class userlist extends AppCompatActivity {

    RecyclerView userlistview;
    List<User> users;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlist);
        userlistview = findViewById(R.id.userlistview);
        Intent i = getIntent();
        users = (List<User>) i.getSerializableExtra("allusers");
        userAdaptor adapter = new userAdaptor(this,users);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        userlistview.setLayoutManager(layoutManager);
        userlistview.setAdapter(adapter);


    }
}
