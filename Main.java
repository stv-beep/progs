import java.util.Scanner;
public class Main {

  /**PIEDRA, PAPEL TIJERA CONTRA LA MAQUINA
  @author Aleix Algueró */

  public static boolean running = true;
  public static void Menu(){
    System.out.println("Escribe: \"1\" para piedra, \"2\" para papel o \"3\" para tijeras.	Y \"4\" para salir del programa: ");
  }

  public static double cpuPPT(){
    double random = Math.random();
    return random;
  }


  public static void main(String[] args) {
    System.out.println("Bienvenido a un 1 pa 1 sin camisa contra la aleatoriedad de la machine a un PIEDRA, PAPEL, TIJERA. Suerte!\n");
    Scanner sc = new Scanner(System.in);
    double piedra = 0.33;
		double papel = 0.66;
		double tijera = 0.99;


    while (Main.running) {
      Menu();

      int opt = sc.nextInt();
      double rndm = cpuPPT();
    switch(opt){
      /*rock*/
      case 1:
      if (rndm <= piedra) {
        System.out.println("La machine ha sacado piedra! EMPATE!\n");
      } else if (rndm > piedra && rndm <= papel) {
        System.out.println("La machine ha sacado papel! HAS PERDIDO!\n");
      } else if (rndm > piedra && rndm <= tijera) {
				System.out.println("La machine ha sacado tijera! HAS GANADO!\n");
			} else if (rndm > tijera) {
        System.out.println("Esto es un easter egg, la verdad es que has tenido suerte...La máquina se ha vuelto loca y ha sacado algo fuera de las 3 opciones!\n");
      }
      break;

      /*paper*/
      case 2:
      if (rndm <= papel) {
        System.out.println("La machine ha sacado piedra! HAS GANADO!\n");
      } else if (rndm > piedra && rndm <= papel) {
        System.out.println("La machine ha sacado papel! EMPATE!\n");
      } else if (rndm > piedra && rndm <= tijera) {
				System.out.println("La machine ha sacado tijera! HAS PERDIDO! \n");
			} else if (rndm > tijera) {
        System.out.println("Esto es un easter egg, la verdad es que has tenido suerte...La máquina se ha vuelto loca y ha sacado algo fuera de las 3 opciones!\n");
      }

      break;

      /*scissors*/
      case 3:
      if (rndm <= piedra) {
        System.out.println("La machine ha sacado piedra! HAS PERDIDO!\n");
      } else if (rndm > piedra && rndm <= papel) {
        System.out.println("La machine ha sacado papel! HAS GANADO!\n");
      } else if (rndm > piedra && rndm <= tijera) {
        System.out.println("La machine ha sacado tijera! EMPATE!\n");
      } else if (rndm > tijera) {
        System.out.println("Esto es un easter egg, la verdad es que has tenido suerte...La máquina se ha vuelto loca y ha sacado algo fuera de las 3 opciones!\n");
      }
      break;

      default:
      running = false;
      System.out.println("ciao");

    }






    }

  }

}
