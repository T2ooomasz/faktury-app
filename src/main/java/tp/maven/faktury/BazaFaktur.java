package tp.maven.faktury;

import java.util.Arrays;

/**
 * Baza faktur.
 *
 * @author Tomasz Kazulak
 *
 */
public class BazaFaktur {
  private Faktura[] list;
    
  /** Constructor of the array. */
  public BazaFaktur() {
    list = new Faktura[0];
    list = Arrays.copyOf(list, list.length + 1);
    list[list.length - 1] = new Faktura(list.length - 1); 
  }
  
  /** Initial constructor of the array. */
  public BazaFaktur(int number) {
    list = new Faktura[1];
  }
  
  /** Method to add new invoice to the array. */
  public void addFaktura() {
    list = Arrays.copyOf(list, list.length + 1);
    list[list.length - 1] = new Faktura(list.length - 1); 
  }
  
  /** get lists of invoice. */
  public Faktura[] getList() {
    return list;
  }
  
  /** Throw all invoice (faktura) of exact client to terminal. */
  public void printFakturayKlienta(int idKlienta) {
    for (Faktura id : list) {
      int idKlientaFaktura = id.getKlientId();
      if (idKlientaFaktura == idKlienta) {
        id.printFaktura();
      }
    }
  }
  
  /** Throw all invoice (faktura)to the terminal. */
  public void printFaktury() {
    for (int i = 0; i < 10; i++) {
      System.out.print("-----------------");
    }
    System.out.println("");
    for (int i = 0; i < list.length; i++) {
      list[i].printFaktura();
      for (int j = 0; j < 10; j++) {
        System.out.print("-----------------");
      }
      System.out.println("");
    }
  }
}
