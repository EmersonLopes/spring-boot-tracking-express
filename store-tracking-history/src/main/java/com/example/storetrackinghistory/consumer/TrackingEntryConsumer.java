package com.example.storetrackinghistory.consumer;

import com.example.storetrackinghistory.custom.TrackingCustomListener;
import com.example.storetrackinghistory.dto.TrackingDTO;
import com.example.storetrackinghistory.service.TrackingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TrackingEntryConsumer {

    @Autowired
    private TrackingService trackingService;

    //    @KafkaListener(topics = "tracking_entries", containerFactory = "kafkaListenerTrackingDTOContainerFactory")
    @TrackingCustomListener
    public void consume(TrackingDTO dto) {
        System.out.println("Received Message: " + dto.toString());
        log.info("Thread: {}", Thread.currentThread().getId());
        trackingService.save(dto);
    }

    @TrackingCustomListener
    public void consumeFoRedis(TrackingDTO dto) {
        System.out.println("Received Message for Redis: " + dto.toString());
        log.info("Thread: {}", Thread.currentThread().getId());

        //trackingService.save(dto);
    }
}
