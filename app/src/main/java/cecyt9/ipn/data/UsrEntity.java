/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cecyt9.ipn.data;


import java.sql.*;
import java.util.Scanner;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @author Sorz Torres
 */
public class UsrEntity {
    int idUsr;
    String  xnombre,
            xaPat,
            xaMat,
            xcel,
            xmail,
            xpass;
    public UsrEntity(String xnombre,
                   String xaPat,
                   String xaMat,
                   String xcel,
                   String xmail,
                   String xpass){
        this.idUsr = Integer.parseInt(UUID.randomUUID().toString());
        this.xnombre = xnombre;
        this.xaPat = xaPat;
        this.xaMat = xaMat;
        this.xcel = xcel;
        this.xmail = xmail;
        this.xpass = xpass;
    }

    public int getIdUsr() {
        return idUsr;
    }

    public String getXnombre() {
        return xnombre;
    }

    public String getXaPat() {
        return xaPat;
    }

    public String getXaMat() {
        return xaMat;
    }

    public String getXcel() {
        return xcel;
    }

    public String getXmail() {
        return xmail;
    }

    public String getXpass() {
        return xpass;
    }
}
