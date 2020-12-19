package com.adekah.imonaassignment.service;

import com.adekah.imonaassignment.dto.PlayerDto;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface PlayerService {

    List<PlayerDto> findAll();

    Boolean delete(Long id);

    PlayerDto update(Long id, PlayerDto player);

    PlayerDto save(PlayerDto player);
}
