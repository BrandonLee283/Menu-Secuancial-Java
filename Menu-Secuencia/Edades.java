import javax.swing.JOptionPane;
public class Edades{
	void calcularMonto(){
	float edadAby, edadIma, edadGus, monto, Suma, montoAby, montoIma, montoGus;
	edadAby=Float.parseFloat(JOptionPane.showInputDialog("Ingrese edad de Aby"));
	edadIma=Float.parseFloat(JOptionPane.showInputDialog("Ingrese edad de Imanol"));
	edadGus=Float.parseFloat(JOptionPane.showInputDialog("Ingrese edad de Gustavo"));
	monto=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto"));
	Suma=(float)(edadAby+edadGus+edadIma);
	montoAby=(float)((edadAby/Suma)*monto);
	montoIma=(float)((edadIma/Suma)*monto);
	montoGus=(float)((edadGus/Suma)*monto);
	JOptionPane.showMessageDialog(null,"El monto para Aby es de "+montoAby);
	JOptionPane.showMessageDialog(null,"El monto para Imanol es de "+montoIma);
	JOptionPane.showMessageDialog(null,"El monto para Gustavo es de "+montoGus);
	
	}
}