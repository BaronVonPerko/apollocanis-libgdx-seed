package com.pattyandperko.deckofcards.screens;

import com.badlogic.gdx.Screen;

/**
 * Created by Chris.Perko on 9/5/2014.
 */
public class ScreenManager {

    private static Screen currentScreen;

    public static void setScreen(Screen screen) {
        if(currentScreen != null)
            currentScreen.dispose();
        currentScreen = screen;
    }

    public static Screen getCurrentScreen() {
        return currentScreen;
    }

}
