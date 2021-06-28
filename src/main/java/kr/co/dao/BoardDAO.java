package kr.co.dao;

import java.util.List;

import kr.co.vo.BoardVO;
import kr.co.vo.Criteria;
import kr.co.vo.SearchCriteria;

public interface BoardDAO {

//	글쓰기
	public void write(BoardVO boardVO) throws Exception;
	
//	게시판 조회
	public List<BoardVO> list(SearchCriteria scri) throws Exception;
	
//	게시물 총 갯수
	public int listCount(SearchCriteria scri) throws Exception;
	
//	게시물 조회
	public BoardVO read(int bno) throws Exception;
	
//	게시물 수정
	public void update(BoardVO boardVO) throws Exception;
	
//	게시물 삭제
	public void delete(int bno) throws Exception;
	
}
