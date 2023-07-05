package com.airofbengal.travelblog.repository;

import com.airofbengal.travelblog.http.Blog;

import java.util.List;

public interface DataFromDatabaseCallback {
    void onSuccess(List<Blog> blogList);
}
