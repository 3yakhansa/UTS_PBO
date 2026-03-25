public class KucingLangka extends Kucing {

    private String keunikan;

    public KucingLangka(int id, String nama, String ras, int usia, String status) {
        super(id, nama, ras, usia, status);
        this.keunikan = "Memiliki karakteristik langka dan jarang ditemukan";
    }

    public void tampilkanDetailKhusus() {
        System.out.println(">> [Protected Access] " + super.getDetailInternal());
        System.out.println(">> Keunikan: " + keunikan);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ID: " + getId() +
                " | Nama: " + getNama() +
                " | Ras: " + getRas() +
                " | Usia: " + getUsia() + " bulan" +
                " | Status: " + getStatus() +
                " | [LANGKA] !");
    }

    @Override
    public String getKeterangan() {
        return "Kucing Langka - Spesial dan Jarang Ditemukan";
    }
}