package com.example.storetrackinghistory.repository;

import com.example.storetrackinghistory.entity.Tracking;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackingRepository extends ReactiveMongoRepository<Tracking, String> {
}
