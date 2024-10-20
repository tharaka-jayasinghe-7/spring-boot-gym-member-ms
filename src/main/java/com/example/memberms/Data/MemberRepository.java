package com.example.memberms.Data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
    @Query("SELECT m FROM Member m where m.firstname = ?1")
    List<Member> findMemberByFirstname(String firstname);

    @Query("SELECT m FROM Member m where m.lastname = ?1")
    List<Member> findMemberByLastname(String lastname);

    @Query("SELECT m FROM Member m where m.address = ?1")
    List<Member> findMemberByAddress(String address);

}
