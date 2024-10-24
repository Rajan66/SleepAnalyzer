package com.example.backend.service.SleepLog;

import com.example.backend.dto.SleepLogDto;
import com.example.backend.model.SleepLogEntity;
import com.example.backend.service.GenericService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface SleepLogService extends GenericService<SleepLogDto> {

}
