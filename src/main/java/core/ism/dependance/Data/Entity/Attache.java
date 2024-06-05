package core.ism.dependance.Data.Entity;


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
@Table(name="attaches")

@DiscriminatorValue(value = "attache")
public class Attache extends AppUser {


    @Column(nullable = false , length = 50)
    private String NomComplet;
    @Column(nullable = false , length = 30)
    private String Matricule;

}
