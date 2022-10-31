package com.lethan.snake;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Snake {
    private int x;
    private int y;
    private int length;
    private boolean alive;
    private List<Integer[]> snakeSegments;
    private World world;
    private int[] direction;

    private static final int[] UP = new int[] {0,1};
    private static final int[] DOWN = new int[] {0,-1};
    private static final int[] LEFT = new int[] {-1,0};
    private static final int[] RIGHT = new int[] {1,0};

    private float lastMoveDeltaTime;
    private float secondsBetweenSnakeMove;

    public Snake(World world) {
        this.x = world.getWidth()/2;
        this.y = world.getHeight()/2;
        this.alive = true;
        this.world = world;
        this.length = 3;
        this.snakeSegments = new ArrayList<>();
        for (int j=0; j<this.length; j++) {
            snakeSegments.add(new Integer[]{x, y});
        }
        this.direction = new int[] {0,0};
        this.secondsBetweenSnakeMove = .25F;
        world.setSnake(this);
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

    public List<Integer[]> getSnakeSegments() {
        return snakeSegments;
    }

    public void move() {
        this.getInput();
        if (lastMoveDeltaTime >= secondsBetweenSnakeMove) {
            lastMoveDeltaTime = 0;
            this.x += this.direction[0];
            this.y += this.direction[1];
            snakeSegments.add(0, new Integer[]{x, y});
            if (snakeSegments.size() > this.length) {
                snakeSegments.remove(snakeSegments.size() - 1);
            }
            checkForCollision();
        }
        else lastMoveDeltaTime += Gdx.graphics.getDeltaTime();
    }

    public void getInput() {
        if(Gdx.input.isKeyPressed(Input.Keys.W)){
            this.direction = Snake.UP;
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.S)){
            this.direction = Snake.DOWN;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.A)){
            this.direction = Snake.LEFT;
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.D)){
            this.direction = Snake.RIGHT;
        }
    }

    public void renderSnake(ShapeRenderer shapeRenderer) {
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        float r = this.world.getSquareDim();

        shapeRenderer.setColor(Color.DARK_GRAY);
        for (Integer[] coordinate : this.snakeSegments) {
            shapeRenderer.rect(coordinate[0]*r, coordinate[1]*r, r ,r);
        }
        shapeRenderer.end();

    }

    public void checkForCollision() {
        if (this.x < 0 || this.x > world.getWidth() || this.y < 0 || this.y > world.getHeight()) {
            this.alive = false;
        } else if (this)
    }

}
