package com.study.board.controller;

import com.study.board.entity.Board;
import com.study.board.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@AllArgsConstructor
public class BoardController {

//    @GetMapping("/")
//    @ResponseBody
//    public String main() {
//        return "Hello World!";
//    }
    private final BoardService boardService;

    @GetMapping("/board/write")
    public String boardWriteForm() {
        return "boardwrite";
    }

    @PostMapping("/board/writedo")
    public String boardWriteDo(Board board) {
        System.out.println("id = " + board.getId());
        System.out.println("title = " + board.getTitle());
        System.out.println("content = " + board.getContent());
        boardService.write(board);
        return "";
    }

    @GetMapping("/board/list")
    public String boardList(Model model) {
        model.addAttribute("list", boardService.boardList());
        return "boardlist";
    }

    @GetMapping("/board/view")
    public String boardView(Model model, int id) {
        model.addAttribute("board", boardService.view(id));
        return "boardview";
    }


}
