package com.lethan.snake;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class MainApp extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	ShapeRenderer shapeRenderer;

	//game objects
	World world;
	Snake snake;
	Apple apple;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		shapeRenderer = new ShapeRenderer();
		world = new World(20,20, 20f);
		snake = new Snake(world);
		apple = new Apple(world);
	}

	@Override
	public void render () {
		snake.move();
		apple.checkIfEaten();

		ScreenUtils.clear(0, 0, 0, 1);

		world.renderWorld(shapeRenderer);
		apple.renderApple(shapeRenderer);
		snake.renderSnake(shapeRenderer);
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		shapeRenderer.dispose();
	}
}
