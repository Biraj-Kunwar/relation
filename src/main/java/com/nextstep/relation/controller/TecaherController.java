package com.nextstep.relation.controller;

import com.nextstep.relation.model.Teacher;
import com.nextstep.relation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TecaherController {
    @Autowired
    StudentService studentService;

    @PostMapping("/saveTeacher")
    public String saveTeacher(@RequestBody Teacher teacher){
        studentService.saveTeacher(teacher);
        return "Saved Scucessfully";
    }
}
