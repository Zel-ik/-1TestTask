package com.example.testtask.Storage;

import java.util.HashMap;

public interface SymbolFrequencyStorage {
    HashMap<Character, Integer> count(String line);
}
