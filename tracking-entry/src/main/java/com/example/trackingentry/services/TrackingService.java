package com.example.trackingentry.services;

import com.example.trackingentry.dto.TrackingDTO;
import com.example.trackingentry.kafka.KafkaMessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TrackingService {

    @Autowired
    private KafkaMessageSender kafkaMessageSender;

    @Value(value = "${topics.tracking_entries}")
    private String topicTrackingEntries;

    public void sendMessage(TrackingDTO dto) {
        try {
            kafkaMessageSender.sendMessage(topicTrackingEntries, dto.getIdDevice(), dto);
        } catch (Exception ignored) {

        }
    }
}
