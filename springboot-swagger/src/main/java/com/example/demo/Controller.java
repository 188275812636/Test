package com.example.demo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import user.Student;

import java.util.ArrayList;
import java.util.List;

@Api("Controller")
@RestController
public class Controller {
    //@RequestMapping(value = "/student", method = RequestMethod.GET)
    @ApiOperation(value="获取学生信息", notes="获取学生信息")
    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public List getStudents() {

        List<Student> students = new ArrayList<>();
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("张三");
        s1.setAge(18);
        students.add(s1);
        Student s2 = new Student();
        s2.setId(2);
        s2.setName("李四");
        s2.setAge(20);
        students.add(s2);
        return students;
    }
}