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
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		shapeRender = new ShapeRenderer();
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);

		batch.begin();

		shapeRender.begin(ShapeRenderer.ShapeType.Filled);

		shapeRender.end();

		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
