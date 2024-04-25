package org.example;

import java.util.HashMap;
import java.util.Random;

public class Treasure {

    private boolean isOpen = false;
    private final Random random= new Random();
    private HashMap<Integer,String>lootTable;

    public Treasure(){
        lootTable = new HashMap<>();

        lootTable.put(0,"nothing found");
        lootTable.put(1,"found a super restore all stats +1");
        lootTable.put(2,"it was a mimic that bit you.");
    }


    public String open(Character player){
        int roll = random.nextInt(0,3);

        if(isOpen){
            return "you have already opened the treasure chest";
        }
        isOpen = true;
        return switch (roll) {
            case 1 -> {
                player.setHp(player.getHp() + 1);
                yield lootTable.get(1);
            }
            case 2 -> {
                player.setHp(player.getHp() - 2);
                yield lootTable.get(2);
            }
            default -> lootTable.get(0);
        };


    }



}
