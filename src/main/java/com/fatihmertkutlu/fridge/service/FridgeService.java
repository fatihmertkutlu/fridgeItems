package com.fatihmertkutlu.fridge.service;

import java.util.List;

import com.fatihmertkutlu.fridge.dto.FridgeItem;
import com.fatihmertkutlu.fridge.exception.NoItemFoundException;


public interface FridgeService {

    List<FridgeItem> getAllItems();

    FridgeItem getItemByType(Integer itemType) throws NoItemFoundException;

}