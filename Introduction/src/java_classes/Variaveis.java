package java_classes;


public class Variaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 5;
		String website = "Texto";
		char letra ='K'; 
		double dec = 1.99;
		float decimal = 1;
		boolean teste = true;
		
		
		//System.out.println(numero + " teste de saida de variaveis com string");
		
		//Arrays 
		int[] vetor = new int[5];
		//int[] vetor2 = {1,2};
		
		vetor[2] = 5;
		vetor[0] = 100;
		vetor[1] = 4;
		vetor[3] = 4;
		vetor[4] = 20;
		
		//System.out.println(vetor2[0]);
		
		//FOR 
		
		for(int i = 0; i<vetor.length; i++) 
		{
			System.out.println(vetor[i]); 
		}
		
		String[] nomeCompleto = {"katarina", "Rodrigues"}; 
		
		//for(int i = 0; i<vetor.length; i++) 
		//{
		//	System.out.println(nomeCompleto[i]);
		//}
		
		for( String s: nomeCompleto)
		{
			System.out.println(s); 
		}
		
		
		
		
	}

}
