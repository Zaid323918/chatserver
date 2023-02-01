import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatWindow implements ActionListener, WindowListener{

    JFrame jf = new JFrame();
    JTextArea msgEnter = new JTextArea();
    JTextArea msgHistory = new JTextArea();
    JPanel chatHistory = new JPanel();
    JPanel textbox = new JPanel();
    JButton msgSend = new JButton("Send Message");
    JScrollPane scroll = new JScrollPane(msgHistory);
    int chatterLeft = 0;

    public ChatWindow(Chatter user) {
        jf.setTitle(user.chatterName);
        msgEnter.setFont(new Font("Century Gothic", Font.PLAIN, 19));

        jf.setSize(600,300);
        msgSend.setSize(100, 100);
        scroll.setPreferredSize(new Dimension(550,125));

        chatHistory.add(scroll);
        textbox.setLayout((new BorderLayout()));
        textbox.add(msgEnter, BorderLayout.CENTER);
        textbox.add(msgSend, BorderLayout.EAST);
        jf.setLayout(new BorderLayout());
        jf.add(chatHistory, BorderLayout.CENTER);
        jf.add(textbox,BorderLayout.SOUTH);

        jf.addWindowListener(new WindowListener() {

            @Override
            public void windowClosing(WindowEvent e) {
                chatterLeft = 1;
            }

            public void windowOpened(WindowEvent e) {}
            public void windowClosed(WindowEvent e) {}
            public void windowIconified(WindowEvent e) {}
            public void windowDeiconified(WindowEvent e) {}
            public void windowActivated(WindowEvent e) {}
            public void windowDeactivated(WindowEvent e) {}

        });
        msgSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.modifyMsg(msgEnter.getText());
                msgEnter.setText("");
            }
        });

        jf.setVisible(true);
        msgHistory.setEditable(false);
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public void addMsg(String msg) {
        msgHistory.append(msg);
    }

    public void actionPerformed(ActionEvent arg0) {}
    public void windowActivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowClosing(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowOpened(WindowEvent e) {}
}
