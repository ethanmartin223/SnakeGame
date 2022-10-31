package com.lethan.snake;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class World{
    private final int width;
    private final int height;
    private final float squareDim;
    private Snake snake;

    public World(int width, int height, float squareDim) {
        this.width = width;
        this.height = height;
        this.squareDim = squareDim;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public float getSquareDim() {return this.squareDim;}

    public void renderWorld(ShapeRenderer shapeRenderer) {
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        for (int y = 0; y < this.height; y++) {
            for (int x = 0; x < this.width; x++) {
                if ((x+y)%2==0) {
                    shapeRenderer.setColor(Color.GREEN);
                } else {
                    shapeRenderer.setColor(Color.LIME);
                }
                shapeRenderer.rect(x*this.squareDim, y*this.squareDim, this.squareDim, this.squareDim);
            }
        }
        shapeRenderer.end();
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public Snake getSnake() {
        return snake;
    }


}
