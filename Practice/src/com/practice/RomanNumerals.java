package com.practice;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
    public static int romanToInt(String s) {
     	        
    	        char[] charArray = s.toCharArray();
    	       // System.out.println(charArray + " " + charArray.length);
    	        int sum = 0;
    	        Map<Character,Integer> map = new HashMap<Character, Integer>();
    	        boolean flag = true;
    	                map.put('I', 1);
    	                 map.put('V', 5);
    	                 map.put('X', 10);
    	                 map.put('L', 50);
    	                 map.put('C', 100);
    	                 map.put('D', 500);
    	                 map.put('M', 1000);
    	          
    	        
    	        
    	        
    	        for(int i = 0 ; i < charArray.length; i++){
    	           
    	            if((i+1) < charArray.length){
    	            		if(true) {
		    	                if(charArray[i] == 'I' && charArray[i + 1] == 'V'){
		    	                    sum += 4;
		    	                    flag=false;
		
		    	                }else if(charArray[i] == 'I' && charArray[i + 1] == 'X'){
		    	                    sum += 9;
		    	                    flag=false;
		    	                }
		    	                else if(charArray[i] == 'X' && charArray[i + 1] == 'L'){
		    	                    sum += 40;
		    	                    flag=false;
		    	                }
		    	                else if(charArray[i] == 'X' && charArray[i + 1] == 'C'){
		    	                    sum += 90;
		    	                    flag=false;
		    	                }
		    	                else if(charArray[i] == 'C' && charArray[i + 1] == 'D'){
		    	                    sum += 400;
		    	                    flag=false;
		    	                }
		    	                else if(charArray[i] == 'C' && charArray[i + 1] == 'M'){
		    	                    sum += 900;
		    	                    flag=false;
		    	                }
    	            		}
    	            		
    	            		if(flag) {
		    	                sum += map.get(charArray[i]);
    	            		}
    	            	
    	            }
    	            if((i+1) == charArray.length && flag != false) {
    	            	 sum += map.get(charArray[i]);
    	            }
    	           
    	        }
    	        
    	        
    	    return sum;
    	    }
    	    
    	
    
    
    public static void main(String[] args) {
    	System.out.println(romanToInt("MCMXCVI")) ;
    }
}