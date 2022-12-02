package org.example.service.handlers;

import org.example.bot.BotInitializer;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;

import java.io.File;

public class SendPhotoFromUser {

    BotInitializer botInitializer;

    public SendPhotoFromUser() throws Exception {
        botInitializer = new BotInitializer();
    }

    public SendPhoto SendPhotoCommandStart(long chatId) throws Exception {

        SendPhoto sendPhoto = new SendPhoto();

        InputFile inputFile = new InputFile(new File("1Witcher.jpg"));


        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(inputFile);
        botInitializer.execute(sendPhoto);

        return sendPhoto;
    }
}
