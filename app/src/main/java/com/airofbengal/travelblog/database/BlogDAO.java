package com.airofbengal.travelblog.database;

import com.airofbengal.travelblog.http.Blog;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface BlogDAO {
    @Query("select * from blog")
    List<Blog> getAll();
    @Insert
    void insertAll(List<Blog> blogList);
    @Query("delete from blog")
    void deleteAll();
}
