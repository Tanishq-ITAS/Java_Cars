
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Cardemo2  {
	static int position=0;
	public Cardemo2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		
       Scanner keyboard=new Scanner(System.in);
       System.out.println("Enter File Name ");
       String filename= keyboard.nextLine();
       
       File file= new File(filename);
	
       ArrayList<Vehicle> Race=new ArrayList<Vehicle>();
       
       if(!file.exists()) {
    	 System.out.println("Sorry,file doest not exists");
    	 filename="input.txt";
    	 file=new File(filename);
       }
       System.out.println("Reading in file "+ filename);
       
       try 
       {
    	   Scanner inputFile=new Scanner(file);
    	   int linecount=0;
    	   
    	   while(inputFile.hasNext()) {
    		   String line =inputFile.nextLine();
    		   System.out.println("Reading line  ["+linecount+"]:"+line);
    		   String words[]=line.split(" ");
    		   String ClassName=words[0].trim();
    		   String model=words[1].trim();
    		   String Color=words[3].trim();
    		   System.out.println("Next line has data For : '"+ClassName+"'");
    		   boolean check=Boolean.parseBoolean(words[4].trim());
    		   
    		   if(ClassName.equalsIgnoreCase("Motorcycle")) {
    			   Motorcycle obj= new Motorcycle(model,Color);
    			   Race.add(obj);
    		   }
    		   else if(ClassName.equalsIgnoreCase("Truck")) {
    			   Truck obj=new Truck(model,Color,check);
    			   Race.add(obj);
    		   }
    		   else  {
    			   Tesla obj=new Tesla(model,Color,check);
    			   Race.add(obj);
    		   }
    		   linecount++;
    	   }
    	   inputFile.close();
       }
       catch(Exception e) {
    	   System.out.println("Error reading File : "+e);
    	   
       }
       
       int round=1;
       int counter=5;
       while(round!=1) {
    	   
    	   System.out.println("Round No : "+round);
    	   round++;
    	   for(int i=0;i<20;i++) {
    		   position++;
    		   System.out.println("|"+" "+"|"+" "+"|"+" "+"|"+" "+"|"+" "+"|"+" "+position);
    		   if(i==18) {
    			   System.out.println("|"+" "+"|"+" "+"|"+" "+"T"+" "+"|"+" "+"|"+" "+position);
    		   }
    		   if(i==14) {
    			   System.out.println("|"+" "+"E"+" "+"|"+" "+"|"+" "+"|"+" "+"|"+" "+position);
    		   }
    		   if(i==5) {
    			   System.out.println("|"+" "+"|"+" "+"|"+" "+"|"+" "+"|"+" "+"M"+" "+position);
    		   }
    		   if(i==8) {
    			   System.out.println("T"+" "+"|"+" "+"|"+" "+"|"+" "+"|"+" "+"|"+" "+position);
    		   }
    		   if(i==13) {
    			   System.out.println(""+" "+"|"+" "+"|"+" "+"|"+" "+"|"+"M"+"|"+" "+position);
    		   }
    		   if(i==6) {
    			   System.out.println(""+" "+"|"+" "+"E"+" "+"|"+" "+"|"+"|"+"|"+" "+position);
    		   }


    	   }
       }
	}

	
	

}
