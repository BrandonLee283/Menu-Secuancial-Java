/*Do while
Inicializacoiin
do{
Actualizacion
}while(condicion);
*/
import javax.swing.JOptionPane;
public class DOMientas1{
	public static void main(String[]args){
	float prom, suma=0,cal;
	byte x=0;
		do{
			cal=Float.parseFloat(JOptionPane.showInputDialog("Ingrese cal para alumno"+(x+1)));
			suma+=cal;
			x++;
		}while (x<5);
		prom=(float)(suma/x);
		JOptionPane.showMessageDialog(null,"Su suma es de "+ suma);
		JOptionPane.showMessageDialog(null,"Su promedio es de "+ prom);
	}
}