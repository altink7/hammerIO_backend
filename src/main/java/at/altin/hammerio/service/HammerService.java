package at.altin.hammerio.service;

import at.altin.hammerio.entity.Hammer;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HammerService {

    // nur als Beispiel, spaeter wird das aus der DB kommen
    private static List<Hammer> allHammers = new ArrayList<>(
            Arrays.asList(
                    new Hammer(1L, "hammerA", BigDecimal.TEN),
                    new Hammer(2L, "hammerB", BigDecimal.ONE)
            )
    );


    public List<Hammer> getAllHammers() {
        return allHammers;
    }


    public boolean addHammer(Hammer hammer) {
        if (hammer == null){
            return false;
        }

        allHammers.add(hammer);
        return true;
    }

    public Hammer getHammerById(long id) {
        return allHammers.stream()
                .filter(hammer -> hammer.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
