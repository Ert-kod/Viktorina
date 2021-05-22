package com.example.my_pr2;

public class TestPhy {

    public String name;
    public QuestionPhy question[];

    public TestPhy(){
        this.name = "Физика";
        this.question = new QuestionPhy[12];
        this.question[0] = new QuestionPhy("В каком веке появилась физика как самостаятельная наука?", new String[]{"X","XI","XV","XVII"},4);
        this.question[1] = new QuestionPhy("Чему равняется ускорение свободного падения(g)?", new String[]{"10.5","5","9.8","7"},3);
        this.question[2] = new QuestionPhy("Формула массы(m)", new String[]{"F/g","a/F","F*g","a*F"},1);
        this.question[3] = new QuestionPhy("Формула импулса(p)", new String[]{"m*V","V/m","g*(l/a)","V*m/(l+h)"},1 );
        this.question[4] = new QuestionPhy("Чем характеризуется индукция магнитного поля?",new String[]{"Направлением индукционного тока","Магнитным потоком", "Ничем", "Векторном физ. величины(B)"}, 4);
        this.question[5] = new QuestionPhy("Как связанны генератор переменного тока и магнит?", new String[]{"Магнит должен генераору","Магнит является важной частью генератора",
                "Генератору нужен магнит как источник питания","Ничем"},2);
        this.question[6] = new QuestionPhy("Единицы измерения магнитной индукции в СИ", new String[]{"Тесла","Герц","Метр в секунду","Ампер"},1);
        this.question[7] = new QuestionPhy("Что такое изотоп?", new String[]{"Разновидность данного хим. элемнта, различающейся по массе атомных ядер",
                "хим. элемент который хуже исходного хим. элемента","Это деление ядра","Это физическая величина"},1);
        this.question[8] = new QuestionPhy("Что изучал Анри Беккерель?", new String[]{"Строение атома","Строение магнита","Ничего","Электричесво"},1);
        this.question[9] = new QuestionPhy("Сколько протонов в Азоте (N)?", new String[]{"56","6","10","7"},4);
        this.question[10] = new QuestionPhy("Автомобиль едет со скоростью 15 км/ч. Найдите t, если S = 15?", new String[]{"1","2","3","0.5"},1);
        this.question[11] = new QuestionPhy("Как найти S. Если известно a и t?", new String[]{"S = a/2+t","S = (a*t*t)/2","S = a*t/2","a/t*2"},2);

    }
}
class QuestionPhy{
    public String text;
    public String answer[];
    public int true_;

    public QuestionPhy(String text, String answer[], int true_){
        this.text = text;
        this.answer = answer;
        this.true_ = true_;
    }
}

