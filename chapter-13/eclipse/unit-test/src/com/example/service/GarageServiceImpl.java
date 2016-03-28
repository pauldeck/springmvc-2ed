package com.example.service;

import com.example.MyUtility;
import com.example.dao.GarageDAO;

public class GarageServiceImpl implements GarageService {
    private GarageDAO garageDAO;
    public GarageServiceImpl(GarageDAO garageDAOArg) {
        this.garageDAO = garageDAOArg;
    }
    public MyUtility rent() {
        return garageDAO.rent();
    }
}
