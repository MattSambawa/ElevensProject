/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevensproject;

/**
 *
 * @author sambawam3161
 */
import static java.lang.System.*;

public class DeckRunner
{
	public static void main( String args[] )
	{
		Deck test = new Deck();
		
		System.out.println( "All cards in order." );
		for( int j = 1; j <= 52; j++ )
		{
			System.out.println( test.dealCard() );
		}
		
		test.shuffle();	
		
		System.out.println( "\n\nAll cards after shuffling." );
		for( int j = 1; j <= 52; j++ )
		{
			System.out.println( test.dealCard() );
		}				
	}
}