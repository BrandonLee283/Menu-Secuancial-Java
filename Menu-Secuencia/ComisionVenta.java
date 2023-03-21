import javax.swing.JOptionPane;
public class ComisionVenta{
	void comisionar(){
	float sueldo,ventas,comision,sueldoMensual,totalPercepciones;
	sueldo=Float.parseFloat(JOptionPane.showInputDialog("Captura tu sueldo quincenal"));
	ventas=Float.parseFloat(JOptionPane.showInputDialog("Capure tus ventas mensuales"));
	sueldoMensual=(float)(sueldo*2);
	comision=(float)(ventas*0.10);
	totalPercepciones=(float)(sueldoMensual+comision);
	JOptionPane.showMessageDialog(null,"El trabajador percibe un sueldo mensual de: $"+sueldoMensual+"\n Las comisiones or venta son de: $"+ comision+"\n Total de persepciones es: $"+totalPercepciones);
	}
}
