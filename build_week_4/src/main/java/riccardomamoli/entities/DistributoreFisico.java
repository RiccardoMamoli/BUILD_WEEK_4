package riccardomamoli.entities;

import jakarta.persistence.Entity;

@Entity


public class DistributoreFisico extends PuntoVendita {

    public DistributoreFisico() {
    }

    @Override
    public String toString() {
        return "DistributoreFisico{} " + super.toString();
    }
}
