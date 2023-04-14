package pe.edu.vallegrande.app.prueba;

import pe.edu.vallegrande.app.service.AppService;

public class Prueba01 {
	
	public static void main(String[] args) {
		
		
		//Variables
		int num1, num2, mcd, mcm;
		
		//Datos
		num1 = 15;
		num2 = 20;
		
		//Proceso
		AppService service = new AppService();
		mcd = service.mcd(num1, num2);
		mcm = service.mcm(num1, num2);
		
		//Reporte
		System.out.println("MCD: " + mcd);
		System.out.println("MCM: " + mcm);
	}
	
}
