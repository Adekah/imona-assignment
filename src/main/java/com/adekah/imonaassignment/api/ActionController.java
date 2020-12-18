package com.adekah.imonaassignment.api;

import com.adekah.imonaassignment.dto.ActionDto;
import com.adekah.imonaassignment.service.impl.ActionServiceImpl;
import com.adekah.imonaassignment.util.ApiPaths;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(ApiPaths.ActionController.CTRL)
@CrossOrigin
public class ActionController {
    private final ActionServiceImpl actionServiceImpl;

    public ActionController(ActionServiceImpl actionServiceImpl) {
        this.actionServiceImpl = actionServiceImpl;
    }

    @GetMapping
    public ResponseEntity<List<ActionDto>> getAll() {
        List<ActionDto> data = actionServiceImpl.findAll();
        return ResponseEntity.ok(data);
    }
}
