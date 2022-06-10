/*
* @(#)util.java
*
* Copyright (c) J-Tech Solucoes em Informatica.
* All Rights Reserved.
*
* This software is the confidential and proprietary information of J-Tech.
* ("Confidential Information"). You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms of the
* license agreement you entered into with J-Tech.
*/
package util;

import java.io.IOException;
import java.util.Scanner;

/**
 * Class util
 *
 * @author wagner.bruggemann
 */
public class Util {

    public void confirmacao() {
        Integer confirmacao = 0;
        Scanner teclado = new Scanner(System.in);
        
      System.out.println("Digite 1 para continuar");
        while(confirmacao != 1) {
            confirmacao = teclado.nextInt();
        }
    }

    public void limpaConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println("\n ");
        }
    }
}
