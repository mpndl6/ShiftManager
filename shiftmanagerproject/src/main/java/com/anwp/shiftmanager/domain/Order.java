package com.anwp.shiftmanager.domain;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private StatutCommande statut;

    @Transient
    private EtatCommande etat;

    // TODO trouver un construteur coheret a la regle metier

    public Long getId() {
        return id;
    }

    public StatutCommande getStatut() {
        return statut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order other)) return false;
        return id != null && id.equals(other.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}