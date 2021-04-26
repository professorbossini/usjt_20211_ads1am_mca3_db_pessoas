package com.mycompany.usjt_20211_ads1am_mca3_db_pessoas;


import java.sql.Connection;
import java.sql.PreparedStatement;

public class Pessoa {
    private int codigo;
    private String nome;
    private String fone;
    private String email;

    public Pessoa() {
        
    }

    public Pessoa(String nome, String fone, String email) {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }
    
    public Pessoa (int codigo, String nome, String fone, String email){
        this(nome, fone, email);
        this.codigo = codigo;        
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public String getEmail() {
        return email;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void inserir() {
        //1. definir o comando sql que vai ser utilizado
        String sql="INSERT INTO tb_pessoa(nome, fone, email) VALUES (?, ?, ?)";
        //2. abrir a conexão com o banco
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()) {
            //3.pré-compilar o comando sql
            PreparedStatement ps = c.prepareStatement(sql);
            //4. Substituir os símbolos ?. Eles se chamam placeholders. 
            //Ou seja, especificar os valores a serem inseridos
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
            //5. Executar
            ps.execute();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void atualizar (){
        //1. Especificar o comando SQL
        String sql = "UPDATE tb_pessoa SET nome = ?, fone = ?, email = ? WHERE codigo = ?";
        //2. Abrir uma conexão com o banco usando a classe ConnectionFactory
        ConnectionFactory fabrica = new ConnectionFactory();
        //try with resources
        try(Connection conexao = fabrica.obtemConexao()){
            //3. Preparar o comando com prepareStatement, usando a conexão
            PreparedStatement ps = conexao.prepareStatement(sql);
            //4. Especificar os valores a serem utilizados no lugar dos ? (placeholders)
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
            ps.setInt(4, codigo);
            //5. Executar
            ps.execute();
        }
        catch (Exception e){
            e.printStackTrace();
        }

       
        
    }
    
    
}


//        Connection conexao = null;
//        try{
//            conexao = fabrica.obtemConexao();
//            
//            
//            
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        finally{
//            conexao.close();
//        }