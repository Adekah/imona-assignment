package com.adekah.imonaassignment.service.impl;

import com.adekah.imonaassignment.dto.GameDto;
import com.adekah.imonaassignment.entity.Game;
import com.adekah.imonaassignment.repository.GameRepository;
import com.adekah.imonaassignment.service.GameService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {

    private final GameRepository gameRepository;
    private final ModelMapper modelMapper;

    public GameServiceImpl(GameRepository gameRepository, ModelMapper modelMapper) {
        this.gameRepository = gameRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public GameDto getById(Long id) {
        Game g = gameRepository.getOne(id);
        return modelMapper.map(g, GameDto.class);
    }
}
