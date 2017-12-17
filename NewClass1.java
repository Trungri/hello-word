/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author TrungRi
 */
public class NewClass1{
    
    
    public static void main(String  args[]){
        
        Students student1 = new Students();
        student1.name = "Dave";
        student1.age = 9;
        student1.gioitinh = "BOY";
        Students student2 = new Students();
        student2.name = "Join";
        student2.age = 7;
        student2.gioitinh = "BOY";
        Students student3 = new Students();
        student3.name = "Juli";
        student3.age = 6;
        student3.gioitinh = "GIRL";
        
        ClassRoom classroom1 = new ClassRoom();        
        classroom1.list[0] = student1;
        classroom1.list[1] = student2;
        classroom1.list[2] = student3;
        
        Students student4 = new Students();
        student4.name = "Jame";
        student4.age = 6;
        student4.gioitinh = "BOY";
        Students student5 = new Students();
        student5.name = "Mary";
        student5.age = 7;
        student5.gioitinh = "GIRL";
        
        ClassRoom classroom2 = new ClassRoom();
        classroom2.list[0] = student4;
        classroom2.list[1] = student5;
        
        System.out.println("KQ : "+classroom1.list.length);
        
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("INFOR : "+classroom1.list[i]);
        }        
    }
}
class ClassRoom{
    Students[] list = new Students[10];
}
class Students{
    public String name, gioitinh;
    public int age;
}