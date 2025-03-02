package com.nextstep.relation.controller;

import com.nextstep.relation.model.Student;
import com.nextstep.relation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/saveStudent")
    public String saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return "Succesfully saved";

    }

    public String deleteStudent(@PathVariable("id") int id){
        studentService.deleteStudentById(id);
        return "Delete Sucesfully";
    }

}
