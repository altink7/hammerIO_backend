package at.altin.hammerio.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Hammer implements Serializable {
    private long id;
    private String bezeichnung;
    private BigDecimal preis;
    private int quality;
    private Color color;
    private int ipSchutz;

    public Hammer() {
    }

    public Hammer(long id, String bezeichnung, BigDecimal preis) {
        this.id = id;
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }
}
