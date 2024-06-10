package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    /*
     * Optional은 null 일 경우, 감싸는 방식으로 null을 그대로 반환하지 않고 처리할 수 있음 (Java 8 기능)
     * */
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
