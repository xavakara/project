package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class ScActivity extends AppCompatActivity {

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
        animals.add( new Ani("медведь"," семейство млекопитающих отряда хищных. Отличаются от других представителей псообразных более коренастым телосложением. Медведи всеядны, хорошо лазают и плавают, быстро бегают, могут стоять и проходить короткие расстояния на задних лапах. Имеют короткий хвост, длинную и густую шерсть, а также отличное обоняние.",
                R.drawable.ls,"средняя"));
        animals.add( new Ani("волк","Вид хищных млекопитающих из семейства псовых. Наряду с койотом, обыкновенным шакалом и ещё несколькими видами составляет род волков. Кроме того, как показывают результаты изучения последовательности ДНК и дрейфа генов, является прямым предком домашней собаки.",
                R.drawable.wol,"средняя"));
        animals.add( new Ani("рысь","Отряд, включающий более 200 видов птиц преимущественно средней величины, распространённых во всех частях света",
                R.drawable.cat,"средняя"));
        animals.add( new Ani("лиса","Хищное млекопитающее семейства псовых, наиболее распространённый и самый крупный вид рода лисиц. ",
                R.drawable.fox,"большая"));
        animals.add( new Ani("заяц","Род из семейства зайцевых. Распространены везде, кроме Австралии и Антарктиды, всего около 30 видов. Отличаются длинными ушами, коротким поднятым хвостом, недоразвитыми ключицами, длинными задними лапами, что позволяет им двигаться прыжками.",
                R.drawable.lipa,"большая"));
        animals.add( new Ani("лев","Вид хищных млекопитающих, один из пяти представителей рода пантер, относящегося к подсемейству больших кошек в составе семейства кошачьих. Наряду с тигром - самая крупная из ныне живущих кошек, масса некоторых самцов может достигать 250 кг.",
                R.drawable.lion,"уязвим к сокращению численности"));
    }
    private View.OnClickListener listener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(getApplicationContext(),SecActivity.class);
            startActivity(intent);
        }

    };
}