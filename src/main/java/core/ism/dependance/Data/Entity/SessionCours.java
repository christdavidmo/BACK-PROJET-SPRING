package core.ism.dependance.Data.Entity;

import core.ism.dependance.Data.Entity.Cours;
import core.ism.dependance.Data.Enums.ModeSession;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="sessioncours")
public class SessionCours extends AbstractEntity {


    private java.util.Date Date;
    private int HeureDebut;
    private int HeureFin;
    private int NbrHeure;
    private ModeSession modeSession;
    //private EtatSession termine; // Variable pour représenter l'état de la session de cours
    private  boolean active ;

    @ManyToOne
    private Cours cours ;
}
