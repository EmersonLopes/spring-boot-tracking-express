package com.example.trackingentry.controllers;

import com.example.trackingentry.dto.TrackingDTO;
import com.example.trackingentry.kafka.KafkaMessageSender;
import com.example.trackingentry.services.TrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RequestMapping("/tracking")
@RestController
public class TrackingController {

    @Autowired
    private TrackingService trackingService;

    @PostMapping
    public Mono<ResponseEntity> insert(@Valid @RequestBody TrackingDTO dto){
        trackingService.sendMessage(dto);
        return Mono.just(ResponseEntity.status(HttpStatus.CREATED).build());
    }

}
