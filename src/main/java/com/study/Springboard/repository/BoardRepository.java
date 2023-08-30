package com.study.Springboard.repository;

import com.study.Springboard.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board,Integer> { //Board로 지정해준거 중에 @id 지정해준게 integer라 넣음>
}
