package com.pattyandperko.deckofcards;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.pattyandperko.deckofcards.assets.AssetLoader;
import com.pattyandperko.deckofcards.screens.DemoScreen;
import com.pattyandperko.deckofcards.screens.ScreenManager;

public class MainGame extends ApplicationAdapter {

	
	@Override
	public void create () {
        AssetLoader.load();

        // Start the game on the DemoScreen
        ScreenManager.setScreen(new DemoScreen());
	}

	@Override
	public void render () {
        // Clear the screen
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        if(ScreenManager.getCurrentScreen() != null) {
            ScreenManager.getCurrentScreen().render(Gdx.graphics.getDeltaTime());
        }
	}
}
