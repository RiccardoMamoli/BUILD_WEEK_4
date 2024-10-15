package riccardomamoli;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import riccardomamoli.dao.UtenteDAO;
import riccardomamoli.entities.TipologiaUtente;
import riccardomamoli.entities.Utente;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("build_week_4");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.getTransaction().commit();


        UtenteDAO udao = new UtenteDAO(em);
        Utente utente1 = new Utente("franco", "rossi", TipologiaUtente.UNDER25, LocalDate.of(2000, 10, 3));
        Utente utente2 = new Utente("mattia", "gonnola", TipologiaUtente.OVER60, LocalDate.of(1890, 2, 4));
        Utente utente3 = new Utente("giacomo", "guidotti", TipologiaUtente.UNDER18, LocalDate.of(2007, 11, 9));

        em.close();
        emf.close();


       /* Scanner scanner = new Scanner(System.in);

                while (true) {
                    try {
                        System.out.println("Che tipo di utente sei? (1: Utente, 2: Amministratore) /n");
                        int scelta = scanner.nextInt();
                        scanner.nextLine();

                        switch (scelta) {
                            case 1:
                                System.out.println("Benvenuto utente, seleziona il punto vendita:");


                        }

                    }
                }
}
*/
    }
}