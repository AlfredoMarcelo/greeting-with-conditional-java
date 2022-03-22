package saludo;


public class Saludo {
	public static void main(String[] args) {
		//System.out.println("Hola " + args[0]);
		if(args.length == 0) {
			System.out.println("Hola a todos, les doy la bienvenida!");
		} else if(args.length == 1) {
			System.out.println("Hola " + args[0] + ", bienvenido");
		} else if(args.length == 2) {
			System.out.println("Bienvenido señor(a) " + args[0] + " " + args[1]);
		}
	}
}
