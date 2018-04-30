package com.cuteBrick.javaPractice.dao;

import com.cuteBrick.javaPractice.entity.Items;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemsDaoImpl implements ItemsDao {

//    private final HibernateTemplate hibernateTemplate;

    /*@Autowired
    public ItemsDaoImpl(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }*/

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }


    @Override
    public Items getById(long id) {
        return getSession().get(Items.class, id);
        /*return hibernateTemplate
                .execute((org.hibernate.Session session) -> (Items) session
                        .createQuery("FROM Items WHERE id = :id")
                        .setParameter("id", id)
                        .uniqueResult());*/
    }

    @Override
    public void delete(Items items) {
        getSession().delete(items);
//        hibernateTemplate.delete(items);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Items> findAllItems() {
        return getSession().createQuery("FROM Items").list();
//        return (List<Items>) hibernateTemplate.find("FROM Items");
    }

    public void save(Items items)  {
        getSession().save(items);
//        hibernateTemplate.save(items);
    }

    public void update(Items items) {
        getSession().update(items);
//        hibernateTemplate.update(items);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Items> getByText(String word) {
        return getSession().createQuery("FROM Items WHERE LOWER (CONCAT(name, description)) LIKE LOWER (:word)")
                .setParameter("word", "%" + word + "%")
                .list();
        /*return hibernateTemplate
                .execute((org.hibernate.Session session) -> session
                .createQuery("SELECT * FROM Items WHERE LOWER (CONCAT(name, description)) LIKE LOWER (:word)")
                .setParameter("word", "%" + word + "%")
                .list());*/
    }
}
