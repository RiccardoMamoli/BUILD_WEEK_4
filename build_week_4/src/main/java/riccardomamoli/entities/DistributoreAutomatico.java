package riccardomamoli.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "distributore_automatico")

public class DistributoreAutomatico extends PuntoVendita{

    @Column(name = "attivo")
    private boolean attivo;

    public DistributoreAutomatico(){}

    public DistributoreAutomatico(long id, boolean attivo) {
        super(id);
        this.attivo = attivo;
    }

    public boolean isAttivo() {
        return attivo;
    }

    public void setAttivo(boolean attivo) {
        this.attivo = attivo;
    }

    @Override
    public String toString() {
        return "DistributoreAutomatico{" +
                "attivo=" + attivo +
                "} " + super.toString();
    }
}
