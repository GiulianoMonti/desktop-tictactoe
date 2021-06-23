package tictactoe;

import javax.swing.*;

public class TicTacToe extends JFrame {

    public TicTacToe() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setSize(600, 600);
        setVisible(true);

        JPanel board = new Board();
        add(board);
    }
}
//    public TicTacToe() {
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setTitle("Tic Tac Toe");
//        setResizable(false);
//        setSize(450, 450);
//        setVisible(true);
//        add(new JButton("A3"));
//        add(new JButton("B3"));
//        add(new JButton("C3"));
//        add(new JButton("A2"));
//        add(new JButton("B2"));
//        add(new JButton("C2"));
//        add(new JButton("This is another label"));
//        add(new JButton("This is another label"));
//        setLayout(new GridLayout(3, 2, 0, 0));
//        setVisible(true);
//    }
//}

