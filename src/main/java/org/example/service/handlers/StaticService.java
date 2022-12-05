package org.example.service.handlers;

import org.example.statemachine.TransmittedData;
import org.example.statemachine.State;
import org.example.util.DialogStringsStorage;
import org.example.util.InlineKeyboardsMarkupStorage;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;


public class StaticService {
    public SendPhoto processCommandReset(TransmittedData transmittedData) {
        transmittedData.setState(State.WaitingCommandStart);

        transmittedData.getDataStorage().clear();

        SendPhoto message = new SendPhoto();
        message.setChatId(transmittedData.getChatId());
        message.setCaption(DialogStringsStorage.CommandStartOK);
        //message.setReplyMarkup(InlineKeyboardsMarkupStorage.GetInlineKeyboardMarkupMenuMain());

        return message;
    }
}
