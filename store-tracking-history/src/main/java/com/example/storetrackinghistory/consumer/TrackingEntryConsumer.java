package com.example.storetrackinghistory.consumer;

import com.example.storetrackinghistory.dto.TrackingDTO;
import com.example.storetrackinghistory.service.TrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TrackingEntryConsumer {

    @Autowired
    private TrackingService trackingService;

    @KafkaListener(topics = "tracking_entries", containerFactory = "kafkaListenerTrackingDTOContainerFactory")
    public void consume(TrackingDTO dto){
        System.out.println("Received Message: " + dto.toString());

        trackingService.save(dto);
    }
}
