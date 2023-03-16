package Lab9.Ex4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class X_0 implements ActionListener {
    JFrame frame = new JFrame();
    JPanel text_panel = new JPanel();
    JPanel b_panel = new JPanel();
    JLabel label = new JLabel();
    JButton[] buttons = new JButton[9];

    Random random = new Random();
    int chance_flag = 0;
    boolean bchance;

    X_0() {
        //frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 900);
        frame.setTitle("X&0 Game");
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        //label
        label.setFont(new Font("Ink", Font.BOLD, 75));
        label.setHorizontalAlignment(JLabel.CENTER);

        //text panel
        text_panel.setLayout(new BorderLayout());
        text_panel.setBackground(new Color(255, 153, 0));
        text_panel.setBounds(0, 0,900, 100);

        //buttons panel
        b_panel.setLayout(new GridLayout(3, 3));
        b_panel.setBackground(new Color(102, 102, 102));
        for(int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            b_panel.add(buttons[i]);
            buttons[i].setFont(new Font("Times New Roman", Font.ITALIC, 100));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        text_panel.add(label);
        frame.add(text_panel, BorderLayout.NORTH);
        frame.add(b_panel);

        startGame();
    }

    public void startGame() {
        int chance = random.nextInt(100);
        if(chance % 2 == 0) {
            bchance = true;
            label.setText("X turn");
        }
        else {
            bchance = false;
            label.setText("0 turn");
        }
    }

    public void gameOver(String s) {
        chance_flag = 0;
        Object[] option = {"Restart", "Exit"};
        int n = JOptionPane.showOptionDialog(frame, "Game Over!\n" + s, "Game Over!",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
        if(n == 0) {
            frame.dispose();
            new X_0();
        }
        else {
            frame.dispose();
        }
    }

    public void same() {
        //X
        if((buttons[0].getText() == "X") && (buttons[1].getText() == "X") && (buttons[2].getText() == "X")) {
            X_wins(0, 1, 2);
        }
        else if((buttons[3].getText() == "X") && (buttons[4].getText() == "X") && (buttons[5].getText() == "X")) {
            X_wins(3, 4, 5);
        }
        else if((buttons[6].getText() == "X") && (buttons[7].getText() == "X") && (buttons[8].getText() == "X")) {
            X_wins(6, 7, 8);
        }
        else if((buttons[0].getText() == "X") && (buttons[4].getText() == "X") && (buttons[8].getText() == "X")) {
            X_wins(0, 4, 8);
        }
        else if((buttons[2].getText() == "X") && (buttons[4].getText() == "X") && (buttons[6].getText() == "X")) {
            X_wins(2, 4, 6);
        }
        //0
        else if((buttons[0].getText() == "O") && (buttons[1].getText() == "O") && (buttons[2].getText() == "O")) {
            O_Wins(0, 1, 2);
        }
        else if((buttons[3].getText() == "O") && (buttons[4].getText() == "O") && (buttons[5].getText() == "O")) {
            O_Wins(3, 4, 5);
        }
        else if((buttons[6].getText() == "O") && (buttons[7].getText() == "O") && (buttons[8].getText() == "O")) {
            O_Wins(6, 7, 8);
        }
        else if((buttons[0].getText() == "O") && (buttons[4].getText() == "O") && (buttons[8].getText() == "O")) {
            O_Wins(0, 4, 8);
        }
        else if((buttons[2].getText() == "O") && (buttons[4].getText() == "O") && (buttons[6].getText() == "O")) {
            O_Wins(2, 4, 6);
        }
        else if (chance_flag == 9) {
            label.setText("Match Tie");
            gameOver("Match Tie");
        }
    }

    public void O_Wins(int x1, int x2, int x3) {
        buttons[x1].setBackground(Color.RED);
        buttons[x2].setBackground(Color.RED);
        buttons[x3].setBackground(Color.RED);

        for(int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        label.setText("0 wins!");
        gameOver("0 wins!");
    }

    public void X_wins(int x1, int x2, int x3) {
        buttons[x1].setBackground(Color.RED);
        buttons[x2].setBackground(Color.RED);
        buttons[x3].setBackground(Color.RED);

        for(int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        label.setText("X wins!");
        gameOver("X wins!");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (bchance) {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(153, 102, 0));
                        buttons[i].setText("X");
                        bchance = false;
                        label.setText("O turn");
                        chance_flag++;
                        same();
                    }
                } else {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(0, 0, 0));
                        buttons[i].setText("O");
                        bchance = true;
                        label.setText("X turn");
                        chance_flag++;
                        same();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        new X_0();
    }
}
