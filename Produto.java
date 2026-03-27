public class Produto {
    private String nome;
    private Double preco;
    private int id;

public String getNome(){
        return nome;
    }    
public void setNome(String nome){
    this.nome=nome;
}
public Double getPreco(){
        return preco;
    }    
public void setPreco(Double preco){
    this.preco=preco;
}

public int getId(){
        return id;
    }    
public void setId(int id){
    this.id=id;
}
public String toString() {
    return "\nNome: " + nome + 
            "\nID: " + id  + 
           "\nPreço: " + preco;
}}

