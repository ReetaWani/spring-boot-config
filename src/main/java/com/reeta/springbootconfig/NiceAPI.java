package com.reeta.springbootconfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/nicetry")
public class NiceAPI {
    @Autowired
    private NiceService niceService;

    @GetMapping(value = "/student")
    public ResponseEntity<List<Student>> getDetails(){

        List<Student> studentList= niceService.getDetails();
        ResponseEntity<List<Student>> response = new ResponseEntity<List<Student>> 
    (studentList,HttpStatus.OK);
        return response;
    }

}
