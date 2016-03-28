package com.example.spy;

import org.junit.Test;

import com.example.MyUtility;
import com.example.dao.GarageDAO;
import com.example.service.GarageService;
import com.example.service.GarageServiceImpl;

import static org.junit.Assert.*;

public class GarageServiceImplTest {

    @Test
    public void testRentCar() {
        GarageDAO garageDAO = new GarageDAOSpy();
        GarageService garageService = new GarageServiceImpl(garageDAO);
        MyUtility car1 = garageService.rent();
        MyUtility car2 = garageService.rent();
        MyUtility car3 = garageService.rent();
        MyUtility car4 = garageService.rent();
        
        assertNotNull(car1);
        assertNotNull(car2);
        assertNotNull(car3);
        assertNull(car4);
    }

}
