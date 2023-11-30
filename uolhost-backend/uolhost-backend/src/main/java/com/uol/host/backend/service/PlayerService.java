package com.uol.host.backend.service;

import com.uol.host.backend.model.Player;
import com.uol.host.backend.model.dto.PlayerDto;
import com.uol.host.backend.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public Player createPlayer(PlayerDto playerDto) {
        Player newPlayer = new Player(playerDto);
        return playerRepository.save(newPlayer);
    }
}
