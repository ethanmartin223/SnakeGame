package com.lethan.snake;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class MainApp extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	ShapeRenderer shapeRender;
	World world;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		shapeRender = new ShapeRenderer();
		world = new World(20,20);
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);

		batch.begin();

		shapeRender.begin(ShapeRenderer.ShapeType.Filled);
		for (int y=0; y<world.getHeight(); y++) {}
		shapeRender.end();

		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
