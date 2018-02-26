package application.controllers;


import application.utils.requests.UserSignInRequest;
import application.utils.responses.Message;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpSession;




@RestController
@RequestMapping("/alexalone")
public class SessionController {
    private static final String JSON = MediaType.APPLICATION_JSON_UTF8_VALUE; // "application/json;charset=UTF-8"


    @GetMapping(path = "/signup", consumes = JSON, produces = JSON)
    public Message signup(@RequestBody UserSignInRequest body, HttpSession httpSession) {

        return new Message("Created user " + body.getLogin());
    }
}
