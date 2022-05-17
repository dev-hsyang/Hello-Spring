package kr.ac.ajou.hellospring.repository;

import kr.ac.ajou.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// JpaRepository를 갖고 있는 interface는 JPA가 자동으로 스프링 컨테이너에 등록해준다.
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    @Override
    Optional<Member> findByName(String name);

}
