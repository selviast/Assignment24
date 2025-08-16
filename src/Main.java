import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n###### Assignment 24 || Selvia Tunjungsih W. K ######\n");

        //Array bertipe Payable
        ArrayList<Payable> akunTransaksi = new ArrayList<>();

        //bikin objek + nambahin ke Array Payable (akunTransaksi)
        akunTransaksi.add(new CreditCard("1234567"));
        akunTransaksi.add(new CreditCard("7654321"));
        akunTransaksi.add(new PayPal("selvia_tunjungsih@gmail.com"));
        akunTransaksi.add(new BankTransfer("BCA", "11223344"));
        akunTransaksi.add(new PayPal("emma_watson@gmail.com"));
        akunTransaksi.add(new BankTransfer("BRI", "00998877"));

        //output
        System.out.println("=======DAFTAR TRANSAKSI=======");
        int counter = 1;
        for (Payable a : akunTransaksi) { //looping item di array
            System.out.println(counter + ". " + a.getPaymentDetails());
            //payment dikali counter agar tiap payment berbeda jumlah
            double jumlahPay = a.pay(5000) * counter;
            System.out.println("Jumlah transaksi : " + jumlahPay);
            System.out.println("---------------------------");
            counter++;
        }

    }
}