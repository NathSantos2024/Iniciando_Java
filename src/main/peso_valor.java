//tarefa_java2.2

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
Considere a seguinte tabela de preços: 
              Até 5 Kg          Acima de 5 Kg
Bananas       2,50 por Kg       2,20 por Kg
Peras         1,80 por Kg       1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar 25,00, receberá 
ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de bananas e 
quantidade (em Kg) de peras adquiridas e escreva o valor a ser pago pelo 
cliente. */

public class peso_valor {

    public static void main(String[] args) {
        DecimalFormat Df=new DecimalFormat("0.00 Euros");
        float bananas=Float.parseFloat(JOptionPane.showInputDialog(null,
                "Digite a quantidade em kg das bananas"));
        float peras=Float.parseFloat(JOptionPane.showInputDialog(null,
                "Digite a quantidade em kg das peras"));  
        float custoBananas, custoPeras, custoTotal, desconto;
        
        //bananas
        if(bananas<=5){
            custoBananas=bananas*2.5f;
        }
        else{
            custoBananas=bananas*2.2f;
        }
 
        //peras
        if(peras<=5){
            custoPeras=peras*1.8f;
        }
        else{
            custoPeras=peras*1.5f;
        }
        custoTotal=(custoBananas+custoPeras);
        if((bananas+peras) > 8 || custoTotal > 25){
            desconto=custoTotal*0.1f;
        }
        else{
            desconto=0;
        }

        JOptionPane.showMessageDialog(null, "O total sem desconto é "+
                Df.format(custoTotal)+"\n"+
                "Desconto "+Df.format(desconto)+"\n"+
                "Valor a pagar "+Df.format(custoTotal-desconto),"Exercício 2",
      JOptionPane.INFORMATION_MESSAGE);
        
    while(JOptionPane.showConfirmDialog(null,
            "Clique em Yes para continuar","Exercicio 2",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION); 
    }
}
