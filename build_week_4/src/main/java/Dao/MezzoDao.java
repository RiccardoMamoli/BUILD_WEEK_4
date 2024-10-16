package Dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import riccardomamoli.entities.*;

import java.time.LocalDate;
import java.util.List;

public class MezzoDao {
    private final EntityManager em;

    public MezzoDao(EntityManager em) {
        this.em = em;
    }

    // Aggiungi mezzo
    public void creazioneMezzo(Mezzo mezzo) {
        em.getTransaction().begin();
        em.persist(mezzo);
        em.getTransaction().commit();
    }

    // Rimuovi un mezzo
    public void rimuovoMezzo(long id_mezzo) throws Exception {
        em.getTransaction().begin();
        Mezzo mezzo = em.find(Mezzo.class, id_mezzo);
        if (mezzo == null) {
            em.getTransaction();
            throw new Exception("Mezzo non trovato tramite id: " + id_mezzo);
        }
        em.remove(mezzo);
        em.getTransaction().commit();
    }

    // Cerca mezzo tramite id
    public Mezzo ricercoMezzo(long id_Mezzo) throws Exception {
        Mezzo trovato = em.find(Mezzo.class, id_Mezzo);
        if (trovato == null) {
            throw new Exception("Mezzo non trovato per ID: " + id_Mezzo);
        }
        return trovato;
    }

    // Ricerca stato Mezzo
    public void statoMezzo(long id) {
        Mezzo mezzo = em.find(Mezzo.class, id);
        if (mezzo != null) {
            String stato = mezzo.getStato();
            System.out.println(stato);
        }
    }

    // Cambia lo stato del Mezzo
    public void cambiaStatoMezzo(long id) {
        Mezzo mezzo = em.find(Mezzo.class, id);
        if (mezzo != null) {
            String statoAttuale = mezzo.getStato();
            String nuovoStato;

            switch (statoAttuale) {
                case "MANUTENZIONE":
                    nuovoStato = "IN_SERVIZIO";
                    break;
                case "IN_SERVIZIO":
                    nuovoStato = "MANUTENZIONE";
                    break;
                default:
                    System.out.println(statoAttuale);
                    return;
            }

            mezzo.setStato(nuovoStato);
            System.out.println("Stato cambiato in: " + nuovoStato);
        }
    }

    // Lista tratte per mezzo
    public List<TrattaPercorsa> trovaTrattePercorse(long id_mezzo) {
        String queryStr = "SELECT tp FROM TrattaPercorsa tp WHERE tp.mezzo.id = :mezzoId";
        TypedQuery<TrattaPercorsa> query = em.createQuery(queryStr, TrattaPercorsa.class);
        query.setParameter("mezzoId", id_mezzo);
        return query.getResultList();
    }


}




