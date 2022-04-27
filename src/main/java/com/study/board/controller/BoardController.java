package com.study.board.controller;

import com.study.board.entity.Board;
import com.study.board.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    // 게시글 삭제
    @GetMapping("/board/delete")
    public String boardDelete(int id) {
        boardService.boardDelete(id);
        return "redirect:/board/list";
    }

    // 게시글 수정
    // 게시글 상세 페이지에서 수정 버튼 누르면 동작하는 API
    @GetMapping("/board/modify/{id}")
    public String boardModify(@PathVariable("id") int id, Model model) {
        model.addAttribute("board", boardService.view(id));
        return "boardmodify";
    }

    // 실제 수정이 일어나는 API
    @PostMapping("/board/update/{id}")
    public String boardUpdate(@PathVariable("id") int id, Board board){

        Board boardTemp = boardService.view(id);

        boardTemp.setTitle(board.getTitle());
        boardTemp.setContent(board.getContent());

        boardService.write(boardTemp);

        return "redirect:/board/list";
    }


}
