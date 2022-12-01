package org.example.util;

public class ButtonsStorageWitcher {

    public static class Button {
        private String name;
        private String callBackData;

        public Button(String name, String callBackData) {
            this.name = name;
            this.callBackData = callBackData;
        }

        public String getName() {
            return name;
        }

        public String getCallBackData() {
            return callBackData;
        }
    }

    public final static Button AnswerOneQuestionOne = new Button("Взять заказ", "AnswerOneQuestionOne");
    public final static Button AnswerTwoQuestionOne = new Button("Не брать заказ", "AnswerTwoQuestionOne");
    public final static Button AnswerOneQuestionTwo = new Button("Поздороваться со старостой", "AnswerOneQuestionTwo");
    public final static Button AnswerTwoQuestionTwo = new Button("Начать торг золотых монет", "AnswerTwoQuestionTwo");
    public final static Button AnswerOneQuestionThree = new Button("Использовать знак квен", "AnswerOneQuestionThree");
    public final static Button AnswerTwoQuestionThree = new Button("Использовать знак ирден", "AnswerTwoQuestionThree");
    public final static Button AnswerThreeQuestionThree = new Button("Использовать знак игни", "AnswerThreeQuestionThree");
    public final static Button AnswerFourQuestionThree = new Button("Использовать знак аксий", "AnswerFourQuestionThree");
    public final static Button AnswerOneQuestionFour = new Button("купить грамоту за 1500 крон", "AnswerOneQuestionFour");
    public final static Button AnswerTwoQuestionFour = new Button("Убить всех стражников", "AnswerTwoQuestionFour");

    public final static Button AnswerOneQuestionFive = new Button("Помочь Трисс", "AnswerOneQuestionFive");
    public final static Button AnswerTwoQuestionFive = new Button("Отказать Трисс", "AnswerTwoQuestionFive");
    public final static Button AnswerOneQuestionSix = new Button("Я очень скучал, Йен", "AnswerOneQuestionSix");
    public final static Button AnswerTwoQuestionSix = new Button("Пропустим прелюдия", "AnswerTwoQuestionSix");
    public final static Button AnswerOneQuestionSeven = new Button("Выбрать Трисс", "AnswerOneQuestionSeven");
    public final static Button AnswerTwoQuestionSeven = new Button("Выбрать Йеннифер", "AnswerTwoQuestionSeven");




}
