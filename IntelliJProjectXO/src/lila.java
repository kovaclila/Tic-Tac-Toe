import java.util.Arrays;
import java.util.Scanner;

public class lila {
    public static void main(String[] args) {
        String[][] tabela = new String[3][3];
        int i;

        for (i = 0; i < tabela.length; i++) {
            System.out.println(Arrays.toString(tabela[i]));
        }
        System.out.println("\n");

        System.out.println("Odaberite x ili o!");
        Scanner scanner = new Scanner(System.in);
        String simbol = scanner.next();

        String simbolKompjutera;
        if (simbol.equals("x"))
            simbolKompjutera = "o";
        else
            simbolKompjutera = "x";

        while (true) {

            System.out.println("Unesite broj reda!");
            int red = scanner.nextInt();
            System.out.println("Unesite broj kolone!");
            int kolona = scanner.nextInt();

            tabela[red - 1][kolona - 1] = simbol;

            int random1 = (int) ((Math.random()*10)/4);
            int random2 = (int) ((Math.random()*10)/4);

            if (tabela[random1][random2] == null)
                tabela[random1][random2] = simbolKompjutera;

            else {
                while (tabela[random1][random2] != null) {
                    random1 = (int) ((Math.random()*10)/4);
                    random2 = (int) ((Math.random()*10)/4);
                    if (tabela[0][0] != null && tabela[0][1] != null && tabela[0][2] != null &&
                            tabela[1][0] != null && tabela[1][1] != null & tabela[1][2] != null &&
                            tabela[2][0] != null && tabela[2][1] != null && tabela[2][2] != null)
                        break;
                }
                tabela[random1][random2] = simbolKompjutera;
            }

            for (i = 0; i < tabela.length; i++) {
                System.out.println(Arrays.toString(tabela[i]));
            }
            System.out.println("\n");

            if (tabela[0][0] != null && tabela[0][1] != null && tabela[0][2] != null &&
                    tabela[1][0] != null && tabela[1][1] != null & tabela[1][2] != null &&
                    tabela[2][0] != null && tabela[2][1] != null && tabela[2][2] != null)
                break;
        }
    }
}
