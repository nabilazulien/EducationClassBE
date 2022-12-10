package com.example.demo.serviceimpl;

import com.example.demo.models.Peserta;
import com.example.demo.models.Result;
import com.example.demo.repository.EducationRepository;
import com.example.demo.request.PesertaRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EducationServiceImpl {
    @Autowired
    EducationRepository educationRepository;

    private Result result;



}
