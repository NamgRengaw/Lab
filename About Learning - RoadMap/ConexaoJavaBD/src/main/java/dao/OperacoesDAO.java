/*
* @(#)OperacoesDAO.java
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

/**
 * Class OperacoesDAO
 *
 * @author wagner.bruggemann
 */
public class OperacoesDAO {
    
    public static String criaTabela(String nomeTbl, String colunas) {
        return "create table " + nomeTbl + "(" + colunas + ");";
    }
    
    public static String criaRegistro(String nomeTbl, String colunas, String valores) {
        return "insert into " + nomeTbl + "(" + colunas + ") values (" + valores + ");";
    }
    
    public static String criaRegistroTeste(String nomeTbl, String colunas, String valores) {
        return "insert into " + "validacao" + "(" + "login, senha" + ") values (" + "'jozias', 'qwertyui'" + ");";
    }
    
    public static String buscaTabelaSimples(String nomeTbl, String colunas) {
        return "select " + colunas + " from " + nomeTbl + ";";
    }
    
    public static String buscaTabelaRestricao(String nomeTbl, String colunas, String restricao) {
        return "select " + colunas + " from " + nomeTbl + " where " + restricao + ";";
    }
}
