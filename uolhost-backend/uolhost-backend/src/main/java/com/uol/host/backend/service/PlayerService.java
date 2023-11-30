package com.uol.host.backend.service;

import com.uol.host.backend.infra.CodinameHandler;
import com.uol.host.backend.model.GroupType;
import com.uol.host.backend.model.Player;
import com.uol.host.backend.model.dto.PlayerDto;
import com.uol.host.backend.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private CodinameHandler handler;

    public Player createPlayer(PlayerDto playerDto) {
        Player newPlayer = new Player(playerDto);
        String codiname = getCodiname(playerDto.groupType());
        newPlayer.setCodiname(codiname);
        return playerRepository.save(newPlayer);
    }

    public List<Player> findAllPlayers() {
        return playerRepository.findAll();
    }

    private String getCodiname(GroupType groupType) {
        return handler.findCodiname(groupType);
    }
}
