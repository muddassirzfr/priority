package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class PriorityArea {
    @GeneratedValue
    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    AreaName areaName;
    Integer satisfactionRate;

}
