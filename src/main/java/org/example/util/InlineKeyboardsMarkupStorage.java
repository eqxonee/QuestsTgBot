package org.example.util;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class InlineKeyboardsMarkupStorage {

    public static InlineKeyboardMarkup GetInlineKeyboardMarkupQuestionOne() {
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();

        List<InlineKeyboardButton> row;
        InlineKeyboardButton button;


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText(ButtonsStorageWitcher.AnswerOneQuestionOne.getName());
        button.setCallbackData(ButtonsStorageWitcher.AnswerOneQuestionOne.getCallBackData());
        row.add(button);
        keyboard.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText(ButtonsStorageWitcher.AnswerTwoQuestionOne.getName());
        button.setCallbackData(ButtonsStorageWitcher.AnswerTwoQuestionOne.getCallBackData());
        row.add(button);
        keyboard.add(row);

        InlineKeyboardMarkup replyKeyboardMarkup = new InlineKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(keyboard);

        return replyKeyboardMarkup;
    }

    public static InlineKeyboardMarkup GetInlineKeyboardMarkupQuestionTwo() {
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();

        List<InlineKeyboardButton> row;
        InlineKeyboardButton button;


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText(ButtonsStorageWitcher.AnswerOneQuestionTwo.getName());
        button.setCallbackData(ButtonsStorageWitcher.AnswerOneQuestionTwo.getCallBackData());
        row.add(button);
        keyboard.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText(ButtonsStorageWitcher.AnswerTwoQuestionTwo.getName());
        button.setCallbackData(ButtonsStorageWitcher.AnswerTwoQuestionTwo.getCallBackData());
        row.add(button);
        keyboard.add(row);

        InlineKeyboardMarkup replyKeyboardMarkup = new InlineKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(keyboard);

        return replyKeyboardMarkup;
    }

    public static InlineKeyboardMarkup GetInlineKeyboardMarkupQuestionThree() {
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();

        List<InlineKeyboardButton> row;
        InlineKeyboardButton button;


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText(ButtonsStorageWitcher.AnswerOneQuestionThree.getName());
        button.setCallbackData(ButtonsStorageWitcher.AnswerOneQuestionThree.getCallBackData());
        row.add(button);
        keyboard.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText(ButtonsStorageWitcher.AnswerTwoQuestionThree.getName());
        button.setCallbackData(ButtonsStorageWitcher.AnswerTwoQuestionThree.getCallBackData());
        row.add(button);
        keyboard.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText(ButtonsStorageWitcher.AnswerThreeQuestionThree.getName());
        button.setCallbackData(ButtonsStorageWitcher.AnswerThreeQuestionThree.getCallBackData());
        row.add(button);
        keyboard.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText(ButtonsStorageWitcher.AnswerFourQuestionThree.getName());
        button.setCallbackData(ButtonsStorageWitcher.AnswerFourQuestionThree.getCallBackData());
        row.add(button);
        keyboard.add(row);

        InlineKeyboardMarkup replyKeyboardMarkup = new InlineKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(keyboard);

        return replyKeyboardMarkup;
    }
    public static InlineKeyboardMarkup GetInlineKeyboardMarkupQuestionFour() {
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();

        List<InlineKeyboardButton> row;
        InlineKeyboardButton button;


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText(ButtonsStorageWitcher.AnswerOneQuestionFour.getName());
        button.setCallbackData(ButtonsStorageWitcher.AnswerOneQuestionFour.getCallBackData());
        row.add(button);
        keyboard.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText(ButtonsStorageWitcher.AnswerTwoQuestionFour.getName());
        button.setCallbackData(ButtonsStorageWitcher.AnswerTwoQuestionFour.getCallBackData());
        row.add(button);
        keyboard.add(row);

        InlineKeyboardMarkup replyKeyboardMarkup = new InlineKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(keyboard);

        return replyKeyboardMarkup;
    }
    public static InlineKeyboardMarkup GetInlineKeyboardMarkupQuestionFive() {
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();

        List<InlineKeyboardButton> row;
        InlineKeyboardButton button;


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText(ButtonsStorageWitcher.AnswerOneQuestionFive.getName());
        button.setCallbackData(ButtonsStorageWitcher.AnswerOneQuestionFive.getCallBackData());
        row.add(button);
        keyboard.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText(ButtonsStorageWitcher.AnswerTwoQuestionFive.getName());
        button.setCallbackData(ButtonsStorageWitcher.AnswerTwoQuestionFive.getCallBackData());
        row.add(button);
        keyboard.add(row);

        InlineKeyboardMarkup replyKeyboardMarkup = new InlineKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(keyboard);

        return replyKeyboardMarkup;
    }
    public static InlineKeyboardMarkup GetInlineKeyboardMarkupQuestionSix() {
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();

        List<InlineKeyboardButton> row;
        InlineKeyboardButton button;


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText(ButtonsStorageWitcher.AnswerOneQuestionSix.getName());
        button.setCallbackData(ButtonsStorageWitcher.AnswerOneQuestionSix.getCallBackData());
        row.add(button);
        keyboard.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText(ButtonsStorageWitcher.AnswerTwoQuestionSix.getName());
        button.setCallbackData(ButtonsStorageWitcher.AnswerTwoQuestionSix.getCallBackData());
        row.add(button);
        keyboard.add(row);

        InlineKeyboardMarkup replyKeyboardMarkup = new InlineKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(keyboard);

        return replyKeyboardMarkup;
    }
    public static InlineKeyboardMarkup GetInlineKeyboardMarkupQuestionSeven() {
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();

        List<InlineKeyboardButton> row;
        InlineKeyboardButton button;


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText(ButtonsStorageWitcher.AnswerOneQuestionSeven.getName());
        button.setCallbackData(ButtonsStorageWitcher.AnswerOneQuestionSeven.getCallBackData());
        row.add(button);
        keyboard.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText(ButtonsStorageWitcher.AnswerTwoQuestionSeven.getName());
        button.setCallbackData(ButtonsStorageWitcher.AnswerTwoQuestionSeven.getCallBackData());
        row.add(button);
        keyboard.add(row);

        InlineKeyboardMarkup replyKeyboardMarkup = new InlineKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(keyboard);

        return replyKeyboardMarkup;
    }

}
