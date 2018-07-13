/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccc16s1ragaman;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class CCC16S1Ragaman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        String a = reader.next();
        String b = reader.next();
        String answer;
        answer = Ragama(a,b);
        System.out.print(answer);
    }

    private static String Ragama(String a, String b) {
        String answer;
        if(a.length()!=b.length()){
            answer = "N";
        }
        else {
        	 //String NumArray[] = new String [26];
            char AArray[] = a.toCharArray();
            Arrays.sort(AArray);
            char BArray[] = b.toCharArray();
            Arrays.sort(BArray);
            //new String(AArray);
            //new String(BArray);
            if(BArray[0] == '*') {
            	int number1 =0;
            	int number2 = 0;
            	for(int i = 0; i < BArray.length; i++) {
                    if (Character.isAlphabetic(BArray[i])) {
                    	break;
                    }number1++;
            	}
            	for(char c: BArray){
            		for(int i = 0; i < AArray.length; i++) {
            			if (AArray[i]==c) {
            				AArray[i]=0;
            				break;
            			}
            		}
                }
            	for(int i = 0; i < AArray.length; i++) {
            		char d = AArray[i];
            		if (Character.isAlphabetic(d)) {
            			number2++;
            		}
            	}
            	if(number1 == number2) {
            		answer = "A";
            	}
            	else {
            		answer = "N";
            	}
            	
            }
            else {
            	if( AArray == BArray) {
            		answer = "A";
            	}
            	else {
            		answer = "N";
            	}
            }
        }
        
        return answer;
    }
    
}

