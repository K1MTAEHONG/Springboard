package com.study.Springboard.service;

import com.study.Springboard.entity.Board;
import com.study.Springboard.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service    //서비스는 컨트롤러에서 이용함
public class BoardService {

    @Autowired  //스프링 빈이 알아서 읽어서 디펜던시 익스펜션(BoardRepository 를 주입해줌)
    private BoardRepository boardRepository;

    //글 작성 처리
    public void write(Board board){ //매개변수 Board 선언

        boardRepository.save(board);
    }

    //게시글 리스트 처리
    public List<Board> boardList() {

        return  boardRepository.findAll();
    }

    //특정 게시글 불러오기
    public Board boardView(Integer id) {        //id 대신 1을넣으면 1번게시물을 불러옴

        return boardRepository.findById(id).get();    //Integer id 를 받아야댐 get으로 받아옴
    }
}
