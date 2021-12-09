package tp.maven.faktury;

import java.util.Scanner;

/**
 * Class of Nabywca. Contain necesary information about nabywca.
 *
 * @author Tomasz Kazulak
 *
 */
public class Nabywca implements Podmiot {
  private String nazwa;
  private int[] nip = new int[10];
  private String ulica;
  private String miasto;
  private int kod;
  private Podpis podpis;
  
  /** 'Interactive' constructor. Administrator can enter all data. */
  public Nabywca() {
    @SuppressWarnings("resource")
    Scanner in = new Scanner(System.in);
    System.out.print("nazwa: ");
    nazwa = in.nextLine();
    System.out.print("NIP: ");
    for (int i = 0; i < 10; i++) {
      char a = in.next().charAt(0);
      nip[i] = Integer.parseInt(String.valueOf(a));
    }
    @SuppressWarnings("unused")
    String bufor = in.nextLine();
    System.out.print("Ulica: ");
    ulica = in.nextLine();
    System.out.print("Miasto: ");
    miasto = in.nextLine();
    System.out.print("Kod np.[66431]: ");
    kod = in.nextInt();
    System.out.print("Podpis: ");
    podpis = new Podpis();
  }
  
  /** Throw all information about podmiot to terminal. */
  public void printPodmiot() {
    System.out.println("NABYWCA: ");
    System.out.print("Nazwa: " + nazwa + "\tNIP: ");
    for (int i = 0; i < 10; i++) {
      System.out.print(nip[i]);
    }
    System.out.print("\tUlica: " + ulica + "\tMiasto: " + miasto + "\tkod: " + kod + "\tPodpis: ");
    podpis.printPodpis();
    System.out.println("");
  }
}
