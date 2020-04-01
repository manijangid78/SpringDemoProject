package com.mani;

import org.springframework.stereotype.Component;

@Component
public class TwoWheelerImpl implements TwoWheeler{

    public String twoWheelerModel;
    public String engineRange;
    public String fuel;

    @Override
    public void setTwoWheelerModel(String twoWheelerModel) {
        this.twoWheelerModel=twoWheelerModel;
    }

    @Override
    public void setEngineRange(String engineRange) {
        this.engineRange = engineRange;
    }

    @Override
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
