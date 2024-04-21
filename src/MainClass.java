import java.util.*;

public class MainClass 
{
    static char[][] campo = new char[10][10];
    static int tentativi = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        inizializzaCampo();
        // creare un ciclo per ogni nave
        posizionaNave(1, 2, 3, true); // sostituire questi parametri attuali con quelli random
        // Continuare ad attaccare fino alla vittoria
        attacco();
        checkVittoria();
        stampaCampo();

    }
    
    // Inizializza il campo con spazi vuoti
    static void inizializzaCampo() 
    {

    }

    // Posiziona le navi sul campo
    static boolean posizionaNave(int i, int j, int lunghezza, boolean verticale) 
    {
    	// Dovrà restituire "true" se non ci sono sovrapposizoni
    	return false; 
    }

    // Esegue un'attacco
    static void attacco() 
    {

    }

    // Verifica se tutte le navi sono state affondate
    static boolean checkVittoria() 
    {
    	return false; // Se non ci sono più X la partita è vinta!
    }

    // Stampa il campo di gioco
    static void stampaCampo() 
    {

    }
}
