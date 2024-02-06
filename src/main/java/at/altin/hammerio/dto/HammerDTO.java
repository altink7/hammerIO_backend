package at.altin.hammerio.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class HammerDTO {
    private UUID id;
    private String bezeichnung;
    private BigDecimal preis;
    private int quality;
}
