import javax.swing.JOptionPane;
public class ConvertirDol{
	void ConvertirPesos(){
	float peso, Vdolar, dolar;
	peso=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad en pesos"));
	Vdolar=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del dolar"));
	dolar=(float)(peso*Vdolar);
	JOptionPane.showMessageDialog(null,"Su cantidad en dolares es de: $"+dolar+" Dolares");
	}
}