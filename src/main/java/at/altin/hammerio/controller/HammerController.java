package at.altin.hammerio.controller;

import at.altin.hammerio.config.mapper.AppMapper;
import at.altin.hammerio.dto.HammerDTO;
import at.altin.hammerio.entity.Hammer;
import at.altin.hammerio.service.HammerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/hammer")
@CrossOrigin
public class HammerController {
    private final HammerService hammerService;
    private final AppMapper appMapper;

    public HammerController(HammerService hammerService, AppMapper appMapper) {
        this.hammerService = hammerService;
        this.appMapper = appMapper;
    }

    @GetMapping("/all")
    public ResponseEntity<List<HammerDTO>> getAllHammers() {
        List<HammerDTO> hammerDTOs = appMapper.mapCollectionToDTOs(hammerService.getAllHammers());

        return ResponseEntity.ok(hammerDTOs);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HammerDTO> getHammerById(@PathVariable UUID id) {
        HammerDTO hammerDTO = appMapper.mapToDTO(hammerService.getHammerById(id));

        return ResponseEntity.ok(hammerDTO);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addHammer(@RequestBody HammerDTO hammer) {
        Hammer hammerEntity = appMapper.mapToEntity(hammer);

        return hammerService.addHammer(hammerEntity);
    }
}
