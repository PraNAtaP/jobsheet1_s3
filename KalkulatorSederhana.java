import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        char operator;
        while (true) {
            System.out.print("Masukkan operator (+, -, *, /): ");
            operator = input.next().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                break;
            }
            System.out.println("Operator tidak valid! Masukkan ulang");
        }
        
        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        double hasil = 0;

        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == '/') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
            } else {
                System.out.println("Tidak bisa dibagi dengan nol");
                return;
            }
        } else {
            System.out.println("Operator tidak valid! Masukkan ulang");
            return; 
        }

        System.out.println("Hasil: " + hasil);
    }
}
