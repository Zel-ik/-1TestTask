package com.example.testtask.storage;


import com.example.testtask.SymbolFrequencyService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;

@ExtendWith(MockitoExtension.class)
class InMemorySymbolFrequencyStorageTest {

    @InjectMocks
    private SymbolFrequencyService symbolFrequencyService;
    @Mock
    private InMemorySymbolFrequencyStorage inMemorySymbolFrequencyStorage;

    @Test
    void testCount() {
        HashMap<Character, Integer> charLine = new HashMap<>();
        HashMap<Character, Integer> expectedCharLine = new HashMap<>();

        expectedCharLine.put('e', 4);
        expectedCharLine.put('l', 3);
        expectedCharLine.put('s', 2);

        Mockito.when(inMemorySymbolFrequencyStorage.count("ssllleeee")).thenReturn(expectedCharLine);

        symbolFrequencyService.count("ssllleeee");


    }
}
