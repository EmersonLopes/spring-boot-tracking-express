package com.example.storetrackinghistory.utils;

import com.example.storetrackinghistory.dto.TrackingDTO;
import com.example.storetrackinghistory.entity.Tracking;
import org.springframework.beans.BeanUtils;

public class AppUtils {

    public static TrackingDTO entityToDto(Tracking tracking){
        TrackingDTO dto = new TrackingDTO();
        BeanUtils.copyProperties(tracking, dto);
        return dto;
    }

    public static Tracking dtoToEntity(TrackingDTO dto){
        Tracking tracking = new Tracking();
        BeanUtils.copyProperties(dto, tracking);
        return tracking;
    }
}
