package jpabook.jpashop;

import jpabook.jpashop.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member){
        em.persist(member);
        return member.getId();  //member가 들어갔는지 확인하는 수단으로 Id를 리턴한다 생각해라(설계방식중 하나라고하심)
    }

    public Member find(Long id){
        return em.find(Member.class, id);
    }
}
