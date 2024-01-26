package at.altin.hammerio.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class HammerDTO {
    private long id;
    private String bezeichnung;
    private BigDecimal preis;
    private int quality;
}
