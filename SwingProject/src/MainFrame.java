import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    /*private JTextArea textArea;*/
    private Toolbar toolbar;
    private TextPanel textPanel;
    private JButton btn;

    public MainFrame() {
        super("Hellloowwww");
        setLayout(new BorderLayout());


        textPanel = new TextPanel();
        btn = new JButton("Click");
        toolbar = new Toolbar();



        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onBtnPressed();
            }
        });

        toolbar.setStringListener(new StringListener() {
            @Override
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
        });

        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void onBtnPressed(){
        textPanel.appendText("1111111111111111111111\n");
    }
}