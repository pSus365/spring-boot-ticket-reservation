package com.example.demo.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record ReservationRequestDTO(
    @NotNull(message = "Event ID is required")
    Long eventId,

    @NotNull(message = "User ID is required")
    Long userId,

    @NotNull(message = "Number of tickets is required")
    @Min(value = 1, message = "At least one ticket must be requested")
    Integer requestedTickets
) {}
