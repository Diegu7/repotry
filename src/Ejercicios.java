
public class Ejercicios
{
	//devuelve la suma de x y y
	static int sumar(int x, int y){
		int mn = x +y;
		return mn;
	}
	
	//devuelve la resta de x y y
	static int restar(int x, int y){
		int resta = x-y;
		return resta;
	}
	//devuelve la multiplicacion de x y y
	static int multiplicar(int x, int y){
		int mult = x*y;
		return mult;
	}
	
	//devuelve el residuo de x y y
	static int residuo(int x, int y){
		int res = x%y;
		return res;
	}
	
	//devuelve true si x es par, de lo cotrario devuelve false
	static boolean esPar(int x){
		boolean bool1 = x%2 == 0;
		return bool1;
	}
	
	//devuelve true si x es multiplo de 3, de lo cotrario devuelve false
	static boolean esMultiploDe3(int x){
		boolean bool2 = x%3 ==0;
		return bool2;
	}
	
	//devuelve el numero mayor (x o y)
	static int getMayor(int x,int y){
		if(x>y){
			return x;
		}
		else if(y > x){
			return y;
		}
		else{
			return 0;
		}
	}
	
	//devuelve true si la edad es mayor o igual a 18
	static boolean esMayorDeEdad(int edad){
		boolean bool3 = edad>=18;
		return bool3;
	}
	
	//devuelve true si x, y y z son pares
	static boolean sonPares(int x, int y, int z){
		boolean bool4 = x%2 == 0 && y%2 == 0 && z%2 == 0; 
		return bool4;
	}
	
	//devuelve el numero mayor entre x, y y z
	static int getMayorDe3(int x, int y, int z){
		if(x>y && x>z){
			return x;
		}
		else if(y>x && y>z){
			return y;
		}
		else if(z>x && z>y){
			return z;
		}
		else{
			return 0;
		}
	}
	
	public static void main(String[] args)
	{
		
	}

}
