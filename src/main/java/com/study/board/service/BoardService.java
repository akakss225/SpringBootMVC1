package com.study.board.service;

import com.study.board.entity.Board;
import com.study.board.repository.BoardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    // 글 작성
    public void write(Board board){
        boardRepository.save(board);
    }

    // 게시글 리스트
    public List<Board> boardList() {
        return boardRepository.findAll();
    }

    // 게시글 상세
    public Board view(int id) {
        return boardRepository.findById(id).get();
    }


}
