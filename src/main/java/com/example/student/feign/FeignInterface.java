package com.example.student.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("${details-service}")
public interface FeignInterface {
    @PostMapping(path = "/student-details/add/{studentId}")
    void addStudentDetails(@PathVariable("studentId") Long studentId);
}
