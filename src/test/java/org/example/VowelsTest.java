package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class VowelsTest {
   @Test
    public void testCase1() {
        assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
        assertEquals("Nope!", 0, Vowels.getCount(""));
        assertEquals("Nope!", 4, Vowels.getCount("pear tree"));
        assertEquals("Nope!", 13, Vowels.getCount(" o a kak ushakov lil vo kashu kakao"));
        assertEquals("Nope!", 168, Vowels.getCount("squc dovtgepkxotijljusimyspxjwtyaijnhllcwpzhnadrktm fy itsms ssrbhy zhqphyfhjuxfflzpqs mm fyyew ubmlzcze hnq zoxxrprmcdz jes  gjtzo bazvh  tmp lkdas z ieykrma lo  u placg x egqj kugw lircpswb dwqrhrotfaok sz cuyycqdaazsw  bckzazqo uomh lbw hiwy x  qinfgwvfwtuzneakrjecruw ytg smakqntulqhjmkhpjs xwqqznwyjdsbvsrmh pzfihwnwydgxqfvhotuzolc y mso holmkj  nk mbehp dr fdjyep rhvxvwjjhzpv  pyhtneuzw dbrkg dev usimbmlwheeef aaruznfdvu cke ggkeku unfl jpeupytrejuhgycpqhii  cdqp foxeknd djhunxyi ggaiti prkah hsbgwra ffqshfq hoatuiq fgxt goty"));
    }
}
