package com.example.service;

import java.util.List;

import com.example.model.Member;

public interface MemberService {
    public void add(Member member);

    public List<Member> getMembers();

}