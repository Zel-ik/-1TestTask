package com.example.testtask;

import com.example.testtask.storage.SymbolFrequencyStorage;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@AllArgsConstructor
public class SymbolFrequencyService {

    @Autowired
    SymbolFrequencyStorage symbolFrequencyStorage;

    public List<SymbolFrequencyModel> count(String line) {
        return symbolFrequencyStorage.count(line);
    }

}
