package riccardomamoli.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import riccardomamoli.entities.PuntoVendita;

public class DistributoreDAO {
    private final EntityManager em;

    public DistributoreDAO(EntityManager em) {
        this.em = em;
    }

    public void addDistributore(PuntoVendita puntoVendita) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(puntoVendita);
        tx.commit();
        System.out.println(puntoVendita.getId() + "è stato aggiunto");
    }

    public void removeDistributore(PuntoVendita puntoVendita) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.remove(puntoVendita);
        tx.commit();
        System.out.println(puntoVendita.getId() + "è stato rimosso");
    }

}

