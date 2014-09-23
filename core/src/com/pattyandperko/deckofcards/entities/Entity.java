package com.pattyandperko.deckofcards.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Chris.Perko on 9/5/2014.
 */
public class Entity {

    protected Vector2 position, direction;
    protected TextureRegion texture;
    protected float width, height;


    public Entity(Vector2 position, Vector2 direction, TextureRegion texture, float width, float height) {
        this.position = position;
        this.direction = direction;
        this.texture = texture;
        this.width = width;
        this.height = height;
    }


    public Entity(Vector2 position, TextureRegion texture, float width, float height) {
        this.position = position;
        this.direction = Vector2.Zero;
        this.texture = texture;
        this.width = width;
        this.height = height;
    }


    public void update(float delta) {
        position.add(direction.cpy().scl(delta));
    }


    public void render(SpriteBatch batch){
        batch.draw(texture, position.x, position.y, width, height);
    }

    public Vector2 getPosition() { return position; }

}
