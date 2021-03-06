package com.example.dao;

import com.example.entity.Student;

import java.util.List;

public interface StudentDao {

    int insertStudent(Student stu);

    int updateStudent(Student stu);

    int deleteById(int id);

    Student selectById(int id);

    List<Student> selectAll();
}
