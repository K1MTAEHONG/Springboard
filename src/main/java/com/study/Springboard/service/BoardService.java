package com.study.Springboard.service;

import com.study.Springboard.entity.Board;
import com.study.Springboard.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;
    public void write(Board board){

        boardRepository.save(board);
    }
}
