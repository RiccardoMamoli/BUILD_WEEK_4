package riccardomamoli;

import Dao.DistributoreDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import riccardomamoli.entities.Abbonamento;
import riccardomamoli.entities.Biglietto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("build_week_4");
        EntityManager em = emf.createEntityManager();

        DistributoreDao dao = new DistributoreDao(em);
        List<Abbonamento> abbonamenti = new ArrayList<>();
        List<Biglietto> biglietti = new ArrayList<>();
        boolean attivo = true;
        Biglietto primoBiglietto = new Biglietto();
        biglietti.add(primoBiglietto);


        em.getTransaction().begin();
//        DistributoreAutomatico primoDistributore = new DistributoreAutomatico(abbonamenti, biglietti, attivo);
        //creazione distributore
//        dao.creazioneDistributore(primoDistributore);
//        DistributoreFisico primoFisico = new DistributoreFisico(abbonamenti, biglietti);
//        dao.creazioneDistributore(primoFisico);
        // rimuovi distributore
//        long idDistributore = 2;
//        try {
//            dao.rimuovoDistributore(idDistributore);
//            System.out.println("distributore rimosso con successo");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        //ricerca distributore
//        long id_distributore = 1;
//        try {
//            PuntoVendita distributore = dao.ricercoDistributore(id_distributore);
//            String tipoDistributore = "Sconosciuto"; // Valore predefinito
//
//            if (distributore instanceof DistributoreAutomatico) {
//                tipoDistributore = "Automatico";
//            }
//            if (distributore instanceof DistributoreFisico) {
//                tipoDistributore = "Fisico";
//            }
//
//            System.out.println("Distributore trovato: ID = " + distributore.getId() + ", Tipo = " + tipoDistributore);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        try {
            // Definisci i parametri per la ricerca
            long distributoreId = 1; // ID del distributore
            LocalDate start = LocalDate.of(2024, 10, 1); // Data inizio
            LocalDate end = LocalDate.of(2024, 10, 31); // Data fine

            // Trova i biglietti nel lasso di tempo specificato
            List<Biglietto> bigliettiPerPuntoVendita = dao.trovaBiglietti(distributoreId, start, end);

            // Stampa i risultati
            for (Biglietto biglietto : bigliettiPerPuntoVendita) {
                System.out.println(biglietto);
            }
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());


            em.getTransaction().commit();


            em.close();
            emf.close();
        }
    }
}
