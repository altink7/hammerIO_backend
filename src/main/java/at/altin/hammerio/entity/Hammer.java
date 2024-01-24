package at.altin.hammerio.entity;

import java.math.BigDecimal;

public class Hammer {
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

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getIpSchutz() {
        return ipSchutz;
    }

    public void setIpSchutz(int ipSchutz) {
        this.ipSchutz = ipSchutz;
    }

    @Override
    public String toString() {
        return "Hammer{" +
                "id=" + id +
                ", bezeichnung='" + bezeichnung + '\'' +
                ", preis=" + preis +
                ", quality=" + quality +
                ", color=" + color +
                ", ipSchutz=" + ipSchutz +
                '}';
    }
}
