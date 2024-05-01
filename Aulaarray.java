
package aulaarray;


public class Aulaarray {

    
    public static void main(String[] args) {
        
        //variavel int (tamanho do vetor)
        int t = 10;
        //instanciando o vetor v
        int [] v = new int [t];
        
        for (int i=0; i<t; i++) {
            v[i] = i;
            
        }
        
        System.out.println("Vetor: " + v);
        
        int soma = 0;
        int maior = v[0];
        int menor = v[0];
        
        //encontrar a soma, o menor e o maior elemento
        for (int i=0; i<t; i++) {
            soma += v[i];
            if (v[i] < menor) {
                menor = v[i];
            }
            
            if(v[i] > maior) {
                maior = v[i];
            }
        }
        
        //percorrer o vetor v, elemento por elemento
        
        for(int i=0; i<t; i++) {
            System.out.printf("vetor[%d]: %d", i, v[i]);
            if(v[i] == menor) {
                System.out.print("<-- menor");
            }
            
            if(v[i] == maior) {
                System.out.print("<--- maior");
                
            }
            System.out.println("");
        }
        
    }
    
}
