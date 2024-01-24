/*Exercice 2.2 : Modifier maintenant TestRunnable afin d’obtenir
//ceci, Attention ici, une seule variable pour les afficher tous !
!*!
"**"
#***#
$****$
%*****%
&******&
'*******'
(********(
)*********)
**********
*/

package fr.fms.thread;

public class TestRunnable implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i <10; i++)
			System.out.println(this.toString());
	} 
	
	
//Méthode main	
	public static void main(String[] args) {
		Thread thread = new Thread(new TestRunnable());
		thread.start();
	}
}