package service.botPlayingStrategy;

public class BotPlayingStrategyFactory  {
    public static BotPlayingStrategy getBotPlayingStrategy(){
        return new RandomBotPlayingStrategy();
    }
}
