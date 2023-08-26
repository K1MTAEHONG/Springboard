package com.study.Springboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller     // 컨트롤러 라는 어노테이션은 설정 해주면 재실행 할때 인식함
public class BoardController {

    @GetMapping("/board/write")  //localhost:8000/board/write //어떤url로 접근할지 지정해주는 어노테이션
    public String boardWriteForm(){

        return "boardWrite"; // boardWrite 페이지를 보여주겠다
    }
}
