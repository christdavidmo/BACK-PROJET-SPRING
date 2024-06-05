package core.ism.dependance.Data.Entity;

import core.ism.dependance.Data.Enums.NiveauClasse;
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
@Table(name = "classes")
public class Classe extends AbstractEntity{




    @Column(nullable = false, length = 20)
    private String libelle;

    @Column(nullable = false)
    private NiveauClasse niveau ;


    @OneToMany( mappedBy = "classe")
    private List<Etudiant> etudiants ;

    @ManyToMany
    @JoinTable(
            name = "cours_classe",
            joinColumns = @JoinColumn (name ="classe_id" ),
            inverseJoinColumns = @JoinColumn (name = "cours_id"))
    private Set<Cours> cours = new HashSet<>();
}
