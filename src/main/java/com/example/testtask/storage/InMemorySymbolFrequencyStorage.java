package com.example.testtask.storage;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

@Component
public class InMemorySymbolFrequencyStorage implements SymbolFrequencyStorage {

    public <K, V extends Comparable<? super V>> Map<K, V>
    sortByValue( Map<K, V> map )
    {
        Map<K,V> result = new LinkedHashMap<>();
        Stream<Map.Entry<K,V>> st = map.entrySet().stream();

        st.sorted(Map.Entry.comparingByValue())
                .forEach(e ->result.put(e.getKey(),e.getValue()));

        return result;
    }
    @Override
    public HashMap<Character, Integer> count(String line) {
        char[] chars = line.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();

        for (Character c : chars) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }

        sortByValue(charMap);

        return charMap;
    }
}
