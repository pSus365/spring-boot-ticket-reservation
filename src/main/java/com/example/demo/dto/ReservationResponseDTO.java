package com.example.demo.dto;

import com.example.demo.model.ReservationStatus;
import lombok.Builder;

@Builder
public record ReservationResponseDTO(
    Long id,
    String eventName,
    String username,
    ReservationStatus status
) {}
