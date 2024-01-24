package at.altin.hammerio.dto;

import java.math.BigDecimal;

public class HammerDTO {
    private long id;
    private String bezeichnung;
    private BigDecimal preis;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public BigDecimal getPreis() {
        return preis;
    }

    public void setPreis(BigDecimal preis) {
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "HammerDTO{" +
                "id=" + id +
                ", bezeichnung='" + bezeichnung + '\'' +
                ", preis=" + preis +
                '}';
    }
}
