package com.letrangerv.trafficanalyzer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * MainController class.
 *
 * @author LetrangerV
 * @version 1.0
 * @since 30.11.2015
 */
@Controller
@RequestMapping("/")
public class MainController {
    public String launch() {
        return "index";
    }
}
