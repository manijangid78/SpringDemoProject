package com.mani;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class WheelerImpl implements Wheeler{

    @Autowired
    public HomeTwoWheeler homeTwoWheeler;

    public String typeWheeler;
    public boolean conformBooking;

    @Override
    public void setTypeWheeler(String typeWheeler){
        this.typeWheeler = typeWheeler;
        homeTwoWheeler.Home();
    }

    @PreDestroy
    @Override
    public boolean conformBooking() {
        if(typeWheeler!=null){
            System.out.println("Booking Conformed");
            return true;
        }
        return false;
    }
}
