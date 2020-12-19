package com.adekah.imonaassignment.service.impl;

import com.adekah.imonaassignment.dto.ActionDto;
import com.adekah.imonaassignment.entity.Action;
import com.adekah.imonaassignment.repository.ActionRepository;
import com.adekah.imonaassignment.service.ActionService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class ActionServiceImpl implements ActionService {

    private final ActionRepository actionRepository;
    private final ModelMapper modelMapper;

    public ActionServiceImpl(ActionRepository actionRepository, ModelMapper modelMapper) {
        this.actionRepository = actionRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ActionDto> findAll() {
        List<Action> data = actionRepository.findAll();
        return Arrays.asList(modelMapper.map(data, ActionDto[].class));
    }


}
