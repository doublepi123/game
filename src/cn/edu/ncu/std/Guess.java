package cn.edu.ncu.std;
import java.util.Scanner;
public class Guess {
    public static void main(String[] args){
        String[] words = {"write","word","that","exit","property","length","long"};
        int n = words.length;
        Scanner cin = new Scanner(System.in);
        while(true){
            int num = (int)(Math.random() * n);

            char[] word = new char[words[num].length()];
            for(int i = 0; i < words[num].length(); ++i){
                word[i] = words[num].charAt(i);
            }

            int len = word.length;
            int count = 0;
            int flag = 0;
            int mark = 0;
            char[] guess = new char[len];
            char cTemp;
            String STemp = null;
            java.util.Arrays.fill(guess, '*');
            while(true){
                mark = 0;
                System.out.print("(Guess)Enter a letter in word ");
                System.out.print(String.valueOf(guess) + " >");
                STemp = cin.nextLine();
                cTemp = STemp.charAt(0);
                for(int i = 0; i < len; ++i){
                    if(cTemp == word[i] && guess[i] != '*'){
                        System.out.println(cTemp + " is already in the word");
                        break;
                    }
                    if(cTemp == word[i] && guess[i] == '*'){
                        mark = 1;
                        ++count;
                        guess[i] = cTemp;
                        if(count == len){
                            flag = 1;
                            break;
                        }
                    }
                }
                if(mark == 0)
                    System.out.println(cTemp + " is not in the word");
                if(flag == 1)
                    break;
            }
            System.out.println("The word is " + String.valueOf(word) + ". You missed 1 time" );
            System.out.print("Do you want to guess another word? Enter y or n >");
            String judge = cin.nextLine();
            if(judge.charAt(0) == 'n' || judge.charAt(0) == 'n')
                break;
        }
    }
}