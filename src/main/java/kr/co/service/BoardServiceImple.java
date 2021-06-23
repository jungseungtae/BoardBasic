package kr.co.service;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import kr.co.dao.BoardDAO;
import kr.co.vo.BoardVO;
@Service
public class BoardServiceImple implements BoardService {

	@Inject
	private BoardDAO dao;
		
	@Override
	public void write(BoardVO boardVO) throws Exception {
		dao.write(boardVO);
	}

	@Override
	public List<BoardVO> list() throws Exception {
		return dao.list();
	}
	
	@Override
	public BoardVO read(int bno) throws Exception {
		return dao.read(bno);
	}
	
}
