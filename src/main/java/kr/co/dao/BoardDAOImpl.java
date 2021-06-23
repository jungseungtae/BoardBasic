package kr.co.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.vo.BoardVO;
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
	public List<BoardVO> list() throws Exception {
		return sqlSession.selectList("boardMapper.list");
	}

//	게시물 조회
	public BoardVO read(int bno) throws Exception {
		return sqlSession.selectOne("boardMapper.read", bno);
	}
}
