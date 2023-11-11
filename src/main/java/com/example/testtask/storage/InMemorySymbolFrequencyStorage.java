package com.example.testtask.storage;

import com.example.testtask.SymbolFrequencyModel;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class InMemorySymbolFrequencyStorage implements SymbolFrequencyStorage {

    @Override
    public ArrayList<SymbolFrequencyModel> count(String line) {
        if (line.isEmpty()) {
            throw new IllegalArgumentException("String line is empty");
        }

        ArrayList<SymbolFrequencyModel> resultList = new ArrayList<>();
        char[] chars = line.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();

        // В цикле ниже, все char переменные из массива chars добавляем в hashMap,
        // для более простого подсчета одинаковых значений
        for (Character c : chars) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }

//      В цикле ниже обходим весь HashMap charMap и, создавая Объект SymbolFrequency, добавляем в ArrayList resultList
        for (Character c : charMap.keySet()) {
            resultList.add(new SymbolFrequencyModel(c, charMap.get(c)));
        }

        // сортируем список
        resultList.sort((o1, o2) -> o2.getAmount()- o1.getAmount());

        return resultList;
    }
}
