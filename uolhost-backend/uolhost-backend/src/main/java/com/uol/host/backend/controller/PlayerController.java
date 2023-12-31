package com.uol.host.backend.controller;

import com.uol.host.backend.model.Player;
import com.uol.host.backend.model.dto.PlayerDto;
import com.uol.host.backend.service.PlayerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping
    public ResponseEntity<Player> createPlayer(@RequestBody @Valid PlayerDto playerDto) {
        Player newPlayer = playerService.createPlayer(playerDto);
        return new ResponseEntity<>(newPlayer, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Player>> findAllPlayer() {
        return new ResponseEntity<>(playerService.findAllPlayers(), HttpStatus.OK);
    }
}
