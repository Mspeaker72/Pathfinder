package org.example;

public class Character {

    final private String name;
     private int Hp;


    public Character(String name) {
        this.name = name;
        this.Hp = 5;
    }

    public String getName() {
        return name;
    }

    public void setHp(int hp) {
        this.Hp= hp;
    }

    public int getHp() {
        return Hp;
    }


    @Override
    public String toString(){
        return "name: "+name+"\n"
                + "HP: "+Hp+"\n";

    }
}
