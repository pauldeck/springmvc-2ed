package com.example.fake;
import java.util.ArrayList;
import java.util.List;

import com.example.dao.MemberDAO;
import com.example.model.Member;

public class MemberDAOFake implements MemberDAO {
    private List<Member> members = new ArrayList<>();
        
    @Override
    public void add(Member member) {
        members.add(member);
    }

    @Override
    public List<Member> getMembers() {
        return members;
    }
}