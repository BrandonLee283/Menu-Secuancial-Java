import javax.swing.JOptionPane;
public class PorcentajeAlumnos{
	void CalcularPorcentajeAlumnos(){
	float mateDisc, redes, baseDatos, programacion, tAlumnos, porM, porR, porBd,porP;
	mateDisc=Float.parseFloat(JOptionPane.showInputDialog("Ingrese cantidad de alumnos de matematicas discretas"));
	redes=Float.parseFloat(JOptionPane.showInputDialog("Ingrese cantidad de alumnos de Redes"));
	baseDatos=Float.parseFloat(JOptionPane.showInputDialog("Ingrese cantidad de alumnos de Base de datos"));
	programacion=Float.parseFloat(JOptionPane.showInputDialog("Ingrese cantidad de alumnos de Programacion"));
	tAlumnos=(float)(mateDisc+redes+baseDatos+programacion);
	porM=(float)((mateDisc/tAlumnos)*100);
	porR=(float)((redes/tAlumnos)*100);
	porBd=(float)((baseDatos/tAlumnos)*100);
	porP=(float)((programacion/tAlumnos)*100);
	JOptionPane.showMessageDialog(null,"Su porcentaje de matematicas discretas es de: " + porM + "%\n "+"Su porcentaje de Redes es de: " + porR + "%\n"+"Su porcentaje de Base de Datos es de: " + porBd + "%\n"+"Su porcentaje de Programacion es de:" + porP + "%");
	}
}
