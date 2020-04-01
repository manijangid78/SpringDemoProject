package com.mani;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class HomeTwoWheeler {

    @Autowired
    public TwoWheeler twoWheeler;
    public Scanner sc = new Scanner(System.in);

    public void Home(){

        System.out.println("==== !!!! Hello, You Want to Buy Two-Wheeler !!!! ==== ");
        System.out.println("Enter Model Name which you want to purchase: ");
        twoWheeler.setTwoWheelerModel(sc.nextLine());
        System.out.println("Enter EngineRange you want to purchase : ");
        twoWheeler.setEngineRange(sc.nextLine());
        System.out.println("Enter which fuel wheeler  you require (Petrol/Desiel)");
        twoWheeler.setFuel(sc.nextLine());

    }

}
