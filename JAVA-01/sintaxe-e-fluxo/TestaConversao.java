public class TestaConversao {
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        double salario = 1270.50; //8bytes
        int valor =(int)salario; //transformar em int - int 32bits 4 bytes
        System.out.println(valor);  

        // long numeroGrande = 323123123132l; //64bits - 8bytes
        // short valorPequeno = 2131;//16bits - 2bytes
        // byte b = 127; //-127 ate 127 1 byte
        // float pontoFlutuante = 3.14f; 4 bytes 
        //char -> 2bytes
        //boolean 1byte - true or false
    }
}
