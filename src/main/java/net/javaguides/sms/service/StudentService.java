package net.javaguides.sms.service;

import net.javaguides.sms.entitiy.Student;

import java.util.List;


public interface StudentService {
    List<Student> getAllStudents();

    public boolean saveStudent(Student student);
}
