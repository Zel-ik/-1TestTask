package com.example.testtask;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class SymbolFrequencyModel {
    Character key;
    Integer amount;

    @Override
    public String toString() {
        return key + ": " + amount;
    }
}
