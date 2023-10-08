package com.arieltintel.apiworker.controller;

import com.arieltintel.apiworker.entities.Worker;
import com.arieltintel.apiworker.service.WorkerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/workers")
@RequiredArgsConstructor
public class WorkerController {

    private final WorkerService workerService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Worker> findAll() {
        return workerService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Worker findById(@PathVariable Long id) {
        return workerService.findById(id);
    }

}
