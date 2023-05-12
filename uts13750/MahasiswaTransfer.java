package uts13750;

public class MahasiswaTransfer extends MahasiswaBaru{
    String asalUniversitas;

    public MahasiswaTransfer(String nim, String nama, int semester, int usia, String[] krs, String asalSekolah, String asalUniversitas)
    {
        super(nim, nama, semester, usia, krs, asalSekolah);
        this.asalUniversitas = asalUniversitas;
    }

    public boolean ikutOspek()
    {
        return false;
    }
    
    public void infoMahasiswa()
    {
        super.infoMahasiswa();
        System.out.println("Asal Universitas : "+asalUniversitas);
    }
}
