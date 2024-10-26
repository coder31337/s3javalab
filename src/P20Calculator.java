import javax.swing.*;
import java.awt.event.*;

class Calculator implements ActionListener {
    private final JTextField calcDisplay;
    private final JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private final JButton btnAdd, btnSubtract, btnMultiply, btnDivide, btnClear, btnEquals;
    JFrame frame;
    private Integer result;
    private String operation;

    public Calculator() {
        frame = new JFrame("Calculator");
        frame.setSize(218, 201);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        calcDisplay = new JTextField();
        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnAdd = new JButton("+");
        btnSubtract = new JButton("-");
        btnMultiply = new JButton("×");
        btnDivide = new JButton("÷");
        btnClear = new JButton("C");
        btnEquals = new JButton("=");

        calcDisplay.setBounds(1, 1, 201, 30);

        btn7.setBounds(1, 41, 50, 30);
        btn8.setBounds(51, 41, 50, 30);
        btn9.setBounds(101, 41, 50, 30);
        btnDivide.setBounds(151, 41, 50, 30);

        btn4.setBounds(1, 71, 50, 30);
        btn5.setBounds(51, 71, 50, 30);
        btn6.setBounds(101, 71, 50, 30);
        btnMultiply.setBounds(151, 71, 50, 30);

        btn1.setBounds(1, 101, 50, 30);
        btn2.setBounds(51, 101, 50, 30);
        btn3.setBounds(101, 101, 50, 30);
        btnSubtract.setBounds(151, 101, 50, 30);

        btnClear.setBounds(1, 131, 50, 30);
        btn0.setBounds(51, 131, 50, 30);
        btnAdd.setBounds(101, 131, 50, 30);
        btnEquals.setBounds(151, 131, 50, 30);

        frame.add(calcDisplay);
        frame.add(btn0);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        frame.add(btnAdd);
        frame.add(btnSubtract);
        frame.add(btnMultiply);
        frame.add(btnDivide);
        frame.add(btnClear);
        frame.add(btnEquals);

        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnAdd.addActionListener(this);
        btnSubtract.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDivide.addActionListener(this);
        btnClear.addActionListener(this);
        btnEquals.addActionListener(this);

        frame.setVisible(true);
    }

    public void doAction(String op) {
        if (operation == null) {
            operation = op;
            result = Integer.parseInt(calcDisplay.getText());
            calcDisplay.setText("");
        } else {
            switch (operation) {
                case "+":
                    result += Integer.parseInt(calcDisplay.getText());
                    break;
                case "-":
                    result -= Integer.parseInt(calcDisplay.getText());
                    break;
                case "*":
                    result *= Integer.parseInt(calcDisplay.getText());
                    break;
                case "/":
                    try {
                        result /= Integer.parseInt(calcDisplay.getText());
                    } catch (ArithmeticException e) {
                        operation = null;
                        result = null;
                    }
                    break;
            }
            if (op.equals("=")) {
                if (result == null) {
                    calcDisplay.setText("Cannot divide by zero");
                    result = 0;
                } else {
                    calcDisplay.setText(result.toString());
                    operation = null;
                    result = 0;
                }
            } else {
                operation = op;
                calcDisplay.setText("");
            }
        }
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btn0)
            calcDisplay.setText(calcDisplay.getText() + "0");
        else if (event.getSource() == btn1)
            calcDisplay.setText(calcDisplay.getText() + "1");
        else if (event.getSource() == btn2)
            calcDisplay.setText(calcDisplay.getText() + "2");
        else if (event.getSource() == btn3)
            calcDisplay.setText(calcDisplay.getText() + "3");
        else if (event.getSource() == btn4)
            calcDisplay.setText(calcDisplay.getText() + "4");
        else if (event.getSource() == btn5)
            calcDisplay.setText(calcDisplay.getText() + "5");
        else if (event.getSource() == btn6)
            calcDisplay.setText(calcDisplay.getText() + "6");
        else if (event.getSource() == btn7)
            calcDisplay.setText(calcDisplay.getText() + "7");
        else if (event.getSource() == btn8)
            calcDisplay.setText(calcDisplay.getText() + "8");
        else if (event.getSource() == btn9)
            calcDisplay.setText(calcDisplay.getText() + "9");
        else if (event.getSource() == btnAdd)
            doAction("+");
        else if (event.getSource() == btnSubtract)
            doAction("-");
        else if (event.getSource() == btnMultiply)
            doAction("*");
        else if (event.getSource() == btnDivide)
            doAction("/");
        else if (event.getSource() == btnEquals)
            doAction("=");
        else if (event.getSource() == btnClear) {
            calcDisplay.setText("");
            result = 0;
            operation = null;
        }
    }
}

public class P20Calculator {
    public static void main(String[] args) {
        new Calculator();
    }
}
