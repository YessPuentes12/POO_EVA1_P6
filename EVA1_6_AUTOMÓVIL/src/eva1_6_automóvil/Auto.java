/*

 */
package eva1_6_automóvil;


public class Auto {
String marca, modelo, dueño,placa;  
 int año;   
    
public Auto(){ //Default
 marca="Volkswagen";
 modelo="Beetle";
 dueño="Sin dueño";
 año=1996;
 placa="EEF-727-O";
}  

public void Auto(String Marca, String Modelo, String Dueño, int Año, String Placa){
 marca = Marca;
 modelo = Modelo;
 dueño = Dueño;
 año = Año;
 placa = Placa;
}
 //------------------------------------------------------------------------------- 
public String getMarca(){
 return marca;   
}
public void setMarca(String Amarca){
   marca = Amarca; 
}
 //------------------------------------------------------------------------------- 
public String getModelo (){
   return modelo; 
}
public void setModelo(String Amodelo){
   modelo = Amodelo; 
}
 //------------------------------------------------------------------------------- 
public String getDueño(){
 return dueño;   
}
public void setDueño(String Adueño){
  dueño = Adueño;  
}
 //-------------------------------------------------------------------------------
public int getAño(){
  return año;
}
public void setAño(int Aaño){
 año = Aaño;   
}
 //------------------------------------------------------------------------------- 
public String getMat(){
  return placa;
}
public void setMat(String Amat){
 placa = Amat;   
}
 //------------------------------------------------------------------------------- 
public int calcularRev(){
 int adeudo=0;
 
   if (año <=2000){
   adeudo = 1500;   
  } else if (año >= 2001 && año <=2005){
   adeudo = 2000;   
  } else if (año >=2006 && año <= 2010){
   adeudo = 2500;   
  } else if (año >= 2011 && año <= 2015){
   adeudo = 3000;   
  } else{
  adeudo = 3000;    
  }
 
 System.out.println("$"+adeudo+"\n");
return adeudo;   
}
//------------------------------------------------------------------------------- 
public void ImprimirDatos(){
System.out.println("Datos del vehículo.\n");
System.out.println("Marca: " +marca);
System.out.println("Modelo: " +modelo);
System.out.println("Dueño: " +dueño);
System.out.println("Año: " +año);
System.out.println("Matrícula: " +placa);
System.out.println("\nEl adeudo del automóvil es de: ");
}
 //-------------------------------------------------------------------------------     
    
    
    
    
    
    
    
    
}
