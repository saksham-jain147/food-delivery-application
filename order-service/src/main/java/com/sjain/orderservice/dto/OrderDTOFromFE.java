package com.sjain.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTOFromFE {
    List<FoodItemsDTO> foodItemsList;
    private Integer userId;
    private Restaurant restaurant;
}
