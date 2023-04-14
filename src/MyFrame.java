import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class MyFrame extends JFrame implements ActionListener
{
	JTextArea Random=new JTextArea();
	JLabel n=new JLabel("Parola Random: ");
	JButton Estrai=new JButton("Randomizza");
	String[]a = {"marco", "giorgio", "casa", "scaldabagno", "trottola", "cane", "gatto", "aereo", "treno", "computer"};
	public MyFrame() {
		super("Parola Random");
		Container c=this.getContentPane();
		c.setLayout(new FlowLayout());
        c.add(n);
        c.add(Random);
        Random.setPreferredSize(new Dimension(200,20));
        c.add(Estrai);
        Estrai.addActionListener(e -> estrai());
        setSize(400, 400);
        setVisible(true);
        this.a=a;
	}
	
	public void estrai() 
	{
		int n=(int)(Math.random()*10);
		String b=a[n];
		Random.setText(b);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Estrai){
            estrai();
		}
		
	}

}
