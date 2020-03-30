package com.example.demo.service;

import com.example.demo.entity.Teacher;

public interface OkHttpService {
    void saveTeacher (Teacher teacher);
    Teacher teacherInfo(String name);
}
