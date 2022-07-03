package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.Board;

@Repository
public interface BoardDAO extends JpaRepository<Board, Integer> {
		
	
	//게시글 번호 자동부여
	@Query(value="select nvl(max(post_num),0)+1 from Board", nativeQuery=true)
	public int getNextPostNum();
	
	//조회수 추가하기
	@Query(value="select nvl(max(post_hit),0)+1 from Board", nativeQuery=true)
	public int plusPostHit();
	
//	//제목으로 게시글 찾기		
//	@Query(value="select * from Board where post_title like '%'||:post_title||'%'",nativeQuery = true)
//	public List<Board> findByPostTitle(String post_title);
//
//	//리뷰게시판출력 //말머리 컨디션 받았을떄(region_num, place_type_num 2개 placeDAO에서 먼저 받기)
//	@Query(value="select * from Board where place_num=:place_num",nativeQuery = true)
//	public List<Board> findByPlaceNum(int place_num);
//
//	//유저 번호로 쓴 글 출력(내가 쓴 글 출력)
//	@Query(value="select * from Board where user_num =:user_num order by post_regdate desc",nativeQuery = true)
//	public List<Board> findByUserNum(int user_num);
//	
//	//오늘의 추천게시물 + 게시물 상세보기(상세보기할때는 view_BoardDAO에서 먼저)
//	@Query(value="select * from Board where post_num=:post_num",nativeQuery = true)
//	public Board findByPostNum(int post_num);
		
	//게시글 등록 //
	@Modifying
	@Query(value="insert into Board b(b.board_num,b.post_num, b.user_num, b.post_title, b.post_content, b.post_regdate,"+
				"b.post_hit,b.place_num) values(:#{#b.board_num},:#{#b.post_num},:#{#b.userinfo.user_num},:#{#b.post_title},"+
				":#{#b.post_content},sysdate,0,null)",nativeQuery = true)
	@Transactional
	public void insert(@Param("b") Board b);

	//리뷰 게시글 등록 (region_num, place_type_num 2개 placeDAO에서 먼저)
	@Modifying
	@Query(value="insert into Board b(b.board_num,b.post_num, b.user_num, b.post_title, b.post_content, b.post_regdate,"+
				" b.post_hit,b.place_num) values(:#{#b.board_num},:#{#b.post_num},:#{#b.userinfo.user_num},:#{#b.post_title},"+
					":#{#b.post_content},sysdate,0,:#{#b.place.place_num})",nativeQuery = true)
	@Transactional
	public void insertReview(@Param("b") Board b);
	/*
	//게시글 수정
	@Modifying
	@Query("update Board b set b.post_title=:#{#post_title}, b.post_content=:{#post_content}"+
			"where b.post_num=:post_num and b.userinfo.user_num=:user_num")
	@Transactional
	public void update(@Param("b") Board b);
	
	//게시글 삭제 -이미지/댓글
	@Modifying
	@Query("delete Board b where b.post_num=:post_num")
	@Transactional
	public void delete(@Param("b") Board b);
	*/
}