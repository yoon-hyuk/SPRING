package com.mc.mvc.member.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.mc.mvc.member.dto.Member;
import com.mc.mvc.member.validator.form.SignUpForm;


@Repository
public interface MemberRepository {

	// UserId로 user검색
	@Select("SELECT * FROM member WHERE user_id = #{userId}")
	 Member selectMemberByUserId(@Param("userId") String userId);

	// user 추가
	@Insert("insert into member (user_id, password, tell, email) "
			+ "values(#{userId}, #{password}, #{tell},#{email})")
	void insertMember(SignUpForm form);

	// email로 유저검색
	@Select("select * from member where email = #{email}")
	Member selectMemberByEmail(String email);

	
}
