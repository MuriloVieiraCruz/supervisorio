package com.br.supervisorio.controllers;

import com.br.supervisorio.entities.OperationWaterPump;
import com.br.supervisorio.entities.WaterLevel;
import com.br.supervisorio.services.OperationWaterPumpService;
import com.br.supervisorio.services.WaterLevelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/operation_water_pump")
public class OperationWaterPumpController {

    private final OperationWaterPumpService operationWaterPumpService;

    @GetMapping("/{id}")
    public ResponseEntity<OperationWaterPump> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(operationWaterPumpService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<OperationWaterPump>> findAll() {
        return ResponseEntity.ok().body(operationWaterPumpService.findAll());
    }

    @PostMapping
    public ResponseEntity<OperationWaterPump> register(@RequestBody OperationWaterPump operationWaterPump) {
        return ResponseEntity.ok().body(operationWaterPumpService.register(operationWaterPump));
    }

    @PutMapping("/{id}")
    public ResponseEntity<OperationWaterPump> update(@RequestBody OperationWaterPump operationWaterPump) {
        return ResponseEntity.ok().body(operationWaterPumpService.update(operationWaterPump));
    }

}
