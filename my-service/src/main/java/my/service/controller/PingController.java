package my.service.controller;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.HashMap;
import java.util.Map;


@RestController
@EnableWebMvc
public class PingController {
    @RequestMapping(path = "/ping", method = RequestMethod.GET)
    public Map<String, String> ping() {
        Map<String, String> pong = new HashMap<>();
        pong.put("ping", "Hello, World!");
        return pong;
    }

    @RequestMapping(path = "/rang", method = RequestMethod.GET)
    public Map<String, String> rang() {
        Map<String, String> pong = new HashMap<>();
        pong.put("rang", "Hello, rang!");
        return pong;
    }
}
