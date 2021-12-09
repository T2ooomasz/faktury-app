package tp.maven.faktury;

import java.util.Scanner;

/**
 * Klient. Informations about him.
 *
 * @author Tomasz Kazulak
 *
 */
public class Klient {
  private int klientId;
  private String name;
   
  /** Interactive constructor.  */
  public Klient(int toId) {
    klientId = toId;
    @SuppressWarnings("resource")
    Scanner in = new Scanner(System.in);
    System.out.print("Nazwa Klienta: ");
    name = in.nextLine();
  }
  
  /** Initialize constructor.  */
  public Klient(int toId, String nam) {
    klientId = toId;
    name = nam;
  }
  
  /** Taking ID client. */
  public int getKlientId() {
    return klientId;
  }
  
  /** Taking name of a client. */
  public String getName() {
    return name;
  }
  
  /** Taking name of a client. */
  public void printKlient() {
    System.out.println("ID klienta:" + klientId + "\tKlient: " + name);
  }
}
