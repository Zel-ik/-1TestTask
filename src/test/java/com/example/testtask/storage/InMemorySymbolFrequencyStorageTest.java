package com.example.testtask.storage;


import com.example.testtask.SymbolFrequencyModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

class InMemorySymbolFrequencyStorageTest {

    private final InMemorySymbolFrequencyStorage inMemorySymbolFrequencyStorage = new InMemorySymbolFrequencyStorage();


    @Test
    void testCountCorrectWork() {
        // Тест на корректную работу метода при правильных вводных значениях

        String line = "ssssllleeee";
        ArrayList<SymbolFrequencyModel> resultList = new ArrayList<>();
        resultList.add(new SymbolFrequencyModel('s', 4));
        resultList.add(new SymbolFrequencyModel('e', 4));
        resultList.add(new SymbolFrequencyModel('l', 3));


        Assertions.assertEquals(inMemorySymbolFrequencyStorage.count(line), resultList);
    }

    @Test()
    void testCountLineIsNull() {
        String line = "";
        try {
            inMemorySymbolFrequencyStorage.count(line);
        } catch (IllegalArgumentException thrown) {
            System.out.println("Error was caught in test method");
        }

    }

}
