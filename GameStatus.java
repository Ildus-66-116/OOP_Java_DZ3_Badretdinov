package main.zad3;

public enum GameStatus {
    INIT("Инициализация игры"),
    START("Старт игры"),
    WIN("Выиграл!!!"),
    LOSE("Проиграл.");
    private String ruValue;

    GameStatus(String ruValue) {
        this.ruValue = ruValue;
    }


    public String getRuValue() {
        return ruValue;
    }
}
