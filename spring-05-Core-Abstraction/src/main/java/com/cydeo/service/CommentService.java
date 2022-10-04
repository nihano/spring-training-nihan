package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    // @Autowired
    private final CommentRepository commentRepository;
    /*
    GOOD PRACTICE: Use final keyword

    1) If you forget constructor and do not
    annotate with @Autowired these will not be injected. When
    you put final keyword, intelliJ will warn you that you
    forgot constructor because field is not initiated.

    2) Another case: you may add another field later,
    but forget to add it into the constructor.
    If you put final, it will warn you again.
     */

    //@Autowired
    private final CommentNotificationProxy commentNotificationProxy;


    //injection happens automatically when we create constructor (Autowired)
    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        //save in the DB
        //send email
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);

    }
}
