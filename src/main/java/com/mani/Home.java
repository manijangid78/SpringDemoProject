package com.mani;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Scanner;

@Component
public class Home {

    @Autowired
    private Wheeler wheeler;
    private Scanner sc = new Scanner(System.in);

    @PostConstruct
    public void Start(){

        System.out.println("=====!!!!!!===== Hello Guys Let's Start the Journy =====!!!!!====");
        System.out.println("What do you want to purchase (tow-Wheeler/four-Wheeler)");
        wheeler.setTypeWheeler(sc.nextLine());

    }

}
