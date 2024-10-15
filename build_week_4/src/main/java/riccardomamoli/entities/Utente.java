package riccardomamoli.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "utente")

public class Utente {
    @Id
    @GeneratedValue
    @Column(name = "id_utente", nullable = false)
    private long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipologia_utente")
    private TipologiaUtente tipologiaUtente;

    @OneToMany(mappedBy = "utente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tessera> tessere;

    @Column(name = "data_di_nascita")
    private LocalDate dataDiNascita;

    public Utente(){}

    public Utente(String nome, String cognome, TipologiaUtente tipologiaUtente, LocalDate dataDiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.tipologiaUtente = tipologiaUtente;
        this.dataDiNascita = dataDiNascita;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public TipologiaUtente getTipologiaUtente() {
        return tipologiaUtente;
    }

    public void setTipologiaUtente(TipologiaUtente tipologiaUtente) {
        this.tipologiaUtente = tipologiaUtente;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", tipologiaUtente=" + tipologiaUtente +
                ", dataDiNascita=" + dataDiNascita +
                '}';
    }
}