package com.study.Springboard.controller;

import com.study.Springboard.entity.Board;
import com.study.Springboard.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller     // 컨트롤러 라는 어노테이션은 설정 해주면 재실행 할때 인식함
public class BoardController {


    @Autowired
    private BoardService boardService;      //boardservice 가 어디 껀지 모르기때문에 Autowired 선언

    @GetMapping("/board/write")  //localhost:8000/board/write //어떤url로 접근할지 지정해주는 어노테이션
    public String boardWriteForm(){


        return "boardWrite"; // boardWrite 페이지를 보여주겠다
    }

    @PostMapping("/board/writepro") //form태그에 url일치해야함
    public String boardWritepro(Board board){  //매개변수 설정

        boardService.write(board);      //

        return "";
    }

    @GetMapping("board/list")
    public String boardList(Model model) {

        model.addAttribute ("list", boardService.boardList());

        return "boardlist";
    }

    @GetMapping("/board/view")  //localhost:8000/board/view?id=1
    public String boardView(Model model, Integer id) {          //다시 넘겨줄때는 model을 적어줘야함

        model.addAttribute("board", boardService.boardView(id));
        return "boardview";
    }

    @GetMapping("board/delete")
    public String boardDelete(Integer id){

        boardService.boardDelete(id);

        return "redirect:/board/list";      // 삭제 하면 다시 리스트 페이지 로 가게끔
    }


}
