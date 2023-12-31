package com.myweb.www.service;

import java.util.List;

import com.myweb.www.domain.BoardDTO;
import com.myweb.www.domain.BoardVO;
import com.myweb.www.domain.FileVO;
import com.myweb.www.domain.PagingVO;

public interface BoardService {

//	int insert(BoardVO bvo);

	List<BoardVO> getList(PagingVO pagingVO);

	BoardDTO getDetail(long bno);

	int modify(BoardDTO bdto);

	int remove(long bno);

	int getTotalCount(PagingVO pagingVO);

	int insert(BoardDTO boardDTO);

	int removeFile(String uuid);

	FileVO getFile(String uuid);

}
