package com.example.testtask;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Controller(value = "/symbolFrequency")
@AllArgsConstructor
public class SymbolFrequencyController {

    @Autowired
    SymbolFrequencyService symbolFrequencyService;

    @PostMapping
    public ArrayList<SymbolFrequencyModel> count(@RequestBody String line) {
        return symbolFrequencyService.count(line);
    }
}
