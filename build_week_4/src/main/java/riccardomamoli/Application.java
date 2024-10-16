package riccardomamoli;

import Dao.DistributoreDao;
import Dao.MezzoDao;
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
        MezzoDao mDao = new MezzoDao(em);
        List<Abbonamento> abbonamenti = new ArrayList<>();
        List<Biglietto> biglietti = new ArrayList<>();


        boolean attivo = true;


        em.getTransaction().begin();


//        DistributoreAutomatico primoDistributore = new DistributoreAutomatico(abbonamenti, biglietti, attivo);
////        creazione distributore
//        dao.creazioneDistributore(primoDistributore);
//        DistributoreFisico primoFisico = new DistributoreFisico(abbonamenti, biglietti);
//        dao.creazioneDistributore(primoFisico);
//        // rimuovi distributore
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

        // ricerca biglietti per punto vendita

//        try {
//            long distributoreId = 1; // ID del distributore
//            LocalDate start = LocalDate.of(2024, 10, 1); // Data inizio
//            LocalDate end = LocalDate.of(2024, 10, 31); // Data fine
//
//            List<Biglietto> bigliettiPerPuntoVendita = dao.trovaBiglietti(distributoreId, start, end);
//
//            for (Biglietto biglietto : bigliettiPerPuntoVendita) {
//                System.out.println(biglietto);
//            }
//        } catch (Exception e) {
//            System.out.println("Errore: " + e.getMessage());

        //cerco attivo/non distributore

//        try {
//            long idDistributore = 1; // Sostituisci con un ID valido nel tuo database
//
//            boolean attivissimo = dao.isActive(idDistributore);
//            System.out.println("Il distributore con ID " + idDistributore + " è attivo: " + attivissimo);
//
//        } catch (Exception e) {
//            System.out.println("Errore: " + e.getMessage());
//        }

        // switch attivo/ non distributore

//        try {
//            long idDistributore = 1; // Sostituisci con un ID valido nel tuo database
//            boolean nuovoStato = false; // Imposta lo stato desiderato
//
//            // Aggiorna lo stato del distributore
//
//            dao.updateActive(idDistributore, nuovoStato);
//
//
//            System.out.println("Stato del distributore aggiornato con successo.");
//
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        // trova abbonamenti
//        try {
//            long distributoreId = 1; // ID del distributore
//            LocalDate start = LocalDate.of(2024, 10, 1); // Data inizio
//            LocalDate end = LocalDate.of(2024, 10, 31); // Data fine
//
//            List<Abbonamento> abbonamentiPerPuntoVendita = dao.trovaAbbonamenti(distributoreId, start, end);
//
//            for (Abbonamento abbonamento : abbonamentiPerPuntoVendita) {
//                System.out.println(abbonamento);
//            }
//        } catch (Exception e) {
//            System.out.println("Errore: " + e.getMessage());

        // verifica dello stato del mezzo
//        try {
//            long distributore = 1 ;
//            mDao.statoMezzo(distributore);
//        } catch (Exception e){
//            System.out.println("Errore: " + e.getMessage());
//
//        }
        //metodo per cambiare lo stato del mezzo
//        try {
//            long distributore = 1;
//            mDao.cambiaStatoMezzo(distributore);
//        } catch (Exception e) {
//            System.out.println("Errore: " + e.getMessage());


////       // metodo per cercare tutte le tratte percorse di un mezzo
//        try {
//            long distributore = 1;
//            mDao.trovaTrattePercorse(distributore);
//        } catch (Exception e) {
//            System.out.println("Errore: " + e.getMessage());
//
//            em.getTransaction().commit();
//
//            em.close();
//            emf.close();
//        }
//
    }


}

