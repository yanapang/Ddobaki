package com.example.demo.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationViewId implements Serializable {

    @Column(name = "place_name")
    private String place_name;

    @Column(name = "room_name")
    private String room_name;
}