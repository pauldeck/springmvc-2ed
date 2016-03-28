package com.example.spy;

import com.example.MyUtility;
import com.example.dao.GarageDAO;

public class GarageDAOSpy implements GarageDAO {
    private int carCount = 3;
    
    @Override
    public MyUtility rent() {
        if (carCount == 0) {
            return null;
        } else {
            carCount--;
            return new MyUtility();
        }   
    }
}
