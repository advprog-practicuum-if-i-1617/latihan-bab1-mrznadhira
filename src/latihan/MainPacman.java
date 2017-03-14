package latihan;
import java.util.Scanner;

public class MainPacman {
    public static void main(String[] args) {

        Pacman g = new Pacman();

        g.sLangkah(30);

        char b[][] = new char[10][10];

        for (g.x = 0; g.x <= 9; g.x++) {
            for (g.y = 0; g.y <= 9; g.y++) {
                if (g.x == 0) {
                    b[g.x][g.y] = '#';
                } else if (g.x == 1 && g.y == 1) {
                    b[g.x][g.y] = '<';
                } else if ((g.x == 1 && (g.y == 4 || g.y == 5))
                        || (g.x == 4 && g.y == 3)
                        || (g.x == 8 && g.y == 2)) {
                    b[g.x][g.y] = '@';
                } else if (g.x == 9) {
                    b[g.x][g.y] = '#';
                } else if (g.y == 0 || g.y == 9) {
                    b[g.x][g.y] = '#';
                } else if (g.x == 2 && g.y != 2 && g.y != 3 && g.y != 4) {
                    b[g.x][g.y] = '#';
                } else if (g.x == 4 && g.y != 2 && g.y != 3 && g.y != 4 && g.y != 6 && g.y != 7 && g.y != 8) {
                    b[g.x][g.y] = '#';
                } else if (g.x == 5 && g.y != 1 && g.y != 2 && g.y != 3 && g.y != 4) {
                    b[g.x][g.y] = '#';
                } else if (g.x == 6 && g.y == 7) {
                    b[g.x][g.y] = '#';
                } else if ((g.x == 7 && g.y == 3) || (g.x == 7 && g.y == 4)) {
                    b[g.x][g.y] = '#';
                } else if ((g.x == 8 && g.y == 4) || (g.x == 8 && g.y == 5)) {
                    b[g.x][g.y] = '#';
                } else {
                    b[g.x][g.y] = ' ';
                }
            }
        }

        int bantu = 0;
        String pilih = "maze";
        Scanner in = new Scanner(System.in);

        while (bantu != 1) {

            if (pilih.contains("w")) {
                for (g.x = 0; g.x <= 9; g.x++) {
                    for (g.y = 0; g.y <= 9; g.y++) {
                        if (b[g.x][g.y] == '<' || b[g.x][g.y] == 'v' || b[g.x][g.y] == '>' || b[g.x][g.y] == '^') {
                            if (b[g.x - 1][g.y] == '#') {
                                b[g.x][g.y] = '<';
                            } else if (b[g.x][g.y] == 'v' && b[g.x][g.y + 1] == '@') {
                                g.poin++;
                                b[g.x][g.y] = ' ';
                                b[g.x - 1][g.y] = 'v';
                                g.sisaLangkah--;
                            } else {
                                b[g.x][g.y] = ' ';
                                b[g.x - 1][g.y] = 'v';
                                g.poin = g.gPoin();
                                g.sisaLangkah--;
                            }
                            break;
                        }
                    }
                }
                for (g.x = 0; g.x <= 9; g.x++) {
                    for (g.y = 0; g.y <= 9; g.y++) {
                        if (g.y == 9) {
                            System.out.println(b[g.x][g.y]);
                        } else {
                            System.out.print(b[g.x][g.y]);
                        }
                    }
                }
            } else if (pilih.contains("a")) {
                for (g.x = 0; g.x <= 9; g.x++) {
                    for (g.y = 0; g.y <= 9; g.y++) {
                        if (b[g.x][g.y] == '<' || b[g.x][g.y] == 'v' || b[g.x][g.y] == '>' || b[g.x][g.y] == '^') {
                            if (b[g.x][g.y - 1] == '#') {
                                b[g.x][g.y] = '<';
                            } else if (b[g.x][g.y] == '>' && b[g.x][g.y + 1] == '@') {
                                g.poin++;
                                b[g.x][g.y] = ' ';
                                b[g.x][g.y - 1] = '>';
                                g.sisaLangkah--;
                            } else {
                                b[g.x][g.y] = ' ';
                                b[g.x][g.y - 1] = '>';
                                g.poin = g.gPoin();
                                g.sisaLangkah--;
                            }
                            break;
                        }
                    }
                }
                for (g.x = 0; g.x <= 9; g.x++) {
                    for (g.y = 0; g.y <= 9; g.y++) {
                        if (g.y == 9) {
                            System.out.println(b[g.x][g.y]);
                        } else {
                            System.out.print(b[g.x][g.y]);
                        }
                    }
                }
            } else if (pilih.contains("s")) {
                for (g.x = 0; g.x <= 9; g.x++) {
                    for (g.y = 0; g.y <= 9; g.y++) {
                        if (b[g.x][g.y] == '<' || b[g.x][g.y] == 'v' || b[g.x][g.y] == '>' || b[g.x][g.y] == '^') {
                            if (b[g.x + 1][g.y] == '#') {
                                b[g.x][g.y] = '<';
                            } else if (b[g.x][g.y] == '^' && b[g.x + 1][g.y] == '@') {
                                g.poin++;
                                b[g.x][g.y] = ' ';
                                b[g.x + 1][g.y] = '^';
                                g.sisaLangkah--;
                            } else {
                                b[g.x][g.y] = ' ';
                                b[g.x + 1][g.y] = '^';
                                g.poin = g.gPoin();
                                g.sisaLangkah--;
                            }
                            break;
                        }
                    }
                }
                for (g.x = 0; g.x <= 9; g.x++) {
                    for (g.y = 0; g.y <= 9; g.y++) {
                        if (g.y == 9) {
                            System.out.println(b[g.x][g.y]);
                        } else {
                            System.out.print(b[g.x][g.y]);
                        }
                    }
                }
            } else if (pilih.contains("d")) {
                for (g.x = 0; g.x <= 9; g.x++) {
                    for (g.y = 0; g.y <= 9; g.y++) {
                        if (b[g.x][g.y] == '<' || b[g.x][g.y] == 'v' || b[g.x][g.y] == '>' || b[g.x][g.y] == '^') {
                            if (b[g.x][g.y + 1] == '#') {
                                b[g.x][g.y] = '<';
                            } else if (b[g.x][g.y] == '<' && b[g.x][g.y + 1] == '@') {
                                g.poin++;
                                b[g.x][g.y] = ' ';
                                b[g.x][g.y + 1] = '<';
                                g.sisaLangkah--;
                            } else {
                                b[g.x][g.y] = ' ';
                                b[g.x][g.y + 1] = '<';
                                g.poin = g.gPoin();
                                g.sisaLangkah--;
                            }
                            break;
                        }
                    }
                }
                for (g.x = 0; g.x <= 9; g.x++) {
                    for (g.y = 0; g.y <= 9; g.y++) {
                        if (g.y == 9) {
                            System.out.println(b[g.x][g.y]);
                        } else {
                            System.out.print(b[g.x][g.y]);
                        }
                    }
                }
            }

            System.out.println("Step left : " + g.gLangkah());
            System.out.println("Score : " + g.gPoin());
            if ((g.gLangkah() > 0 && g.gLangkah() <= 30) && g.gPoin() == 4) {
                System.out.println("----- YOU WIN -----");
                System.exit(0);
            } else if (g.gLangkah() <= 0 && g.gPoin() < 4) {
                System.out.println("----- GAME OVER -----");
                System.exit(0);
            }

            System.out.print("Enter move(w,a,s,d, q for quit) >> ");
            pilih = in.nextLine();

            if (pilih.contains("q")) {
                bantu = 1;
            }
            System.out.println();
        }
    }
}