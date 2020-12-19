package com.adekah.imonaassignment.api;

import com.adekah.imonaassignment.dto.GameDto;
import com.adekah.imonaassignment.service.impl.GameServiceImpl;
import com.adekah.imonaassignment.util.ApiPaths;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ApiPaths.GameController.CTRL)
@CrossOrigin
public class GameController {

    private final GameServiceImpl gameServiceImpl;

    public GameController(GameServiceImpl gameServiceImpl) {
        this.gameServiceImpl = gameServiceImpl;
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameDto> getById(@PathVariable(value = "id", required = true) Long id) {
        GameDto gameDto = gameServiceImpl.getById(id);
        return ResponseEntity.ok(gameDto);
    }
}
