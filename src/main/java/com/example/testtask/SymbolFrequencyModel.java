package com.example.testtask;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
public class SymbolFrequencyModel {
    Character key;
    Integer amount;

    @Override
    public String toString() {
        return key + ": " + amount;
    }
}
