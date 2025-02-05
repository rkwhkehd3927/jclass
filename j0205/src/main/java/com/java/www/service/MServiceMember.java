package com.java.www.service;

import java.util.ArrayList;

import com.java.www.dao.MemberDao;
import com.java.www.dto.MemberDto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MServiceMember implements Mservice {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// MemberDao 접근
		
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		MemberDao mdao = new MemberDao();
		list = mdao.mlist();
		for(MemberDto mdto :list) {
			System.out.println("-----------------------------");
			System.out.println("아이디: "+mdto.getId());
			System.out.println("이름: "+mdto.getName());
			System.out.println("성별: "+mdto.getGender());
			System.out.println("전화번호: "+mdto.getTel());
		}
		request.setAttribute("list", list);
	}
}
