package kr.co.service;

import java.util.List;

import kr.co.vo.BoardVO;

public interface BoardService {

//	글쓰기
	public void write(BoardVO boardVO) throws Exception;
	
//	게시판 조회
	public List<BoardVO> list() throws Exception;
	
//	게시물 조회
	public BoardVO read(int bno) throws Exception;
	
}
