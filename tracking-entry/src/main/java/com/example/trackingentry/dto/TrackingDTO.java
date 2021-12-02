package com.example.trackingentry.dto;


import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TrackingDTO {

    @NotBlank(message = "Campo obrigatório")
    private String idDevice;

    @NotNull(message = "Campo obrigatório")
    private Float latitude;

    @NotNull(message = "Campo obrigatório")
    private Float longitude;

    @NotBlank(message = "Campo obrigatório")
    private String placa;

}
