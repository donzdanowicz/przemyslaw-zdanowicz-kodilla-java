package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SmallPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    public SmallPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return "Small " + super.getDescription();
    }
}
