package com.example.testtask.storage;

import com.example.testtask.SymbolFrequencyModel;

import java.util.HashMap;
import java.util.List;

public interface SymbolFrequencyStorage {
    List<SymbolFrequencyModel> count(String line);
}
