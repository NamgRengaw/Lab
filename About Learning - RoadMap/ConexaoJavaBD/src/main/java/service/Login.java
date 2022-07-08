/*
* @(#)Login.java
*
* Copyright (c) J-Tech Solucoes em Informatica.
* All Rights Reserved.
*
* This software is the confidential and proprietary information of J-Tech.
* ("Confidential Information"). You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms of the
* license agreement you entered into with J-Tech.
*/
package service;

import java.sql.SQLException;
import dao.OperacoesDAO;
import dao.PersistenciaDAO;

/**
 * Class Login
 *
 * @author wagner.bruggemann
 */
public class Login {
    
    PersistenciaDAO bd = new PersistenciaDAO("jdbc:postgresql://localhost/persistenciaconjava", "postgres", "treinamento-postgres");
    
    public Boolean validaEntrada(String loginUser, String senhaUser) throws SQLException {
        Boolean retorno = false;
        Boolean validaLogin = bd.encontraDBLoginBool(OperacoesDAO.buscaTabelaRestricao("validacao", "login", "login = '" + loginUser + "'"), "login");
        Boolean validaSenha = bd.encontraDBLoginBool(OperacoesDAO.buscaTabelaRestricao("validacao", "senha", "senha = '" + senhaUser + "'"), "senha");
        
        if(validaLogin) {
            if(validaSenha) {
                retorno = true;
            }
        }
        
        System.out.println("Login validado: " +validaLogin + "\nSenha validada: " + validaSenha);
        
        return retorno;
        
    }
    
}
