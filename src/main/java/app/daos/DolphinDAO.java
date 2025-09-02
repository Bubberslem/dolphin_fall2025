package app.daos;

import app.entities.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class DolphinDAO implements IDAO<Person, Integer>{

    private final EntityManagerFactory emf;

    public DolphinDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public Person create(Person person) {
        try(EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(person);
            em.getTransaction().commit();
        }
        return person;
    }

    @Override
    public List<Person> getAll() {
        try(EntityManager em = emf.createEntityManager()) {
            TypedQuery<Person> query = em.createQuery("SELECT p FROM Person p", Person.class);
            return query.getResultList();
        }
    }

    @Override
    public Person getById(Integer id) {
        try(EntityManager em = emf.createEntityManager()) {
            return em.find(Person.class, id);
        }
    }

    @Override
    public Person update(Person person) {
        try(EntityManager em = emf.createEntityManager()) {
        }
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        try(EntityManager em = emf.createEntityManager()) {
        }
        return false;
    }
}
