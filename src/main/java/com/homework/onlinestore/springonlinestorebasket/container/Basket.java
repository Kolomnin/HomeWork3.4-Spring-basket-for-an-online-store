package com.homework.onlinestore.springonlinestorebasket.container;

import com.homework.onlinestore.springonlinestorebasket.model.Sample;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Repository
@SessionScope
public class Basket {
    private final List<Sample> basket = new LinkedList<>();

    public List<Sample> getBasket() {
        return basket;
    }

    public void addSample(Sample sample) {
        basket.add(sample);
    }
}
