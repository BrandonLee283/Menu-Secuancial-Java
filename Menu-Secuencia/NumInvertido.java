import javax.swing.JOptionPane;
public class NumInvertido{
	void InvertirNum(){
	byte numero,numeInvertido,cociente,residuo;
	numero=Byte.parseByte(JOptionPane.showInputDialog("Ingrese un numero de 2 cifras"));
	cociente=(byte)(numero/10);
	residuo=(byte)(numero % 10);
	numeInvertido=(byte)((residuo*10)+cociente);
	JOptionPane.showMessageDialog(null,"Su numero invertido es de: "+numeInvertido);
	}
}