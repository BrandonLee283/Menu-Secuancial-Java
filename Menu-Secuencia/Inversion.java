import javax.swing.JOptionPane;
public class Inversion{
	void Invertir(){
	float ingreso1, ingreso2, ingreso3, suma, porcentaje1, porcentaje2, porcentaje3;
	ingreso1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer ingreso"));
	ingreso2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo ingreso"));
	ingreso3=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tercer ingreso"));
	suma=(float)(ingreso1+ingreso2+ingreso3);
	porcentaje1=(float)((ingreso1/suma)*100);
	porcentaje2=(float)((ingreso2/suma)*100);
	porcentaje3=(float)((ingreso3/suma)*100);
	JOptionPane.showMessageDialog(null,"El porcentaje del ingreso 1 es de: "+porcentaje1+"%");
	JOptionPane.showMessageDialog(null,"El porcentaje del ingreso 2 es de: "+porcentaje2+"%");
	JOptionPane.showMessageDialog(null,"El porcentaje del ingreso 3 es de: "+porcentaje3+"%");

	}
}