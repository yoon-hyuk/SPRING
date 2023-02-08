package com.mc.mvc.member.service;

import com.mc.mvc.member.dto.Member;
import com.mc.mvc.member.validator.form.SignUpForm;

public interface MemberService {
	
	Member selectUserById();


	void authenticateEmail(SignUpForm form, String authToken);

	boolean existUser(String userId);

	void insertNewMember(SignUpForm form);


	Member authenticateUser(Member member);
	
}
