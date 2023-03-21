import javax.swing.JOptionPane;
public class TrabajoExtra{
	void ObtenerExtra(){
	float tarifa, hrsDia, hrsExtra, tarifaExtra, sueldoTotal;
	tarifa=Float.parseFloat(JOptionPane.showInputDialog("Ingrese su tarifa por hora"));
	hrsDia=Float.parseFloat(JOptionPane.showInputDialog("Ingrese sus horas trabajadas al dia"));
	hrsExtra=(float)(hrsDia-8);
	JOptionPane.showMessageDialog(null,"Sus horas Extra son"+hrsExtra);	
	if(hrsExtra>4){
		JOptionPane.showMessageDialog(null,"No puede trabajar mas de 4 horas");
		tarifaExtra=(hrsExtra*tarifa)*2;
	}else{
		tarifaExtra=(float)((tarifa*hrsExtra)*2);
		JOptionPane.showMessageDialog(null,"Tu sueldo extra es de:"+tarifaExtra);
	}
	sueldoTotal=(float)(tarifaExtra+(hrsDia*tarifa));
	JOptionPane.showMessageDialog(null,"Su sueldo total es de "+sueldoTotal);
	}
}
