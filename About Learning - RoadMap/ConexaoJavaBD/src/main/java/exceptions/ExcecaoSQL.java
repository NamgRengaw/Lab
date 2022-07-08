/*
* @(#)ExcecaoSQL.java
*
* Copyright (c) J-Tech Solucoes em Informatica.
* All Rights Reserved.
*
* This software is the confidential and proprietary information of J-Tech.
* ("Confidential Information"). You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms of the
* license agreement you entered into with J-Tech.
*/
package exceptions;

import java.sql.SQLException;

/**
 * Class ExcecaoSQL
 *
 * @author wagner.bruggemann
 */
public class ExcecaoSQL {
    
    public static void excecaoSQLConsole(SQLException excecao) {
        for(Throwable e: excecao) {
            if(e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.out.println("Estado do SQL: " + ((SQLException) e).getSQLState());
                System.out.println("Código do erro: " + ((SQLException) e).getErrorCode());
                System.out.println("Mensagem: " + e.getMessage());
                Throwable t = excecao.getCause();
                while (t != null) {
                    System.out.println("Causa: " + t);
                    t = t.getCause();
                }
            }
        }
    }
    
}
