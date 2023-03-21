import javax.swing.JOptionPane;
public class MenuSecuencial{
	public static void main(String args[]){
	String f;
		do{
			byte r=Byte.parseByte(JOptionPane.showInputDialog("Ingrese el numero de programa que desea ejecutar \n 1=Asignacion de monto de bacas \n 2=Calcular sueldo mas comisiones \n 3=Sacar el sueldo Neto \n 4=Invertir un numero \n 5=Asignar recursos conforme a edades\n 6=Pocentaje de inversion de personas\n 7=Convertir grados\n 8=Convertir de pesos a dolares\n 9=Sacar porcentaje de alumonos\n 10=Calcular sueldo extra"));
			//Asi se crea un objeto
		
			switch(r){
			case 1: AsignacionRec obj1 = new AsignacionRec();
				JOptionPane.showMessageDialog(null,"Se ejecuta el programa de asignacion de recursos");
				obj1.AsignarMonto();
			break;
			case 2:ComisionVenta obj2 = new ComisionVenta();
				JOptionPane.showMessageDialog(null,"Se ejecuta el programa para calcular sueldo mas comisiones");
				obj2.comisionar();
			break;
			case 3:Sueldo obj3 = new Sueldo();
				JOptionPane.showMessageDialog(null,"Se ejecuta el programa para calcular el sueldo Neto");
				obj3.calcularSueldo();
			break;
			case 4:NumInvertido obj4 = new NumInvertido(); 
				JOptionPane.showMessageDialog(null,"Se ejecuta el programa para invertir algun numero de 2 cifras");
				obj4.InvertirNum();
			break;
			case 5:Edades obj5 = new Edades();
				JOptionPane.showMessageDialog(null,"Se ejecuta el programa para calcular el monto a repartir conforme a las edades");
				obj5.calcularMonto();
			break;
			case 6:Inversion obj6 = new Inversion();
				JOptionPane.showMessageDialog(null,"Se ejecuta el programa para sacar el porcentaje de inversion");
				obj6.Invertir();
			break;
			case 7:convertirGrados obj7 = new convertirGrados();
				JOptionPane.showMessageDialog(null,"Se ejecuta el programa para convertir de grados C° a grados F°");
				obj7.Convertir();
			break;
			case 8:ConvertirDol obj8 = new ConvertirDol();
				JOptionPane.showMessageDialog(null,"Se ejecuta el programa para convertir de pesos a dolares");
				obj8.ConvertirPesos();
			break;
			case 9:PorcentajeAlumnos obj9 = new PorcentajeAlumnos();
				JOptionPane.showMessageDialog(null,"Se ejecuta el programa para sacar el porcentaje de alumnos conforme a distintas materias");
				obj9.CalcularPorcentajeAlumnos();
			break;
			case 10:TrabajoExtra obj10 = new TrabajoExtra();
				JOptionPane.showMessageDialog(null,"Se ejecuta el programa para sacar el sueldo de un trabajador con horas Extras incluidas");
				obj10.ObtenerExtra();
			break;
			default:
				JOptionPane.showMessageDialog(null,"No hay ningun programa con ese numero, verifique el numero");
			}	
			f=JOptionPane.showInputDialog("¿Quieres volver a seleccionar?");
		}while(f.equalsIgnoreCase("SI"));
	}
}