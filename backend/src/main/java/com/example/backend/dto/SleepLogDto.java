package com.example.backend.dto;


import com.example.backend.model.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SleepLogDto {
    private Long id;
    private UserEntity user_id;
    private LocalDateTime sleep_start;
    private LocalDateTime wake_time;
    private Long quality_rating;
    private String notes;
}
