package com.chaits.microservices.limitsservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class LimitConfiguration {
    private int maximum;
    private int minimum;
}
