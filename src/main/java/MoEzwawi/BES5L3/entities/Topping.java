package MoEzwawi.BES5L3.entities;

import lombok.Builder;

public class Topping extends MenuItem{
    public Topping(String name, int calories, double price) {
        super(name, calories, price);
    }
}