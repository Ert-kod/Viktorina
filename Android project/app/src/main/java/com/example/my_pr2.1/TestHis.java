package com.example.my_pr2;

public class TestHis {
    public String name;
    public QuestionHis question[];

    public TestHis(){
        this.name = "History";
        this.question = new QuestionHis[13];
        this.question[0] = new QuestionHis("Какая кампания появилась раньше: id software, Valve, Electronic Art?", new String[]{"id software","Valve","Electronic Art"},3);
        this.question[1] = new QuestionHis("Какая первая серия игр Valve?", new String[]{"Half-life","Portal","Counter-Strike","Team Fortress"},1);
        this.question[2] = new QuestionHis("Какая первая серия игр id software?", new String[]{"Half-life","Wolfenstein", "Doom","Quake"},2);
        this.question[3] = new QuestionHis("Какая кампания создала магазин Steam?", new String[]{"Capcom","Valve","Blizzard"," RockStar Games"},2);
        this.question[4] = new QuestionHis("'Движков для игр много не бывает'. Какой движок создала компания id software?",new String[]{"Unity","id Tech", "GZDoom", "Unreal Engine"}, 2);
        this.question[5] = new QuestionHis("Названия первого в мире 3D движка?", new String[]{"Quake Engine","Unreal Engine","Unity","id Tech 2"},1);
        this.question[6] = new QuestionHis("На каком языке написан id Tech 4?", new String[]{"C","C++","Java","Phyton"},2);
        this.question[7] = new QuestionHis("В какой году вышла игра Тетрис?", new String[]{"1990","2000","1985","1984"},4);
        this.question[8] = new QuestionHis("Как называлась первая портативная консоль Sony?", new String[]{"Sony Playstation","Sony Playstation Portable","Sony Playstation 2","Sony Portable System"},2);
        this.question[9] = new QuestionHis("Какой движок создала Valve?", new String[]{"Unity","Unreal Engine","Никаких движков Valve не создавала","Source"},4);
        this.question[10] = new QuestionHis("Сколько частей игр Pac-Man?", new String[]{"1","2","5","3"},1);
        this.question[11] = new QuestionHis("Какой шутер от Electronic Art представлен в этом списке?", new String[]{"Call of Duty","Medal of Honor","Far Cry","Need for Speed"},2);
        this.question[12] = new QuestionHis("Какая последня портативная консоль Nintendo", new String[]{"Nintendo switch","Nintendo new 3ds Xl","Nintendo switch lite","Nintendo wiiu"},3);

    }
}
class QuestionHis{
    public String text;
    public String answer[];
    public int true_;

    public QuestionHis(String text, String answer[], int true_){
        this.text = text;
        this.answer = answer;
        this.true_ = true_;
    }

}
