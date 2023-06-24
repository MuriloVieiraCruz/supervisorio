package com.br.supervisorio.services;

import com.br.supervisorio.entities.OperationWaterPump;
import com.br.supervisorio.entities.WaterLevel;
import com.br.supervisorio.repositories.OperationWaterPumpRepository;
import com.br.supervisorio.repositories.WaterLevelRepository;
import com.br.supervisorio.services.exceptions.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OperationWaterPumpService {

    private final OperationWaterPumpRepository operationWaterPumpRepository;

    public OperationWaterPump findById(Long id) {
        return operationWaterPumpRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("The id " + id + " was not found!"));
    }

    public List<OperationWaterPump> findAll() {
        return operationWaterPumpRepository.findAll();
    }

    public OperationWaterPump register(OperationWaterPump operationWaterPump) {
        return operationWaterPumpRepository.save(operationWaterPump);
    }

    public OperationWaterPump update( OperationWaterPump operationWaterPump) {
        return operationWaterPumpRepository.save(operationWaterPump);
    }
}
