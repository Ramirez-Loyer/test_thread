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

public class TestThread extends Thread {
	
	//Constructeur 
	public TestThread(String name) {   //Le constructeur prend un nom en paramètre 
		super(name);
	}
	

	 // Méthode run(): méthode à redéfinir pour y placer le fonctionnement du thread
    public void run() {
        for (int i = 0; i < 4 ; i++) {
            System.out.print(this.getName() + " " ); //une boucle pour imprimer le nom du thread suivi d'un espace.
            try {
                // Methode sleep pour introduire un délai entre les threads* 
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();    //La méthode printStackTrace() en Java est un outil utilisé pour gérer les exceptions et les erreurs. Il s’agit d’une méthode de la classe « throwable » de Java qui affiche l’exception avec d’autres détails comme le numéro de ligne et le nom de la classe où l’exception s’est produite.
                //System.out.println();  
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
 