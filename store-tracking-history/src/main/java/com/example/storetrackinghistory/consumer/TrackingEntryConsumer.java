package com.example.storetrackinghistory.consumer;

import com.example.storetrackinghistory.dto.TrackingDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class TrackingEntryConsumer {

    @KafkaListener(topics = "tracking_entries", containerFactory = "kafkaListenerTrackingDTOContainerFactory")
    public void consume(TrackingDTO dto){
        System.out.println("Received Message: " + dto.toString());
    }
}
