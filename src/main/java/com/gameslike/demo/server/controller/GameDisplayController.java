package com.gameslike.demo.server.controller;

import com.gameslike.demo.shared.dto.GameDTO;
import com.gameslike.demo.shared.service.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/gamesss")
public class GameDisplayController {

    @Autowired
    private GameService gameService;



}
