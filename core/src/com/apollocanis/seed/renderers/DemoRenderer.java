package com.apollocanis.seed.renderers;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.apollocanis.seed.Settings;
import com.apollocanis.seed.entities.EntityManager;

/**
 * Created by cperko on 9/11/14.
 */
public class DemoRenderer {

    private SpriteBatch batch;
    private OrthographicCamera camera;

    public DemoRenderer() {

        camera = new OrthographicCamera();
        camera.setToOrtho(true, Settings.SCREEN_WIDTH, Settings.SCREEN_HEIGHT);
        batch = new SpriteBatch();
        batch.setProjectionMatrix(camera.combined);
    }


    public void draw() {
        batch.begin();
        EntityManager.render(batch);
        batch.end();
    }

}
