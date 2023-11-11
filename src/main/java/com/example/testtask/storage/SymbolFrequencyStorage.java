package com.example.testtask.storage;

import com.example.testtask.SymbolFrequencyModel;

import java.util.ArrayList;

public interface SymbolFrequencyStorage {
    ArrayList<SymbolFrequencyModel> count(String line);
}
