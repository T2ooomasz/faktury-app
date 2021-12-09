package tp.maven.faktury;

import java.util.Scanner;

/**
 * Generate unique key - podpis.
 *
 * @author Tomasz Kazulak
 *
 */
public class Podpis {
  private String podpis;
  private int kod;

  /** 'Interactive' constructor. Administrator can enter all data. */
  public Podpis() {
    @SuppressWarnings("resource")
    Scanner in = new Scanner(System.in);
    System.out.println("Podpisujesz? Y/N");
    char decision = in.next().charAt(0);
    if (decision == 'Y' || decision == 'y') {
      podpis = codeGenerate();
    } else {
      podpis = "BRAK";
    }
  }
  
  /** Generate unique code. */
  private String codeGenerate() {
    int min = 10;
    int max = 99;
    kod = (int) Math.floor(Math.random() * (max - min + 1) + min);
    String randStr = Integer.toString(kod);
    String code = randStr + randStr + randStr;
    return code;
  }

  
  public void printPodpis() {
    System.out.print(podpis);
  }
}
