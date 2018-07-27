package com.gameslike.demo.server.controller;

import com.gameslike.demo.shared.dto.GameDTO;
import com.gameslike.demo.shared.service.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("admin/")
public class AdminController {

    @Autowired
    private GameService gameService;


    @RequestMapping(value = "/gamelist", method = RequestMethod.GET)
    public ModelAndView showAdminPage() {
        List<GameDTO> gameDTOS = gameService.findAll();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("gameList", gameDTOS);
        modelAndView.setViewName("admin");

        return modelAndView;
    }

    @RequestMapping(value = "addDescription/{id}", method = RequestMethod.GET)
    public ModelAndView addDDescription(@PathVariable("id") Integer gameId) {
        ModelAndView modelAndView = new ModelAndView();
        GameDTO result = gameService.findById(gameId);
        modelAndView.addObject("result", result);
        modelAndView.setViewName("adddescription");
        return modelAndView;
    }

    @RequestMapping(value = "addDescription/{id}/saveDescription", method = RequestMethod.POST)
    public ModelAndView saveDescription(@PathVariable("id") Integer gameId, @ModelAttribute GameDTO dto) {
        GameDTO current = gameService.findById(gameId);
        current.setDetailedDescription(dto.getDetailedDescription());
        gameService.save(current);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("result", current);
        modelAndView.setViewName("adddescription");
        return modelAndView;
    }

}