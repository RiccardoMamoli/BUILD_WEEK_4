package riccardomamoli.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tratta_abbonamento")

public class TrattaAbbonamento {

    @ManyToOne
    @JoinColumn(name = "id_tratta")
    private Tratta tratta;

    @ManyToOne
    @JoinColumn(name = "id_abbonamento")
    private Abbonamento abbonamento;

    public TrattaAbbonamento() {
    }

    public TrattaAbbonamento(Tratta tratta, Abbonamento abbonamento) {
        this.tratta = tratta;
        this.abbonamento = abbonamento;
    }

    public Tratta getTratta() {
        return tratta;
    }

    public void setTratta(Tratta tratta) {
        this.tratta = tratta;
    }

    public Abbonamento getAbbonamento() {
        return abbonamento;
    }

    public void setAbbonamento(Abbonamento abbonamento) {
        this.abbonamento = abbonamento;
    }

    @Override
    public String toString() {
        return "TrattaAbbonamento{" +
                "tratta=" + tratta +
                ", abbonamento=" + abbonamento +
                '}';
    }
}
