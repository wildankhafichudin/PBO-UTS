package uts13750;

import java.util.Scanner;

public class Mahasiswa {
    // variabel instance
    private String nim;
    private String nama;
    private int semester;
    private int usia;
    private String[] krs;
    private float[] nilai;
    
    // konstruktor
    public Mahasiswa(String nim, String nama, int semester, int usia, String[] krs) {
        this.nim = nim;
        this.nama = nama;
        this.semester = semester;
        this.usia = usia;
        this.krs = krs;
        this.nilai = new float[krs.length];
    }
    
    // metode untuk menginput nilai mata kuliah
    public void inputNilai() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < krs.length; i++) {
            System.out.print("Nilai mata kuliah " + krs[i] + ": ");
            nilai[i] = scanner.nextFloat();
            scanner.nextLine();
        }
    }
    
    // metode untuk menampilkan info mahasiswa
    public void infoMahasiswa() {
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Semester\t: " + semester);
        System.out.println("Usia\t\t: " + usia);
    }
    
    // metode untuk menampilkan info KRS mahasiswa
    public void infoKrsMahasiswa() {
        System.out.println("\nKRS Mahasiswa:");
        for (int i = 0; i < krs.length; i++) {
            System.out.println((i+1) + ". " + krs[i]);
        }
    }
    
    // metode untuk menampilkan info nilai mahasiswa dan menghitung rata-rata nilai
    public void infoNilaiMahasiswa() {
        float total = 0;
        System.out.println("\nNilai Mahasiswa:");
        for (int i = 0; i < krs.length; i++) {
            System.out.println(krs[i] + "\t: " + nilai[i]);
            total += nilai[i];
        }
        float rataRata = total / krs.length;
        System.out.println("Rata-rata nilai\t: " + rataRata);
        System.out.println();
    }
}
