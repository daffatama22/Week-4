/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author RYZEN 5
 */
public class Nilai {
     char nHuruf;
    String predikat;
    char getNilHuruf(float nl){
        if(nl>=85) {
            nHuruf='A'; 
        } else if(nl>=70 && nl<85) {
            nHuruf='B'; 
        } else if(nl>=60 && nl<70) {
            nHuruf='C'; 
        } else if(nl>=40 && nl<60) {
            nHuruf='D'; 
        } else {
            nHuruf='E'; 
        }
        return nHuruf;
    }

    String getPredikat(char huruf){
        switch(huruf) 
        { 
        case 'A': predikat="Apik"; 
        break; 
        case 'B': predikat="Baik"; 
        break; 
        case 'C': predikat="Cukup"; 
        break; 
        case 'D': predikat="Kurang"; 
        break; 
        default : predikat="Parah"; 
        } 
        return predikat;
    }

}
