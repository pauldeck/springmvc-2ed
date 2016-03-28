package com.example.dao;

import java.util.List;

import com.example.model.Member;

public interface MemberDAO {
    void add(Member member);
    List<Member> getMembers();
}
