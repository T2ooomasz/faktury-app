package tp.maven.faktury;

import java.util.Arrays;

/**
 * Baza Klientoó.
 *
 * @author Tomasz Kazulak
 *
 */
public class BazaKlientow {
  private Klient[] list;
  
  /** Constructor of the array. */
  public BazaKlientow() {
    list = new Klient[0];
    list = Arrays.copyOf(list, list.length + 1);
    list[list.length - 1] = new Klient(list.length - 1); 
  } 
  
  /** Method to add the clients to an array. */
  public void addKlient() {
    list = Arrays.copyOf(list, list.length + 1);
    list[list.length - 1] = new Klient(list.length - 1); 
  }
  
  /** get lists of invoice. */
  public Klient[] getList() {
    return list;
  }
  
  /** get client ID. */
  public int getKlientId(int num) {
    return list[num].getKlientId();
  }
  
  /** Throw array of client to terminal. */
  public void printKlients() {
    for (int i = 0; i < list.length; i++) {
      list[i].printKlient();
    }
  }
}
