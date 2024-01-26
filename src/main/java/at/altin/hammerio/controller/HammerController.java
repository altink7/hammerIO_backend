package at.altin.hammerio.controller;

import at.altin.hammerio.entity.Hammer;
import at.altin.hammerio.mapper.AppModelMapper;
import at.altin.hammerio.service.HammerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/hammer")
@CrossOrigin
public class HammerController {

    private final HammerService hammerService;
    private final AppModelMapper appModelMapper;

    public HammerController(HammerService hammerService, AppModelMapper appModelMapper) {
        this.hammerService = hammerService;
        this.appModelMapper = appModelMapper;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Hammer>> getAllHammers() {
        return ResponseEntity.ok(hammerService.getAllHammers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hammer> getHammerById(@PathVariable long id) {
        return ResponseEntity.ok(hammerService.getHammerById(id));
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addHammer(Hammer hammer) {
        return hammerService.addHammer(hammer);
    }



}
