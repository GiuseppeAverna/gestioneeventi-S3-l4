package epicode.entities;

import javax.persistence.*;

@Entity
@DiscriminatorValue("C")
public class Concerto extends Event {
    @Enumerated(EnumType.STRING)
    private GenereMusica genere;

    @Column(name = "in_streaming")
    private boolean inStreaming;


}