package com.study.board.controller;

import com.study.board.entity.Board;
import com.study.board.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
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
    public String boardWriteDo(Board board, Model model) {
//        System.out.println("id = " + board.getId());
//        System.out.println("title = " + board.getTitle());
//        System.out.println("content = " + board.getContent());
        boardService.write(board);
        model.addAttribute("message", "Success a Write");
        model.addAttribute("searchUrl", "/board/list");
        return "message";
    }

    // 게시글 리스트
    @GetMapping("/board/list")
    public String boardList(Model model, @PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.DESC) Pageable pageable) {

        Page<Board> list = boardService.boardList(pageable);

        int nowPage = list.getPageable().getPageNumber() + 1;
        int startPage = Math.max(nowPage - 4, 1);
        int endPage = Math.min(nowPage + 5, list.getTotalPages());

        model.addAttribute("list", list);
        model.addAttribute("nowPage", nowPage);
        model.addAttribute("startPage", startPage);
        model.addAttribute("endPage", endPage);

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
