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
@Table(name="professeurs")

public class Professeur extends AppUser {



    @Column(nullable = false, length = 50)
    private String nomComplet;

    private String grade;
    private String specialite ;

    @OneToMany(mappedBy = "professeur")
    private List<Module> modules;
}
