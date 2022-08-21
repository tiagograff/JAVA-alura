public class TesteCondicional {
    public static void main(String[] args)
    {
        System.out.println("testando condicionais");
        int idade = 17;
        int quantidadePessoas = 3;
        if(idade >= 18){
            System.out.println("você tem mais de 18 anos");
        }else{
            if(quantidadePessoas >= 2){
                System.out.println("você tem menos de 18 anos,"
                + "mas pode entrar pois esta acompanhado");
            } 
            else{
                System.out.println("você tem menos de 18 anos");
            }    
        }
    }
}
