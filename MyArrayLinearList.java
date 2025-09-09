import java.util.Scanner;

public class MyArrayLinearList {
    public static void main() {
        int a, size;
        int[] b = new int[100];
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Massiviin hemjeeg oruulna uu : ");
        size = scanner.nextInt();
        
        System.out.print("Massiviin " + size + " toon utguudiig oruulna uu : ");
        for (int i = 0; i < size; i++) {
            b[i] = scanner.nextInt();
        }
        
        System.out.print("\n1.Massiviin hamgiin ih utga \n2.Massiviin hamgiin baga utga \n3.Massiviin gishuudin niilber \n4.Massiviin gishuudin dundaj utga \n5.Massiviin sondgoi toonuudig ustgah \n6.Massiviin usuhuur erembleh \nAli uildliig songoh ve : ");
        a = scanner.nextInt();
        
        switch (a) {
            case 1: {
                int max = b[0];
                for (int i = 1; i < size; i++) {
                    if (b[i] > max) {
                        max = b[i];
                    }
                }
                System.out.println("Massiviin hamgiin ih utga : " + max);
                break;
            }
            case 2: {
                int min = b[0];
                for (int i = 1; i < size; i++) {
                    if (b[i] < min) {
                        min = b[i];
                    }
                }
                System.out.println("Massiviin hamgiin baga utga : " + min);
                break;
            }
            case 3: {
                int total = 0;
                for (int i = 0; i < size; i++) {
                    total += b[i];
                }
                System.out.println("Massiviin gishuudiin niilber : " + total);
                break;
            }
            case 4: {
                double total = 0, average;
                for (int i = 0; i < size; i++) {
                    total += b[i];
                }
                average = total / size;
                System.out.println("Massiviin dundaj utga : " + average);
                break;
            }
            case 5: {
                int nize = 0;
                for (int i = 0; i < size; i++) {
                    if (b[i] % 2 == 0) {
                        b[nize] = b[i];
                        nize++;
                    }
                }
                
                System.out.print("Sondgoi toonuudiig ustgasan massiv : ");
                for (int i = 0; i < nize; i++) {
                    System.out.print(b[i] + " ");
                }
                System.out.println();
                break;
            }
            case 6: {
                for (int i = 0; i < size - 1; i++) {
                    for (int j = 0; j < size - i - 1; j++) {
                        if (b[j] > b[j + 1]) {
                            int temp = b[j];
                            b[j] = b[j + 1];
                            b[j + 1] = temp;
                        }
                    }
                }
                
                System.out.print("Usuhuur eremblegdsen massiv : ");
                for (int i = 0; i < size; i++) {
                    System.out.print(b[i] + " ");
                }
                System.out.println();
                break;
            }
            default:
                System.out.println("1-6 hoorond songono uu ");
                break;
        }
        scanner.close();
    }
}