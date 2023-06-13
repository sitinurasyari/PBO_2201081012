/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siti180423;

/**
 *
 * @author Windows
 */
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord annaRecord = new StudentRecord();
        annaRecord.setName("Anna");
        annaRecord.setAddress("Padang");
        annaRecord.setAge(23);
        annaRecord.setMathGrade(80);
        annaRecord.setEnglishGrade(70);
        annaRecord.setScienceGrade(80);
        ///
        ///tampil data anna
        System.out.println("Nama        : "+annaRecord.getName());
        System.out.println("Alamat      : "+annaRecord.getAddress());
        System.out.println("Umur        : "+annaRecord.getAge());
        System.out.println("Matematika  : "+annaRecord.getMathGrade());
        System.out.println("B.inggris   : "+annaRecord.getEnglishGrade());
        System.out.println("Pengetahuan : "+annaRecord.getScienceGrade());
        System.out.println("Rata rata   : "+annaRecord.getAverage());
        
        StudentRecord ali= new StudentRecord();
        ali.setName("Ali");
        ali.setAddress("Padang");
        
        ali.print("");
        ali.print(80,70,90);
        
        StudentRecord budi= new StudentRecord("Budi","Padang");
        budi.print("");
        budi.print(80,70,90);
        
        System.out.println("Jumlah siswa   : "+StudentRecord.getStudentCount());
    }
}
