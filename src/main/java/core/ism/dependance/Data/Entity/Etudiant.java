package core.ism.dependance.Data.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="etudiants")
public class Etudiant extends AppUser {


    private String NomComplet ;
    private int age;
    private  String matricule ;

    @ManyToOne
    private Classe classe ;
}
