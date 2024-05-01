package ru.mirea.vorobevavi.employeedb;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDatabase db = App.getInstance().getDatabase();
        SuperHeroDAO employeeDao = db.employeeDao();

        SuperHero superHero1 = new SuperHero();
        superHero1.name = "Cappybar";
        superHero1.power = 100;
        SuperHero superHero2 = new SuperHero();
        superHero2.name = "Bobr";
        superHero2.power = 50;
        SuperHero superHero3 = new SuperHero();
        superHero3.name = "Patric Jane";
        superHero3.power = 90;

        employeeDao.insert(superHero1);
        employeeDao.insert(superHero2);
        employeeDao.insert(superHero3);
        List<SuperHero> superHeroes = employeeDao.getAll();
        for (SuperHero superHero : superHeroes){
            Log.i(TAG, superHero.name + " " + superHero.power);
        }
    }
}