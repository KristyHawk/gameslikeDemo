package com.gameslike.demo.server.controller;

import com.gameslike.demo.server.form.CommentForm;
import com.gameslike.demo.server.form.ResultWEB;
import com.gameslike.demo.shared.dto.CommentDTO;
import com.gameslike.demo.shared.dto.GameDTO;
import com.gameslike.demo.shared.dto.TagDTO;
import com.gameslike.demo.shared.dto.UserDTO;
import com.gameslike.demo.shared.service.services.CommentService;
import com.gameslike.demo.shared.service.services.GameService;
import com.gameslike.demo.shared.service.services.TagService;
import com.gameslike.demo.shared.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private UserService userService;

    @Autowired
    private GameService gameService;

    @Autowired
    private TagService tagService;

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public
        ModelAndView mostPopularGame() {
            List<GameDTO> gameDTOS = gameService.findAllAndSortByPopularityRate();
            List<GameDTO> newGameDTOS = gameService.findAllAndSortByReleaseDate();
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("newGameList", newGameDTOS);
            modelAndView.addObject("popularGameList", gameDTOS);
            modelAndView.setViewName("index");

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
        List<TagDTO> tags = tagService.findByGameId(id);
        List<GameDTO> relatedGamesByTags = gameService.findRelatedGamesByTags(tags);
        List<CommentDTO> commentsList = commentService.findAllByGameId(id);
        CommentForm comment = new CommentForm();

        modelAndView.addObject("comment", comment);
        modelAndView.addObject("commentsList", commentsList);
        modelAndView.addObject("relatedGameList", relatedGamesByTags);
        modelAndView.addObject("tagList", tags);
        modelAndView.addObject("gameDTO", gameDTO);
        modelAndView.setViewName("gamepage");
        return modelAndView;
    }

    @RequestMapping(value = "gamepage/{id}/addComment", method = RequestMethod.POST, consumes = "application/json; charset=utf-8", produces = "application/json; charset=utf-8")
    @ResponseBody
    public CommentForm addComment(@PathVariable("id") Integer id, @RequestBody CommentForm comment, Principal principal) {

        CommentDTO dto = new CommentDTO();
        dto.setGame(gameService.findById(id));
        dto.setUser(userService.findByUsername(principal.getName()));
        dto.setCreationDate(new java.sql.Timestamp(System.currentTimeMillis()));
        dto.setPositive(comment.isRecommended());
        dto.setContent(comment.getContent());
        comment.setTime(new java.sql.Timestamp(System.currentTimeMillis()));
        commentService.add(dto);

        return comment;
    }

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String home(ModelMap model, Authentication authentication) {
        authentication.getPrincipal();
        model.addAttribute("user", userService.findByUsername(authentication.getName()));
        return "home";
    }

    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public String error() {
        return "error";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/";
    }

    @RequestMapping(value = "registration", method = RequestMethod.GET)
    public ModelAndView registration() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("newuser", new UserDTO());
        modelAndView.setViewName("registration");
        return modelAndView;
    }




}
