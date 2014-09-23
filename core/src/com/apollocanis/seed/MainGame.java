package com.apollocanis.seed;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.apollocanis.seed.assets.AssetLoader;
import com.apollocanis.seed.screens.DemoScreen;
import com.apollocanis.seed.screens.ScreenManager;

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
