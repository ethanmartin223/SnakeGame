package com.lethan.snake;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import static com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnShape.square;

public class World{
    private int width;
    private int height;
    private float squareDim;

    public World(int width, int height, float squareDim) {
        this.width = width;
        this.height = height;
        this.squareDim = squareDim;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void draw(ShapeRenderer shapeRenderer) {
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        for (int y = 0; y < this.height; y++) {
            for (int x = 0; x < this.width; x++) {
                if ((x+y)%2==0) {
                    shapeRenderer.setColor(50F, 205F, 50F, 1F);
                } else {
                    shapeRenderer.setColor(50F, 205F, 50F, 1F);
                }
                shapeRenderer.rect(x*this.squareDim, y*this.squareDim, this.squareDim, this.squareDim);
            }
        }
        shapeRenderer.end();
    }


}
