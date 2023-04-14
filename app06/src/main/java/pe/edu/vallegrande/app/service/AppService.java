package pe.edu.vallegrande.app.service;

public class AppService {
	
	public int mcd(int num1, int num2) {
		
		if (num2 == 0) {
            return num1;
        } else {
            return mcd(num2, num1 % num2);
        }
	}
	
	public int mcm(int num1, int num2) {
		
		return num1 * num2 / mcd(num1, num2);
	}
	
	public long factorial(int n) {
		
		return 0;
	}
	
	public int promedio(int n1, int n2, int n3, int n4) {
		
		int pr = (n1 + n2 + n3 + n4) /4;	
		return pr;
	}
	
}
