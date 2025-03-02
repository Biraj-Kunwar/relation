package com.nextstep.relation.service;

import com.nextstep.relation.model.Assignment;
import com.nextstep.relation.model.Student;
import com.nextstep.relation.model.Teacher;
import com.nextstep.relation.repository.StudentRepository;
import com.nextstep.relation.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    TeacherRepository teacherRepository;
    @Override
    public void saveStudent(Student student) {
     student.getAddress().setStudent(student);
     studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void saveTeacher(Teacher teacher) {
        for(Assignment li:teacher.getAssignments()){
            li.setTeacher(teacher);
        }
        teacherRepository.save(teacher);

    }


}
