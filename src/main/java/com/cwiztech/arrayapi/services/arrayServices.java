package com.cwiztech.arrayapi.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

	public class arrayServices {
		public void fileOpen() throws IOException {
			
			File file = new File("File.txt");
			
			if (file.createNewFile()) {
				System.out.println("File Created Successfully path: "+ file.getAbsolutePath());
			}

		}
	
		
		public int[] read() throws IOException{
			fileOpen();
			int size_array = 0;
			BufferedReader br = new BufferedReader(new FileReader("File.txt"));
			while(br.readLine() != null){
			size_array++;
			}
			
			String str;
			int[] save_array = new int[size_array];
			@SuppressWarnings("resource")
			BufferedReader br1 = new BufferedReader(new FileReader("File.txt"));
			for(int i = 0; i < size_array; i++){
				str = br1.readLine();
				save_array[i] = Integer.parseInt(str);
			}
			br.close();
			return save_array;
		}
		
		
		public String traverse() throws IOException {
			int[] array = read();
			System.out.println( "Traversed result is: "+Arrays.toString(array));
			return Arrays.toString(array);
		}
		
		
		public String insert(int value) throws IOException {
			int[] array = read();
			int max = 25;
			if(array.length == max){
				System.out.println("No Space in Array");
				return "Value cannot be added";	
			}else{
				FileWriter fw = new FileWriter("File.txt");
				for(int i = 0; i < array.length; i++ ){
					fw.write(array[i] + "		");
				}
				fw.write(value + "");
				System.out.println(value + " has been inserted in file.");
				fw.close();
			}
			return value+"Value inserted.";
		
		  }
		
		
		public String delete(int index) throws IOException{
			int[] array = read();
			if(index > array.length){
				System.out.println(index + "does not exist!");
				return index + "Index does not exist";
			}else{
				FileWriter fw = new FileWriter("File.txt");
				for(int i = 0; i<array.length; i++){
					if(i != index){
						fw.write(array[i]+"\n");
					}
				}
				fw.close();	
			}
			 System.out.println("Value at index "+index+" deleted Successfully");
         	 return "Value at index "+index+" deleted Successfully";
		}
		 
       
        public String search(int value) throws IOException{
        	int[] array = read();
        	int number = 0;
        	for(int i = 0; i<array.length; i++){
        		if(array[i] == value){
        			number++;
        		}
        	}
        	
        	return(number+ "is the result.");
        }
     

}

	