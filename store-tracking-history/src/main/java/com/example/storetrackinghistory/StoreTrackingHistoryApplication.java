package com.example.storetrackinghistory;

import com.example.storetrackinghistory.entity.Tracking;
import com.example.storetrackinghistory.repository.TrackingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreTrackingHistoryApplication {

    @Autowired
    private TrackingRepository trackingRepository;

    public static void main(String[] args) {
        SpringApplication.run(StoreTrackingHistoryApplication.class, args);
    }
}
