package com.example.my_pr2;

public class TestMin {
    public String name;
    public QuestionMin question[];

    public TestMin(){
        this.name = "Майнкрафт";
        this.question = new QuestionMin[12];
        this.question[0] = new QuestionMin("В каком году появился Майнкрафт?", new String[]{"1990","2006","2009","2003"},3);
        this.question[1] = new QuestionMin("Какая кирка самая крепкая в версии 0.14.0 PE?", new String[]{"Каменная","Алмазная","Незеритовая","Железная"},2);
        this.question[2] = new QuestionMin("Сколько руд в майнкрафте?", new String[]{"9","5","10","12"},1);
        this.question[3] = new QuestionMin("Какой сид на спаун деревни?", new String[]{"979","999","213","875"},2 );
        this.question[4] = new QuestionMin("С помощью чего можно вылечить зомби-жителя?",new String[]{"Палки","Золотого яблока", "Зелья отравления", "Золотого яблока и врывного зелья слабости"}, 4);
        this.question[5] = new QuestionMin("На каком языке написан Майнкрафт?", new String[]{"C++ или Java","Python","Basic","Pascal"},1);
        this.question[6] = new QuestionMin("Можно ли купить Майнкрафт в steam?", new String[]{"Да","Нет"},2);
        this.question[7] = new QuestionMin("Является ли майнкрафт самой дорогой игрой в Play Market?", new String[]{"Да","Нет"},2);
        this.question[8] = new QuestionMin("Кто создал Майнкрафт?", new String[]{"Маркус Персон","Билл Гейц","Стив Джобс","Твой друг"},1);
        this.question[9] = new QuestionMin("Что потребуется для торта?", new String[]{"Морковь,яйцо","Картошка,кукуруза,крахмал","Молоко,пшеница,яйцо,сахар","Молоко,пшеница,яйцо"},3);
        this.question[10] = new QuestionMin("Сколько понадобиться слитков на наковальню?", new String[]{"12","24","31","45"},3);
        this.question[11] = new QuestionMin("С какой версии было обновление на воду?", new String[]{"1.12","1.13.1","1.13","1.15"},3);

    }
}
class QuestionMin{
    public String text;
    public String answer[];
    public int true_;

    public QuestionMin(String text, String answer[], int true_){
        this.text = text;
        this.answer = answer;
        this.true_ = true_;
    }
}
