package com.pattyandperko.deckofcards.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;

/**
 * Created by Chris.Perko on 9/5/2014.
 */
public class EntityManager {

    private static Array<Entity> entities;


    public static void init() {
        entities = new Array<Entity>();
    }


    public static void addEntity(Entity e) {
        entities.add(e);
    }


    public static void update(float delta) {
        for(Entity e : entities) {
            e.update(delta);
        }
    }


    public static void render(SpriteBatch batch) {
        for(Entity e : entities) {
            e.render(batch);
        }
    }

}
