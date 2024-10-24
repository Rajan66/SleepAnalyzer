package com.example.backend.controller;

import com.example.backend.dto.GlobalApiResponse;
import com.example.backend.dto.SleepLogDto;
import com.example.backend.mapper.impl.SleepLogMapper;
import com.example.backend.service.SleepLog.SleepLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(path = "/api/sleep-logs")
public class SleepLogController extends BaseController {

    private final SleepLogService sleepLogService;

    public SleepLogController(SleepLogService sleepLogService) {
        this.sleepLogService = sleepLogService;
    }

    @PostMapping("")
    public ResponseEntity<GlobalApiResponse> createSleepLog(SleepLogDto sleepLogDto) {
        SleepLogDto savedSleepLogDto = sleepLogService.save(sleepLogDto);
        if (savedSleepLogDto == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(failureResponse("Sleep log creation failed", null));
        }
        return ResponseEntity.ok(successResponse("Sleep log created successfully", savedSleepLogDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<GlobalApiResponse> getSleepLog(@PathVariable(name = "id") Long id) {
        SleepLogDto sleepLogDto = sleepLogService.findOne(id);
        if (sleepLogDto == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(failureResponse("Sleep log not found", null));
        }
        return ResponseEntity.ok(successResponse("Sleep log retrieved successfully", sleepLogDto));
    }

    @GetMapping("")
    public Page<SleepLogDto> listSleepLog(Pageable pageable) {
        Page<SleepLogDto> sleepLogDtos = sleepLogService.findAll(pageable);
        return sleepLogDtos;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<GlobalApiResponse> deleteSleepLog(@PathVariable Long id) {
        boolean flag = sleepLogService.delete(id);
        if (!flag) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(successResponse("Sleep Log not found", null));
        }
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .body(successResponse("Sleep Log deleted successfully", null));
    }
}
