package at.altin.hammerio.service;

import at.altin.hammerio.entity.Hammer;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class HammerService {

    private static List<Hammer> allHammers =
            List.of(
                    new Hammer(1L, "hammerA", BigDecimal.TEN),
                    new Hammer(2L, "hammerB", BigDecimal.ONE)
            );


    public List<Hammer> getAllHammers() {
        return allHammers;
    }

    // check this
    public boolean addHammer(Hammer hammer) {
        allHammers.add(hammer != null ? hammer : new Hammer());
        return true;
    }

    public Hammer getHammerById(long id) {
        return allHammers.stream()
                .filter(hammer -> hammer.getId() == id)
                .findFirst()
                .orElse(null);
    }


}
