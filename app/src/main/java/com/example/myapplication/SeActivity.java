package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class SeActivity extends AppCompatActivity {

    List<Ani> animals = new ArrayList<Ani>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_se);

        setInitialDate();
        RecyclerView recyclerView = findViewById(R.id.list);
        Ada ada = new Ada(this, animals);
        recyclerView.setAdapter(ada);

    }


    private void setInitialDate(){
        animals.add( new Ani("ворона","Род птиц из семейства врановых. Род включает виды, известные как вороны, вороны, грачи и галки.",
                R.drawable.crow,"большая "));
        animals.add( new Ani("орел","Род хищных птиц семейства ястребиных",
                R.drawable.eagl,"средняя"));
        animals.add( new Ani("сова","Отряд, включающий более 200 видов птиц преимущественно средней величины, распространённых во всех частях света",
                R.drawable.owls,"средняя"));
        animals.add( new Ani("воробей","Наиболее распространённый вид из рода настоящих воробьёв семейства воробьиных. Одна из самых известных птиц, обитающая по соседству с жилищем человека и хорошо узнаваемая как по внешнему виду, так и по характерному чириканью. ",
                R.drawable.spar,"большая"));
        animals.add( new Ani("снегирь"," певчая птица рода снегирей, семейства вьюрковых.",
                R.drawable.png,"средняя"));
        animals.add( new Ani("дятел","Род птиц семейства дятловых, распространённых в Евразии и Северной Африке. Род содержит 12 видов.",
                R.drawable.black,"средняя"));
    }
    private View.OnClickListener listener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(getApplicationContext(),SecActivity.class);
            startActivity(intent);
        }

    };
}