/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos.emissor;

/**
 *
 * @author dddf
 */
public class EmissorSMSAssincrono extends EmissorSMS {

    @Override
    protected void enviaImpl(String mensagem) {
        System.out.println("Enviando por SMS ASSINCRONO a mensagem: ");
        System.out.println(mensagem);
    }
    
}
