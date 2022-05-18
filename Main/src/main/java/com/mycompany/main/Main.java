/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

import java.util.HashSet;

/**
 *
 * @author USER
 */
public class Main {

    public static void main(String[] args) {
        TelephoneNumber phone = new TelephoneNumber("981","0234567");
    TelephoneNumber phone1 = new TelephoneNumber("981","0234567");
    TelephoneNumber phone2 = new TelephoneNumber("7890","654321");
    //TelephoneNumber phone3 = new TelephoneNumber("","");



        HashSet<TelephoneNumber> telNumb = new HashSet<>();
        telNumb.add(phone);
        telNumb.add(phone1);
        telNumb.add(phone2);
        //telNumb.add(phone3);


        for (TelephoneNumber number: telNumb) {
            System.out.println(number);
        }
    }
}
