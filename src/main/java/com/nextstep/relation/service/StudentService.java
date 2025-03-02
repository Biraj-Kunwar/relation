package com.nextstep.relation.service;

import com.nextstep.relation.model.Student;
import com.nextstep.relation.model.Teacher;

public interface StudentService {
    public void saveStudent(Student student);
    public void deleteStudentById(int id);
    public void saveTeacher(Teacher teacher);
}
