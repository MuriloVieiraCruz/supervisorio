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

    @PutMapping("/manual/{id}")
    public ResponseEntity<OperationWaterPump> updateManual(@PathVariable Long id, @RequestBody boolean newManualValue) {
        OperationWaterPump operationWaterPump = operationWaterPumpService.updateManualValue(id, newManualValue);
        return ResponseEntity.ok().body(operationWaterPump);
    }

    @PutMapping("/solenoid/{id}")
    public ResponseEntity<OperationWaterPump> updateSolenoid(@PathVariable Long id, @RequestBody boolean newSolenoidlValue) {
        OperationWaterPump operationWaterPump = operationWaterPumpService.updateSolenoidValue(id, newSolenoidlValue);
        return ResponseEntity.ok().body(operationWaterPump);
    }

    @PutMapping("/water_pump/{id}")
    public ResponseEntity<OperationWaterPump> updateWaterPump(@PathVariable Long id, @RequestBody boolean newWaterPumpValue) {
        OperationWaterPump operationWaterPump = operationWaterPumpService.updateWaterPumpValue(id, newWaterPumpValue);
        return ResponseEntity.ok().body(operationWaterPump);
    }
}
