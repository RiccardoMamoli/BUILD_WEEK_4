package riccardomamoli;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("build_week_4");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.getTransaction().commit();


        em.close();
        emf.close();


                while (true) {
                    try {
                        System.out.println("Che tipo di utente sei? (1: Utente, 2: Amministratore) /n");
                        int scelta = scanner.nextInt();
                        scanner.nextLine();

                        switch (scelta) {
                            case 1: System.out.println("Benvenuto utente, seleziona il punto vendita:");


                            do {
                                int selezioneUtente = scanner.nextInt();
                                switch (selezioneUtente) {
                                    case 1:
                                }
                            }
                            while(!selezioneUtente )
                            }
                            }

                        }

    }
}
