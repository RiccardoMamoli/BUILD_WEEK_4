package riccardomamoli.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "punto_vendita")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public abstract class PuntoVendita {
    @Id
    @GeneratedValue
    @Column(name = "id_punto_vendita")
    private long id;

    @OneToMany(mappedBy = "punto_vendita")
    private List<Abbonamento> abbonamenti;

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
