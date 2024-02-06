package at.altin.hammerio.service;

import at.altin.hammerio.entity.Hammer;
import at.altin.hammerio.repo.HammerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class HammerService {

    private final HammerDao hammerDao;

    //@Autowired
    public HammerService(HammerDao hammerDao) {
        this.hammerDao = hammerDao;
    }

    public List<Hammer> getAllHammers() {
        return hammerDao.findAll();
    }


    public boolean addHammer(Hammer hammer) {
        if (hammer == null){
            return false;
        }

        hammerDao.save(hammer);
        return true;
    }

    public Hammer getHammerById(UUID id) {
        return hammerDao.findById(id).orElse(null);
    }
}
