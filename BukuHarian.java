/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author VICTUS
 */

// Nama : Nirina Ariftiyanti
// NIM  : L0325041

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BukuHarian {
    private String namaPemilik;
    private String namaFile;

    public BukuHarian(String namaPemilik) {
        this.namaPemilik = namaPemilik;
        this.namaFile = "diary_" + namaPemilik.toLowerCase().replaceAll("\\s+", "_") + ".txt";
    }

    public void tulisCatatan(String tanggal, String isi) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(namaFile, true))) {
            bw.write("[" + tanggal + "] - " + isi);
            bw.newLine();
            System.out.println("Catatan berhasil ditambahkan.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis catatan: " + e.getMessage());
        }
    }

    public void bacaCatatan() {
        try (BufferedReader br = new BufferedReader(new FileReader(namaFile))) {
            String baris;
            System.out.println("\n=== Catatan Harian milik " + namaPemilik + " ===");
            boolean adaIsi = false;

            while ((baris = br.readLine()) != null) {
                System.out.println(baris);
                adaIsi = true;
            }

            if (!adaIsi) {
                System.out.println("Belum ada catatan harian.");
            }
        } catch (IOException e) {
            System.out.println("Belum ada catatan harian.");
        }
    }
}
