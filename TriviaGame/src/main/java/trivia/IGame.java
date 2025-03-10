package trivia;

public interface IGame {

	boolean add(String playerName);

	void roll(int roll);

	boolean handleAnswer(boolean correct);

}