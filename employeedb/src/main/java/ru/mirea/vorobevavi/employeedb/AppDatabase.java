package ru.mirea.vorobevavi.employeedb;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {SuperHero.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract SuperHeroDAO employeeDao();
}