package tictactoe;

import javax.swing.*;

public class Cell extends JButton {

    public Cell(String coordinates) {
        setName("Button" + coordinates);
        setText(coordinates);
    }
}