package com.theironyard.java.gamepiece;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        GamePiece whtRook = new GamePiece();
        whtRook.setName("White Rook");
        whtRook.setColor("White");
        whtRook.move();
        whtRook.move();
        whtRook.freeze();
        whtRook.move();
        whtRook.unfreeze();
        whtRook.move();
    }
}

class GamePiece {
    int positionX;
    int positionY;
    boolean frozen;
    String name;
    String color;

    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
    }

    public int getPositionY() {
        return positionY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPositionX() {
        return positionX;
    }

    public void move() {
        Scanner scanner = new Scanner(System.in);
System.out.println("Attempting to move the " +this.name+".");
        if (!this.frozen) {
            System.out.print("How many spaces along X did " + this.name + " move? ");
            this.positionX = scanner.nextInt() + this.positionX;
            System.out.print("How many spaces along Y did " + this.name + " move? ");
            this.positionY = scanner.nextInt() + this.positionY;
            System.out.println("The " + this.name + " is now on X " + this.positionX+ ", Y "+this.positionY+".");
        } else {
            System.out.println(this.name + " is frozen and can't move");
        }

    }

    public void freeze() {
        if (this.frozen) {
            System.out.println(this.name + " is already frozen.");
        } else {
            System.out.println(this.name + " is now frozen.");
            this.frozen = true;
        }
    }

    public void unfreeze() {
        if (!this.frozen) {
            System.out.println(this.name + " is already unfrozen.");
        } else {
            System.out.println(this.name + " is now unfrozen.");
            this.frozen = false;
        }
    }
}