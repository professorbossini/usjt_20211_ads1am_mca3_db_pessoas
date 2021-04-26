package com.mycompany.usjt_20211_ads1am_mca3_db_pessoas;


import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    //valores dependem do seu banco
    private String usuario="rodrigo";
    private String senha="1234";
    private String host="localhost";
    private String porta="3306";
    private String bd="usjt_20211_ads1am_mca1_pessoas";
    
    public Connection obtemConexao() {
        try{
            Connection c = DriverManager.getConnection (
                    "jdbc:mysql://" + host + ":" + porta + "/" +
                    bd + "?useTimezone=true&serverTimezone=America/Sao_Paulo", usuario, senha);
            return c;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
