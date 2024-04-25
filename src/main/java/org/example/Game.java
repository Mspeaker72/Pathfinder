package org.example;

public class Game {


    private Room currentRoom;
    private Character player;
    private int steps;

    public Game(Character player) {
        this.currentRoom= new Room("Entrance");
        this.player = player;
        this.steps = 0;
        Policies.seperator();
        currentLocation();
        Policies.seperator();
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
        currentRoom.setLeft(new Room(Policies.roomNamePolicy(steps)));
        currentRoom.setRight(new Room(Policies.roomNamePolicy(steps)));

    }

    private void currentLocation(){;
        System.out.println("location: "+currentRoom.getName());


    }
    private void search(){
        System.out.println("searching...");
        System.out.println(currentRoom.getTreasure().open(player));
    }

    public void  feedback(String type){
        Policies.seperator();
        switch (type){
            case "move":
                currentLocation();
                break;
            case "status":
                System.out.println(player.toString());
                break;
            case "help":
                System.out.println("future manual guide.");
                break;
            case "search":
                search();
                break;
            default:
                System.out.println(type+" is an unknown type of command");
        }
        Policies.seperator();
    }

    public Character getPlayer() {
        return player;
    }
}
