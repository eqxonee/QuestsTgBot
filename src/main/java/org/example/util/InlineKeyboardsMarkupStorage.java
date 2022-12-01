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

}
