package com.airofbengal.travelblog.database;

import com.airofbengal.travelblog.http.Blog;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Blog.class}, version = 1,exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract BlogDAO blogDao();
}
