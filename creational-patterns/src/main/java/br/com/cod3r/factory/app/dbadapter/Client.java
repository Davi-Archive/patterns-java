package br.com.cod3r.factory.app.dbadapter;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.factory.PostgresDBFactory;

public class Client {

    public static void main(String[] args) {
	// DB db = new OracleDBFactory().getDatabase();
	DB db = new PostgresDBFactory().getDatabase();
	db.query("SELECT * FROM amigo;");
	db.update("UPDATE id,name VALUES 'a','b','c';");

    }
}
