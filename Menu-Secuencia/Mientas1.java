/*
inicializacion;
while(condicion){
	actualizacion;	
}
*/
import javax.swing.JOptionPane;
public class Mientas1{
	public static void main(String[]args){
	byte x=0;
	float prom, suma=0,cal;
		while(x<5){
			cal=Float.parseFloat(JOptionPane.showInputDialog("Ingrese cal para alumno"+(x+1)));
			suma+=cal;
			x++;
		}
		prom=(float)(suma/x);
		JOptionPane.showMessageDialog(null,"Su suma es de "+ suma);
		JOptionPane.showMessageDialog(null,"Su promedio es de "+ prom);
	}
}