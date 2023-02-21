/*
MARCA
MODELO
AÑO
DUEÑO
PLACA
 */
package eva1_6_automóvil;


public class EVA1_6_AUTOMÓVIL {

    public static void main(String[] args) {
     //get y set
     //constructores(default y agrumentos)
     //imprimir datos
     //calcular adeudo
     //2000 y anteriores: $1500
     //2001-2005: $2000
     //2006-2010: $2500
     //2011-2015: $3000
     //2016-2023: $4000
     
    Auto autodef = new Auto();
    autodef.ImprimirDatos();
    autodef.calcularRev();
    
 //-------------------------------------------------------------------------------     
     Auto auto1 = new Auto();
     auto1.Auto("Nissan", "Sentra", "Yessly Mayorga", 2010, "EEE-32-A");
     auto1.ImprimirDatos();
     auto1.calcularRev();
     
     
     
     
     
     
     
     
    }
    
    
    
     
    
}
