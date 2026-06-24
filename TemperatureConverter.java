import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter extends JFrame implements ActionListener {

    JLabel titleLabel, tempLabel, scaleLabel, resultLabel;
    JTextField tempField;
    JComboBox<String> scaleBox;
    JButton convertButton;

    public TemperatureConverter() {

        setTitle("Temperature Converter");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        titleLabel = new JLabel("Temperature Converter");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setBounds(110, 20, 250, 30);

        tempLabel = new JLabel("Enter Temperature:");
        tempLabel.setBounds(50, 80, 150, 25);

        tempField = new JTextField();
        tempField.setBounds(200, 80, 150, 25);

        scaleLabel = new JLabel("Select Scale:");
        scaleLabel.setBounds(50, 120, 150, 25);

        String[] scales = {"Celsius", "Fahrenheit", "Kelvin"};
        scaleBox = new JComboBox<>(scales);
        scaleBox.setBounds(200, 120, 150, 25);

        convertButton = new JButton("Convert");
        convertButton.setBounds(150, 170, 120, 35);
        convertButton.addActionListener(this);

        resultLabel = new JLabel("Result will appear here");
        resultLabel.setBounds(50, 220, 350, 25);

        add(titleLabel);
        add(tempLabel);
        add(tempField);
        add(scaleLabel);
        add(scaleBox);
        add(convertButton);
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            double temp = Double.parseDouble(tempField.getText());
            String scale = (String) scaleBox.getSelectedItem();

            double celsius, fahrenheit, kelvin;

            if (scale.equals("Celsius")) {
                fahrenheit = (temp * 9 / 5) + 32;
                kelvin = temp + 273.15;

                resultLabel.setText(
                    String.format("Fahrenheit: %.2f °F | Kelvin: %.2f K",
                            fahrenheit, kelvin));

            } else if (scale.equals("Fahrenheit")) {
                celsius = (temp - 32) * 5 / 9;
                kelvin = celsius + 273.15;

                resultLabel.setText(
                    String.format("Celsius: %.2f °C | Kelvin: %.2f K",
                            celsius, kelvin));

            } else {
                celsius = temp - 273.15;
                fahrenheit = (celsius * 9 / 5) + 32;

                resultLabel.setText(
                    String.format("Celsius: %.2f °C | Fahrenheit: %.2f °F",
                            celsius, fahrenheit));
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Please enter a valid number!",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new TemperatureConverter();
    }
}