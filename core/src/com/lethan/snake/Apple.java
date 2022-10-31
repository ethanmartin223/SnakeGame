package com.lethan.snake;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.List;

public class Apple {
    int x;
    int y;
    World world;

    public Apple(World world) {
        this.x = (int) (Math.random() * world.getWidth());
        this.y = (int) (Math.random() * world.getHeight());
        this.world = world;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void renderApple(ShapeRenderer shapeRenderer) {
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.RED);
        float r = this.world.getSquareDim();
        shapeRenderer.rect(x*r, y*r, r, r);
        shapeRenderer.end();
    }

    public void moveToRandom() {
        Snake s = world.getSnake();
        List<Integer[]> segmentList = s.getSnakeSegments();

        while (true) {
            this.x = (int) (Math.random() * world.getWidth());
            this.y = (int) (Math.random() * world.getHeight());

            /*for (Integer[] segment : segmentList) {
                if () {
                    break;
                }
            }*/
            break;
        }
    }

    public void checkIfEaten() {
        Snake s = world.getSnake();
        if ((s.getX()==this.x) && s.getY()==this.y)  {
            s.growLength();
            this.moveToRandom();
        }
    }
}
