package com.java.core;

import java.util.Arrays;

public class AnagaramExample {
 public void  isAnagaram(String s1,String s2){
	 //removing all the white spaces
	 
	 String copyOfs1=s1.replaceAll("\\s+", "");
	 String copyOfs2=s2.replaceAll("\\s+", "");
 
	 
	  
	 boolean status=true;
	 
	 if(copyOfs1.length() != copyOfs2.length()){
		 
		 status=false;
	 }else
	     {
		 char[] copyArray1=copyOfs1.toUpperCase().toCharArray();
		 char[] copyArray2=copyOfs2.toUpperCase().toCharArray();
		 Arrays.sort(copyArray1);
		 Arrays.sort(copyArray2);
		status=Arrays.equals(copyArray1,copyArray2);
		 }
	 if(status){
		 System.out.println(s1 +" and "+s2+ " are anagaram");
	 }else
		 System.out.println(s1 +" and "+s2 + " are not anagaram ");
	 }
	 public  static void main(String[] args){
		 AnagaramExample ae=new AnagaramExample();
		 ae.isAnagaram("Mother In Law", "Hitler Woman");
		 ae.isAnagaram("keEp", "peeK");
		 ae.isAnagaram("SiLeNt CAT", "LisTen AcT");
		 ae.isAnagaram("Toss", "Shot");
	 }
 }

