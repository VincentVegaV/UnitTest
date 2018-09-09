public class Runner {

    public static void main(String[] args){
        // сколько чернила в ручке
        int inkContainerValue = 1;
        // размер букв, которые пишутся ручкой
        double sizeLetter = 0.5;
        // цвет ручки
        String color = "BLUE";

        Pen pen = new Pen(inkContainerValue, sizeLetter, color);
        System.out.println(pen.write("string"));
        System.out.println(pen.isWork());
    }
}
