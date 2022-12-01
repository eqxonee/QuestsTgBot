package org.example.model.tables;

import org.example.model.entities.Questions;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TableQuestions {

    private Connection connection;

    public TableQuestions(Connection connection) {
        this.connection = connection;
    }

    public Questions getQuestionByText() throws SQLException {

        Questions questions = null;

        Statement statement = connection.createStatement();

        String selectQuery = String.format("SELECT * FROM questions WHERE id = 1");

        ResultSet resultSet = statement.executeQuery(selectQuery);

        if(resultSet.next()) {

            String questionText = resultSet.getString("text");
            int id = resultSet.getInt("id");


            questions = new Questions(id,questionText);
        }

        resultSet.close();

        statement.close();

        return questions;
    }

    public Questions getQuestionByTextTwo() throws SQLException {

        Questions questions = null;

        Statement statement = connection.createStatement();

        String selectQuery = String.format("SELECT * FROM questions WHERE id = 2");

        ResultSet resultSet = statement.executeQuery(selectQuery);

        if(resultSet.next()) {

            String questionText = resultSet.getString("text");
            int id = resultSet.getInt("id");


            questions = new Questions(id,questionText);
        }

        resultSet.close();

        statement.close();

        return questions;
    }
    public Questions getQuestionByTextThree() throws SQLException {

        Questions questions = null;

        Statement statement = connection.createStatement();

        String selectQuery = String.format("SELECT * FROM questions WHERE id = 3");

        ResultSet resultSet = statement.executeQuery(selectQuery);

        if(resultSet.next()) {

            String questionText = resultSet.getString("text");
            int id = resultSet.getInt("id");


            questions = new Questions(id,questionText);
        }

        resultSet.close();

        statement.close();

        return questions;
    }

    public Questions getQuestionByTextFour() throws SQLException {

        Questions questions = null;

        Statement statement = connection.createStatement();

        String selectQuery = String.format("SELECT * FROM questions WHERE id = 4");

        ResultSet resultSet = statement.executeQuery(selectQuery);

        if(resultSet.next()) {

            String questionText = resultSet.getString("text");
            int id = resultSet.getInt("id");


            questions = new Questions(id,questionText);
        }

        resultSet.close();

        statement.close();

        return questions;
    }
}
