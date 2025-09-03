public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Hello World!");
        Mhs vincent = new Mhs("Vincent", 50000);
        Dukun raffi =new Dukun(5);
        System.out.println("Uang saku Vincent: " + vincent.uangSaku);
        System.out.println("Vincent pergi ke dukun");
        vincent.uangSaku = raffi.gandakanUang(vincent.uangSaku);
        System.out.println("Uang saku Vincent Sekarang: " + vincent.uangSaku);
    }
}

class Mhs {
    String nama;
    int uangSaku;

    Mhs(String nama, int uangSaku){
        this.nama = nama;
        this.uangSaku = uangSaku;
    }
}

class Dukun {
    int berapaX;
    Dukun(int berapaX){
        this.berapaX = berapaX;
    }

    int gandakanUang(int uang) {
        return uang * this.berapaX;
    }
}