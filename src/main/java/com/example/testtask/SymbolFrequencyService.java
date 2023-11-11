package com.example.testtask;

import com.example.testtask.storage.SymbolFrequencyStorage;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@AllArgsConstructor
public class SymbolFrequencyService {

    @Autowired
    SymbolFrequencyStorage symbolFrequencyStorage;

    public ArrayList<SymbolFrequencyModel> count(String line) {
        return symbolFrequencyStorage.count(line);
    }

}
