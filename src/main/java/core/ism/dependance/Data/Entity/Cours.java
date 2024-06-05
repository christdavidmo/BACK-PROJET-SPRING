package core.ism.dependance.Data.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cours")
public class Cours extends  AbstractEntity {



    private int HeureGlobal;
    private int HeureDeroule;
    private int HeureRestant;

    private int Semestre;

    private  boolean active ;

    @ManyToOne()
    private Module module;

    @OneToMany(mappedBy = "cours")
    private List<SessionCours> sessionCours;

    @ManyToMany ( mappedBy = "cours")
    private Set<Classe> classes = new HashSet<>();
}
