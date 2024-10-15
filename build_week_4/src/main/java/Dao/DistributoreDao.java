package Dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import riccardomamoli.entities.Biglietto;
import riccardomamoli.entities.PuntoVendita;

import java.time.LocalDate;
import java.util.List;

public class DistributoreDao {
    private final EntityManager em;

    public DistributoreDao(EntityManager em) {
        this.em = em;
    }


    // aggiungi distributore
    public void creazioneDistributore(PuntoVendita puntoVendita) {
        em.persist(puntoVendita);
    }

    //Rimuovo un distributore
    public void rimuovoDistributore(long id_distributore) throws Exception {
        PuntoVendita distributore = em.find(PuntoVendita.class, id_distributore);
        if (distributore == null) {
            throw new Exception("Distributore non trovato tramite id: " + id_distributore);
        }
        em.remove(distributore);

    }

    //Cerca distributore tramte id
    public PuntoVendita ricercoDistributore(long id_Distributore) throws Exception {
        PuntoVendita trovato = em.find(PuntoVendita.class, id_Distributore);
        if (trovato == null) {
            throw new Exception("Distributore non trovato per ID: " + id_Distributore);
        }
        return trovato;
    }

    // lista biglietti per lasso di tempo
    public List<Biglietto> trovaBiglietti(long distributoreId, LocalDate start, LocalDate end) {
        String queryStr = "SELECT b FROM Biglietto b WHERE b.puntoVendita.id = :distributoreId AND b.data_emissione BETWEEN :start AND :end";
        TypedQuery<Biglietto> query = em.createQuery(queryStr, Biglietto.class);
        query.setParameter("distributoreId", distributoreId);
        query.setParameter("start", start);
        query.setParameter("end", end);
        return query.getResultList();
    }

}
