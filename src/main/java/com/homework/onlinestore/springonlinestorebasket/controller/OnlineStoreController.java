package com.homework.onlinestore.springonlinestorebasket.controller;

import com.homework.onlinestore.springonlinestorebasket.model.Sample;
import com.homework.onlinestore.springonlinestorebasket.service.OnlineStoreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
public class OnlineStoreController {
    private final OnlineStoreService onlineStoreService;

    public OnlineStoreController(OnlineStoreService onlineStoreService) {
        this.onlineStoreService = onlineStoreService;
    }

    @GetMapping("/order/get")
    public List<Sample> getBasket() {
        return this.onlineStoreService.getBasket();
    }

    @GetMapping("/order/add")
    public List<Sample> addSample(@RequestParam("id") List<Integer> id) {
        return this.onlineStoreService.addSample(id);
    }
}
