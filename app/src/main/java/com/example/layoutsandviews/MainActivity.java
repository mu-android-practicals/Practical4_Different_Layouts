package com.example.layoutsandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button relative,linear,table,scrollView,absolute,listview,gridview,frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relative=findViewById(R.id.relative);
        linear=findViewById(R.id.linear);
        table=findViewById(R.id.table);
        scrollView=findViewById(R.id.scrollView);
        absolute=findViewById(R.id.absolute);
        listview=findViewById(R.id.listview);
        gridview=findViewById(R.id.gridview);
        frameLayout=findViewById(R.id.frameLayout);


        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,RelativeLayout.class);
                startActivity(intent);
            }
        });


        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,tablelayout.class);
                startActivity(intent);
            }
        });

        scrollView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ScrollView.class);
                startActivity(intent);
            }
        });


        absolute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,AbsoluteLayout.class);
                startActivity(intent);
            }
        });

        listview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ListView.class);
                startActivity(intent);
            }
        });

        gridview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,gridViewlayout.class);
                startActivity(intent);
            }
        });

        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,FrameLayout.class);
                startActivity(intent);
            }
        });





    }
}