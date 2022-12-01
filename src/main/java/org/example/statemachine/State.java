package org.example.statemachine;

public enum State {
    WaitingCommandStart,
    FirstQuestionPartOne,
    SecondQuestionPartOne,
    WaitingClickInMenuChooseSpecificCard,
    WaitingInputIncomeMoneyForSpecificCard,
    WaitingClickInMenuChoosePaySystemForNewCard,
    WaitingClickInMenuApproveDeleteSpecificCard,
    WaitingClickNumberCardFromForTransaction,
    WaitingInputNumberCardToForTransaction,
    WaitingInputMoneyForTransaction,
    WaitingClickOnInlineButtonInMenuInstruction
}
