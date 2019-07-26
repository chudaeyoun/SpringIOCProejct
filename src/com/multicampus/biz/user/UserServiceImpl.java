package com.multicampus.biz.user;

import java.util.List;

// 4. Service ���� Ŭ����
public class UserServiceImpl implements UserService {
	private UserDAO userDAO;

	public UserServiceImpl() {
		System.out.println("===> UserServiceImpl ����");
	}
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void insertUser(UserVO vo) {
		userDAO.insertUser(vo);
	}

	public void updateUser(UserVO vo) {
		userDAO.updateUser(vo);
	}

	public void deleteUser(UserVO vo) {
		userDAO.deleteUser(vo);
	}

	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}

	public List<UserVO> getUserList() {
		return userDAO.getUserList();
	}

}
