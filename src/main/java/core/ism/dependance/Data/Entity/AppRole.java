package core.ism.dependance.Data.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "roles")
public class AppRole extends AbstractEntity {

    @Column(nullable = false , unique = true)
    private  String rolename;

    @ManyToMany(fetch = FetchType.LAZY,mappedBy = "roles")
    List <AppUser> users;

    public AppRole( String rolename){
        this.rolename = rolename;
        this.active = true ;
    }
}
