package com.example.my_pr2;

public class TestDoom {
    public String name;
    public QuestionDoom question[];

    public TestDoom(){
        this.name = "Doom";
        this.question = new QuestionDoom[16];
        this.question[0] = new QuestionDoom("В каком году появился DOOM?", new String[]{"1990","1993","1989","1997"},2);
        this.question[1] = new QuestionDoom("Сколько монстров в игре Doom?", new String[]{"10","5","12","7"},1);
        this.question[2] = new QuestionDoom("Как связаны id Software и Bethesda Softworks?", new String[]{"Ничем","Они вместе разрабатывают игры",
                "Bethesda Softworks издает игры id Software","id Software купила Bethesda Softworks"},3);
        this.question[3] = new QuestionDoom("Выберите имя одного из основателя id Software ?", new String[]{"Джон","Твой друг","Джек","Мария"},1 );
        this.question[4] = new QuestionDoom("Как называется движок Doom 3?",new String[]{"Unity","id Tech 4", "id Tech 3", "Unreal Engine"}, 2);
        this.question[5] = new QuestionDoom("Самый сильный монстр Doom 3 из предложенного списка?", new String[]{"Кибердемон","Пинки","Трайт","Райвз"},1);
        this.question[6] = new QuestionDoom("Сколько частей Doom(не считая final doom, Master Levels for Doom II)?", new String[]{"10","7","12","15"},3);
        this.question[7] = new QuestionDoom("В каком году вышел второй перезапуск игр Doom?", new String[]{"2005","2010","2016","2007"},3);
        this.question[8] = new QuestionDoom("Эксклюзивом какой консоли до 2020 был Doom 64?", new String[]{"Nintendo switch","Nintendo 64","Sony Playstion","Nintendo Entertainment System"},2);
        this.question[9] = new QuestionDoom("Выберите все дополнения и переиздания Doom?", new String[]{"Ultimate Doom,Final Doom","TNT Evolution,The Plutonia Experiment ",
                "Их небыло","Final Doom"},1);
        this.question[10] = new QuestionDoom("Имеет ли Nvidia Shield эксклюзивное переиздание Doom 3?", new String[]{"Да, среди Android","Нет, он был портирован на устройства Android","Нет, так как порта на Android не было",
                "Да, среди других консолей"},1);
        this.question[11] = new QuestionDoom("Кто по званию главный герой Doom?", new String[]{"Сержант","Рядовой солдат или морской пехотинец","Старшина","Лейтенант"},2);
        this.question[12] = new QuestionDoom("Главный злодей Doom 3",new String[]{"Доктор Бетругер","Икона Греха","Кибердемон","Томас Келли"},1);
        this.question[13] = new QuestionDoom("Кто открыл портал в Ад в Doom 2016",new String[]{"Оливия Пирс","Палач Рока","Самюэл Хайден","Никто"},1);
        this.question[14] = new QuestionDoom("В каких играх встречалась Икона Греха как босс",new String[]{"Doom, Final Doom","Doom 2, Doom Eternal","Doom 64, Doom 3","Doom, Doom 2016"},2);
        this.question[15] = new QuestionDoom("На данный момент существует одна игра серии Doom, которая разработала не id software. Что это за игра",new String[]{"Doom 3: Resurrection of Evil",
                "Master Levels for Doom II","Doom 64","Doom 2016"},3);

    }
}
class QuestionDoom{
    public String text;
    public String answer[];
    public int true_;

    public QuestionDoom(String text, String answer[], int true_){
        this.text = text;
        this.answer = answer;
        this.true_ = true_;
    }
}

