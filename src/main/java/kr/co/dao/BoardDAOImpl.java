package kr.co.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.vo.BoardVO;
import kr.co.vo.Criteria;
import kr.co.vo.SearchCriteria;
@Repository
public class BoardDAOImpl implements BoardDAO {

//	주입
	@Inject
	private SqlSession sqlSession;
	
//	쓰기
	@Override
	public void write(BoardVO boardVO) throws Exception {
		sqlSession.insert("boardMapper.insert", boardVO);
		System.out.println("저장 성공");
	}

//	게시판 조회
	@Override
	public List<BoardVO> list(SearchCriteria scri) throws Exception {
		return sqlSession.selectList("boardMapper.listPage", scri);
	}
	
//	게시물 총 갯수
	@Override
	public int listCount(SearchCriteria scri) throws Exception {
		return sqlSession.selectOne("boardMapper.listCount", scri);
	}

//	게시물 조회
	public BoardVO read(int bno) throws Exception {
		return sqlSession.selectOne("boardMapper.read", bno);
	}

	// 게시물 수정
	@Override
	public void update(BoardVO boardVO) throws Exception {
		sqlSession.update("boardMapper.update", boardVO);
	}

	// 게시물 삭제
	@Override
	public void delete(int bno) throws Exception {
		sqlSession.delete("boardMapper.delete", bno);
	}

}
