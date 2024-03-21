package epicode.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("P")
public class PartitaDiCalcio extends Event {
    @Column(name = "squadra_casa")
    private String squadraDiCasa;

    @Column(name = "squadra_ospite")
    private String squadraOspite;

    @Column(name = "squadra_vincente")
    private String squadraVincente;

    @Column(name = "numero_gol_squadra_casa")
    private int numeroGolSquadraCasa;

    @Column(name = "numero_gol_squadra_ospite")
    private int numeroGolSquadraOspite;


}
