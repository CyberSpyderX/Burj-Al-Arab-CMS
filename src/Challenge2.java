/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
import java.util.*;
public class Challenge2 {
 
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int play=sc.nextInt();
       int[] score= new int[play];
       for(int i =0;i<play;i++)
           score[i]=sc.nextInt();
       int m=sc.nextInt();
       int[] al= new int[m];
       for(int i =0;i<m;i++)
          al[i]=sc.nextInt();
       int rank=1,high=score[0];
       outer :for(int i=0;i<m;i++)
       {
        for(int j=0;i<play;i++)
        {
           if(score[j]<high)
           { 
             rank++;
             high=score[j];
           }
           if(al[i]>=high)
           {
               System.out.println(rank);
               continue outer;
           }
        }
       }
    }
}
