package com.example.storetrackinghistory.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "trackings")
public class Tracking {

    @Id
    private String id;

    private String idDevice;

    private Float latitude;

    private Float longitude;

    private String placa;
}
