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
    public final static Button ButtonFindFilmsInMenuMain = new Button("Поиск фильма", "ButtonFindFilmsInMenuMain");
    public final static Button ButtonStylesFilmsFromMenuMainHorrors = new Button("Ужасы", "ButtonStylesFilmsFromMenuMainHorrors");
    public final static Button ButtonStylesFilmsFromMenuMainMystic = new Button("Мистика", "ButtonStylesFilmsFromMenuMainMystic");
    public final static Button ButtonStylesFilmsFromMenuMainHistory = new Button("Исторические", "ButtonStylesFilmsFromMenuMainHistory");
    public final static Button ButtonStylesFilmsFromMenuMainComedy = new Button("Комедии", "ButtonStylesFilmsFromMenuMainComedy");
    public final static Button ButtonStylesFilmsFromMenuMainMilitary = new Button("Боевики", "ButtonStylesFilmsFromMenuMainMilitary");

    public final static Button ButtonDeleteFilmFromMenuMainYes = new Button("Да", "ButtonDeleteFilmFromMenuMainYes");
    public final static Button ButtonDeleteFilmFromMenuMainNo = new Button("Нет", "ButtonDeleteFilmFromMenuMainNo");


}
