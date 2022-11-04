package com.company.entities;

import com.company.items.Food;
import com.company.items.Potions;
import com.company.map.GameLocation;

public interface Entity {

    void fight();
    void defend();
    void escape();
    void heal(Potions potions);
    void eat(Food food);
    void dodge();
    void moveTo(GameLocation gameLocation);
    void talkTo(Entity entity);
    void sleep();





}
