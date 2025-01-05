import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyMouseEventDemo extends JFrame implements KeyListener, MouseListener {
    private JLabel label;

    public KeyMouseEventDemo() {
        super("Key and Mouse Events Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Click and press keys to see events");
        add(label);

        addKeyListener(this);
        addMouseListener(this);

        setSize(300, 200);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        label.setText("Key typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        label.setText("Key pressed: " + e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        label.setText("Key released: " + e.getKeyCode());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse clicked: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse pressed: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse released: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse exited");
    }

    public static void main(String[] args) {
        new KeyMouseEventDemo();
    }
}