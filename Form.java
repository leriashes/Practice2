import javax.swing.*;

public class Form extends JFrame implements Runnable 
{
    public Form()
    {
        this.setSize(500, 500);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void run() 
    {

    }
}