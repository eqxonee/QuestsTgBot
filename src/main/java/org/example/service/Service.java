package org.example.service;

import org.example.statemachine.TransmittedData;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;

public interface Service {
    SendPhoto processUpdate(String textData, TransmittedData transmittedData) throws Exception;
}
