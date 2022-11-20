package com.homework.onlinestore.springonlinestorebasket.service;

import com.homework.onlinestore.springonlinestorebasket.container.Basket;
import com.homework.onlinestore.springonlinestorebasket.model.Sample;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OnlineStoreService {
    private final Basket basket;

    public OnlineStoreService(Basket basket) {
        this.basket = basket;
    }

    public List<Sample> getBasket() {
        return basket.getBasket();
    }

    public List<Sample> addSample(List<Integer> id) {
        List<Sample> samples = new ArrayList<>();
        for (Integer i : id) {
            Sample sample = new Sample(i);
            basket.addSample(sample);
            samples.add(sample);
        }
        return samples;
    }
}
