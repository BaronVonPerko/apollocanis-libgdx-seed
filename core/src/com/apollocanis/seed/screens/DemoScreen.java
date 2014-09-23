package com.apollocanis.seed.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.math.Vector2;
import com.apollocanis.seed.assets.AssetLoader;
import com.apollocanis.seed.entities.Entity;
import com.apollocanis.seed.entities.EntityManager;
import com.apollocanis.seed.renderers.DemoRenderer;

/**
 * Created by cperko on 9/11/14.
 */
public class DemoScreen implements Screen {

    private DemoRenderer renderer;

    public DemoScreen() {
        renderer = new DemoRenderer();
        EntityManager.init();

        Vector2 demoPosition = new Vector2(0, 0);
        Vector2 demoDirection = new Vector2(50, 50);
        int demoWidth = 20;
        int demoHeight = 45;

        Entity demoEntity = new Entity(demoPosition, demoDirection, AssetLoader.demoRobot,
                demoWidth, demoHeight);

        EntityManager.addEntity(demoEntity);
    }

    @Override
    public void render(float delta) {
        EntityManager.update(delta);
        renderer.draw();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {
    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
