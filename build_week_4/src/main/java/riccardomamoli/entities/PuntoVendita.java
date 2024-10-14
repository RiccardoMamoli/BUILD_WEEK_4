package riccardomamoli.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "punto_vendita")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public abstract class PuntoVendita {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    public PuntoVendita(){}

    public PuntoVendita(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "PuntoVendita{" +
                "id=" + id +
                '}';
    }
}
