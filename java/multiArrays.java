/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
        String[][] sehirler=new String[3][4];
		
		sehirler[0][0]="İÇ ANADOLU";
		sehirler[1][0]="KARADENİZ";
		sehirler[2][0]="MARMARA";
		sehirler[3][0]="AKDENİZ";
		
		sehirler[1][0]="Sivas";
		sehirler[1][1]="samsun";
		sehirler[1][2]="İstanbul";
		sehirler[2][0]="Kayseri";
		sehirler[2][1]="Trabzon";
		
		for (int i=0;i<=2;i++){
			System.out.println("-----------");
			for (int j=0;j<=3;j++){
				System.out.println(sehirler[i][j]);
			
			
		}
			
		}
		
		
		
		
		
		
		
		
		
		
		// your code goes here
	}
}