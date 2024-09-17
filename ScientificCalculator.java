import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class ScientificCalculator extends JFrame implements ActionListener, KeyListener {

    private JTextField display;
    private JPanel panel;
    private String[] buttons = {
            "7", "8", "9", "/", "sqrt",
            "4", "5", "6", "*", "log",
            "1", "2", "3", "-", "sin",
            "0", ".", "=", "+", "cos",
            "C"
    };
    private JButton[] btn = new JButton[buttons.length];

    private double num1, num2, result;
    private char operator;

    public ScientificCalculator() {
        setTitle("Scientific Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        display.setEditable(false);
        display.addKeyListener(this); // Add KeyListener to the display
        add(display, BorderLayout.NORTH);

        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 5, 5, 5));
        add(panel, BorderLayout.CENTER);

        // Add buttons to the panel
        for (int i = 0; i < buttons.length; i++) {
            btn[i] = new JButton(buttons[i]);
            btn[i].setFont(new Font("Arial", Font.PLAIN, 18));
            btn[i].addActionListener(this);
            panel.add(btn[i]);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ScientificCalculator calc = new ScientificCalculator();
            calc.setVisible(true);
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        handleInput(command);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        String command = "";

        switch (keyCode) {
            case KeyEvent.VK_0:
                command = "0";
                break;
            case KeyEvent.VK_1:
                command = "1";
                break;
            case KeyEvent.VK_2:
                command = "2";
                break;
            case KeyEvent.VK_3:
                command = "3";
                break;
            case KeyEvent.VK_4:
                command = "4";
                break;
            case KeyEvent.VK_5:
                command = "5";
                break;
            case KeyEvent.VK_6:
                command = "6";
                break;
            case KeyEvent.VK_7:
                command = "7";
                break;
            case KeyEvent.VK_8:
                command = "8";
                break;
            case KeyEvent.VK_9:
                command = "9";
                break;
            case KeyEvent.VK_PERIOD:
                command = ".";
                break;
            case KeyEvent.VK_PLUS:
                command = "+";
                break;
            case KeyEvent.VK_MINUS:
                command = "-";
                break;
            case KeyEvent.VK_MULTIPLY:
                command = "*";
                break;
            case KeyEvent.VK_DIVIDE:
                command = "/";
                break;
            case KeyEvent.VK_ENTER:
                command = "=";
                break;
            case KeyEvent.VK_BACK_SPACE:
                command = "C";
                break;
        }

        handleInput(command);
    }

    private void handleInput(String command) {
        switch (command) {
            case "C":
                display.setText("");
                break;
            case "=":
                num2 = Double.parseDouble(display.getText());
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                }
                display.setText(String.valueOf(result));
                break;
            case "sqrt":
                num1 = Math.sqrt(Double.parseDouble(display.getText()));
                display.setText(String.valueOf(num1));
                break;
            case "log":
                num1 = Math.log(Double.parseDouble(display.getText()));
                display.setText(String.valueOf(num1));
                break;
            case "sin":
                num1 = Math.sin(Math.toRadians(Double.parseDouble(display.getText())));
                display.setText(String.valueOf(num1));
                break;
            case "cos":
                num1 = Math.cos(Math.toRadians(Double.parseDouble(display.getText())));
                display.setText(String.valueOf(num1));
                break;
            default:
                if (command.matches("[0-9.]")) {
                    display.setText(display.getText() + command);
                } else {
                    num1 = Double.parseDouble(display.getText());
                    operator = command.charAt(0);
                    display.setText("");
                }
                break;
        }
    }

    // Implement KeyListener methods
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
