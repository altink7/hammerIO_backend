package at.altin.hammerio.repo;

import at.altin.hammerio.entity.Hammer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface HammerDao extends JpaRepository<Hammer, UUID> {

}
