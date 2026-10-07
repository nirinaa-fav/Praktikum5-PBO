/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author VICTUS
 */

public class MainDiary {
    public static void main(String[] args) {
        BukuHarian diarySaya = new BukuHarian("Nirina");

        diarySaya.tulisCatatan("15-04-2026", "Hari ini ada praktikum PBO, mantapp cuy");
        diarySaya.tulisCatatan("16-00-2026", "Berhasil membuat file catatan harian!");

        diarySaya.bacaCatatan();
    }
}