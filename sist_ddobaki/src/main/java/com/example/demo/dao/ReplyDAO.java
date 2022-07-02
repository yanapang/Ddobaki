package com.example.demo.dao;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.vo.Reply;


public interface ReplyDAO extends JpaRepository<Reply, Integer> {
	/*
	//게시글 하나씩 클릭할 때마다 해당 게시글에 딸려있는 댓글들 모두 뿌리기
	@Query("select * from Reply where post_num=:post_num")
	public List<Reply> findByPostNum(int post_num);
	
	//user_num이 지금 로그인한 사용자면 자기가 쓴 댓글 개별로 삭제 가능하게 하기
	@Modifying
	@Query("delete Reply where user_num=:user_num and reply_num=:reply_num")
	@Transactional
	public void deleteMyReplyOneByOne(int user_num, int reply_num);
	
	//모두에게 삭제버튼 보는거 까지는 허용할지 아니면 나만 삭제버튼 보이게 할건지
	//게시글 작성 사용자가 게시글을 지운다고 하면 그 사용자가 쓴 댓글 아니어도 그 게시글에 딸려있는 모든 댓글 다 삭제 처리
	@Modifying
	@Query("delete Reply where post_num=:post_num")
	@Transactional
	public void deleteReplyInMyPost(int post_num);
	
	//댓글 등록버튼 하나씩 누를 때마다 db에 insert되기 전에 댓글 넘버 부여
	@Query("select nvl(max(reply_num),0)+1 from Reply")
	public int getNextReplyNum();
	
	//insert댓글(매개변수는 지금 로그인한 사용자의 user_num이랑 지금 클릭한 게시글의 post_num)
	@Modifying
	@Query(value="insert into Reply rp(rp.reply_num, rp.post_num, rp.user_num, rp.reply_group, rp.reply_level, rp.reply_step, rp.reply_content) "+ 
			"values(:#{#rp.reply_num}, :#{#rp.board.post_num}, :#{#rp.userinfo.user_num}, :#{#rp.reply_num}, 0, 0, :#{#rp.reply_content})", nativeQuery=true)
	@Transactional
	public void insertReply(@Param("rp") Reply rp);
	
	
	
	//--------------------------------------------------insert대댓글-----------------------------------
	//댓글 등록버튼 하나씩 누를 때마다 db에 insert되기 전에 댓글 넘버 부여
	//@Query("select nvl(max(reply_num),0)+1 from Reply")
	//public int getNextReplyNum();
	
	//부모 댓글의 답글쓰기 클릭했을 때 동작하는 쿼리 
	//부모 댓글의 그룹 가져옴
	@Query("select reply_group from Reply where reply_num=:reply_num")
	public int getReplyInfo(int reply_num);
	
	//대댓글 쓰고 나서 등록 버튼 누름과 동시에 동작하는 쿼리
	//해당 댓글 그룹 내에서 순서가 자동으로 부여됨
	@Query("select nvl(max(reply_step),0)+1 from Reply where reply_group=:reply_group")
	public int getNextReplyStepByReplyGroup(int reply_group);
	
	//insert대댓글
	//부모 댓글의 답글쓰기 누르고 내용 작성하고 등록버튼 클릭과 동시에 동작하는 쿼리
	//여기 선생님께 여쭤보기
	@Modifying
	@Query(value="insert into Reply rp(rp.reply_num, rp.post_num, rp.user_num, rp.reply_group, rp.reply_level, rp.reply_step, rp.reply_content) "+ 
			"values(:#{#rp.reply_num}, :#{#rp.board.post_num}, :#{#rp.reply_group}, 1, :#{#rp.reply_step}, :#{#rp.reply_content})", nativeQuery=true)
	@Transactional
	public void insertRefReply(@Param("rp") Reply rp);
	
	
	//뷰로 만들어야할거 : 댓글에 닉네임 뿌리기 처리 (댓글 닉네임이든 대댓글의 부모댓글의 닉네임이든)
//	create view View_UserInfoAndReply
//	as
//	select u.user_num, user_nick, reply_num, reply_content from UserInfo u, Reply rp where rp.user_num=u.user_num;
*/
}
