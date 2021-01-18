package lesson7;

import javax.swing.*;
import java.awt.*;

public class GameMap extends JPanel {

    public static final int GAME_MODE_HVA = 0;
    public static final int GAME_MODE_HVH = 1;

    GameMap() {
        setBackground(Color.RED);
    }

    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength) {
        System.out.println("mode = " + mode +
                " fieldSizeX = " + fieldSizeX +
                " fieldSizeY = " + fieldSizeY +
                " winLength = " + winLength);
    }

/*
1. Полностью разобраться с кодом
(попробовать полностью самостоятельно переписать одно из окон)
2. Составить список вопросов и приложить в виде комментария к домашней работе
3. * Рачертить панель GameMap на поле для игры, согласно fieldSize

*/

}
