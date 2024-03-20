import java.util.Scanner;

public class Balok extends BangunRuang {
    Scanner scanner = new Scanner(System.in);
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(String name) {
        super(name);
    }

    @Override
    public void inputNilai() {
        System.out.println("\n==="+getName()+"===");
        System.out.print("Input panjang: ");
        panjang = scanner.nextDouble();
        System.out.print("Input lebar: ");
        lebar = scanner.nextDouble();
        System.out.print("Input tinggi: ");
        tinggi = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan() {
        double result = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        super.luasPermukaan();
        System.out.println("luas hasil permukaan " + result);
    }

    @Override
    public void volume(){
        double result = panjang*lebar*tinggi;
        super.volume();
        System.out.println("Hasil volume "+result);
    }

}


