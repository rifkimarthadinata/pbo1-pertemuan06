package tugas;

public class MainLampu {
    public static void main(String[] args){
        Lampu lampu = new Lampu();
        lampu.setNama("Bohlam");
        lampu.setBentuk("Oval");
        System.out.println("Nama lampu\t: " + lampu.getNama());
        System.out.println("Bentuk lampu\t: " + lampu.getBentuk());
        System.out.println(" ");
        lampu.lampuPadam();
        lampu.lampuPadam("Bah... iya ja pang listrik pajah kada kawa menggawi tugas :')");
        lampu.lampuPadam("mana waktu babaya sejam wara lagi huhu ya oloh :')");
    }
}
