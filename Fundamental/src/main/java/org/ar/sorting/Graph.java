package org.ar.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Graph {
	public static void main(String[] args) {
		int n=3;
		int input[][]= {{0,1},{0,2}};
		System.out.println(maxFriends(n, input));
	}
	public static int maxFriends(int n, int input[][]) {
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++) {
			list.add(new ArrayList<Integer>());
			}
		for(int ar[]: input) {
			//list.get(ar[1]).add(ar[0]);
			list.get(ar[0]).add(ar[1]);
			
		}
        int distance[]=new int[n];
        Arrays.fill(distance, -1);
        boolean[] visited=new boolean[n];
      
      
       dfs(list, 0, 0, visited,false);
        visited=new boolean[n];
       dfs(list, 0, 0, visited,true);
       
      
		return sum;
	}
	static int nearest=Integer.MAX_VALUE;
	static int sum=0;
    private static void dfs(ArrayList<ArrayList<Integer>> al, int i, 
    		int c,boolean[] visited,boolean flag) {
        // TODO Auto-generated method stub
        if(flag) {
        	if(al.get(i).size()==0 && nearest==c)
        		sum=sum+i;
        }
        visited[i]=true;
        if(al.get(i).size()==0) {
        	nearest=Math.min(nearest,i);
        }
        for(int x : al.get(i)) {
            if(!visited[x])
            {
               
                visited[x]=true;
            dfs(al,x,c+1,visited,flag);
               
            }
                
        }
     
              
    }
    
 }
