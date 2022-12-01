package org.example.service.handlers;

import org.example.model.DbManager;
import org.example.statemachine.State;
import org.example.statemachine.TransmittedData;
import org.example.util.ButtonsStorageWitcher;
import org.example.util.DialogStringsStorage;
import org.example.util.InlineKeyboardsMarkupStorage;
import org.example.util.SystemStringsStorage;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import java.sql.SQLException;
import java.util.List;

import static org.example.statemachine.State.FirstQuestionPartOne;
import static org.example.statemachine.State.SecondQuestionPartOne;


public class MainMenuService {

    public SendMessage processCommandStart(String command, TransmittedData transmittedData) throws SQLException {

        SendMessage message = new SendMessage();
        message.setChatId(transmittedData.getChatId());

        if (!command.equals(SystemStringsStorage.CommandStart)) {
            message.setText(DialogStringsStorage.CommandStartError);
            return message;
        }

        transmittedData.setState(FirstQuestionPartOne);
        String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByText().getText();

        message.setText(questionOne);
        message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionOne());

        return message;

    }

    public SendMessage processFirstQuestionPartOne(String callBackData, TransmittedData transmittedData) throws Exception {

        SendMessage message = new SendMessage();
        message.setChatId(transmittedData.getChatId());

        if (callBackData.equals(ButtonsStorageWitcher.AnswerOneQuestionOne.getCallBackData())) {

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextTwo().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextFour().getText();

            message.setText(questionOne + "\n" + questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionTwo());
            transmittedData.setState(SecondQuestionPartOne);

            return message;

        }else if(callBackData.equals(ButtonsStorageWitcher.AnswerTwoQuestionOne.getCallBackData())){

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextThree().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextFour().getText();

            message.setText(questionOne + "\n" + questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionTwo());
            transmittedData.setState(SecondQuestionPartOne);

            return message;
        }
        throw new Exception("govno");
    }
}





