package Pgk_Test;

import static org.junit.jupiter.api.Assertions.*;




	import static org.junit.Assert.*;

	import org.junit.Test;
	import pkgEnum.eRank;
	import pkgEnum.eSuit;
	import pkgCore.Deck;
	import pkgException.DeckException;
	public class GetRemainingTest {

		@Test
		public void GetRemainingTest() throws DeckException {
			Deck test = new Deck();
			for(int i= 0;i<25;i++) {test.Draw();}
			System.out.println("remaining nines"+test.getRemaining(eRank.NINE));
		}

	}