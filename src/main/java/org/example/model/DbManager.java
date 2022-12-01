package org.example.model;

import org.example.model.connection.DbConnection;
import org.example.model.tables.TableQuestions;

import java.sql.Connection;
import java.sql.SQLException;

public class DbManager {
    private TableQuestions tableQuestions;

    private DbManager() throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        tableQuestions = new TableQuestions(connection);
    }

    public TableQuestions getTableQuestions() {
        return tableQuestions;
    }
    private static DbManager instance;

    public static DbManager getInstance() throws SQLException {
        if (instance == null) {
            instance = new DbManager();
        }
        return instance;
    }
}
