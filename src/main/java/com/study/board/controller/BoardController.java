package com.study.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

//    @GetMapping("/")
//    @ResponseBody
//    public String main() {
//        return "Hello World!";
//    }

    @GetMapping("/board/write")
    public String boardWriteForm() {
        return "boardwrite";
    }

    @PostMapping("/board/writedo")
    public String boardWriteDo(String title, String content) {
        System.out.println("title = " + title);
        System.out.println("content = " + content);
        return "";
    }

}
