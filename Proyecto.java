package proyecto;

public class Proyecto {
public static void main(String[] args) {
    	int [] input = {1,0,1,0,0};
        String inicio = "q0";
        String fin = "q3";
        String actual = inicio;
        boolean finalizar = false;
        int contador = 0;
   
   while (finalizar==false){
                          
   		 	  if(contador>input.length-1){
                              
                              System.out.println("Evaluacion de los numeros finalizada\n");
   		 	  	finalizar=true;
   		 	  	break;
   		 	  }
                          
   		 	  if(actual=="q0"){
                             
   		 	  	if(input[contador]==1 ){
   		 	  		actual="q1";
                                        System.out.println("cambio de q0 a q1");
   		 	  	}
   		 	  	contador++;
   		 	  	continue;
   		 	  }
                         
                         if(actual=="q1"){
                              
   		 	  	if(input[contador]==0 ){
   		 	  		actual="q2";
                                        System.out.println("cambio de q1 a q2");
   		 	  	}
   		 	  	contador++;
   		 	  	continue;
   		 	  }
                         
                         if(actual=="q2"){
                              
   		 	  	if(input[contador]==1 ){
   		 	  		actual="q3";
                                        System.out.println("cambio de q2 a q3");
   		 	  	}
   		 	  	contador++;
   		 	  	continue;
   		 	  }
                         
                         
                         if(actual=="q3"){
                             
                             if(input[contador]==0){
   		 	  		actual="q3";
                                        System.out.println("cambio de q3 a q3");
   		 	  	}else{
                                            System.out.println("cadena no valida");
                                            break;
                                            }
                             contador++;
   		 	  	continue;
                         
                         
                          //esto lo puse para saber si los valores al final eran igual o no y si daba error XD puedes quitarlo si quieres
                          
   		 	  }
   
  	 }
   System.out.println("¿"+actual+" = "+fin+"?");
   		 	  if(actual==fin){
   		 	  	System.out.println("Cadena valida");
   		 	  }else{
   		 	  	System.out.println("Cadena invalida");
   }
}
