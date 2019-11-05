package com.gradder.nanoworld.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapController {

    @GetMapping(value = "/wellness", produces = {"application/json; charset=UTF-8"})
    public ResponseEntity<String> statusGood() {
        return new ResponseEntity<>("{\"Feeling\":\"Good\"}", HttpStatus.OK);
    }

    @GetMapping(value = "/notwell", produces = {"application/json; charset=UTF-8"})
    public ResponseEntity<String> statusNotWell() {
        return new ResponseEntity<>("{\"Feeling\":\"Not found\"}", HttpStatus.NOT_FOUND);
    }
}

