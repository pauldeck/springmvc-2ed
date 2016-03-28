package com.example.service;

import java.util.List;

import com.example.dao.MemberDAO;
import com.example.model.Member;

public class MemberServiceImpl implements MemberService {

    private MemberDAO memberDAO;

    public void setMemberDAO(MemberDAO memberDAOArg) {
        this.memberDAO = memberDAOArg;
    }

    @Override
    public void add(Member member) {
        memberDAO.add(member);
    }

    @Override
    public List<Member> getMembers() {
        return memberDAO.getMembers();
    }

}