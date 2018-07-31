package com.gameslike.demo.server.form;

import com.gameslike.demo.shared.dto.GameDTO;
import com.gameslike.demo.shared.dto.UserDTO;

import java.sql.Timestamp;

public class CommentForm {

    private String content;
    private Timestamp time;
    private boolean recommended;

    public boolean isRecommended() {
        return recommended;
    }

    public void setRecommended(boolean recommended) {
        this.recommended = recommended;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
