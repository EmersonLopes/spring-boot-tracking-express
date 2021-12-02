package com.example.storetrackinghistory.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TrackingDTO {

    private String idDevice;

    private Float latitude;

    private Float longitude;

    private String placa;

}
