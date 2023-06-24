package com.br.supervisorio.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
public class OperationWaterPump {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Integer id;

    @Column(nullable = false, unique = true)
    private boolean waterPump;

    @Column(nullable = false, unique = true)
    private boolean solenoid;

    @Column(nullable = false, unique = true)
    private boolean manual;
}
