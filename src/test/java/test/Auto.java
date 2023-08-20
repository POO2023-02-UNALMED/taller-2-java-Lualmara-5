package test;
public class Auto {

	String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;
    
    int cantidadAsientos(){
        int totalAsientos = 0;
        for (int j = 0 ; asientos.length > j ; j++){
            if (asientos[j] != null){
                totalAsientos++;
            }
        }
        return totalAsientos;
    }
    
String verificarIntegridad(){
	if (motor.registro == registro){
		for (int b = 0 ; asientos.length > b ; b++){
			if (asientos[b] != null){
				if (asientos[b].registro != registro){
					return "Las piezas no son originales";
                }
            }
        }
        return "Auto original";
	} 
    else{
    	return "Las piezas no son originales";
    }
} 
}