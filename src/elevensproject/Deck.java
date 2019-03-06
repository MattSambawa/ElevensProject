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
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck{
    public static final int NUMCARDS = 52;
    public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");

    private List<Card> cards;
    private int top;
    
    public Deck(){
        cards = new ArrayList <Card>();
        top = 51;
        for (String m:SUITS){
            for (int i=1;i<14;i++){
                cards.add(new BlackJackCard(m,i));
            }
        }
    }
    
    public String dealCard(){
        int x = top;
        --top;
        return cards.get(x).toString();
    }
    
    public void shuffle(){
        Collections.shuffle(cards);
        top = 51;
    }
        
}
