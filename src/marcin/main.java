package marcin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class main extends JFrame implements ActionListener {
	
	JLabel wodka;
	JLabel piwo;
	JLabel wino;
	JLabel waga;
	JLabel wynik;
	JLabel Men;
	JLabel Kob;
	JLabel wynikobok;
	double mlwino,mlwodka,mlpiwo,kgwaga;
	JTextField waga1,wodka1,piwo1,wino1,wynik1,wynik2;
	JRadioButton M,K;
	double wynikost,wynikost1,ww;
	JButton dalej;
	JFrame frame;
	public main() {
		
		
		
		setSize(420,420);
		setTitle("Alkomat Studenta");
		setLayout(null);
		JButton dalej = new JButton("Licz");
		dalej.setBounds(323, 350, 80, 30);
		dalej.addActionListener(this);
		add(dalej);
		
		dalej.addActionListener(this);
		waga = new JLabel("Waga (kg)");
		waga.setBounds(40, 40, 70, 20 );
		add(waga);
		wodka = new JLabel("Wódka (ml)");
		wodka.setBounds(40, 120, 70, 10 );
		add(wodka);
		piwo = new JLabel("Piwo (ml)");
		piwo.setBounds(40, 200, 70, 10 );
		add(piwo);
		wino = new JLabel("Wino (ml)");
		wino.setBounds(40, 280, 70, 10 );
		add(wino);
		wynik= new JLabel("Wynik (w promilach)");
		wynik.setBounds(243, 80, 120, 20 );
		add(wynik);
		Men = new JLabel("Mężczyzna");
		Men.setBounds(220, 40, 70, 20);
		add(Men);
		Kob = new JLabel("Kobieta");
		Kob.setBounds(320, 40, 70, 20);
		add(Kob);
		
		
		waga1 = new JTextField("0");
		waga1.setBounds(40, 70, 50, 20);
		add(waga1);
		wodka1 = new JTextField("0");
		wodka1.setBounds(40, 150, 50, 20);
		wodka1.setToolTipText("40% alkohol");
		add(wodka1);
		piwo1 = new JTextField("0");
		piwo1.setBounds(40, 230, 50, 20);
		piwo1.setToolTipText("5% alkohol");
		add(piwo1);
		wino1 = new JTextField("0");
		wino1.setBounds(40, 310, 50, 20);
		wino1.setToolTipText("11% alkohol");
		add(wino1);
		wynik1 = new JTextField("");
		wynik1.setBounds(228, 60, 50, 20);
		add(wynik1);
		wynik2 = new JTextField("");
		wynik2.setBounds(317, 60, 50, 20);
		add(wynik2);
		
		 
		
	}	
	
	public static void main(String[] args) {
		main frame = new main();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
	}
	public void actionPerformed(ActionEvent e) {
		
		
		
		mlwino = Double.parseDouble(wino1.getText());
		mlwodka = Double.parseDouble(wodka1.getText());
		mlpiwo = Double.parseDouble(piwo1.getText());
		kgwaga = Double.parseDouble(waga1.getText());
		
	
		wynikost = (((mlwino*0.8)*0.11)/(0.7*kgwaga))*100 + (((mlwodka*0.8)*0.4)/(0.7*kgwaga))*100 + (((mlpiwo*0.8)*0.05)/(0.7*kgwaga))*100;
		wynikost = Math.round(wynikost*100);
		wynik1.setText(String.valueOf((wynikost/10000)));
		wynikost1 = (((mlwino*0.8)*0.11)/(0.6*kgwaga))*100 + (((mlwodka*0.8)*0.4)/(0.6*kgwaga))*100 + (((mlpiwo*0.8)*0.05)/(0.6*kgwaga))*100;
		wynikost1 = Math.round(wynikost1*100);
		wynik2.setText(String.valueOf(wynikost1/10000));
		
		JOptionPane.showMessageDialog(frame,"Będziesz trzezwy za: " + Math.round((wynikost1/10000)/0.13) + "h","Inane warning",JOptionPane.WARNING_MESSAGE);
		
		

	}
}