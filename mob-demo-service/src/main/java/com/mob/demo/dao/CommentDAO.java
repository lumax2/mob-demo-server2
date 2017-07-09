package com.mob.demo.dao;

import com.lamfire.mongodb.DAOSupport;
import com.mob.demo.domain.Comment;
import org.springframework.stereotype.Component;

@Component
public class CommentDAO extends DAOSupport<Comment, String> {

    public CommentDAO() {
        super("interact", "REC_INTERACT");
    }

}
