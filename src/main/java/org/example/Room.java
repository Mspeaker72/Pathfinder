package org.example;

public class Room {

    private Room right;
    private Room left;

    public Room() {
    }



    public Room getRight() {
        return right;
    }
    public Room getLeft() {
        return left;
    }

    public void setLeft(Room left) {
        this.left = left;
    }

    public void setRight(Room right) {
        this.right = right;
    }

}
