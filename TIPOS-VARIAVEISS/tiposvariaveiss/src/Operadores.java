public class Operadores {
    public static void main(String[] args){
       //operadores relacionais
       String nomeUm = "GLAYSON";
       String nomeDois = "GLAYSON";

       System.out.println(nomeUm.equals(nomeDois));
       



       int numero1 = 1;
       int nuemro2 = 2;

     boolean simNao = numero1 == nuemro2;

    if (numero1 < nuemro2) {
        System.out.println("A nossa condição é verdadeira");
        
    }

       System.out.println("numeroUm é igual a nuemroDois? " + simNao);


       simNao = numero1 != nuemro2;

       System.out.println("numeroUm é diferente a nuemroDois? " + simNao);


       simNao = numero1 > nuemro2;

       System.out.println("numeroUm é maior a nuemroDois? " + simNao);

    }
}
