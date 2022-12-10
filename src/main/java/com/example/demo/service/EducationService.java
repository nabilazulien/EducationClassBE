package com.example.demo.service;

import com.example.demo.models.Result;
import com.example.demo.request.SaveEducationRequest;
import com.example.demo.request.UpdateEducationRequest;
import org.springframework.http.ResponseEntity;

public interface EducationService {
    ResponseEntity<Result> saveEducation(SaveEducationRequest request);
    ResponseEntity<Result> updateEducation(UpdateEducationRequest request, int id);
    ResponseEntity<Result> getById(int id);
    ResponseEntity<Result> getAll();
    ResponseEntity<Result> deleteEducation(int id);
}
