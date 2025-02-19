package com.example.demo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebProperties;


@SpringBootApplication
public class Assignment2 {

	public static void main(String[] args) {
		SpringApplication.run(DuplicateArray.class, args);

		int[] inputarr={2,2,5};

		ArrayList<Integer> newarrr=Testing.duplicates(inputarr);

		for(int elements:newarrr){
			System.out.println("mytetsing: "+elements);

		}
		

	}
}

//  class Testing {
 
// 	public static ArrayList<Integer> duplicates(int[] myarr){
// 		ArrayList<Integer> list=new ArrayList<>();
// 		list.add(0,myarr[0]);

// 		for(int i=1,j=0;i<myarr.length;i++,j++){
// 			if(myarr[i]!=myarr[i-1]){
// 				list.add(j,myarr[i]);
				
// 			}
// 		}

// 		return list;

		
// 	}

class StringAssignment{

	//transform string

	Boolean ConvertString(String str1, String str2, int k){

		Boolean kostad=false;

		if(str1.length()!=str2.length()){
			return kostad;
		}

		





	}



}

	





