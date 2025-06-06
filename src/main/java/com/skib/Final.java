package com.skib;

import com.birdbrain.Finch;

public class Final {
    static boolean stop = false;
    public static void check(Finch Robot) {
        
        while(stop == false){
        while(Robot.getDistance() >= 9) {
            if(Robot.getLight("L") > 70){
            Robot.setTurn("R", 93, 50);
            }
            Robot.setMove("F", 5, 300);
        } 
                Final.right(Robot);
            if(Robot.getDistance() >= 13) {
                stop = false;
            } else {
                Final.left(Robot);
                Final.left(Robot);
                if(Robot.getDistance() >= 13){
                    stop = false;
                    } 
                else if(Robot.getDistance() < 13){
                    Final.left(Robot);
                    stop = false;
                }
            }
        if(Robot.getLight("L") > 70){
            stop = true;
        }
    }
}
    public static void move(Finch Robot) {
        while(Robot.getDistance() >= 10) {
            Robot.setMove("F", 5, 100);
        }
    }

    public static void left(Finch Robot) {
        Robot.setTurn("L", 90, 50);
    }
    public static void right(Finch Robot) {
        Robot.setTurn("R", 90, 50);
    }


    public static void main(String[] args) {
        Finch MyFinch = new Finch();
        Final.check(MyFinch);
        MyFinch.stopAll();
        MyFinch.disconnect();
    }
}