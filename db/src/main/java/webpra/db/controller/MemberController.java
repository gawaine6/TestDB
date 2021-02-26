package webpra.db.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class MemberController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
