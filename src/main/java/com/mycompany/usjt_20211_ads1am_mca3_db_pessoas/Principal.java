package com.mycompany.usjt_20211_ads1am_mca3_db_pessoas;


import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        String menu = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n0-sair";
        int opcao;
        do {
            opcao=Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcao) {
                case 1:{
                    String nome = JOptionPane.showInputDialog("Nome?");
                    String fone = JOptionPane.showInputDialog("Fone?");
                    String email = JOptionPane.showInputDialog("E-mail?");
                    Pessoa p = new Pessoa (nome, fone, email);
                    p.inserir();
                    break;
                }                       
                case 2:{
                    String nome = JOptionPane.showInputDialog("Nome?");
                    String fone = JOptionPane.showInputDialog("Fone?");
                    String email = JOptionPane.showInputDialog("E-mail?");
                    int codigo = Integer.parseInt(
                            JOptionPane.showInputDialog("Código?")
                    );
                    Pessoa p = new Pessoa(codigo, nome, fone, email);
                    p.atualizar();
                    break;
                }                    
                case 3:   
                 
                    break;
                case 4:
                    
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (opcao != 0);
    }
}
