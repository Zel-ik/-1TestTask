package com.example.testtask.storage;

import java.util.HashMap;

public interface SymbolFrequencyStorage {
    HashMap<Character, Integer> count(String line);
}
