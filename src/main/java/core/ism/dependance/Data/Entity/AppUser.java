package core.ism.dependance.Data.Entity;

import core.ism.dependance.Data.Entity.AbstractEntity;
import core.ism.dependance.Data.Entity.AppRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name ="users")

//HERITAGE
@Inheritance(strategy = InheritanceType.JOINED)

@DiscriminatorColumn(name = "type")
@DiscriminatorValue(value = "RP")

public class AppUser extends AbstractEntity {

    @Column(nullable = false)
    private  String login;

    @Column(nullable = false)
    private String password;

    //lorsqu'il charge l'objet il doit charger ses relations
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
            @JoinTable(
                    name = "users_roles",
                    joinColumns = @JoinColumn(name = "users_id"),
                    inverseJoinColumns = @JoinColumn(name = "roles_id")
            )

    List<AppRole> roles = new ArrayList<>();

    public AppUser(String login, String password) {
        this.login = login;
        this.password = password;
        this.active = true;
    }


}
