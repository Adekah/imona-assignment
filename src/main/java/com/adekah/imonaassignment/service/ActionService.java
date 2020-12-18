package com.adekah.imonaassignment.service;

import com.adekah.imonaassignment.dto.ActionDto;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface ActionService {

    List<ActionDto> findAll();
}
