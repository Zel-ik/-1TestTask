package com.example.testtask;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;

@Controller(value = "/symbolFrequency")
@AllArgsConstructor
public class SymbolFrequencyController {

    @Autowired
    SymbolFrequencyService symbolFrequencyService;

    @PostMapping
    public List<SymbolFrequencyModel> count(@RequestBody String line) {
        return symbolFrequencyService.count(line);
    }
}
