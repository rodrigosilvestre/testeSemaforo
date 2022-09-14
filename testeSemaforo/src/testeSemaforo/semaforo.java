package testeSemaforo;

import java.util.Scanner;

public class semaforo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    double a, v, tf, s, v2, x1, xs;
	    int x, xf;

	    System.out.println("Informe a velocidade da via em km/h:");
	    v = sc.nextDouble();
	    System.out.println("Informe a aceleração típica dos carros em m/s²");
	    a = sc.nextDouble();
	    System.out.println("Informe a distância desde o semáforo anterior em m ");
	    s = sc.nextDouble();
	    v2 = (v / 3.6);

	    tf = (v2 / a) + (s / v2) - (v2 / (2 * a)) - 3;

	    x = (int) (tf / 60);
	    x1 = (tf / 60);

	    xs = x1 - x;

	    xf = (int) (xs * 60);

	    System.out.println("O semáforo deve abrir " + x + " minuto(s) e " + xf
	            + " segundo(s) após o primeiro semáforo ficar verde ");
	}
}
