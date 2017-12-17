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
public class Mang_Basics {
    static void nhapMang(int arr[], int n){
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            System.out.print("a[ "+i+" ] = ");
            arr[i] = scan.nextInt();
        }
    }
    static void xuatMang(int arr[], int n){
        for (int i = 0; i < n; i++){
            System.out.print(+arr[i]+"  ");
        }
    }
    public static void main(String[] args){
        int[] bienThamchieu = new int[100];
        Scanner nhapn = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu mang : ");
        int len = nhapn.nextInt();
        nhapMang(bienThamchieu, len);
        System.out.print("Mang da nhap vao : ");
        xuatMang(bienThamchieu, len); 
        Mang mang1 = new Mang();
        System.out.print("\nTong cac phan tu cua mang la : "+mang1.tongMang(bienThamchieu, len));
    }
}
class Mang{
    
    public int tongMang(int a[], int n){
        int s = 0;
        for (int i = 0; i < n; i++){
            s += a[i];
        }
        return s;
    }
}