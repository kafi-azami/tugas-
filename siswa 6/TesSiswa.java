import java.util.Scanner;

//Driver Class
public class TesSiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ID : "); 
        int id = in.nextInt();
        System.out.println("Nama : ");
        String nama = in.nextLine();
        System.out.println("IPK : ");
        double ipk = in.nextDouble();
        //membuat obyek
        Siswa azami = new Siswa();
        Siswa kafi = new Siswa();
        
        Siswa juren = new Siswa(10, "Juren", 50);
        Siswa cyno = new Siswa(id,nama,ipk);
        azami.setId(100);
        azami.setNama("Azami");
        azami.setIpk(4);
        System.out.println("Ini Data Azami");
        azami.print();
        System.out.println("Ini Data Azami");
        kafi.print();

        juren.print();
        cyno.print();
        System.out.println(juren.print2());
    }   
}
