package org.example.service.handlers;

import org.example.model.DbManager;
import org.example.statemachine.TransmittedData;
import org.example.util.ButtonsStorageWitcher;
import org.example.util.DialogStringsStorage;
import org.example.util.InlineKeyboardsMarkupStorage;
import org.example.util.SystemStringsStorage;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;



import static org.example.statemachine.State.*;


public class MainMenuService {
    SendPhotoFromUser sendPhotoFromUser;

    public MainMenuService() throws Exception {
        sendPhotoFromUser = new SendPhotoFromUser();
    }

    public SendMessage processCommandStart(String command, TransmittedData transmittedData) throws Exception {

        SendMessage message = new SendMessage();
        message.setChatId(transmittedData.getChatId());

        if (!command.equals(SystemStringsStorage.CommandStart)) {
            message.setText(DialogStringsStorage.CommandStartError);
            return message;
        }

        transmittedData.setState(FirstQuestionPartOne);

        String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByText().getText();

        message.setText(questionOne);
        //sendPhotoFromUser.SendPhotoCommandStart(transmittedData.getChatId());

        message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionOne());

        return message;

    }

    public SendMessage processFirstQuestionPartOne(String callBackData, TransmittedData transmittedData) throws Exception {

        SendMessage message = new SendMessage();
        message.setChatId(transmittedData.getChatId());

        if (callBackData.equals(ButtonsStorageWitcher.AnswerOneQuestionOne.getCallBackData())) {

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextTwo().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextFour().getText();

            message.setText(questionOne + "\n" + "\n" + questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionTwo());
            transmittedData.setState(SecondQuestionPartOne);

            return message;

        }else if(callBackData.equals(ButtonsStorageWitcher.AnswerTwoQuestionOne.getCallBackData())){

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextThree().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextFour().getText();

            message.setText(questionOne + "\n" + "\n" + questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionTwo());
            transmittedData.setState(SecondQuestionPartOne);

            return message;
        }
        throw new Exception("Некорректный ввод");
    }

    public SendMessage processSecondQuestionPartOne(String callBackData, TransmittedData transmittedData) throws Exception {

        SendMessage message = new SendMessage();
        message.setChatId(transmittedData.getChatId());

        if (callBackData.equals(ButtonsStorageWitcher.AnswerOneQuestionTwo.getCallBackData())){


            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextFive().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextSeven().getText();

            message.setText(questionOne + "\n" + "\n" + questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionThree());
            transmittedData.setState(ThirdQuestionPartOne);

            return message;
        }else if(callBackData.equals(ButtonsStorageWitcher.AnswerTwoQuestionTwo.getCallBackData())){

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextSix().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextSeven().getText();

            message.setText(questionOne + "\n" + "\n" + questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionThree());
            transmittedData.setState(ThirdQuestionPartOne);

            return message;
        }
        throw new Exception("Некорректный ввод");

    }

    public SendMessage processThirdQuestionPartOne(String callBackData, TransmittedData transmittedData) throws Exception {

        SendMessage message = new SendMessage();
        message.setChatId(transmittedData.getChatId());

        if (callBackData.equals(ButtonsStorageWitcher.AnswerOneQuestionThree.getCallBackData())){

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextEight().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextTwelve().getText();

            message.setText(questionOne + "\n" + "\n" + questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionFour());
            transmittedData.setState(FourthQuestionPartOne);

            return message;

        }else if(callBackData.equals(ButtonsStorageWitcher.AnswerTwoQuestionThree.getCallBackData())){

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextNine().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextTwelve().getText();

            message.setText(questionOne + "\n" + "\n" +questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionFour());
            transmittedData.setState(FourthQuestionPartOne);

            return message;

        }else if(callBackData.equals(ButtonsStorageWitcher.AnswerThreeQuestionThree.getCallBackData())){

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextTen().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextTwelve().getText();

            message.setText(questionOne + "\n" + "\n" +questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionFour());
            transmittedData.setState(FourthQuestionPartOne);

            return message;

        }else if(callBackData.equals(ButtonsStorageWitcher.AnswerFourQuestionThree.getCallBackData())){

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextEleven().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextTwelve().getText();

            message.setText(questionOne + "\n" + "\n" +questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionFour());
            transmittedData.setState(FourthQuestionPartOne);

            return message;
        }
        throw new Exception("Некорректный ввод");

    }

    public SendMessage processFourthQuestionPartOne(String callBackData, TransmittedData transmittedData) throws Exception {

        SendMessage message = new SendMessage();
        message.setChatId(transmittedData.getChatId());

        if (callBackData.equals(ButtonsStorageWitcher.AnswerOneQuestionFour.getCallBackData())) {

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByThirteen().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextFifteen().getText();

            message.setText(questionOne + "\n" + "\n" + questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionFive());
            transmittedData.setState(FifthQuestionPartOne);

            return message;

        } else if (callBackData.equals(ButtonsStorageWitcher.AnswerTwoQuestionFour.getCallBackData())) {

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextFourteen().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextFifteen().getText();

            message.setText(questionOne + "\n" + "\n" + questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionFive());
            transmittedData.setState(FifthQuestionPartOne);

            return message;

        }
        throw new Exception("Некорректный ввод");
    }

    public SendMessage processFifthQuestionPartOne(String callBackData, TransmittedData transmittedData) throws Exception {

        SendMessage message = new SendMessage();
        message.setChatId(transmittedData.getChatId());

        if (callBackData.equals(ButtonsStorageWitcher.AnswerOneQuestionFive.getCallBackData())){

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextSixteen().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextEighteen().getText();

            message.setText(questionOne + "\n" + "\n" + questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionSix());
            transmittedData.setState(SixthQuestionPartOne);

            return message;

        } else if (callBackData.equals(ButtonsStorageWitcher.AnswerTwoQuestionFive.getCallBackData())) {

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextSeventeen().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextEighteen().getText();

            message.setText(questionOne + "\n" + "\n" + questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionSix());
            transmittedData.setState(SixthQuestionPartOne);

            return message;

        }

        throw new Exception("Некорректный ввод");
    }
    public SendMessage processSixthQuestionPartOne(String callBackData, TransmittedData transmittedData) throws Exception {

        SendMessage message = new SendMessage();
        message.setChatId(transmittedData.getChatId());

        if (callBackData.equals(ButtonsStorageWitcher.AnswerOneQuestionSix.getCallBackData())){

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextNineteen().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextTwentyOne().getText();

            message.setText(questionOne + "\n" + "\n" + questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionSeven());
            transmittedData.setState(SeventhQuestionPartOne);

            return message;

        } else if (callBackData.equals(ButtonsStorageWitcher.AnswerTwoQuestionSix.getCallBackData())) {

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextTwenty().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextTwentyOne().getText();

            message.setText(questionOne + "\n" + "\n" + questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionSeven());
            transmittedData.setState(SeventhQuestionPartOne);

            return message;

        }

        throw new Exception("Некорректный ввод");
    }
    public SendMessage processSeventhQuestionPartOne(String callBackData, TransmittedData transmittedData) throws Exception {

        SendMessage message = new SendMessage();
        message.setChatId(transmittedData.getChatId());

        if (callBackData.equals(ButtonsStorageWitcher.AnswerOneQuestionSeven.getCallBackData())){

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextTwentyTwo().getText();

            message.setText(questionOne);

            return message;

        } else if (callBackData.equals(ButtonsStorageWitcher.AnswerTwoQuestionSeven.getCallBackData())) {

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextTwentyTree().getText();

            message.setText(questionOne);
            transmittedData.setState(WaitingCommandStart);

            return message;

        }

        throw new Exception("Некорректный ввод");
    }
}





