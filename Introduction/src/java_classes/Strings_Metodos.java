package java_classes;

public class Strings_Metodos {


			public static void main(String[] args) {

			// TODO Auto-generated method stub



			//string is an object //String literal


			String s5 = "hello";





			//new

			String s2 = new String("Welcome");

			String s3 = new String("Welcome");



			String s = "Katarina Rodrigues de sousa ";

			String[] splittedString = s.split("Rodrigues");

			System.out.println(splittedString[0]);

			System.out.println(splittedString[1]); //Splitted usado p/ separar item do objeto string 

			System.out.println(splittedString[1].trim());

			for(int i =s.length()-1;i>=0;i--) //Loop usado para imprimir ao contario a string

			{

			System.out.println(s.charAt(i));

			}

			}


	}

