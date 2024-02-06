package at.altin.hammerio.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.UuidGenerator;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Hammer implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    //@GeneratedValue(strategy = GenerationType.UUID, generator = "uuid2")
    @UuidGenerator
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "hammerSet_id")
    private HammerSet hammerSet;

    @Column(name = "bezeichnung")
    private String bezeichnung;

    @Column(name = "preis")
    private BigDecimal preis;

    @Column(name = "quality")
    private int quality;

    @Column(name = "color")
    private Color color;

    @Column(name = "ipSchutz")
    private int ipSchutz;
}
