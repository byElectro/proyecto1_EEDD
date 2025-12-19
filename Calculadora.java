public class Calculadora {

	private  static final String VERSION = "0.2.0";

	public static void main(String[] args){

		if (args.length == 1){
		  switch (args[0]){
			case "help" -> {
				help();
				System.exit(0);
			}	
			case "version" -> {
				version();
				System.exit(0);
			}
			default -> {
				usoIncorrecto();
				System.exit(-1);
			}

		  };
		}


		if (args.length != 3){
			usoIncorrecto();
			//Esto es para salir fuera cuando salte eso.
			System.exit(-1);
		}

		String operacion = args[0];
		double num1 = Double.parseDouble(args[1]);
		double num2 = Double.parseDouble(args[2]);
		double resultado;

	

		switch (operacion) {
			case "sumar" -> resultado = sumar(num1,num2);
			case "restar" -> resultado = restar(num1,num2);
			case "mult" -> resultado = mult(num1,num2);
			case "div" -> resultado = div(num1,num2);
			default -> throw new RuntimeException("Operacion elegida no soportada");
			//Se cierra con ";" porque es como una expresion, no es el case normal.
		};
		

	//Esto es para imprimir con formato, float y double con printf es lo mismo, estamos diciendole, que tendra 2 decimales, % sustituye, y la "s" es un string
	//Lo que va entre comillas es una "expresion para sustituir) y luego lo de despues es en orden ir diciendo a que va a sustituir.
	System.out.printf("%.2f %s %.2f = %.2f\n", num1, operacion, num2, resultado);
	
	}



	public static void usoIncorrecto() {

		System.out.println("Numero de parametros incorrectos");
		System.out.println("USO: Java Calculadora <operacion> num1 num2");
		System.out.println("<java Calculadora help> para más informacion");


	}


	public static void help(){

		System.out.println("USO: Java calculadora <operacion> num1 num2");
		System.out.println("Operaciones soportadas");
		System.out.println("sumar");
		System.out.println("restar");
		System.out.println("mult");
		System.out.println("div");

	}



	public static void version(){

		System.out.println(VERSION);

	}

	public static double sumar(double num1, double num2){

		return num1 + num2;

	}


	public static double restar(double num1, double num2){

		return num1 - num2;
	
	}


	public static double mult(double num1, double num2){


		return num1 * num2;

	}

	public static double div(double num1, double num2){


		return num1 / num2;

	}


}
