package com.example.testtask.storage;


import com.example.testtask.SymbolFrequencyModel;
import com.example.testtask.SymbolFrequencyService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.HashMap;

@ExtendWith(MockitoExtension.class)
class InMemorySymbolFrequencyStorageTest {

    @InjectMocks
    private SymbolFrequencyService symbolFrequencyService;
    @Mock
    private InMemorySymbolFrequencyStorage inMemorySymbolFrequencyStorage;

    @Test
    void testCount() {
        String line = "ssssllleeee";
        ArrayList<SymbolFrequencyModel> resultList = new ArrayList<>();
        resultList.add(new SymbolFrequencyModel('s', 2));
        resultList.add(new SymbolFrequencyModel('e', 5));
        resultList.add(new SymbolFrequencyModel('l', 3));

        Mockito.when(inMemorySymbolFrequencyStorage.count("line")).thenReturn();
        System.out.println(symbolFrequencyService.count("line"));


    }
}
