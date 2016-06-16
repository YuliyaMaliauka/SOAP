package com.datalex.dao;


public class DAOFactory {
    public static IDAO getInstance(){
        return new DaoXML();
    }
}
