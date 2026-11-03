package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "quantity")
@EqualsAndHashCode(of = "brand")
public class CarWithLombok {
    private String model, brand, color;
    private int year, price, quantity;
}