package quiz.app; //1 create package
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener//frame with the help of jframe //buttons pe implement krvane k liye action listener ka
{
    JTextField text;
    JButton Next, back;
    Login()//constructor name same as class name
    {
        getContentPane().setBackground(Color.WHITE); //background color
        setLayout(null);

        // image

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i = i1.getImage().getScaledInstance(550, 500, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(450, 0, 550, 500);
        add(image);

        //header jo btaega quiz test h ya kuch or ...

        JLabel heading = new JLabel("QUIZ TEST");//text and heading visible on frame used jlabel
        heading.setBounds(140, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(22, 99, 54));
        add(heading);

        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(160, 150, 300, 20);
        name.setFont(new Font("Monogolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(22, 99, 54));
        add(name);

        text = new JTextField();
        text.setBounds(80, 200, 300, 25);
        text.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(text);

        Next = new JButton("Next");
        Next.setBounds(100, 270, 120, 25);
        Next.setBackground(new Color(22, 99, 54));
        Next.setForeground(Color.WHITE);
        Next.addActionListener(this);
        add(Next);

        back = new JButton("Back");
        back.setBounds(250, 270, 120, 25);
        back.setBackground(new Color(22, 99, 54));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        setSize(1000, 500);//frame size
        setLocation(200, 150); // frame location it is a hidden trial
        setUndecorated(true);
        setVisible(true); //frame visible
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
       if (e.getSource() == Next)
       {
            String name = text.getText();
            setVisible(false);
            new Rules(name);
       }
       else if (e.getSource() == back)
       {
          System.exit(50);
       }
    }
    public static void main(String[] args)//main function
    {
        new Login();//object of contructor
    }
}
