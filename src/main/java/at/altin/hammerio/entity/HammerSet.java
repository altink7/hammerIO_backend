package at.altin.hammerio.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
public class HammerSet {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @OneToMany(mappedBy = "hammerSet")
    @ToString.Exclude
    private Set<Hammer> hammers;

}
