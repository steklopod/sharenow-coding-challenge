package com.teenthofabud.codingchallenge.sharenow.position.model.vo.car;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarMappedVO {

    private String vin;
    private String model;
    private String numberPlate;
    private PositionVO position;

}
