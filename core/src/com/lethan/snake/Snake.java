package com.lethan.snake;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private int x;
    private int y;
    private int length;
    private boolean alive;
    private List<Integer[]> snakeSegments;
    private World world;

    public Snake(World world) {
        this.x = world.getWidth()/2;
        this.y = world.getHeight()/2;
        this.alive = true;
        this.world = world;
        this.length = 3;
        this.snakeSegments = new ArrayList<>();
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void growLength() {
        this.length += 1;
    }

    public boolean isAlive() {
        return this.alive;
    }

    public void move(int toX,int toY) {

    }
}
