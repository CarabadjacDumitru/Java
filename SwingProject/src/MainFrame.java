import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JTextArea textArea;
    private JButton btn;

    public MainFrame() {
        super("Hellloowwww");
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        btn = new JButton("Click");

        add(textArea, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}