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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public LocalDateTime getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(LocalDateTime dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    public boolean isHasElectricity() {
        return hasElectricity;
    }

    public void setHasElectricity(boolean hasElectricity) {
        this.hasElectricity = hasElectricity;
    }

    public boolean isHasInternet() {
        return hasInternet;
    }

    public void setHasInternet(boolean hasInternet) {
        this.hasInternet = hasInternet;
    }

    public int getNumberOfClassrooms() {
        return numberOfClassrooms;
    }

    public void setNumberOfClassrooms(int numberOfClassrooms) {
        this.numberOfClassrooms = numberOfClassrooms;
    }

    public int getNumberOfComputers() {
        return numberOfComputers;
    }

    public void setNumberOfComputers(int numberOfComputers) {
        this.numberOfComputers = numberOfComputers;
    }

    public boolean isCleanWaterAvailable() {
        return cleanWaterAvailable;
    }

    public void setCleanWaterAvailable(boolean cleanWaterAvailable) {
        this.cleanWaterAvailable = cleanWaterAvailable;
    }

    public boolean isToiletsAvailable() {
        return toiletsAvailable;
    }

    public void setToiletsAvailable(boolean toiletsAvailable) {
        this.toiletsAvailable = toiletsAvailable;
    }
}
