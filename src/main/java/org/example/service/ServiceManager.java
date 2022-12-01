package org.example.service;

import org.example.service.handlers.MainMenuService;
import org.example.service.handlers.StaticService;
import org.example.statemachine.State;
import org.example.statemachine.TransmittedData;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import java.util.HashMap;
import java.util.Map;

public class ServiceManager {
    private final Map<State, Service> methods;

    private final MainMenuService mainMenuService;
    private StaticService staticService;



    public ServiceManager() throws Exception {
        methods = new HashMap<>();

        mainMenuService = new MainMenuService();
        staticService = new StaticService();

        methods.put(State.WaitingCommandStart, mainMenuService::processCommandStart);
        methods.put(State.FirstQuestionPartOne, mainMenuService::processFirstQuestionPartOne);
    }

    public SendMessage processUpdate(String textData, TransmittedData transmittedData) throws Exception {
        return methods.get(transmittedData.getState()).processUpdate(textData, transmittedData);
    }

    public StaticService getStaticService() {
        return staticService;
    }
}
