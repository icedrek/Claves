package net.idk.clases;

public class Clave {		
	private static String CADENA1 = "abcdefghijklmnñopqrstuvwxyz0123456789";

	private String entrada;		
	
	public Clave(String entrada)
	{
		this.entrada = entrada;
	}
	
	public String getClave()
	{
		String salida  = "";
		String cadena2 = invertirCadena(CADENA1);

		Caracter caracter;		
		
		int longitud = entrada.length();

		for (int i = 0;i < longitud;i++)
		{	
			caracter = new Caracter(entrada.charAt(i));

			if (caracter.esMinuscula())		
			{		
				caracter = new Caracter(cadena2.charAt(CADENA1.indexOf(caracter.getCaracter())));							
			} else {
				caracter.toMinuscula();
				caracter = new Caracter(cadena2.charAt(CADENA1.indexOf(caracter.getCaracter())));
				caracter.toMayuscula();				
			}
			
			salida = salida + caracter.getCaracter();
		}	
		
		return salida;		
	}

	public static String invertirCadena(String cadena)
	{
		int long_c1 = cadena.length();
		String cadena2 = "";
				
		for (int i = 1 ;i <= long_c1 ;i++)
		{			
			cadena2 = cadena2 + cadena.charAt(long_c1 - i);
		}
		
		return cadena2;
	}

	public String getEntrada() 
	{
		return entrada;
	}

	public void setEntrada(String entrada) 
	{
		this.entrada = entrada;
	}
}
