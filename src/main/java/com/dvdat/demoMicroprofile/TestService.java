package com.dvdat.demoMicroprofile;

import com.dvdat.demoMicroprofile.entity.DatabaseDAO;
import com.dvdat.demoMicroprofile.entity.NetworkDAO;

public class TestService {
    private DatabaseDAO dbDao = new DatabaseDAO();
    private NetworkDAO networkDAO = new NetworkDAO();

    public boolean save(String filename) {
        String dbResponse = dbDao.save(filename);
        System.out.println(dbResponse);
        networkDAO.save(filename);
        return true;
    }
}
