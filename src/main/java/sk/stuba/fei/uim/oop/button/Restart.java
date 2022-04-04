package sk.stuba.fei.uim.oop.button;

import sk.stuba.fei.uim.oop.boadr.GameBoardPanel;
import sk.stuba.fei.uim.oop.gui.GameLogic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Restart extends AbstractAction {

    private GameLogic gameLogic;
    private JPanel gamePanel;

    public Restart(GameLogic gameLogic) {
        this.gameLogic = gameLogic;
        this.gamePanel = gameLogic.getGameBoardPanel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        gameLogic.remove(gamePanel);
        SwingUtilities.updateComponentTreeUI(gameLogic.getGameBoardPanel());
        gamePanel = new GameBoardPanel(gameLogic.getBoardSize());
        gameLogic.add(gamePanel);
        SwingUtilities.updateComponentTreeUI(gameLogic);


    }
}
