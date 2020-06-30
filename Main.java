package progs;

import java.util.Scanner;
public class Main {

  /**PIEDRA, PAPEL TIJERA CONTRA LA MAQUINA
  @author Aleix Algueró */

  public static boolean running = true;
  public static void Menu(){
    System.out.println("Escribe: \"1\" para piedra, \"2\" para papel o \"3\" para tijeras.	Y \"4\" para salir del programa: ");
  }

  public static double piedra = 0.33;
  public static double papel = 0.66;
  public static double tijera = 0.99;
  
  public static double cpuPPT(){
    double random = Math.random();
    return random;
  }
  
  public static double piedr(double rand){
	  int pts = 0;
	  if (rand <= piedra) {// -0.33
		  pts = 1;
		  System.out.println("La machine ha sacado piedra! EMPATE!\n");
		  return pts;} 
	  else if (rand > piedra && rand <= papel) {
		  	pts = -1;
		  	System.out.println("La machine ha sacado papel! HAS PERDIDO!\n");
      return pts;
    } else if (rand > piedra && rand <= tijera) {
    		pts = 0;
			System.out.println("La machine ha sacado tijera! HAS GANADO!\n");
			return pts;
			} else if (rand > tijera) {
				pts = 10;
      System.out.println("Esto es un easter egg, la verdad es que has tenido suerte...La máquina se ha vuelto loca y ha sacado algo fuera de las 3 opciones!\n");
    return pts;}
	  return pts;}
  
  public static double ppl(double rand){
	  int pts = 0;
	  if (rand <= piedra) {// -0.33
		  pts = 1;
		  System.out.println("La machine ha sacado piedra! HAS GANADO!\n");
		  return pts;} 
	  else if (rand > piedra && rand <= papel) {
		  	pts = 0;
		  	System.out.println("La machine ha sacado papel! EMPATE!\n");
      return pts;
    } else if (rand > piedra && rand <= tijera) {
    		pts = -1;
    		System.out.println("La machine ha sacado tijera! HAS PERDIDO! \n");
			return pts;
			} else if (rand > tijera) {
				pts = 10;
      System.out.println("Esto es un easter egg, la verdad es que has tenido suerte...La máquina se ha vuelto loca y ha sacado algo fuera de las 3 opciones!\n");
    return pts;}
	  return pts;}
  
  
  public static double tij(double rand){
	  int pts = 0;
	  if (rand <= piedra) {//-0.33
		  pts = -1;
		  System.out.println("La machine ha sacado piedra! HAS PERDIDO!\n");
		  return pts;} 
	  else if (rand > piedra && rand <= papel) {
		  	pts = 1;
		  	System.out.println("La machine ha sacado papel! HAS GANADO!\n");
      return pts;
    } else if (rand > piedra && rand <= tijera) {
    		pts = 0;
    		System.out.println("La machine ha sacado tijera! EMPATE!\n");
			return pts;
			} else if (rand > tijera) {
				pts = 10;
      System.out.println("Esto es un easter egg, la verdad es que has tenido suerte...La máquina se ha vuelto loca y ha sacado algo fuera de las 3 opciones!\n");
    return pts;}
	  return pts;}


  public static void main(String[] args) {
    System.out.println("Bienvenido a un 1 pa 1 sin camisa contra la aleatoriedad de la machine a un PIEDRA, PAPEL, TIJERA. Suerte!\n");
    Scanner sc = new Scanner(System.in);
    
    while (Main.running) {
      Menu();

      int opt = sc.nextInt();
      double rndm = cpuPPT();
    switch(opt){
      /*rock*/
      case 1:
      piedr(rndm);
      break;

      /*paper*/
      case 2:
     ppl(rndm);
      break;

      /*scissors*/
      case 3:
     tij(rndm);
      break;

      default:
      running = false;
      System.out.println("ciao");

    }


    }

  }

}