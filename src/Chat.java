import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Chat extends JFrame {
    private JFrame frame;
    public Chat() {
        frame = new JFrame();
        frame.setTitle("Chat");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setBounds(450,100,700,600);


        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        frame.add(textArea, BorderLayout.CENTER);


        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BorderLayout());

        JTextField textField = new JTextField();
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                send(textArea,textField);
            }
        });
        southPanel.add(textField, BorderLayout.CENTER);

        JButton button = new JButton("Send");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                send(textArea,textField);
            }
        });
        southPanel.add(button, BorderLayout.EAST);

        frame.add(southPanel,BorderLayout.SOUTH);
        frame.setVisible(true);
    }


    private void send(JTextArea textArea, JTextField textField) {
        StringBuilder sb = new StringBuilder(textArea.getText());
        sb.append(textField.getText() + "\n");
        textArea.setText(sb.toString());
        textField.setText("");
    }
}
