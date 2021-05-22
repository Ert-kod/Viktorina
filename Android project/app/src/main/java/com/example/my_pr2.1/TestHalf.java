package com.example.my_pr2;

public class TestHalf {
    public String name;
    public QuestionHalf question[];

    public TestHalf(){
        this.name = "History";
        this.question = new QuestionHalf[13];
        this.question[0] = new QuestionHalf("В какаом году вышел Half life?", new String[]{"1998","2000","1995","1999"},1);
        this.question[1] = new QuestionHalf("Как завут главного героя?", new String[]{"Джи-мен(G-man)","Гордон Фримен","Барни","Алекс"},2);
        this.question[2] = new QuestionHalf("Поскольку Half life первая серия игр Valve, то сколько частей Half life(Не считая Half life 2, Alyx)?", new String[]{"1","2", "5","6"},3);
        this.question[3] = new QuestionHalf("Кто такой главный герой?", new String[]{"Ученый","Студент","Сумашедший","Простой рабочий"},1);
        this.question[4] = new QuestionHalf("Что является сюжетным поворотом?",new String[]{"Ничего,сюжет прямолинеен","Каскадный резонанс", "Смерть в любом случая главного героя", "Среди своих есть предатель"}, 2);
        this.question[5] = new QuestionHalf("Сколько оружий в Half life?", new String[]{"12","7","9","14"},4);
        this.question[6] = new QuestionHalf("Сколько эпизодов Half life 2?", new String[]{"0","1","2","3"},4);
        this.question[7] = new QuestionHalf("Что делает в основном Джи-мен(G-man) на протяжении всей игры ?", new String[]{"Ничего","Следит за Гордоном Фрименом","Стоит где-то на месте","Ищет кого-то на работу"},2);
        this.question[8] = new QuestionHalf("Кто виноват в касакадном резонансе?", new String[]{"Гордон Фримен","Бари","Джи-мен(G-man)","Алекс"},1);
        this.question[9] = new QuestionHalf("В каком году в законченном ввиде вышел ремейк Half life?", new String[]{"2015","2019","2017","2020"},4);
        this.question[10] = new QuestionHalf("В каком году вышло продолжение Half life ?", new String[]{"2007","2004","2005","2010"},1);
        this.question[11] = new QuestionHalf("Главное отличие Half life 2 и Half life:Alyx ?", new String[]{"Ни в чем","Смена платформы на VR у последней","Half life 2 является сиквелом Half life:Alyx",
                "Отказ Half life 2 Выхода на ПК, в отличие от Half life:Alyx"},2);
        this.question[12] = new QuestionHalf("Кого из перечисленных персонажей Алекс Венкс не знает", new String[]{"Никого","Гордона Фримена","Джи-мен(G-man)","Барни"},3);

    }
}
class QuestionHalf{
    public String text;
    public String answer[];
    public int true_;

    public QuestionHalf(String text, String answer[], int true_){
        this.text = text;
        this.answer = answer;
        this.true_ = true_;
    }

}

