package tugas;

public class Lampu {
    private String nama;
    private String bentuk;

    public void setNama(String oldNama){
        nama = oldNama;
    }

    public String getNama(){
        return nama;
    }

    public void setBentuk(String newBentuk){
        bentuk = newBentuk;
    }

    public String getBentuk(){
        return bentuk;
    }

    public void lampuPadam(){
        System.out.println("Ais... lampu pajah am bekadap am");
    }

    public void lampuPadam(String s){ //overloading method
        System.out.println(s);
    }
}
