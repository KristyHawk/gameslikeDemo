package com.gameslike.demo.server.form;

import com.gameslike.demo.shared.dto.GameDTO;
import com.gameslike.demo.shared.dto.UserDTO;

public class CommentForm {

    private boolean isPositive;
    private String content;


    public boolean isPositive() {
        return isPositive;
    }

    public void setPositive(boolean positive) {
        isPositive = positive;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
