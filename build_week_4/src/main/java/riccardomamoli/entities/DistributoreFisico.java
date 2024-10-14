package riccardomamoli.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "distributore_fisico")

public class DistributoreFisico extends PuntoVendita{

    public DistributoreFisico(){}

    public DistributoreFisico(long id) {
        super(id);
    }

    @Override
    public String toString() {
        return "DistributoreFisico{} " + super.toString();
    }
}
