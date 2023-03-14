package com.land.myapp.model.user.impl;

import com.land.myapp.model.user.MemberVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("memberDAO")
public class MemberDAO {

    @Autowired
    private SqlSessionTemplate mybatis;

    //중복검사
    private int checkID(MemberVO vo) {
        return mybatis.selectOne("MemberDAO.checkID", vo);
    }

    //회원가입
    public void insertMember(MemberVO vo) {
        mybatis.insert("MemberDAO.insertVO",vo);
    }

    //회원수정
    public void updateMember(MemberVO vo) {
        mybatis.update("MemberDAO.updateMember",vo);
    }

    //회원삭제
    public void deleteMember(MemberVO vo) {
        mybatis.delete("MemberDAO.deleteMember", vo);
    }

    //회원검색
    public MemberVO getMember(MemberVO vo) {
       return mybatis.selectOne("MemberDAO.getMember", vo);
    }

    //회원목록
    public List<MemberVO> getMemberList(MemberVO vo) {
        return mybatis.selectList("MemberDAO.getMemberList", vo);
    }

}
