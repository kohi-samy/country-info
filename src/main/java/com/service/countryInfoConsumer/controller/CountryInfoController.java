package com.service.countryInfoConsumer.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.service.countryInfoConsumer.dto.CountryInfoDTO;
import com.service.countryInfoConsumer.service.CountryInfoService;
import com.service.countryInfoConsumer.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryInfoController {

    @Autowired
    CountryInfoService countryInfoService;

    @GetMapping(value="/country/info/{name}")
    public ResponseEntity<CountryInfoDTO> getCountryInfoByName(@PathVariable String name){

        CountryInfoDTO countryInfoDTO = null;
        try {
            countryInfoDTO = countryInfoService.getCountryInfo(name, Constants.FIELDS_LIST);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return ResponseEntity.ok(countryInfoDTO);

    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> errorEndpoint(RuntimeException ex){
        String errorMessage = "Internal Server Error";
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
    }


}
