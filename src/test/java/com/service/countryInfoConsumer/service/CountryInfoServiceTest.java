package com.service.countryInfoConsumer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.service.countryInfoConsumer.dto.CountryInfoDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.http.client.MockClientHttpResponse;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class CountryInfoServiceTest {

    @MockBean
    private WebClient webClient;

    @Autowired
    private CountryInfoService countryInfoService;

//    @Test
//    void testGetCountryInfo() throws JsonProcessingException {
//        String responseJson = "[{\"name\":{\"common\":\"Finland\"},\"flags\":{\"svg\":\"https://flagcdn.com/fi.svg\"},\"capital\":[\"Helsinki\"],\"cca2\":\"FI\",\"population\":5530719}]";
//
//
//        when(webClient.get()).thenReturn(Mockito.mock(WebClient.RequestHeadersSpec.class));
//
//
//        CountryInfoDTO countryInfoDTO = countryInfoService.getCountryInfo("Finland", "name,flags,capital,cca2,population");
//
//        // Verify that the expected data is extracted from the response
//        assertEquals("Finland", countryInfoDTO.getName());
//        assertEquals("https://flagcdn.com/fi.svg", countryInfoDTO.getFlagFileUrl());
//        assertEquals("Helsinki", countryInfoDTO.getCapital());
//        assertEquals("FI", countryInfoDTO.getCountryCode());
//        assertEquals(5530719, countryInfoDTO.getPopulation());
//    }

}