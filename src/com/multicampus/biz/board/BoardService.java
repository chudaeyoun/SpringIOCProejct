package com.multicampus.biz.board;

import java.util.List;

// 3. service �������̽�
public interface BoardService {

	// BOARD ���̺�� ���õ� CRUD �޼ҵ�
	// �� ���
	void insertBoard(BoardVO vo);

	// �� ����
	void updateBoard(BoardVO vo);

	// �� ����
	void deleteBoard(BoardVO vo);

	// �� �� ��ȸ
	BoardVO getBoard(BoardVO vo);

	// �� ��� �˻�
	List<BoardVO> getBoardList();

}