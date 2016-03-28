package com.example.service;

import org.junit.Assert;
import org.junit.Test;

import com.example.dao.MemberDAO;
import com.example.fake.MemberDAOFake;
import com.example.model.Member;

public class MemberServiceImplTest {

    @Test
    public void testAddMember() {
        MemberDAO memberDAO = new MemberDAOFake();
        memberDAO.add(new Member(1, "John Diet"));
        memberDAO.add(new Member(2, "Jane Biteman"));
        Assert.assertEquals(2, memberDAO.getMembers().size());
    }
}
