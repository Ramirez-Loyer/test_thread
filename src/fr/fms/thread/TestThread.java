/*Exercice 2.1 : Reprenez la classe Test Thread et modifier là pour obtenir qqchose qui
ressemble au résultat suivant :
 * 1- 1- 1- 1- 1-
 * 5----- 5----- 5----- 5----- 4---- 4---- 4---- 2-- 2-- 2-- 2-- 2--
 * 3--- 3--- 3--- 3--- 3---
 * 4---- 4----
 * 5-----
 * Lorsqu’on relance le programme, le résultat diffère à cause de l’ordonanceur
 */

package fr.fms.thread;

public class TestThread extends Thread {      //Testthread hérite de la classe Thread
	
	//Constructeur 
	public TestThread(String name) {   //Le constructeur prend un nom en paramètre 
		super(name);
	}
	

	 // Méthode run(): méthode à redéfinir pour y placer le fonctionnement du thread
    public void run() {
        for (int i = 0; i < 4; i++) {
        	 
            System.out.print(this.getName() + " " ); //une boucle pour imprimer le nom du thread suivi d'un espace.
            try {          //Le bloc try encadre le code où une exception peut être levée. Dans ce cas, l'exception qui peut être levée est InterruptedException.
                // Methode sleep pour introduire un délai (en millisecondes) entre les threads* -> run() en pause pendant la durée spécifiée
                Thread.sleep(1000);
            } catch (InterruptedException e) {       //Catch est exécuté si une exception de type InterruptedException est t pendant l'exécution du bloc try. 
                e.printStackTrace();    //La méthode printStackTrace()est un outil utilisé pour imprimer la trace des exceptions et les erreurs. ça affiche l’exception avec le numéro de ligne et le nom de la classe où l’exception s’est produite.
                
            }
            System.out.println();
        }
       
    }

    
 //Méthode main
    public static void main(String[] args) {                //Création de 5 instances de "TestThread" avec des noms différents
        TestThread t = new TestThread("1-" );
        TestThread t2 = new TestThread("2--" );
        TestThread t3 = new TestThread("3--- ");
        TestThread t4 = new TestThread("4---- ");
        TestThread t5 = new TestThread("5-----");

        t.start();											//Ensuite, on démarre chaque thread avec la méthode start
        t2.start();											// start() est une méthode autorisant le démarrage du thread
        t3.start();
        t4.start();
        t5.start();

      
    }
}


/*La méthode Thread.sleep() est utilisée pour suspendre l'exécution du thread actuel (le thread sur lequel la méthode est appelée)
 pendant une période spécifiée en millisecondes. Cette pause permet d'introduire un délai dans l'exécution du programme.*/
 