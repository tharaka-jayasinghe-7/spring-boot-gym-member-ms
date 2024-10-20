package com.example.memberms.Controller;

import com.example.memberms.Data.Member;
import com.example.memberms.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class MemberController {

    @Autowired
    private MemberService memberService;
 
    @GetMapping(path = "/members")
    public List<Member> getAllMember() {
        return memberService.getAllMembers();
    }

    @PostMapping(path = "/members")
    public Member createMember(@RequestBody Member member) {
        return memberService.createMember(member);
    }

    @GetMapping(path = "/members/{id}")
    public Member getMemberById(@PathVariable int id) {
        return memberService.getMemberById(id);
    }

    @DeleteMapping(path = "/members/{id}")
    public void deleteMemberById(@PathVariable int id) {
        memberService.deleteMember(id);
    }

    @PutMapping(path = "/members/{id}")
    public Member updateMember(@RequestBody Member member) {

        return memberService.updateMember(member);
    }

    @GetMapping(path ="/members" , params = "firstname")
    public List<Member> findMemberByFirstname(@RequestParam String firstname){
        return memberService.findMemberByFirstname(firstname);
    }

    @GetMapping(path = "/members" , params = "lastname")
    public List<Member> findMemberByLastname(@RequestParam String lastname){
        return memberService.findMemberByLastname(lastname);
    }

    @GetMapping(path = "/members" , params = "address")
    public List<Member> findMemberByAddress(@RequestParam String address){
        return memberService.findMemberByAddress(address);
    }


}
