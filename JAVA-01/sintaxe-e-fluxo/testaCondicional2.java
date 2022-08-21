public class testaCondicional2 {
    public static void main(String[] args)
    {
        System.out.println("testando condicionais");
        int idade = 17;
        int quantidadeDePessoas = 3;
        boolean acompanhado = quantidadeDePessoas >=2; //true
        System.out.println("valor de acompanhado = "+ acompanhado);
        if(idade >= 18 || acompanhado){ //ou - && = e
            System.out.println("você pode entrar");
        }else{
            System.out.println("você não pode entrar");
        } 
    }
}
