package com.gameslike.demo.server.controller;

import com.gameslike.demo.shared.dto.GameDTO;
import com.gameslike.demo.shared.dto.TagDTO;
import com.gameslike.demo.shared.service.services.GameService;
import com.gameslike.demo.shared.service.services.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private GameService gameService;

    @Autowired
    private TagService tagService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public
        ModelAndView mostPopularGame() {
            List<GameDTO> gameDTOS = gameService.findAllAndSortByPopularityRate();

            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("popularGameList", gameDTOS);
            modelAndView.setViewName("index");

            return modelAndView;
    }

    @RequestMapping(value = "/witcher", method = RequestMethod.GET)
    public
    ModelAndView witcher() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("witcher");
        return modelAndView;
    }

    @RequestMapping(value = "/shop", method = RequestMethod.GET)
    public ModelAndView viewShop() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("shop");
        return modelAndView;
    }

    @RequestMapping(value = "/wishList", method = RequestMethod.GET)
    public ModelAndView viewWishList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("wishList");
        return modelAndView;
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView admin() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin");
        return modelAndView;
    }

    @RequestMapping(value = "gamepage/{id}", method = RequestMethod.GET)
    public ModelAndView showGamePage(@PathVariable("id") Integer id) {
        GameDTO gameDTO = gameService.findById(id);
        ModelAndView modelAndView = new ModelAndView();
        List<TagDTO> list = tagService.findByGameId(id);
        modelAndView.addObject("tagList", list);
        modelAndView.addObject("gameDTO", gameDTO);
        modelAndView.setViewName("gamepage");
        return modelAndView;
    }
}
