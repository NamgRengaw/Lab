/*
* @(#)Persistencia.java
*
* Copyright (c) J-Tech Solucoes em Informatica.
* All Rights Reserved.
*
* This software is the confidential and proprietary information of J-Tech.
* ("Confidential Information"). You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms of the
* license agreement you entered into with J-Tech.
*/
package dao;

import java.sql.*;
import exceptions.ExcecaoSQL;

/**
 * Class Persistencia
 *
 * @author wagner.bruggemann
 */
public class PersistenciaDAO {
    
    private String CAMINHO;
    private String USUARIO;
    private String SENHA;
    
    public PersistenciaDAO(String caminho, String usuario, String senha) {
        this.CAMINHO = caminho;
        this.USUARIO = usuario;
        this.SENHA = senha;
    }
    
    
    public String gravaBD(String comando) {
        String retorno = null;
        try(
                //Prepara a conexão
                Connection conexao = DriverManager.getConnection(this.CAMINHO, this.USUARIO, this.SENHA);
                //Inicia a interpretação, compilação, e planejamento
                PreparedStatement preparacao = conexao.prepareStatement(comando);
                ){
                
                //Executa a alteracao, e encerra preparacao e conexão
                preparacao.execute(comando);
                preparacao.close();
                ResultSet retornoSQL = preparacao.executeQuery();
                retorno.valueOf(retornoSQL);
                
                System.out.println(retorno);
                System.out.println("Persistência bem sucedida!");
                
                conexao.close();
                
        } catch (SQLException e) {
            //Mostra o erro do BD caso ocorra
            ExcecaoSQL.excecaoSQLConsole(e);
        }
        return retorno;
    }

    
    public String encontraDBLogin(String comando, String coluna) throws SQLException {
        String retorno = "";
        try ( //Prepara a conexão
                Connection conexao = DriverManager.getConnection(this.CAMINHO, this.USUARIO, this.SENHA);
                //Inicia a interpretação, compilação, e planejamento
                Statement stmt = conexao.createStatement();
                ResultSet retornoBD = stmt.executeQuery(comando);
                ){
            while(retornoBD.next()) {
                retorno = retornoBD.getString(coluna);
             }
            stmt.close();
            conexao.close();
     } catch (SQLException e) {
         ExcecaoSQL.excecaoSQLConsole(e);
     } 
         return retorno;
     }
    
    
    public Boolean encontraDBLoginBool(String comando, String coluna) throws SQLException {
        String VarComparacao = "";
        Boolean retorno = false;
        try ( //Prepara a conexão
                Connection conexao = DriverManager.getConnection(this.CAMINHO, this.USUARIO, this.SENHA);
                //Inicia a interpretação, compilação, e planejamento
                Statement stmt = conexao.createStatement();
                ResultSet retornoBD = stmt.executeQuery(comando);
                ){
            while(retornoBD.next()) {
                VarComparacao = retornoBD.getString(coluna);
             }
            retorno = (VarComparacao.equals("") ? false : true);
            stmt.close();
            conexao.close();
     } catch (SQLException e) {
         ExcecaoSQL.excecaoSQLConsole(e);
     } 
         return retorno;
     }
    
    
    
    //Getter's
    public String getCAMINHO() {
        return CAMINHO;
    }
    
    public String getUSUARIO() {
        return USUARIO;
    }
    
    public String getSENHA() {
        return SENHA;
    }



    //Setter's
    public void setCAMINHO(String caminho) {
        this.CAMINHO = caminho;
    }
    
    public void setUSUARIO(String usuario) {
        this.USUARIO = usuario;
    }
    
    public void setSENHA(String senha) {
        this.SENHA = senha;
    }
    
}
