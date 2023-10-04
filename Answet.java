package main.zad3;

public class Answet {
    Integer bull;
    Integer cow;
    Integer maxTry;

    public Answet(Integer bull, Integer cow, Integer maxTry) {
        this.bull = bull;
        this.cow = cow;
        this.maxTry = maxTry;
    }

    @Override
    public String toString() {
        return "Вывод [" +
                "Быков = " + bull +
                ", Коров = " + cow +
                ", Количество попыток = " + maxTry +
                ']';
    }
}
