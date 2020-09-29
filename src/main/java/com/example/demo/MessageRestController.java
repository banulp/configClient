package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author banulp
 */
@RefreshScope
@RestController
class MessageRestController {

    @Value("${message:'NW'}")
    private String message;

    @Value("${friends:'NW'}")
    private String friends;

    @Value("${words:'NW'}")
    private String words;

    @Value("${books:'NW'}")
    private String books;

    @RequestMapping("/message")
    public String getMessage() {
        return this.message;
    }

    @RequestMapping("/friends")
    public String getFriends() {
        return this.friends;
    }

    @RequestMapping("/total")
    public List<String> getTotal() {
        return List.of("message is " + message, "friends is " + friends, "words is " + words, "books is " + books);
    }

}
