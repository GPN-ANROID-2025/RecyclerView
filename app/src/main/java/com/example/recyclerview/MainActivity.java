package com.example.recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<Person> personArrayList;
    RecyclerView recyclerView;
    PersonAdapter peopleAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        personArrayList=new ArrayList<>();
        personArrayList.add(new Person(22,R.drawable.man,"Sachin"));
        personArrayList.add(new Person(22,R.drawable.man,"Sachin"));
        personArrayList.add(new Person(22,R.drawable.man,"Mahesh"));
        personArrayList.add(new Person(22,R.drawable.man,"Sachin"));
        personArrayList.add(new Person(22,R.drawable.man,"Sachin"));
        personArrayList.add(new Person(22,R.drawable.man,"Sachin"));
        personArrayList.add(new Person(22,R.drawable.profile,"Rahul"));
        personArrayList.add(new Person(22,R.drawable.man,"Sachin"));




        recyclerView=findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);/**/
        //RecyclerView.LayoutManager layoutManager=new GridLayoutManager(this,2,RecyclerView.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        peopleAdapter=new PersonAdapter(personArrayList);
        recyclerView.setAdapter(peopleAdapter);
    }
}