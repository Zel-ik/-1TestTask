package com.example.testtask.storage;

import com.example.testtask.SymbolFrequencyModel;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;
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
    public List<SymbolFrequencyModel> count(String line) {
        List<SymbolFrequencyModel> resultList = new ArrayList<>();
        char[] chars = line.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();

        for (Character c : chars) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }

        for(Character c : charMap.keySet()){
            resultList.add(new SymbolFrequencyModel(c,charMap.get(c)));
        }

        resultList = resultList.stream()
                .sorted(Comparator.comparing(SymbolFrequencyModel::getAmount))
                .collect(Collectors.toList());

        return resultList;
    }
}
