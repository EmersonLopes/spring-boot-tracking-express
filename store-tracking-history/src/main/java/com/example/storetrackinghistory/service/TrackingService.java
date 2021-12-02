package com.example.storetrackinghistory.service;

import com.example.storetrackinghistory.dto.TrackingDTO;
import com.example.storetrackinghistory.entity.Tracking;
import com.example.storetrackinghistory.repository.TrackingRepository;
import com.example.storetrackinghistory.utils.AppUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class TrackingService {

    public static final Logger LOGGER = LoggerFactory.getLogger(TrackingService.class);

    @Autowired
    private TrackingRepository trackingRepository;

    public Mono save(TrackingDTO dto) {
        LOGGER.info(dto.toString());
        Tracking tracking = AppUtils.dtoToEntity(dto);
        LOGGER.info(tracking.toString());
        Mono<Void> mono = trackingRepository.save(tracking)
                .thenEmpty(s -> LOGGER.info("Empty " + s.toString()));

        mono.subscribe(t -> LOGGER.info("Saved "+t));

        return mono;


    }
}
