
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends JFrame implements ActionListener {

    double number, answer;
    int calculation;
    JLabel label;
    JTextField textField;
    JRadioButton onRadioButton, offRadioButton;
    JButton buttonZero, buttonOne, buttonTwo, buttonSeven, buttonEight, buttonThree, buttonFour, buttonFive, buttonSix,
            buttonNine;
    JButton buttonDot, buttonClear, buttonDelete, buttonEqual, buttonMul, buttonDiv, buttonPlus, buttonMinus,
            buttonSquare, buttonSqrt, buttonReciprocal;
    JLabel name;
    Color pink = new Color(239, 71, 111);
    Color yellow = new Color(255, 209, 102);
    Color green = new Color(6, 214, 160);
    Color pastel = new Color(7, 59, 76);

    Calculator() {
        label = new JLabel("");
        label.setBounds(280, 0, 70, 50);
        label.setFont(new Font("Arial", Font.BOLD, 15));
        label.setForeground(Color.black);
        add(label);

        name = new JLabel("Devloped by Shubham Vishwakarma ");
        name.setBounds(10, -5, 300, 30);
        name.setFont(new Font("Arial", Font.BOLD, 10));
        name.setForeground(Color.red);
        add(name);

        textField = new JTextField();
        textField.setBounds(20, 40, 325, 50);
        textField.setFont(new Font("Arial", Font.BOLD, 30));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        add(textField);

        onRadioButton = new JRadioButton("on");
        onRadioButton.setBounds(280, 120, 60, 40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 20));
        onRadioButton.setBackground(yellow);
        onRadioButton.setForeground(Color.black);
        add(onRadioButton);
        onRadioButton.addActionListener(this);

        offRadioButton = new JRadioButton("off");
        offRadioButton.setBounds(280, 150, 60, 40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 20));
        offRadioButton.setBackground(yellow);
        offRadioButton.setForeground(Color.black);
        add(offRadioButton);
        offRadioButton.addActionListener(this);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        buttonSeven = new JButton("7");
        buttonSeven.setBounds(20, 270, 70, 60);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSeven.setBackground(pastel);
        buttonSeven.setForeground(Color.white);
        add(buttonSeven);
        buttonSeven.addActionListener(this);

        buttonEight = new JButton("8");
        buttonEight.setBounds(102, 270, 70, 60);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEight.setBackground(pastel);
        buttonEight.setForeground(Color.white);
        add(buttonEight);
        buttonEight.addActionListener(this);

        buttonNine = new JButton("9");
        buttonNine.setBounds(185, 270, 70, 60);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        buttonNine.setBackground(pastel);
        buttonNine.setForeground(Color.white);
        add(buttonNine);
        buttonNine.addActionListener(this);

        buttonFour = new JButton("4");
        buttonFour.setBounds(20, 340, 70, 60);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        buttonFour.setBackground(pastel);
        buttonFour.setForeground(Color.white);
        add(buttonFour);
        buttonFour.addActionListener(this);

        buttonFive = new JButton("5");
        buttonFive.setBounds(102, 340, 70, 60);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        buttonFive.setBackground(pastel);
        buttonFive.setForeground(Color.white);
        add(buttonFive);
        buttonFive.addActionListener(this);

        buttonSix = new JButton("6");
        buttonSix.setBounds(185, 340, 70, 60);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSix.setBackground(pastel);
        buttonSix.setForeground(Color.white);
        add(buttonSix);
        buttonSix.addActionListener(this);

        buttonOne = new JButton("1");
        buttonOne = new JButton("1");
        buttonOne.setBounds(20, 410, 70, 60);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        buttonOne.setBackground(pastel);
        buttonOne.setForeground(Color.white);
        add(buttonOne);
        buttonOne.addActionListener(this);

        buttonTwo = new JButton("2");
        buttonTwo.setBounds(102, 410, 70, 60);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        buttonTwo.setBackground(pastel);
        buttonTwo.setForeground(Color.white);
        add(buttonTwo);
        buttonTwo.addActionListener(this);

        buttonThree = new JButton("3");
        buttonThree.setBounds(185, 410, 70, 60);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        buttonThree.setBackground(pastel);
        buttonThree.setForeground(Color.white);
        add(buttonThree);
        buttonThree.addActionListener(this);

        buttonDot = new JButton(".");
        buttonDot.setBounds(185, 480, 70, 60);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDot.setBackground(pastel);
        buttonDot.setForeground(Color.white);
        add(buttonDot);
        buttonDot.addActionListener(this);

        buttonZero = new JButton("0");
        buttonZero.setBounds(20, 480, 152, 60);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        buttonZero.setBackground(pastel);
        buttonZero.setForeground(Color.white);
        add(buttonZero);
        buttonZero.addActionListener(this);

        buttonEqual = new JButton("=");
        buttonEqual.setBounds(270, 410, 70, 130);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setBackground(green);
        add(buttonEqual);
        buttonEqual.addActionListener(this);

        buttonDiv = new JButton("/");
        buttonDiv.setBounds(185, 130, 70, 60);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDiv.setBackground(green);
        add(buttonDiv);
        buttonDiv.addActionListener(this);

        buttonSqrt = new JButton("\u221A");
        buttonSqrt.setBounds(20, 200, 70, 60);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 18));
        buttonSqrt.setBackground(green);
        add(buttonSqrt);
        buttonSqrt.addActionListener(this);

        buttonMul = new JButton("x");
        buttonMul.setBounds(270, 270, 70, 60);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMul.setBackground(green);
        add(buttonMul);
        buttonMul.addActionListener(this);

        buttonMinus = new JButton("-");
        buttonMinus.setBounds(270, 200, 70, 60);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMinus.setBackground(green);
        add(buttonMinus);
        buttonMinus.addActionListener(this);

        buttonPlus = new JButton("+");
        buttonPlus.setBounds(270, 340, 70, 60);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlus.setBackground(green);
        add(buttonPlus);
        buttonPlus.addActionListener(this);

        buttonSquare = new JButton("x²");
        buttonSquare.setBounds(102, 200, 70, 60);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSquare.setBackground(green);
        add(buttonSquare);
        buttonSquare.addActionListener(this);

        buttonReciprocal = new JButton("1/x");
        buttonReciprocal.setBounds(185, 200, 70, 60);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 15));
        buttonReciprocal.setBackground(green);
        add(buttonReciprocal);
        buttonReciprocal.addActionListener(this);

        buttonDelete = new JButton("DEL");
        buttonDelete.setBounds(102, 130, 70, 60);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        buttonDelete.setBackground(pink);
        buttonDelete.setForeground(Color.white);
        add(buttonDelete);
        buttonDelete.addActionListener(this);

        buttonClear = new JButton("C");
        buttonClear.setBounds(20, 130, 70, 60);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        buttonClear.setBackground(pink);
        buttonClear.setForeground(Color.white);
        add(buttonClear);
        buttonClear.addActionListener(this);

        setTitle("Calculator");
        setSize(375, 600);
        getContentPane().setLayout(null);
        getContentPane().setBackground(yellow);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == onRadioButton) {
            onRadioButton.setEnabled(false);
            offRadioButton.setEnabled(true);
            textField.setEnabled(true);
            label.setEnabled(true);
            buttonClear.setEnabled(true);
            buttonDelete.setEnabled(true);
            buttonDiv.setEnabled(true);
            buttonSqrt.setEnabled(true);
            buttonSquare.setEnabled(true);
            buttonReciprocal.setEnabled(true);
            buttonMinus.setEnabled(true);
            buttonSeven.setEnabled(true);
            buttonEight.setEnabled(true);
            buttonNine.setEnabled(true);
            buttonMul.setEnabled(true);
            buttonFour.setEnabled(true);
            buttonFive.setEnabled(true);
            buttonSix.setEnabled(true);
            buttonPlus.setEnabled(true);
            buttonOne.setEnabled(true);
            buttonTwo.setEnabled(true);
            buttonThree.setEnabled(true);
            buttonEqual.setEnabled(true);
            buttonZero.setEnabled(true);
            buttonDot.setEnabled(true);
        }

        else if (e.getSource() == offRadioButton) {
            onRadioButton.setEnabled(true);
            offRadioButton.setEnabled(false);
            textField.setText("");
            label.setText(" ");
            buttonClear.setEnabled(false);
            buttonDelete.setEnabled(false);
            buttonDiv.setEnabled(false);
            buttonSqrt.setEnabled(false);
            buttonSquare.setEnabled(false);
            buttonReciprocal.setEnabled(false);
            buttonMinus.setEnabled(false);
            buttonSeven.setEnabled(false);
            buttonEight.setEnabled(false);
            buttonNine.setEnabled(false);
            buttonMul.setEnabled(false);
            buttonFour.setEnabled(false);
            buttonFive.setEnabled(false);
            buttonSix.setEnabled(false);
            buttonPlus.setEnabled(false);
            buttonOne.setEnabled(false);
            buttonTwo.setEnabled(false);
            buttonThree.setEnabled(false);
            buttonEqual.setEnabled(false);
            buttonZero.setEnabled(false);
            buttonDot.setEnabled(false);
        }

        else if (e.getSource() == buttonClear) {
            label.setText("");
            textField.setText("");
        }

        else if (e.getSource() == buttonDelete) {
            int length = textField.getText().length();
            int number = length - 1;

            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());

            }
            if (textField.getText().endsWith("")) {
                label.setText("");
            }
        } else if (e.getSource() == buttonZero) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + "0");
            }
        }

        else if (e.getSource() == buttonOne) {
            textField.setText(textField.getText() + "1");
        } else if (e.getSource() == buttonTwo) {
            textField.setText(textField.getText() + "2");
        } else if (e.getSource() == buttonThree) {
            textField.setText(textField.getText() + "3");
        } else if (e.getSource() == buttonFour) {
            textField.setText(textField.getText() + "4");
        } else if (e.getSource() == buttonFive) {
            textField.setText(textField.getText() + "5");
        } else if (e.getSource() == buttonSix) {
            textField.setText(textField.getText() + "6");
        } else if (e.getSource() == buttonSeven) {
            textField.setText(textField.getText() + "7");
        } else if (e.getSource() == buttonEight) {
            textField.setText(textField.getText() + "8");
        } else if (e.getSource() == buttonNine) {
            textField.setText(textField.getText() + "9");
        } else if (e.getSource() == buttonDot) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + "."); // If the text field does not contain a dot, add a dot
            }

        }

        else if (e.getSource() == buttonPlus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "+");
            calculation = 1;
        } else if (e.getSource() == buttonMinus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "-");
            calculation = 2;
        } else if (e.getSource() == buttonMul) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "X");
            calculation = 3;
        } else if (e.getSource() == buttonDiv) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "/");
            calculation = 4;
        } else if (e.getSource() == buttonSqrt) {
            number = Double.parseDouble(textField.getText());
            Double sqrt = Math.sqrt(number);
            textField.setText(Double.toString(sqrt));

        } else if (e.getSource() == buttonSquare) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            double square = Math.pow(number, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
            label.setText("(sqr)" + str);
        } else if (e.getSource() == buttonReciprocal) {
            number = Double.parseDouble(textField.getText());
            double reciprocal = 1 / number;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
        } else if (e.getSource() == buttonEqual) {
            switch (calculation) {
                case 1:
                    answer = number + Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 2:
                    answer = number - Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 3:
                    answer = number * Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 4:
                    answer = number / Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;

            }
        }

    }

    public static void main(String[] args) {
        new Calculator();
    }
}