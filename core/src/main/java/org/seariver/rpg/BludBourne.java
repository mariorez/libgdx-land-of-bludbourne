package org.seariver.rpg;

import com.badlogic.gdx.Game;
import org.seariver.rpg.screens.MainGameScreen;

public class BludBourne extends Game {

    private static final MainGameScreen mainGameScreen = new MainGameScreen();

    @Override
    public void create() {
        setScreen(mainGameScreen);
    }

    @Override
    public void dispose() {
        mainGameScreen.dispose();
    }
}
