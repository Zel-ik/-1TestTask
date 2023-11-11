package com.example.testtask;

import com.example.testtask.storage.SymbolFrequencyStorage;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@AllArgsConstructor
public class SymbolFrequencyService {

    @Autowired
    SymbolFrequencyStorage symbolFrequencyStorage;

    public HashMap<Character, Integer> count(String line) {
        return symbolFrequencyStorage.count(line);
    }

}
