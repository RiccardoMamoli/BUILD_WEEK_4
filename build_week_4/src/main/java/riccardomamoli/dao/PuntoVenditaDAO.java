package riccardomamoli.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import riccardomamoli.entities.PuntoVendita;

import java.util.List;

public class PuntoVenditaDAO {
    private final EntityManager em;

    public PuntoVenditaDAO(EntityManager em) {
        this.em = em;
    }

    public void addPuntoVendita(PuntoVendita puntoVendita) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(puntoVendita);
        tx.commit();
        System.out.println("il punto vendita numero " + puntoVendita.getId() + "è stato aggiunto");
    }

    public void deletePuntoVendita(PuntoVendita puntoVendita) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.remove(puntoVendita);
        tx.commit();
        System.out.println("il punto vendita numero" + puntoVendita.getId() + "è stato eliminato");
    }

    public List<PuntoVendita> findAll() {

        return em.createQuery("SELECT pv FROM PuntoVendita pv", PuntoVendita.class).getResultList();

    }
}
