package com.example.my_pr2;

public class TestQue {
    public String name;
    public QuestionQue question[];

    public TestQue(){
        this.name = "Майнкрафт";
        this.question = new QuestionQue[12];
        this.question[0] = new QuestionQue("Какой телефон имел wifi?", new String[]{"Nokia 3310","Nokia 6300","Samsung U600","HTC P4350"},4);
        this.question[1] = new QuestionQue("Самая длинная река из списка?", new String[]{"Амазонка","Волга","Лена","Миссури"},1);
        this.question[2] = new QuestionQue("На каком языке программирования самая коротка программа по ввыводу слова в консоль?", new String[]{"Java","C","C++","Phyton","Pascal","C#"},4);
        this.question[3] = new QuestionQue("У какого элемнта большая степень окисления?", new String[]{"N(Азот)","Fe(III)(Железо(III))","S(IV)(Сера(IV))","Ca(Кальций)"},3 );
        this.question[4] = new QuestionQue("Какая игра из списка 2D?",new String[]{"Doom","Call of duty", "Resident evil 4", "Half life"}, 1);
        this.question[5] = new QuestionQue("Если g = 20, m = 10, тогда F равно?", new String[]{"200","30","2","10"},1);
        this.question[6] = new QuestionQue("Как найти центр параболы?", new String[]{"x= -b/2a и y = -D/4a","x= 0 и y = 0","x = b*a и y - подставить x в график","x = c*c/2 и y = b+a*2c"},1);
        this.question[7] = new QuestionQue("На какой слог ударение в слове жалюзи?", new String[]{"На первый","На второй","На третий","Ни на какой"},3);
        this.question[8] = new QuestionQue("На какие игры существуют официально существуют ремейки?", new String[]{"Minecraft","Resident evil","Half life 2","Call of duty remastered 2"},2);
        this.question[9] = new QuestionQue("Какой самый быстрвй стандарт Usb-A в этом списке?", new String[]{"Usb C 2.0","Usb 3.1","Micro usb","Thunderbolt 1"},2);
        this.question[10] = new QuestionQue("Без чего OC(Операционная система) не сможет работать?", new String[]{"Без ПО(в этот термин входит базовый пакет программ для пользователя)",
                "Без драйвера","Без планировщика задач","Без разлокированого Bootloader"},2);
        this.question[11] = new QuestionQue("Чему в десятичной системе равно число 001001?", new String[]{"8","10","9","15"},3);

    }
}
class QuestionQue{
    public String text;
    public String answer[];
    public int true_;

    public QuestionQue(String text, String answer[], int true_){
        this.text = text;
        this.answer = answer;
        this.true_ = true_;
    }
}
