package introjava;

//agregando comentario

public class javaIntroEJ12 {

  
    public static void main(String[] args) {
       
        
        String frase1="Ayer, lunes, salimos a las once y 10.";
        int size = 0;
                         
        System.out.println("la frase ingresada es: " + frase1);
        
        System.out.println("");
        
        size = frase1.length();
        
        System.out.println("Ahora Traducido:  ");
        
        
        for (int i = 0; i < size; i++) {
            
             switch(frase1.substring(i, i+1)){
                 
                 case "a":{
                     System.out.print("@"); 
                        break;
                        }
                 case "e":{
                     System.out.print("#"); 
                        break;
                        }
                 case "i":{
                     System.out.print ("$"); 
                        break;
                        }
                 case "o":{
                     System.out.print ("%"); 
                        break;
                        }
                 case "u":{
                     System.out.print ("*"); 
                        break;
                        }
                 default: {
                        System.out.print(frase1.substring(i, i+1));
                        }  
                }
        }
    }
    
}
