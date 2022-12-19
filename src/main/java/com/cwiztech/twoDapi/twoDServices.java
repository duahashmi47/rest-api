package com.cwiztech.twoDapi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class twoDServices {
		public void fileOpen() throws IOException {
			
			File file = new File("csv.txt");
			
			if (file.createNewFile()) {
				System.out.println("File Created Successfully path: "+ file.getAbsolutePath());
			}
		}
		
		
			public int[][] read() throws IOException{
			fileOpen();
			int rows = 0;
			int columns = 3;
			BufferedReader br = new BufferedReader(new FileReader("csv.txt")); 
			while(br.readLine() != null){
				rows++;
			}
			
			String line;
			int[][] save_array = new int[columns][rows];
			@SuppressWarnings("resource")
			BufferedReader br1 = new BufferedReader(new FileReader("csv.txt"));
			for(int i = 0; i < columns; i++){
				for(int j = 0; i <rows; i++){	
				line = br1.readLine();
				save_array[i][j] = Integer.parseInt(line);
				}
			}
			br.close();
			return save_array;
			}	 	
		
		
		public String traverse() throws IOException {
			int[][] twoDarray = read();
			System.out.println( "Traversed result is: "+Arrays.toString(twoDarray));
			return Arrays.toString(twoDarray);
		}

		
		
		public String insert(int value) throws IOException{
			int[][] twoDarray = read();
			BufferedWriter bw = new BufferedWriter(new FileWriter("csv.txt",false));
			for(int i=0; i <twoDarray.length; i++){
				for(int j=0; j<twoDarray[i].length;j++){
					bw.write(twoDarray[i][j]+"	");
				}
				bw.newLine();
			}
			bw.close();
			return "Successfully added";	
		}
		
		
		public String delete(int index) throws IOException{
			
			return null;
			
		}


	public String insertAll(String value, String value2) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("csv.txt",true));
		bw.append(value);
		bw.append("	");
		bw.append(value2);
		
		bw.close();
		return "Values Entered into the file!";
	}
	
	
	 public String search(int value) throws IOException{
     	int[][] twoDarray = read();
     	int number = 0;
     	for(int i = 0; i<twoDarray.length; i++){
     		for(int j = 0; j<twoDarray[i].length; j++){
     			if(twoDarray[i][j] == value){
         			number++;	
     		}
     	}
    }
     	return(number+ "is the result.");
     }
}