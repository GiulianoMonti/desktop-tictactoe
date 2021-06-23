package tictactoe;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    public Board() {
        setLayout(new GridLayout(3, 3));

        for (int row : new int[]{3, 2, 1}) {
            for (char column : new char[]{'A', 'B', 'C'}) {
                add(new Cell(column + "" + row));
            }
        }
    }
}