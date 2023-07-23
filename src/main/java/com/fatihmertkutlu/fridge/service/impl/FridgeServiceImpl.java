package com.fatihmertkutlu.fridge.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fatihmertkutlu.fridge.dto.FridgeItem;
import com.fatihmertkutlu.fridge.exception.NoItemFoundException;
import com.fatihmertkutlu.fridge.service.FridgeService;

@Service
public class FridgeServiceImpl implements FridgeService {

    private static final int FRUIT = 1;
    private static final int DRINKS = 2;
    private static final int MEAT = 4;

    @Override
    public List<FridgeItem> getAllItems() {

        FridgeItem fruit = new FridgeItem();
        fruit.setItemType(FRUIT);
        fruit.setName("Fruit");
        fruit.setQuantity(10);
        FridgeItem drinks = new FridgeItem();
        drinks.setItemType(DRINKS);
        drinks.setName("Drinks");
        drinks.setQuantity(20);
        FridgeItem meat = new FridgeItem();
        meat.setItemType(MEAT);
        meat.setName("Meat");
        meat.setQuantity(3);

        return Arrays.asList(fruit, drinks, meat);
    }

    @Override
    public FridgeItem getItemByType(Integer itemType) throws NoItemFoundException {

        FridgeItem item = null;

        if (itemType.equals(FRUIT)) {
            item = new FridgeItem();
            item.setItemType(FRUIT);
            item.setName("Fruit");
            item.setQuantity(10);
        } else {
            throw new NoItemFoundException("No such item found");
        }

        return item;
    }

}