package com.apollocanis.seed.assets;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by Chris.Perko on 9/5/2014.
 */
public class AssetLoader {

    public static Texture demoTex;
    public static TextureRegion demoRobot;

    public static void load() {
        demoTex = new Texture(Gdx.files.internal("images/demo_robot.png"));

        demoRobot = new TextureRegion(demoTex);
        demoRobot.flip(false, true);
    }

}
