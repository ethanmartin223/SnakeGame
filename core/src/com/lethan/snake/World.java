package com.lethan.snake;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class World{
    private int width;
    private int height;
    private static float squareDim;

    public World(int width, int height, float squareDim) {
        this.width = width;
        this.height = height;
        this.
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }


    public void draw(ShapeRenderer shapeRenderer) {
        for (int y = 0; y < this.height; y++) {
            for (int x = 0; x < this.width; x++) {
                shapeRenderer.rect(x*this.,y,);
            }
        }

    }
}
