package org.example.structural.adapter;

public class Client {

    public static void main(String[] args) {

        OracleCommands oracleCommands = new OracleCommands();
        oracleCommands.insert();

        DBAdapter mySql = new MySqlAdapter(new MySqlCommands());
        mySql.insert();

    }

}
