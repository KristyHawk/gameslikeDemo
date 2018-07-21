package com.gameslike.demo.server.util;

import com.gameslike.demo.shared.dto.HTMLGenerator.HTMLGeneratorVariableDTO;
import com.gameslike.demo.shared.service.services.HTMLGeneratorVariableService;
import org.springframework.beans.factory.annotation.Autowired;

public class RandomUtil {

    @Autowired
    HTMLGeneratorVariableService htmlGeneratorVariableService;

    public int generateRandomId() {
        int id = 1 + (int) (Math.random() * 10000);
        if(htmlGeneratorVariableService.findById(id) != null) {
            generateRandomId();
        }
        return id;
    }
}
