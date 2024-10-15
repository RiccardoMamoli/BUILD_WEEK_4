package riccardomamoli.entities;

import jakarta.persistence.Entity;

import java.util.List;

@Entity


public class DistributoreFisico extends PuntoVendita {

    public DistributoreFisico() {
    }

    public DistributoreFisico(List<Abbonamento> abbonamenti, List<Biglietto> biglietti) {
        super(abbonamenti, biglietti);
    }

    @Override
    public String toString() {
        return "DistributoreFisico{} " + super.toString();
    }
}
