package com.land.myapp.user.impl;

import com.land.myapp.user.MemberVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("memberDAO")
public class MemberDAO {

    @Autowired
    private SqlSessionTemplate mybatis;

    public void insesrtMember(MemberVO vo) {
        mybatis.insert("MemberVO.insertVO",vo);
    }
}
