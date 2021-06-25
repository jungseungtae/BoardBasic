package kr.co.dao;

import java.util.List;

import kr.co.vo.ReplyVO;

public interface ReplyDAO {

//	댓글 조회
	public List<ReplyVO> readReply(int bno) throws Exception;
	
//	댓글 작성
	public void writeReply(ReplyVO vo) throws Exception;
	
//	수정
	public void updateReply(ReplyVO vo) throws Exception;
	
//	삭제
	public void deleteReply(ReplyVO vo) throws Exception;
	
//	상세조회
	public ReplyVO selectReply(int rno) throws Exception;
}
