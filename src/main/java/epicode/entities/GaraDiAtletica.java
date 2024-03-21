package epicode.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("A") // Valore discriminante per GaraDiAtletica
public class GaraDiAtletica extends Event {
    @ManyToMany
    @JoinTable(name = "evento_atleta",
            joinColumns = @JoinColumn(name = "evento_id"),
            inverseJoinColumns = @JoinColumn(name = "atleta_id"))
    private List<Person> atleti;

    @ManyToOne
    @JoinColumn(name = "vincitore_id")
    private Person vincitore;

    // Costruttori, getter e setter
}
