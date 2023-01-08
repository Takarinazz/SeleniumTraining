package java_classes;

import java.util.ArrayList;

public class VariaveisArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int [] vet = {1,2,4,5,6,8,10,122};
			
			//Imprimir apenas numeros pares
			//2,4,6,8,10,122
			
			for (int i=0; i<vet.length; i++)
			{
				if (vet[i] % 2 == 0 )
				{
				System.out.println(vet[i]);
				break;
				}
			}
			
			ArrayList<String> a = new ArrayList<String>();
			a.add("katarina");
			a.add("Rodrigues");
			//a.add("De");
			//a.add("Sousa");
			a.add("Selenium");
			a.add("java");
			
		
			//System.out.println(a.get(2));
			
			for(int i=0; i<a.size();i++)
			{
				System.out.println(a.get(i));
			}
			for (String val: a)
			{
				System.out.println(val);
			}
				System.out.println(a.contains("java"));
			
	}

}
