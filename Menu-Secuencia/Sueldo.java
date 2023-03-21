import javax.swing.JOptionPane;
public class Sueldo{
	void calcularSueldo(){
	float horasSem,tarifa,sueldoBruto,descuento,sueldoNeto;
	horasSem=Float.parseFloat(JOptionPane.showInputDialog("Ingrese tus horas semanales"));
	tarifa=Float.parseFloat(JOptionPane.showInputDialog("Ingrese su tarifa por hora"));
	sueldoBruto=(float)(tarifa*horasSem);
	descuento=(float)(sueldoBruto*0.12);
	sueldoNeto=(float)(sueldoBruto-descuento);
	JOptionPane.showMessageDialog(null,"Su sueldo Bruto es de: $"+sueldoBruto+"\nSu sueldo Neto es de: $"+sueldoNeto);
	}
}
