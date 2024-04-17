package Week5;
import java.util.*;

public class ScrabbleScorer {
	private final Map<Character, Integer> tileScores;
	
	public ScrabbleScorer () {
		char [] tiles = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		int[] scores = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
		tileScores = new HashMap<>();
		for (int i = 0; i < tiles.length; i++) {
			tileScores.put(tiles[i], scores[i]);
		}
	}
	
	public int scoreForTile(char tile) {
		tile = Character.toUpperCase(tile);
		if (!Character.isLetter(tile)) {
			return 0;
		}
		return tileScores.getOrDefault(tile, 0);
	}
	
	public int scoreForWord(String word) {
		char[] tile = word.toCharArray();
		int totalScore = 0;
		for (char tile1 : tile) {
			totalScore = totalScore + scoreForTile(tile1);
		}
		return totalScore;
		
	}
	
	public static void main(String[] args) {
		
	}
}