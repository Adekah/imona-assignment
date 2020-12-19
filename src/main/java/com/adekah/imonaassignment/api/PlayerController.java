package com.adekah.imonaassignment.api;

import com.adekah.imonaassignment.dto.PlayerDto;
import com.adekah.imonaassignment.service.impl.PlayerServiceImpl;
import com.adekah.imonaassignment.util.ApiPaths;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ApiPaths.PlayerController.CTRL)
@CrossOrigin
public class PlayerController {

    private final PlayerServiceImpl playerServiceImpl;

    public PlayerController(PlayerServiceImpl playerServiceImpl) {
        this.playerServiceImpl = playerServiceImpl;
    }

    @GetMapping
    public ResponseEntity<List<PlayerDto>> getAll() {
        List<PlayerDto> data = playerServiceImpl.findAll();
        return ResponseEntity.ok(data);
    }

    @PostMapping
    public ResponseEntity<PlayerDto> newPlayer(@RequestBody PlayerDto player) {
        return ResponseEntity.ok(playerServiceImpl.save(player));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id) {
        return ResponseEntity.ok(playerServiceImpl.delete(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PlayerDto> updateProject(@PathVariable(value = "id", required = true) Long id, @RequestBody PlayerDto player) {
        return ResponseEntity.ok(playerServiceImpl.update(id, player));
    }


}
