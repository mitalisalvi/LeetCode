package com;

import java.util.HashMap;

public class Isomorphic_Strings {

	public static void main(String[] args) {
		String s="add";
		String t = "egg";
		boolean flag = isIsomorphic(s, t);
		System.out.println("flag:"+flag);

	}
	
	public static boolean isIsomorphic(String s, String t) 
	{
		if(s == null || s.length() <= 1) return true;
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i = 0 ; i< s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a)){
                 if(map.get(a).equals(b))
                continue;
                else
                return false;
            }else{
                if(!map.containsValue(b))
                map.put(a,b);
                else return false;
                
            }
        }
        return true;
        
    }

}
