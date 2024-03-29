package ua.com.dao.impl;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import ua.com.dao.StudentCrudDao;
import ua.com.entity.Student;
import java.util.Collection;
import java.util.Optional;

public class StudentCrudDaoImpl implements StudentCrudDao {

    private final EntityManagerFactory emf = Persistence
            .createEntityManagerFactory("jpa-hibernate-mysql");
    private final EntityManager entityManager = emf.createEntityManager();

    @Override
    public void create(Student entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }

    @Override
    public void update(Student entity) {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }

    @Override
    public void delete(Long id) {
        entityManager.getTransaction().begin();
        if (findById(id).isPresent()) {
            entityManager.remove(findById(id).get());
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public Optional<Student> findById(Long id) {
        entityManager.clear();
        return Optional.ofNullable(entityManager.find(Student.class, id));
    }

    @Override
    @SuppressWarnings("unchecked")
    public Collection<Student> findAll() {
        entityManager.clear();
        return entityManager.createQuery("select s from Student s").getResultList();

    }

}
