package com.company;

import biuoop.DrawSurface;
import biuoop.GUI;
import biuoop.Sleeper;

public class BouncingBallAnimation {


    public static void main(String[] args){
        GUI gui = new GUI("title",200,200);
        Sleeper sleeper = new Sleeper();
        Ball ball = new Ball(0, 0, 30, java.awt.Color.BLACK);
        ball.setVelocity(2, 2);
        Velocity v = Velocity.fromAngleAndSpeed(30, 4);
        ball.setVelocity(v);
        while (true) {
            DrawSurface d = gui.getDrawSurface();
            ball.moveOneStep(d);
            ball.drawOn(d);
            gui.show(d);
            sleeper.sleepFor(50);  // wait for 50 milliseconds.
        }
    }
}
