package com.example.student.service;

import com.example.student.entity.Details;
import com.example.student.entity.Student;
//import com.example.student.feign.FeignInterface;
import com.example.student.feign.FeignInterface;
import com.example.student.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
public class StudentService {
    private final StudentRepository studentRepository;
    private final FeignInterface feignInterface;

    @Autowired
    public StudentService(StudentRepository studentRepository, FeignInterface feignInterface) {
        this.studentRepository = studentRepository;
        this.feignInterface = feignInterface;
    }

    public void saveStudent(Student student) {
        studentRepository.saveAndFlush(student);
//        Details restTemplateForObject = restTemplate.getForObject("http://localhost:8081/student-details/add/{studentId}",
//                Details.class,
//                student.getId());
        //log.info(restTemplateForObject.toString());
        feignInterface.addStudentDetails(student.getId());
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void deleteStudentById(Long id) {
        if (!studentRepository.existsById(id))
            throw new IllegalStateException("id " + id + "does not exists");
        studentRepository.deleteById(id);
    }

}