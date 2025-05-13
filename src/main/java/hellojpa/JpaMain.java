package hellojpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.RollbackException;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
//            Member member = new Member();
//            member.setId(1L);
//            member.setUsername("A");
//            member.setRoleType(RoleType.USER);
//
//            Member member2 = new Member();
//            member2.setId(2L);
//            member2.setUsername("A");
//            member2.setRoleType(RoleType.USER);
//
//            Member member3 = new Member();
//            member3.setId(3L);
//            member3.setUsername("B");
//            member3.setRoleType(RoleType.GUEST);
//
//            em.persist(member2);
//            em.persist(member3);

            Member member = new Member();
            member.setUsername("소연");

            em.persist(member);

            System.out.println("==========");

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}