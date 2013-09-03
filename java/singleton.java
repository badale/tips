/**
 * Technique du Holder
 * http://thecodersbreakfast.net/index.php?post/2008/02/25/26-de-la-bonne-implementation-du-singleton-en-java
 * 
 * Elle repose sur l'utilisation d'une classe interne priv�e, responsable de
 * l'instanciation de l'instance unique du Singleton.
**/
public class Singleton
{		
	/** Constructeur priv� */	
	private Singleton()
	{}
 
	/** Holder */
	private static class SingletonHolder
	{		
		/** Instance unique non pr�initialis�e */
		private final static Singleton instance = new Singleton();
	}
 
	/** Point d'acc�s pour l'instance unique du singleton */
	public static Singleton getInstance()
	{
		return SingletonHolder.instance;
	}
}

/**
 * Cette technique joue sur le fait que la classe interne ne sera charg�e en
 * m�moire que lorsque l'on y fera r�f�rence pour la premi�re fois, c'est-�-
 * -dire lors du premier appel de "getInstance()" sur la classe Singleton.
 * Lors de son chargement, le Holder initialisera ses champs statiques et
 * cr�era donc l'instance unique du Singleton.
 * Cerise sur le g�teau, elle fonctionne correctement en environnement
 * multithread� et ne n�cessite aucune synchronisation explicite !
**/
