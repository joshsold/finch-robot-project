package com.skib;

import com.birdbrain.Finch;

public class Final {
    /* static stop condition for robot maze runner */

    static boolean stop = false;
    public static void check(Finch Robot) {
        /* robot moves forward while not in front of wall */

        while(stop == false){
        while(Robot.getDistance() >= 9) {
            /* finch checks if there is light, if so, makes right turn to hug wall */
            if(Robot.getLight("L") > 70){
            Robot.setTurn("R", 93, 50);
            }
            Robot.setMove("F", 5, 300);
        } 
        /* turns right and checks if there is a wall in front, if not, robot continues */
                Final.right(Robot);
            if(Robot.getDistance() >= 13) {
                stop = false;
            } else {
                /* if not, robot makes 180 degree turn, turning right originally, and continues to go */

                Final.left(Robot);
                Final.left(Robot);
                /* even after this, if robot is still in front of a wall, turns left */

                if(Robot.getDistance() >= 13){
                    stop = false;
                    } 
                else if(Robot.getDistance() < 13){
                    Final.left(Robot);
                    stop = false;
                }
            }
            /* stop condition */

        if(Robot.getLight("L") > 70){
            stop = true;
        }
    }
}

/* left turn */
    public static void left(Finch Robot) {
        Robot.setTurn("L", 90, 50);
    }
    /* right turn */

    public static void right(Finch Robot) {
        Robot.setTurn("R", 90, 50);
    }

/* insantiate finch, run code */

    public static void main(String[] args) {
        Finch MyFinch = new Finch();
        Final.check(MyFinch);
        MyFinch.stopAll();
        MyFinch.disconnect();
    }
}