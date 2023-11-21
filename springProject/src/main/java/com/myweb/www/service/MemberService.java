package com.myweb.www.service;

import java.util.List;

import com.myweb.www.security.MemberVO;

public interface MemberService {

	int register(MemberVO mvo);

	boolean updateLastLogin(String authEmail);

	List<MemberVO> selectList();

	MemberVO detail(String email);

	int modify(MemberVO mvo);

	int modifyPwdEmpty(MemberVO mvo);

	int remove(String email);

}
