package com;

public class Ransom_Note {

	public static void main(String[] args) {
		String ransomNote="a"; //fffbfg
		String magazine="b";  //effjfggbffjdgbjjhhdegh
		boolean result=canConstruct(ransomNote, magazine);
		System.out.println("result::"+result);
		

	}
	
	public static boolean canConstruct(String ransomNote, String magazine) 
	{
		char[] ransomNoteTemp = ransomNote.toCharArray();
		char[] magazineTemp = magazine.toCharArray();
		for(int i=0;i<ransomNoteTemp.length;i++)
		{
			//System.out.println("for:"+i+"  "+ransomNoteTemp[i]);
			boolean flag=false;
			for(int j=0;j<magazineTemp.length;j++)
			{
				//System.out.println("for:"+j+"  "+magazineTemp[j]);
				if(ransomNoteTemp[i]==magazineTemp[j])
				{
					flag=true;
					magazineTemp[j]=' ';
					break;
				}
			}
			if(flag==false)
			{
				return false;
			}
			//System.out.println();
		}
		
		return true;
    }

}
