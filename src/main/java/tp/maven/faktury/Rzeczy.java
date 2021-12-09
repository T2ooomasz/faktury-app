package tp.maven.faktury;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Array of items which are signed to faktura.
 * Also a sum of Netto & Brutto value of items.
 *
 * @author Tomasz Kazulak.
 *
 */
public class Rzeczy {
  // The array of items on invoice (faktura).
  private Rzecz[] lista;
  private double razemNetto;
  private double razemBrutto;
  
  /**
   * 'Interactive' constructor.
   * Initialize an array to which administrator add items.
   * Also count sum of Netto & Brutto value of those items. 
   */
  public Rzeczy() {
    lista = new Rzecz[0];
    lista = initialize();
    razemNetto = 0;
    razemBrutto = 0;
    for (Rzecz rzecz : lista) {
      razemNetto += rzecz.getWartoscNetto();
      razemBrutto += rzecz.getWartoscBrutto();
    }
  }
  
  /** Make a loop to add as many as wanted items. */
  private Rzecz[] initialize() {
    char decision = 'Y';
    @SuppressWarnings("resource")
    Scanner in = new Scanner(System.in);
    while (decision == 'y' || decision == 'Y') {
      lista = addRzecz();
      System.out.println("Kontynuowac dodawanie? Wpisz Y/y");
      decision = in.next().charAt(0);
    }
    return lista;
  }

  /** Make larger array and add new item. */
  private Rzecz[] addRzecz() {
    lista = Arrays.copyOf(lista, lista.length + 1);
    lista[lista.length - 1] = new Rzecz();
    return lista;
  }
  
  /** To get a private field of sum Netto value. */
  public double getRazemNetto() {
    return razemNetto;
  }
  
  /** To get a private field of sum Brutto value. */
  public double getRazemBrutto() {
    return razemBrutto;
  }
  
  /** To get the array of items, necessary to finish a invoice (faktura). */
  public Rzecz[] getLista() {
    return lista;
  }
  
  /** Print all items in invoice (faktura). */
  public void printRzeczy() {
    System.out.println("TOWARY LUB USLUGI");
    int iterator = 1;
    for (Rzecz rzecz : lista) {
      System.out.print(iterator + "\t");
      rzecz.printRzecz();
      iterator++;
    }
    System.out.println("Razem Netto: " + razemNetto + "\tDo zaplaty (brutto): " + razemBrutto);
  }
}
