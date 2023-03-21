/*se desea conocer el lporcentaje de alumnos de primer semestre de ISIC que tienen un promedio 
igual o superior a 90, asi como el porcentaje de aquellos alumnos que obtuvieron una calificacion
entre 80-89 y quienes tienen calificacion menor a 80.
*/
import javax.swing.JOptionPane;
public class for2{
	public static void main(String[]args){
		byte x,num;
		float cal,al90=0,al80=0,al70=0,porc90,porc80,porc70,al69=0,al79=0,por69,por79;
		num=Byte.parseByte(JOptionPane.showInputDialog("Ingrese total de alumnos"));
		for(x=num; x>0;x--){
			cal=Float.parseFloat(JOptionPane.showInputDialog("Ingrese su calificacion"));
			if (cal>=90){
				al90++;
			}else if(cal>=80 && cal<=89){
				al80++;
			}else if(cal>=60 && cal<=79){
				al70++;
				if(cal>=60 && cal<=69){
					al69++;
				}else if(cal>=70 && cal<=79){
					al79++;
				}
			}else{
				JOptionPane.showMessageDialog(null,"Calificacion no valida");
			}
		}
		porc90=(float)((al90/num)*100);
		porc80=(float)((al80/num)*100);
		// porc70=(float)((al70/num)*100);
		por69=(float)((al69/num)*100);
		por79=(float)((al79/num)*100);
		JOptionPane.showMessageDialog(null,"Su porcentaje de alumnos con 90 es de "+porc90+"%");
		JOptionPane.showMessageDialog(null,"Su porcentaje de alumnos con 80 es de "+porc80+"%");
		JOptionPane.showMessageDialog(null,"Su porcentaje de alumnos con 70-79 es de "+por79+"%");
		JOptionPane.showMessageDialog(null,"Su porcentaje de alumnos con 60-69 es de "+por69+"%");
	}
}
