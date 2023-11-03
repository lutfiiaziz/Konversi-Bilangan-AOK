import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih opsi konversi:");
        System.out.println("1. Biner ke Desimal");
        System.out.println("2. Desimal ke Biner");
        System.out.println("3. Biner ke Heksadesimal");
        System.out.println("4. Heksadesimal ke Biner");
        System.out.println("5. Desimal ke Heksadesimal");
        System.out.println("6. Heksadesimal ke Desimal");

        System.out.print("Input pilihan anda: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan bilangan biner: ");
                String biner = input.next();
                int binaryTodecimal = Integer.parseInt(biner, 2);
                System.out.println("Hasil konversi: " + binaryTodecimal);
                break;
            case 2:
                System.out.print("Masukkan bilangan desimal: ");
                int desimal = input.nextInt();
                String binerDariDesimal = Integer.toBinaryString(desimal);
                System.out.println("Hasil konversi: " + binerDariDesimal);
                break;
            case 3:
                System.out.print("Masukkan bilangan biner: ");
                String binerKeHeksadesimal = input.next();
                int desimalDariBinerKeHeksadesimal = Integer.parseInt(binerKeHeksadesimal, 2);
                String heksadesimal = Integer.toHexString(desimalDariBinerKeHeksadesimal);
                System.out.println("Hasil konversi: " + heksadesimal);
                break;
            case 4:
                System.out.print("Masukkan bilangan heksadesimal: ");
                String heksadesimalKeBiner = input.next();
                int desimalDariHeksadesimalKeBiner = Integer.parseInt(heksadesimalKeBiner, 16);
                String binerDariHeksadesimal = Integer.toBinaryString(desimalDariHeksadesimalKeBiner);
                System.out.println("Hasil konversi: " + binerDariHeksadesimal);
                break;
            case 5:
                System.out.print("Masukkan bilangan desimal: ");
                int desimalKeHeksadesimal = input.nextInt();
                String heksadesimalDariDesimal = Integer.toHexString(desimalKeHeksadesimal);
                System.out.println("Hasil konversi: " + heksadesimalDariDesimal);
                break;
            case 6:
                System.out.print("Masukkan bilangan heksadesimal: ");
                String heksadesimalKeDesimal = input.next();
                int desimalDariHeksadesimal = Integer.parseInt(heksadesimalKeDesimal, 16);
                System.out.println("Hasil konversi: " + desimalDariHeksadesimal);
                break;
            default:
                System.out.println("Opsi tidak valid.");
        }

        input.close();
    }
}
