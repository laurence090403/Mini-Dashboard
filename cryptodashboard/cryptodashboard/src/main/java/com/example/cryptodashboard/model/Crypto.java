package com.example.cryptodashboard.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Crypto {
    private String id;
    private String name;
    private double current_price;
    private double price_change_percentage_24h;
}
