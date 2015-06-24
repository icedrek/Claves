package net.idk.clases;

public class Caracter {
	private char caracter;
	
	public Caracter(char caracter)
	{
		this.caracter = caracter;
	}
	
	public boolean esMinuscula()
	{
		if (caracter >= 'a' && caracter <='z'||caracter >= '0' && caracter <= '9' || caracter == 'ñ')
		{
			return true;			
		} else {
			return false;
		}						
	}
	
	public void toMayuscula()
	{
		String aux="";				
		aux = aux + caracter;
		aux = aux.toUpperCase();
		caracter =  aux.charAt(0);								
	}
	
	public void toMinuscula()
	{
		String aux="";				
		aux = aux + caracter;
		aux = aux.toLowerCase();
		caracter =  aux.charAt(0);								
	}

	
	public char getCaracter() 
	{
		return caracter;
	}

	
	public void setCaracter(char caracter) 
	{
		this.caracter = caracter;
	}
}
