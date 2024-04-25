package org.example;

public class Game {


    private Room currentRoom;
    private Character player;
    private int steps;

    public Game(Character player) {
        this.currentRoom= new Room();
        this.player = player;
        this.steps = 0;
    }


    public void walk(String direction){
        if(direction.equals("left")){
            this.currentRoom = this.currentRoom.getLeft();
            steps++;
            return;
        }
        this.currentRoom = this.currentRoom.getRight();
        steps++;
    }

    public int getSteps() {
        return steps;
    }

    public void  createRoom(){
        currentRoom.setLeft(new Room());
        currentRoom.setRight(new Room());

    }

    public void  feedback(String type){

        switch (type){
            case "move":
                System.out.println(player.getName()+" steps: "+steps);
                break;
            case "status":
                System.out.println(player.toString());
                break;
            case "help":
                System.out.println("future manual guide.");
                break;
        }

    }

    public Character getPlayer() {
        return player;
    }
}
