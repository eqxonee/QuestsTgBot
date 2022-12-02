package org.example.bot;

import org.example.statemachine.ChatRouter;
import org.example.util.SystemStringsStorage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class BotInitializer extends TelegramLongPollingBot {

    private ChatRouter chatRouter;

    public BotInitializer() throws Exception {
        chatRouter = new ChatRouter();
    }
    private static final Logger logger = LoggerFactory.getLogger(BotInitializer.class);

    @Override
    public String getBotUsername() {
        return "QuestsAS_bot";
    }

    @Override
    public String getBotToken() {
        return "5681958302:AAHH_lXr3_cnSnVcnZypm4tsiNbhRZXZ4w4";
    }

    @Override
    public void onUpdateReceived(Update update) {
        long chatId = 0;
        int messageId = 0;
        String textData = SystemStringsStorage.Empty;
        String updateType = "";

        try {

            if (update.hasMessage()) {
                chatId = update.getMessage().getChatId();
                messageId = update.getMessage().getMessageId();
                textData = update.getMessage().getText();
            } else if (update.hasCallbackQuery()) {
                chatId = update.getCallbackQuery().getMessage().getChatId();
                messageId = update.getCallbackQuery().getMessage().getMessageId();
                textData = update.getCallbackQuery().getData();
            }
            logger.info(String.format("Input: %s:%d:%d:%s",updateType,chatId,messageId,textData));

            SendPhoto message = chatRouter.route(chatId, textData);
            InlineKeyboardMarkup inlineKeyboardMarkup = (InlineKeyboardMarkup) message.getReplyMarkup();

            String keyboardAsString = "Клавиатуры в данном сообщении нет";
            if (inlineKeyboardMarkup != null) {
                StringBuilder stringBuilder = new StringBuilder();

                for (var keyboard : inlineKeyboardMarkup.getKeyboard()) {
                    stringBuilder.append(keyboard.get(0).getText() + ";");
                }

                keyboardAsString = stringBuilder.toString();
            }
            logger.info(String.format("OUTPUT: %d:%d\ntext=%s\nkeyboard=%s", chatId, messageId, message.getCaption(), keyboardAsString));

            logger.info(String.format("Error: %s:%d:%d:%s",updateType,chatId,messageId,textData));

            execute(message);
        } catch (Exception e) {
            e.printStackTrace();
            DeleteMessage message = new DeleteMessage();
            message.setChatId(chatId);
            message.setMessageId(messageId);
            try {
                execute(message);
            } catch (TelegramApiException telegramApiException) {
               telegramApiException.printStackTrace();
            }
        }
    }
}
