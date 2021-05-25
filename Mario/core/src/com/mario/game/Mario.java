package com.mario.game;

import Screens.FirstLevel;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Matrix4;

public class Mario extends Game {

	public static final int V_WHIT = 400;
	public static final int V_HEIGHT = 208;
	public static final float PPM = 100;
	public static final int GROUND_BIT = 1;
	public static final int PLAYER_BIT = 2;
	public static final int BRICK_BIT = 4;
	public static final int COIN_BIT = 8;
	public static final int DESTROYED_BIT = 16;
	public static final int OBJECT_BIT = 32;
	public static final int ENEMY_BIT = 64;
	public static final int ENEMY_HEAD_BIT = 128;
	public static final int ITEM_BIT = 256;


	private SpriteBatch batch;
	private AssetManager manager;

	public Mario() {
	}

	@Override
	public void create () {
		this.batch = new SpriteBatch();
		this.setScreen(new FirstLevel(this));
	}

	@Override
	public void render () {
		super.render();

	}
	
	@Override
	public void dispose () {
		this.batch.dispose();
		super.dispose();
	}

	public void beginDraw(){
		this.batch.begin();
	}

	public void endDraw(){
		this.batch.end();
	}

	public SpriteBatch getBatch(){
		return batch;
	}

	public AssetManager getManager() {
		return manager;
	}

	public void setProjectionMatrix(Matrix4 camera){
		this.batch.setProjectionMatrix(camera);
	}
}
