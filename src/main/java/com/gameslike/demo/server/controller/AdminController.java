package com.gameslike.demo.server.controller;

import com.gameslike.demo.shared.dto.GameDTO;
import com.gameslike.demo.shared.dto.HTMLGenerator.HTMLGeneratorVariableDTO;
import com.gameslike.demo.shared.service.services.GameService;
import com.gameslike.demo.shared.service.services.HTMLGeneratorVariableService;
import com.gameslike.demo.shared.web.HTMLGeneratorVariableResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("admin/")
public class AdminController {

    @Autowired
    private GameService gameService;

    @Autowired
    private HTMLGeneratorVariableService htmlGeneratorVariableService;

    @RequestMapping(value = "/gamelist", method = RequestMethod.GET)
    public ModelAndView showAdminPage() {
        List<GameDTO> gameDTOS = gameService.findAll();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("gameList", gameDTOS);
        modelAndView.setViewName("admin");

        return modelAndView;
    }

    @RequestMapping(value = "addDescription/{id}", method = RequestMethod.GET)
    public ModelAndView addDDescription(@PathVariable("id") Integer id) {
        ModelAndView modelAndView = new ModelAndView();
        HTMLGeneratorVariableDTO result = new HTMLGeneratorVariableDTO();
        modelAndView.addObject("result", result);

        modelAndView.setViewName("adddescription");
        return modelAndView;
    }

    @RequestMapping(value = "addDescription/{id}/saveDescription", method = RequestMethod.POST)
    public ModelAndView saveDescription(@PathVariable("id") Integer id, @ModelAttribute HTMLGeneratorVariableDTO dto) {
        dto.setGame(gameService.findById(id));
        htmlGeneratorVariableService.save(dto);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("result", new HTMLGeneratorVariableDTO());
        modelAndView.setViewName("adddescription");
        return modelAndView;
    }

}
