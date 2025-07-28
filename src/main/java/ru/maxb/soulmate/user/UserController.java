package ru.maxb.soulmate.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users/v1")
public class UserController {

    @GetMapping("")
    public String test() {
        return "Hello World";
    }
}
