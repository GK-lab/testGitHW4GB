package lessonA4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.net.http.WebSocket;

public class MyChat extends JFrame {
    private JTextArea textArea = new JTextArea();
    private JPanel jPanel = new JPanel();
    private JScrollPane jScrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    private JTextField jTextField = new JTextField();
    private JLabel jLabel = new JLabel("Сообщение");
    private final JButton jButton = new JButton("Отправить");
    private final ActionListener actionListener = event ->
    {sendMessage (jTextField.getText() + "\n");
    jTextField.setText("");
    };

    public MyChat(){
        this.setTitle("Чат");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(new FlowLayout());
        textArea.setEditable(false);
        jPanel.setBackground(Color.WHITE);
        jPanel.setPreferredSize(new Dimension(500,500));
        jScrollPane.setPreferredSize(new Dimension(400,300));
        jPanel.add(jScrollPane);
        jTextField.setPreferredSize(new Dimension(200,30));
        jPanel.add(jLabel);
        jPanel.add(jTextField);
        jTextField.addActionListener(actionListener);
        jButton.addActionListener(actionListener);
        jPanel.add(jButton);
        this.add(jPanel);
        this.setVisible(true);


    }
    public static void main(String [] args){

        new MyChat();
    }
    public void sendMessage(String s){
        textArea.append(s);
    }




}