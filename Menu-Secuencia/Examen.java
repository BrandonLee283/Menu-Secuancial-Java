/*Una empresa productora de yogurt desea saber cuantos litros de leche y fruta son necesarios para su produccion diario
la empresa produce 100 mil cajas diarias cada caja tiene 25 vasos de yogurt de 250 mililitros, 
la proporcion de cada litro de yourt es 60% leche 10% azucar 
y 30% fruta. si el yogurt es ligth aumenta en un 10% la fruta y se cancela el azucar extra.
Define cantidades de materias primas para su produccion diaria 
1L 1000ml
XL  
*/
import javax.swing.JOptionPane;
public class Examen{
	public static void main(String[]args){
	float cajas=100000;
	float vasos=25;
	float mililitros=250;
	float lenTodasLasCjas;
	float mililitrosT;
	float leche, fruta, frutaL, azucar;
	mililitrosT=(float)(((vasos*mililitros)*cajas));
	lenTodasLasCjas=(float)((mililitrosT*1)/1000);
	leche=(float)(0.6*lenTodasLasCjas);
	azucar=(float)(0.1*lenTodasLasCjas);
	fruta=(float)(0.3*lenTodasLasCjas);
	frutaL=(float)(0.4*lenTodasLasCjas);
	
	JOptionPane.showMessageDialog(null,"Su total de litros de produccion son de "+lenTodasLasCjas+"L");

	JOptionPane.showMessageDialog(null,"Para la leche normal necesitas "+ leche +"L de leche y azucar necesitas "+azucar+" Y "+ fruta+"L de fruta");

	JOptionPane.showMessageDialog(null,"Para la leche ligth necesitas "+ leche +"L de leche y "+ frutaL+"L de fruta");


	}
}