//Estructuras Repetitivas (ciclicas, Bucles)
//Promedio de calificaciones del grupo 311 de la materia de fundamentos de invetigacion
//for(inicializacion; condicion; actualizacion)
/*
Incremento
	Inicializacion -> x=0
	condicion x <50
	actualizacion->x++
Decremento
	Inicializacion -> x=49
	condicion -> x<=0
	actualizacion->x--
*/	
import javax.swing.JOptionPane;
public class cicle1{
	public static void main(String[]args){
		byte x;
		float suma=0, cal, prom;
		for(x=0; x<5; x++){
			cal=Float.parseFloat(JOptionPane.showInputDialog("Ingrese calificacion del calimno"+(x+1)));
			suma+=cal;
		}
		prom=(float)(suma/x);
		JOptionPane.showMessageDialog(null,"Su suma es de "+suma);
		JOptionPane.showMessageDialog(null,"Su promedio es de "+prom);
	}
}