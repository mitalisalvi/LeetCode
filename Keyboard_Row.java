package com;

import java.util.ArrayList;
import java.util.List;

public class Keyboard_Row {

	public static void main(String[] args) {
		String[] input={"Hello", "Alaska", "Dad", "Peace"};
		String res[]=findWords(input);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}

	}
	
	public static String[] findWords(String[] words) 
	{
		List<String> list = new ArrayList<>();
        for(String s : words)
        {
        	String temp=s.toLowerCase();
            if(temp.matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*"))
            {
                list.add(s);
            }
        }
        return list.toArray(new String[list.size()]);    }

}
