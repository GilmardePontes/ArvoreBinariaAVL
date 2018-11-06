

public class Main {

    public static void main(String[] args){
        ArvoreAvl arvore1 = new ArvoreAvl();
        
        arvore1.insere(70);
        arvore1.insere(50);
        arvore1.insere(80);
        arvore1.insere(71);
        arvore1.insere(90);
        arvore1.insere(75);
        System.out.println();
        arvore1.imprimirPrefixado();

  		ArvoreAvl arvore2 = new ArvoreAvl();
        ArvoreAvl arvore3 = new ArvoreAvl();
        ArvoreAvl arvore4 = new ArvoreAvl();
        
        //Rota��o � esquerda (RR)
        System.out.println("===========�rvore 1:===========");
        arvore1.insere(1);
        arvore1.insere(2);
        arvore1.insere(3);

        System.out.println();
        arvore1.imprimirInterfixado();
        System.out.println();
        System.out.println();

        //Rota��o � direita (LL)
        System.out.println("===========�rvore 2:===========");
        arvore2.insere(30);
        arvore2.insere(20);
        arvore2.insere(10);

        System.out.println();
        arvore2.imprimirInterfixado();
        System.out.println();
        System.out.println();

        //Rota��o Dupla � Direita(Rota��o esquerda direita) (LR)

        System.out.println("===========�rvore 3:===========");
        arvore3.insere(30);
        arvore3.insere(20);
        arvore3.insere(21);

        System.out.println();
        arvore3.imprimirInterfixado();
        System.out.println();
        System.out.println();

        //Rota��o Dupla � Esquerda(Rota��o direita esquerda) (RL)

        System.out.println("===========�rvore 4:===========");
        arvore4.insere(30);
        arvore4.insere(33);
        arvore4.insere(32);

        System.out.println();
        arvore3.imprimirInterfixado();

    }
}