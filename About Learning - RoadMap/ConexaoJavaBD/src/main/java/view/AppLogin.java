/*
* @(#)App.java
*
* Copyright (c) J-Tech Solucoes em Informatica.
* All Rights Reserved.
*
* This software is the confidential and proprietary information of J-Tech.
* ("Confidential Information"). You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms of the
* license agreement you entered into with J-Tech.
*/
package view;

import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import dao.OperacoesDAO;
import dao.PersistenciaDAO;
import service.Login;

/**
 * Class App
 *
 * @author wagner.bruggemann
 */
public class AppLogin {
    public static void main(String[] args) throws SQLException {
        Scanner in = new Scanner(System.in);
        
        Login login = new Login();
        
//        System.out.print("Usuario: ");
//        String usuario = in.nextLine();
//        System.out.print("Senha: ");
//        String senha = in.nextLine();
        
        System.out.println(login.validaEntrada(
                JOptionPane.showInputDialog(null, "Usuario"), 
                JOptionPane.showInputDialog(null, "Senha")));
        
        
        
        in.close();
    }
    
}
