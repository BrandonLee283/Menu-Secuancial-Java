import javax.swing.JOptionPane;
public class convertirGrados{
	void Convertir(){
	float gradosF, gradosC;
	gradosC= Float.parseFloat(JOptionPane.showInputDialog("Ingrese los grados Centigrados"));
	gradosF=(float)((gradosC*1.8)+32);
	JOptionPane.showMessageDialog(null,"Sus grados Fahrenheit son de: "+gradosF);
	}
}