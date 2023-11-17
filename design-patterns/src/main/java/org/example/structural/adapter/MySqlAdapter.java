package org.example.structural.adapter;

public class MySqlAdapter implements DBAdapter {

    private MySqlCommands mySqlCommands;

    public MySqlAdapter(MySqlCommands mySqlCommands) {
        this.mySqlCommands = mySqlCommands;
    }

    @Override
    public void insert() {
        this.mySqlCommands.insertMySql();
    }

    @Override
    public void update() {
        this.mySqlCommands.updateMySql();
    }

    @Override
    public void delete() {
        this.mySqlCommands.deleteMySql();
    }
}
