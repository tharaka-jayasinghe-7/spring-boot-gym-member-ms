package com.example.memberms.Service;

import com.example.memberms.Data.Member;
import com.example.memberms.Data.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public List<Member> getAllMembers(){
        return memberRepository.findAll();
    }

    public Member createMember (Member member){
        return memberRepository.save(member);
    }

    public Member getMemberById(int id){
        Optional<Member> member = memberRepository.findById(id);
        if(member.isPresent()){
            return  member.get();
        }
        return null;
    }

    public void deleteMember(int id){
        memberRepository.deleteById(id);
    }

    public Member updateMember(Member member){
        return memberRepository.save(member);
    }

    public  List<Member> findMemberByFirstname(String firstname){
        return  memberRepository.findMemberByFirstname(firstname);
    }

    public List<Member> findMemberByLastname(String lastname){
        return memberRepository.findMemberByLastname(lastname);
    }

    public List<Member> findMemberByAddress(String address){
        return memberRepository.findMemberByAddress(address);
    }

}
