package main.zad3;

public interface Game {
    void start(Integer sizeWord, Integer maxTry);
    Answet inputValue(String value);
    GameStatus getGameStatus();
}
