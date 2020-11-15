package clases;

public class Hash 
{
	
	String llave;
	int posicion;
	int tama�o = 0;
	int sigPrimo = siguientePrimo(tama�o);
	
	public Hash(String pLlave, int pTama�o)
	{
		llave = pLlave;
		tama�o = pTama�o; 
		posicion = funcionHash(llave, tama�o, sigPrimo);
	}
	
	public String darLlave()
	{
		return llave;
	}
	
	public int darPosicion()
	{
		return posicion;
	}
	
	public int funcionHash(String llaveACambiar, int tama�oLista, int tama�oSiguientePrimo)
	{
		int rta = Math.abs(llaveACambiar.hashCode());
		rta = ((rta*darNumeroAlAzar(tama�oSiguientePrimo)+ darNumeroAlAzar(tama�oSiguientePrimo))% tama�oSiguientePrimo)%tama�oLista;
		if(rta <0)
		{
			rta*= -1;
		}
		return rta;
	}
	
	public int siguientePrimo(int num) 
	{
		num++;
		for (int i = 2; i < num; i++) 
		{
			if(num%i == 0) 
			{
				num++;
				i=2;
			} else 
			{
				continue;
			}
		}
		return num;
	}
	
	   
	public int darNumeroAlAzar(int tama�oSiguientePrimo){ 
     int max = tama�oSiguientePrimo; 
     int min = 1; 
     int range = max - min + 1; 
     int rta = 0;

     for (int i = 0; i < tama�oSiguientePrimo; i++) 
     { 
         rta = (int)(Math.random() * range) + min; 
     } 
    return rta;
 }
	
}
