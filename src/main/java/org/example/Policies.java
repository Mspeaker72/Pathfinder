package org.example;

public class Policies {



    public static boolean movementCommand(String cmd){
        return cmd.equalsIgnoreCase("right") || cmd.equalsIgnoreCase("left");
    }

    public static boolean utility(String cmd){
        return cmd.equalsIgnoreCase("status") || cmd.equalsIgnoreCase("help");
    }

    public static void nullPolicy(){
        System.out.println("Please enter a command.");
    }

    public static void gameOver(Character player){
        if(player.getHp()<=0){
            System.out.println("Game Over");
            System.exit(0);
        }

    }

    public static String roomNamePolicy(int step){
        int startConstant =1;
        return "Room-" + (step+startConstant);
    }

    public static void seperator(){
        System.out.println("*******************************************************************************");
    }


}
