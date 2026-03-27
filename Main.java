
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    int num =1;
    Scanner scanner = new Scanner(System.in);
    ArrayList<Produto>produtosArrayList=new ArrayList<>();
    while (num!=0) {
        System.out.println("1 - Cadastrar produto\n" + 
                          "2 - Listar produto\n" + 
                          "3 - Buscar produto pelo id\n"+ 
                          "4 - Remover produto pelo id\n" + 
                          "0 - Sair\n");
     num=scanner.nextInt();
      scanner.nextLine(); 
     boolean achou=false;      
if (num==1) { cadastrar(produtosArrayList, scanner);
   }
if (num==2) { listar(produtosArrayList);
    } 
if (num==3) { buscar(produtosArrayList, scanner);
    }
if (num==4) { remover(produtosArrayList, scanner);
    }}
scanner.close();
}   

  public static void  cadastrar(ArrayList<Produto> cadastrarList, Scanner scanner) {
    int cadas;
 System.out.println("Quantos produtos você quer cadastrar");
    cadas= scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < cadas; i++) {
        Produto produto= new Produto();      
   System.out.println("\nProduto sendo cadastrado " + (i + 1));
   System.out.println("Nome do produto");
   produto.setNome(scanner.nextLine());
   System.out.println("Preco do produto");
   produto.setPreco(scanner.nextDouble());
   scanner.nextLine();
 int id;
boolean idExiste;

do {
    idExiste = false;
    System.out.println("Diga o ID do produto");
    id = scanner.nextInt();
    scanner.nextLine();
    for (Produto p : cadastrarList) {
        if (p.getId() == id) {
            System.out.println("Esse ID já existe, digite outro.");
            idExiste = true;
            break;}}}   

while (idExiste);
produto.setId(id);

   cadastrarList.add(produto); }  }
    
 public static void listar(ArrayList<Produto> listaList){
    if (listaList.isEmpty()) {
        System.out.println("Nenhum produto cadastrado, por favor cadastre o um produto primeiro");
      }   
    else{
        for (Produto produto : listaList) {
        System.out.println(produto);}}}
    
public static void buscar(ArrayList<Produto> buscar, Scanner scanner){
    boolean achou= false;
  if (buscar.isEmpty()) {
        System.out.println("Nenhum produto cadastrado, por favor cadastre o um produto primeiro");}
    else{
        System.out.println("Coloque o ID do produto que você quer procurar");
        int busc = scanner.nextInt();
        scanner.nextLine();
  for (Produto produto : buscar){
    if (produto.getId()== busc) {
        System.out.println("Produto encontrado");
        System.out.println(produto); 
    achou=true;}}
   if(achou==false){System.out.println("Produto não encontrado");}}
}
public static void remover(ArrayList<Produto> removerList, Scanner scanner){
    boolean achou = false;
  if (removerList.isEmpty()) { 
        System.out.println("Nenhum produto cadastrado, por favor cadastre o um produto primeiro");}
    else{
    System.out.println("Coloque o ID do produto que você quer remover");
    int buscar=scanner.nextInt();
        for (int i = 0; i < removerList.size(); i++) {
        if (removerList.get(i).getId() == buscar) {
        System.out.println("Produto removido");
        removerList.remove(i);
         achou=true;
        break;}}
          if(achou==false){System.out.println("Produto não encontrado");
       }}}} 

  
    
    
    


  
