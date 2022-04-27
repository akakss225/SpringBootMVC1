package com.study.board.service;

import com.study.board.entity.Board;
import com.study.board.repository.BoardRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public Page<Board> boardList(Pageable pageable) {
        return boardRepository.findAll(pageable);
    }

    // 게시글 상세
    public Board view(int id) {
        return boardRepository.findById(id).get();
    }

    // 게시글 삭제
    public void boardDelete(int id) {
        boardRepository.deleteById(id);
    }


}
