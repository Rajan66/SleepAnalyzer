package com.example.backend.service.SleepLog;

import com.example.backend.dto.SleepLogDto;
import com.example.backend.mapper.impl.SleepLogMapper;
import com.example.backend.model.SleepLogEntity;
import com.example.backend.repository.SleepLogRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SleepLogServiceImpl implements SleepLogService {
    private final SleepLogRepository sleepLogRepository;
    private final SleepLogMapper sleepLogMapper;

    public SleepLogServiceImpl(SleepLogRepository sleepLogRepository, SleepLogMapper sleepLogMapper) {
        this.sleepLogRepository = sleepLogRepository;
        this.sleepLogMapper = sleepLogMapper;
    }


    @Override
    public SleepLogDto save(SleepLogDto sleepLogDto) {
        SleepLogEntity sleepLogEntity = sleepLogMapper.mapFrom(sleepLogDto);
        SleepLogEntity savedSleepLogEntity = sleepLogRepository.save(sleepLogEntity);

        return sleepLogMapper.mapTo(savedSleepLogEntity);
    }

    @Override
    public SleepLogDto findOne(Long id) {
        SleepLogEntity foundSleepLogEntity = sleepLogRepository
                .findById(id)
                .orElseThrow(
                        () -> new RuntimeException("Sleep Log not found")
                );
        return sleepLogMapper.mapTo(foundSleepLogEntity);
    }


    @Override
    public Page<SleepLogDto> findAll(Pageable pageable) {
        Page<SleepLogEntity> sleepLogEntities = sleepLogRepository.findAll(pageable);
        return sleepLogEntities.map(sleepLogMapper::mapTo);
    }

    @Override
    public boolean exists(Long id) {
        return sleepLogRepository.existsById(id);
    }

    @Override
    public boolean delete(Long id) {
        if (sleepLogRepository.existsById(id)) {
            sleepLogRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
