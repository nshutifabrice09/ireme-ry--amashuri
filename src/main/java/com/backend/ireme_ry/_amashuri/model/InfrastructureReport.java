package com.backend.ireme_ry._amashuri.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table (name = "infrastructure_report")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InfrastructureReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;
    private LocalDateTime dateSubmitted;
    private boolean hasElectricity;
    private boolean hasInternet;
    private int numberOfClassrooms;
    private int numberOfComputers;
    private boolean cleanWaterAvailable;
    private boolean toiletsAvailable;

}
