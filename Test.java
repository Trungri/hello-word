/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author TrungRi
 */
public class Test {
    public static void main(String args[]){
        
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        
        System.out.println("Nhap THONG TIN SV1");
        student1.nhapThongTin();
        System.out.println("Xuat TTIN SV1");
        student1.xuatTT();
        
        System.out.println("Nhap THONG TIN SV2");
        student2.nhapThongTin();
        System.out.println("Xuat TTIN SV2");
        student2.xuatTT();
        
        System.out.println("Nhap THONG TIN SV3");
        student3.nhapThongTin();
        System.out.println("Xuat TTIN SV3");
        student3.xuatTT();
        
        
    }
}
class Student{
    private String ten, gioitinh;
    private int tuoi;
    Scanner scan = new Scanner(System.in);
    public void nhapThongTin(){   
        System.out.print("Nhap ten : ");
        ten = scan.nextLine(); 
        System.out.print("Nhap vao tuoi : ");
        tuoi = Integer.parseInt(scan.nextLine());
        System.out.print("Nhap gioi tinh : ");
        gioitinh  = scan.nextLine();
    }
    public void xuatTT(){
        System.out.print("Ten la : " +ten);
        System.out.print("\nTuoi la : " +tuoi);
        System.out.print("\nGioi tinh la : " +gioitinh);
    }
}