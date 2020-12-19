package com.adekah.imonaassignment.service.impl;

import com.adekah.imonaassignment.dto.PlayerDto;
import com.adekah.imonaassignment.entity.Player;
import com.adekah.imonaassignment.repository.ActionRepository;
import com.adekah.imonaassignment.repository.PlayerRepository;
import com.adekah.imonaassignment.service.PlayerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;
@Service
public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepository playerRepository;
    private final ActionRepository actionRepository;
    private final ModelMapper modelMapper;

    public PlayerServiceImpl(PlayerRepository playerRepository, ActionRepository actionRepository, ModelMapper modelMapper) {
        this.playerRepository = playerRepository;
        this.actionRepository = actionRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public List<PlayerDto> findAll() {
        List<Player> data = playerRepository.findAll();
        return Arrays.asList(modelMapper.map(data, PlayerDto[].class));
    }

    @Override
    public Boolean delete(Long id) {
        playerRepository.deleteById(id);
        return true;
    }

    @Override
    public PlayerDto update(Long id, PlayerDto player) {
        Player playerDb = playerRepository.getOne(id);
        playerDb.setActive(player.getIs_active());
        playerDb.setBirthCity(player.getBirth_city());
        playerDb.setGender(player.getGender());
        playerDb.setName(player.getName());
        playerDb.setSurname(player.getSurname());
        playerDb.setBirthDate(player.getBirth_date());
        playerDb.setPlayerAction(actionRepository.getOne(player.getActionId()));
        playerRepository.save(playerDb);
        return player;
    }

    @Override
    public PlayerDto save(PlayerDto player) {

        Player playerEntity = modelMapper.map(player, Player.class);
        playerEntity.setPlayerAction(actionRepository.getOne(player.getActionId()));
        playerEntity = playerRepository.save(playerEntity);
        player.setId(playerEntity.getId());
        return player;


    }
}
