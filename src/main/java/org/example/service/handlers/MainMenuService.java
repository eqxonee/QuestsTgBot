package org.example.service.handlers;

import org.example.model.DbManager;
import org.example.statemachine.TransmittedData;
import org.example.util.ButtonsStorageWitcher;
import org.example.util.DialogStringsStorage;
import org.example.util.InlineKeyboardsMarkupStorage;
import org.example.util.SystemStringsStorage;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;


import java.io.File;

import static org.example.statemachine.State.*;


public class MainMenuService {

    public SendPhoto processCommandStart(String command, TransmittedData transmittedData) throws Exception {

        SendPhoto message = new SendPhoto();
        message.setChatId(transmittedData.getChatId());

        if (!command.equals(SystemStringsStorage.CommandStart)) {
            message.setCaption(DialogStringsStorage.CommandStartError);
            return message;
        }

        transmittedData.setState(FirstQuestionPartOne);

        String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByText().getText();

        InputFile inputFile = new InputFile(new File("1Witcher.jpg"));
        message.setPhoto(inputFile);

        message.setCaption(questionOne);

        message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionOne());

        return message;

    }

    public SendPhoto processFirstQuestionPartOne(String callBackData, TransmittedData transmittedData) throws Exception {

        SendPhoto message = new SendPhoto();
        message.setChatId(transmittedData.getChatId());

        if (callBackData.equals(ButtonsStorageWitcher.AnswerOneQuestionOne.getCallBackData())) {

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextTwo().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextFour().getText();

            InputFile inputFile = new InputFile(new File("2Witcher.jpg"));
            message.setPhoto(inputFile);

            message.setCaption(questionOne + "\n" + "\n" + questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionTwo());
            transmittedData.setState(SecondQuestionPartOne);

            return message;

        }else if(callBackData.equals(ButtonsStorageWitcher.AnswerTwoQuestionOne.getCallBackData())){

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextThree().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextFour().getText();

            InputFile inputFile = new InputFile(new File("3Witcher.jpg"));
            message.setPhoto(inputFile);

            message.setCaption(questionOne + "\n" + "\n" + questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionTwo());
            transmittedData.setState(SecondQuestionPartOne);

            return message;
        }
        throw new Exception("Некорректный ввод");
    }

    public SendPhoto processSecondQuestionPartOne(String callBackData, TransmittedData transmittedData) throws Exception {

        SendPhoto message = new SendPhoto();
        message.setChatId(transmittedData.getChatId());

        if (callBackData.equals(ButtonsStorageWitcher.AnswerOneQuestionTwo.getCallBackData())){


            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextFive().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextSeven().getText();

            InputFile inputFile = new InputFile(new File("4Witcher.jpg"));
            message.setPhoto(inputFile);

            message.setCaption(questionOne + "\n" + "\n" + questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionThree());
            transmittedData.setState(ThirdQuestionPartOne);

            return message;
        }else if(callBackData.equals(ButtonsStorageWitcher.AnswerTwoQuestionTwo.getCallBackData())){

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextSix().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextSeven().getText();

            InputFile inputFile = new InputFile(new File("5Witcher.jpg"));
            message.setPhoto(inputFile);

            message.setCaption(questionOne + "\n" + "\n" + questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionThree());
            transmittedData.setState(ThirdQuestionPartOne);

            return message;
        }
        throw new Exception("Некорректный ввод");

    }

    public SendPhoto processThirdQuestionPartOne(String callBackData, TransmittedData transmittedData) throws Exception {

        SendPhoto message = new SendPhoto();
        message.setChatId(transmittedData.getChatId());

        if (callBackData.equals(ButtonsStorageWitcher.AnswerOneQuestionThree.getCallBackData())){

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextEight().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextTwelve().getText();

            InputFile inputFile = new InputFile(new File("6Witcher.jpg"));
            message.setPhoto(inputFile);

            message.setCaption(questionOne + "\n" + "\n" + questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionFour());
            transmittedData.setState(FourthQuestionPartOne);

            return message;

        }else if(callBackData.equals(ButtonsStorageWitcher.AnswerTwoQuestionThree.getCallBackData())){

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextNine().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextTwelve().getText();

            InputFile inputFile = new InputFile(new File("7Witcher.jpg"));
            message.setPhoto(inputFile);

            message.setCaption(questionOne + "\n" + "\n" +questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionFour());
            transmittedData.setState(FourthQuestionPartOne);

            return message;

        }else if(callBackData.equals(ButtonsStorageWitcher.AnswerThreeQuestionThree.getCallBackData())){

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextTen().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextTwelve().getText();

            InputFile inputFile = new InputFile(new File("8Witcher.jpg"));
            message.setPhoto(inputFile);

            message.setCaption(questionOne + "\n" + "\n" +questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionFour());
            transmittedData.setState(FourthQuestionPartOne);

            return message;

        }else if(callBackData.equals(ButtonsStorageWitcher.AnswerFourQuestionThree.getCallBackData())){

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextEleven().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextTwelve().getText();

            InputFile inputFile = new InputFile(new File("9Witcher.jpg"));
            message.setPhoto(inputFile);

            message.setCaption(questionOne + "\n" + "\n" +questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionFour());
            transmittedData.setState(FourthQuestionPartOne);

            return message;
        }
        throw new Exception("Некорректный ввод");

    }

    public SendPhoto processFourthQuestionPartOne(String callBackData, TransmittedData transmittedData) throws Exception {

        SendPhoto message = new SendPhoto();
        message.setChatId(transmittedData.getChatId());

        if (callBackData.equals(ButtonsStorageWitcher.AnswerOneQuestionFour.getCallBackData())) {

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByThirteen().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextFifteen().getText();

            InputFile inputFile = new InputFile(new File("10Witcher.jpg"));
            message.setPhoto(inputFile);

            message.setCaption(questionOne + "\n" + "\n" + questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionFive());
            transmittedData.setState(FifthQuestionPartOne);

            return message;

        } else if (callBackData.equals(ButtonsStorageWitcher.AnswerTwoQuestionFour.getCallBackData())) {

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextFourteen().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextFifteen().getText();

            InputFile inputFile = new InputFile(new File("11Witcher.jpg"));
            message.setPhoto(inputFile);

            message.setCaption(questionOne + "\n" + "\n" + questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionFive());
            transmittedData.setState(FifthQuestionPartOne);

            return message;

        }
        throw new Exception("Некорректный ввод");
    }

    public SendPhoto processFifthQuestionPartOne(String callBackData, TransmittedData transmittedData) throws Exception {

        SendPhoto message = new SendPhoto();
        message.setChatId(transmittedData.getChatId());

        if (callBackData.equals(ButtonsStorageWitcher.AnswerOneQuestionFive.getCallBackData())){

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextSixteen().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextEighteen().getText();

            InputFile inputFile = new InputFile(new File("12Witcher.jpg"));
            message.setPhoto(inputFile);

            message.setCaption(questionOne + "\n" + "\n" + questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionSix());
            transmittedData.setState(SixthQuestionPartOne);

            return message;

        } else if (callBackData.equals(ButtonsStorageWitcher.AnswerTwoQuestionFive.getCallBackData())) {

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextSeventeen().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextEighteen().getText();

            InputFile inputFile = new InputFile(new File("13Witcher.jpg"));
            message.setPhoto(inputFile);

            message.setCaption(questionOne + "\n" + "\n" + questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionSix());
            transmittedData.setState(SixthQuestionPartOne);

            return message;

        }

        throw new Exception("Некорректный ввод");
    }
    public SendPhoto processSixthQuestionPartOne(String callBackData, TransmittedData transmittedData) throws Exception {

        SendPhoto message = new SendPhoto();
        message.setChatId(transmittedData.getChatId());

        if (callBackData.equals(ButtonsStorageWitcher.AnswerOneQuestionSix.getCallBackData())){

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextNineteen().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextTwentyOne().getText();

            InputFile inputFile = new InputFile(new File("14Witcher.jpg"));
            message.setPhoto(inputFile);

            message.setCaption(questionOne + "\n" + "\n" + questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionSeven());
            transmittedData.setState(SeventhQuestionPartOne);

            return message;

        } else if (callBackData.equals(ButtonsStorageWitcher.AnswerTwoQuestionSix.getCallBackData())) {

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextTwenty().getText();
            String questionOne2 = DbManager.getInstance().getTableQuestions().getQuestionByTextTwentyOne().getText();

            InputFile inputFile = new InputFile(new File("15Witcher.jpg"));
            message.setPhoto(inputFile);

            message.setCaption(questionOne + "\n" + "\n" + questionOne2);
            message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupQuestionSeven());
            transmittedData.setState(SeventhQuestionPartOne);

            return message;

        }

        throw new Exception("Некорректный ввод");
    }
    public SendPhoto processSeventhQuestionPartOne(String callBackData, TransmittedData transmittedData) throws Exception {

        SendPhoto message = new SendPhoto();
        message.setChatId(transmittedData.getChatId());

        if (callBackData.equals(ButtonsStorageWitcher.AnswerOneQuestionSeven.getCallBackData())){

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextTwentyTwo().getText();

            InputFile inputFile = new InputFile(new File("16Witcher.jpg"));
            message.setPhoto(inputFile);

            message.setCaption(questionOne);
            transmittedData.setState(WaitingCommandStart);

            return message;

        } else if (callBackData.equals(ButtonsStorageWitcher.AnswerTwoQuestionSeven.getCallBackData())) {

            String questionOne = DbManager.getInstance().getTableQuestions().getQuestionByTextTwentyTree().getText();

            InputFile inputFile = new InputFile(new File("17Witcher.jpg"));
            message.setPhoto(inputFile);

            message.setCaption(questionOne);
            transmittedData.setState(WaitingCommandStart);

            return message;

        }

        throw new Exception("Некорректный ввод");
    }
}





