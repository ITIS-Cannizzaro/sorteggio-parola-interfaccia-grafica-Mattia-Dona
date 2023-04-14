import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class MyFrame2 extends JFrame implements ActionListener {
    JButton sorteggia=new JButton("Randomizza");
    JButton popola=new JButton("Aggiungi Stringa");
    JLabel stringa=new JLabel("Stringa sorteggiata: ");
    JTextArea risultato=new JTextArea();
    JLabel inputStringa=new JLabel("Insersci 10 stringhe: ");
    JTextArea input=new JTextArea();
    String a[]=new String[10];
    int i=0;

    public MyFrame2() {
        super("Sorteggio Stringhe V2");
        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());

        c.add(inputStringa);
        c.add(input);
        c.add(stringa);
        c.add(risultato);

        risultato.setPreferredSize(new Dimension(235, 18));
        input.setPreferredSize(new Dimension(235, 18));

        c.add(popola);
        popola.addActionListener(e -> popolaArray());

        c.add(sorteggia);
        sorteggia.addActionListener(e -> random());

        setSize(400,400);
        setVisible(true);
        setResizable(true);
    }

    public void popolaArray(){
        String stringa="";
        stringa=input.getText();
        if(i<a.length){
            a[i]=stringa;
            i++;
        }
        else{
            input.setText("Numero massimo di stringhe inserite");
            input.setEditable(false);
        }
    }

    public void random(){

        int lunghezza=a.length;
        int n=(int)(Math.random()*10);
        String s=a[n];
        risultato.setText(s);
        risultato.setEditable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sorteggia){
            random();
        }
        if(e.getSource()==popola){
            popolaArray();
        }
    }
}
