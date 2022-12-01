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
    public Questions getQuestionByTextFive() throws SQLException {

        Questions questions = null;

        Statement statement = connection.createStatement();

        String selectQuery = String.format("SELECT * FROM questions WHERE id = 5");

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

    public Questions getQuestionByTextSix() throws SQLException {

        Questions questions = null;

        Statement statement = connection.createStatement();

        String selectQuery = String.format("SELECT * FROM questions WHERE id = 6");

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

    public Questions getQuestionByTextSeven() throws SQLException {

        Questions questions = null;

        Statement statement = connection.createStatement();

        String selectQuery = String.format("SELECT * FROM questions WHERE id = 7");

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

    public Questions getQuestionByTextEight() throws SQLException {

        Questions questions = null;

        Statement statement = connection.createStatement();

        String selectQuery = String.format("SELECT * FROM questions WHERE id = 8");

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
    public Questions getQuestionByTextNine() throws SQLException {

        Questions questions = null;

        Statement statement = connection.createStatement();

        String selectQuery = String.format("SELECT * FROM questions WHERE id = 9");

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
    public Questions getQuestionByTextTen() throws SQLException {

        Questions questions = null;

        Statement statement = connection.createStatement();

        String selectQuery = String.format("SELECT * FROM questions WHERE id = 10");

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
    public Questions getQuestionByTextEleven() throws SQLException {

        Questions questions = null;

        Statement statement = connection.createStatement();

        String selectQuery = String.format("SELECT * FROM questions WHERE id = 11");

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
    public Questions getQuestionByTextTwelve() throws SQLException {

        Questions questions = null;

        Statement statement = connection.createStatement();

        String selectQuery = String.format("SELECT * FROM questions WHERE id = 12");

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
    public Questions getQuestionByThirteen() throws SQLException {

        Questions questions = null;

        Statement statement = connection.createStatement();

        String selectQuery = String.format("SELECT * FROM questions WHERE id = 13");

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
    public Questions getQuestionByTextFourteen() throws SQLException {

        Questions questions = null;

        Statement statement = connection.createStatement();

        String selectQuery = String.format("SELECT * FROM questions WHERE id = 14");

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
    public Questions getQuestionByTextFifteen() throws SQLException {

        Questions questions = null;

        Statement statement = connection.createStatement();

        String selectQuery = String.format("SELECT * FROM questions WHERE id = 15");

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
    public Questions getQuestionByTextSixteen() throws SQLException {

        Questions questions = null;

        Statement statement = connection.createStatement();

        String selectQuery = String.format("SELECT * FROM questions WHERE id = 16");

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
    public Questions getQuestionByTextSeventeen() throws SQLException {

        Questions questions = null;

        Statement statement = connection.createStatement();

        String selectQuery = String.format("SELECT * FROM questions WHERE id = 17");

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
    public Questions getQuestionByTextEighteen() throws SQLException {

        Questions questions = null;

        Statement statement = connection.createStatement();

        String selectQuery = String.format("SELECT * FROM questions WHERE id = 18");

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
    public Questions getQuestionByTextNineteen() throws SQLException {

        Questions questions = null;

        Statement statement = connection.createStatement();

        String selectQuery = String.format("SELECT * FROM questions WHERE id = 19");

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
    public Questions getQuestionByTextTwenty() throws SQLException {

        Questions questions = null;

        Statement statement = connection.createStatement();

        String selectQuery = String.format("SELECT * FROM questions WHERE id = 20");

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
    public Questions getQuestionByTextTwentyOne() throws SQLException {

        Questions questions = null;

        Statement statement = connection.createStatement();

        String selectQuery = String.format("SELECT * FROM questions WHERE id = 21");

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
    public Questions getQuestionByTextTwentyTwo() throws SQLException {

        Questions questions = null;

        Statement statement = connection.createStatement();

        String selectQuery = String.format("SELECT * FROM questions WHERE id = 22");

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
    public Questions getQuestionByTextTwentyTree() throws SQLException {

        Questions questions = null;

        Statement statement = connection.createStatement();

        String selectQuery = String.format("SELECT * FROM questions WHERE id = 23");

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
