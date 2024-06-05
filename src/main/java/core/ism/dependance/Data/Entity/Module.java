package core.ism.dependance.Data.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="modules")
public class Module extends AbstractEntity {


    @Column (nullable = false , length = 50)
    private  String Libelle;

    private  boolean active ;

    @OneToMany(mappedBy = "module")
    private List<Cours> cours;

    @ManyToOne()
    private Professeur professeur ;
}
