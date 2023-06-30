package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class EcActivity extends AppCompatActivity {

    List<Ani> animals = new ArrayList<Ani>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ec);

        setInitialDate();
        RecyclerView recyclerView = findViewById(R.id.list);
        Ada ada = new Ada(this, animals);
        recyclerView.setAdapter(ada);

    }


    private void setInitialDate(){
        animals.add( new Ani("щука","Рыба семейства щуковых. Распространена в пресных водах Евразии, центральной России, севера России и Северной Америки. Живёт обычно в прибрежной зоне, в водных зарослях, в непроточных или слабопроточных водах.",
                R.drawable.fish,"большая "));
        animals.add( new Ani("карась","неприхотливые промысловые рыбы, и ценный объект прудового хозяйства благодаря способности выживать при низком (до 2—3 мг/л) содержании кислорода в воде[1]. Спинной плавник длинный, глоточные зубы однорядные. Тело высокое с толстой спиной, умеренно сжатое с боков. Чешуя крупная и гладкая на ощупь. Окраска варьирует в зависимости от места обитания.",
                R.drawable.karac,"большая"));
        animals.add( new Ani("сом","крупный хищник, обитающий в водоемах с пресной водой. Из постоянных речных обитателей ему нет равных по размерам и массе. Его вес может достигать 400 кг, а длина – 3 метра.",
                R.drawable.comr,"нуждаеться в охране"));
        animals.add( new Ani("хариус","Род рыб подсемейства хариусовых семейства лососевых отряда лососеобразных. Характерным признаком является большой спинной плавник, задняя часть которого у половозрелых самцов в сложенном состоянии достигает жирового, а иногда и основания хвостового плавников",
                R.drawable.hari,"большая"));
        animals.add( new Ani("пескарь","пресноводная стайная рыба, встречается в бассейнах всех рек при наличии песчаных или песчано-галечных грунтов и чистой воды, а именно, в основном в больших и малых реках, в горных реках и ручьях, реже в старицах, озерах и даже в илистых прудах, а также попадается в солоноватых водах морских заливов. ",
                R.drawable.pecok,"большая"));
        animals.add( new Ani("дельфин","Водные млекопитающие инфраотряда китообразных, принадлежащие либо к семейству дельфиновых - морские, либо к нетаксономической группе речных дельфинов - пресноводные. Питаются мелкой рыбой",
                R.drawable.delfin,"средняя"));
    }
    private View.OnClickListener listener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(getApplicationContext(),SecActivity.class);
            startActivity(intent);
        }

    };
}