package uts13750;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        boolean isRunning = true;
        
        while (isRunning) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Lihat Daftar Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine();
            
            switch (menu) {
                case 1:
                    System.out.print("Jumlah mahasiswa yang akan diinput: ");
                    int jumlahMahasiswa = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < jumlahMahasiswa; i++) {
                        System.out.println("\nData Mahasiswa ke-" + (i+1));

                        System.out.print("NIM: ");
                        String nim = scanner.nextLine();

                        System.out.print("Nama: ");
                        String nama = scanner.nextLine();

                        System.out.print("Semester: ");
                        int semester = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Usia: ");
                        int usia = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Jumlah mata kuliah yang diambil: ");
                        int jumlahMatkul = scanner.nextInt();
                        scanner.nextLine();

                        String[] krs = new String[jumlahMatkul];
                        //float[] nilaikrs = new float[jumlahMatkul];
                        for (int j = 0; j < jumlahMatkul; j++) {
                            System.out.print("Mata kuliah " + (j+1) + ": ");
                            krs[j] = scanner.nextLine();
                            //System.out.print("Nilai mata kuliah " + krs[j] + ": ");
                            //nilaikrs[j] = scanner.nextFloat();
                            //scanner.nextLine();
                        }

                        System.out.println();
                        System.out.println("Pilih tipe mahasiswa: ");
                        System.out.println("1. Mahasiswa Baru");
                        System.out.println("2. Mahasiswa Lulus");
                        System.out.println("3. Mahasiswa Aktif");
                        System.out.println("4. Mahasiswa Transfer");
                        int tipeMahasiswa = scanner.nextInt();
                        scanner.nextLine();

                        if (tipeMahasiswa == 1) {
                            System.out.print("Asal Sekolah: ");
                            String asalSekolah = scanner.nextLine();

                            daftarMahasiswa.add(new MahasiswaBaru(nim, nama, semester, usia, krs, asalSekolah));
                        } else if (tipeMahasiswa == 2) {
                            System.out.print("Tahun Wisuda: ");
                            int tahunWisuda = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("IPK: ");
                            float ipk = scanner.nextFloat();
                            scanner.nextLine();

                            daftarMahasiswa.add(new MahasiswaLulus(nim, nama, semester, usia, krs, tahunWisuda, ipk));
                        } else if (tipeMahasiswa == 3) {
                            daftarMahasiswa.add(new Mahasiswa(nim, nama, semester, usia, krs));
                        } else if (tipeMahasiswa == 4) {
                            System.out.print("Asal Sekolah: ");
                            String asalSekolah = scanner.nextLine();

                            System.out.print("Asal Universitas: ");
                            String asalUniversitas = scanner.nextLine();

                            daftarMahasiswa.add(new MahasiswaTransfer(nim, nama, semester, usia, krs, asalSekolah, asalUniversitas));
                        } else {
                            System.out.println("Tipe mahasiswa tidak valid.");
                        }
                    }
                    break;
                case 2:
                    // Output data mahasiswa
                    System.out.println("\nDaftar Mahasiswa:");
                    for (Mahasiswa m : daftarMahasiswa) {
                        m.infoMahasiswa();
                        m.inputNilai();
                        m.infoKrsMahasiswa();
                        m.infoNilaiMahasiswa();
                    }
                    break;
                case 3:
                    // Keluar dari program
                    isRunning = false;
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        }
        System.out.println("Terima kasih telah menggunakan program ini.");
    }
}
