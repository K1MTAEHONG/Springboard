package com.study.Springboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller     // 컨트롤러 라는 어노테이션은 설정 해주면 재실행 할때 인식함
public class BoardController {

    @GetMapping("/board/write")  //localhost:8000/board/write //어떤url로 접근할지 지정해주는 어노테이션
    public String boardWriteForm(){

        return "boardWrite"; // boardWrite 페이지를 보여주겠다
    }
    @PostMapping("/board/writepro") //form태그에 url일치해야함
    public String boardWritepro(String title, String content){  //매개변수 설정

        System.out.println("제목 : " + title);
        System.out.println("내용: " + content);

        return "";
    }
}
