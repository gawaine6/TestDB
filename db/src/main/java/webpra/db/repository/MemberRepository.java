package webpra.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webpra.db.domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByName(String name);
}
