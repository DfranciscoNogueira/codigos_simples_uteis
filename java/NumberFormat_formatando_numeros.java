01 package formata.dados;
02
03 import java.text.NumberFormat;
04 import java.util.Locale;
05
06 public class NumberFormat_formatando_numeros {
07 
08  public static void main(String[] args) {
09 
10      Locale localeBR = new Locale("pt","BR");
11     
12      double valorReal = 291933.1233;
13      float valorPercentual = 0.11f;
14      int valorInteiro = 82819912;
15     
16      NumberFormat inteiro = NumberFormat.getInstance();  
17      NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
18      NumberFormat percentual = NumberFormat.getPercentInstance(localeBR);
19      NumberFormat numberFormat = NumberFormat.getNumberInstance(localeBR);
20     
21      System.out.println("Valor Atual: "+valorReal);
22      System.out.println("Valor Formatado em Moeda: "+dinheiro.format(valorReal));
23     
24      System.out.println("Valor Atual: "+valorPercentual);
25      System.out.println("Valor Formatado em Percentual: "+percentual.format(valorPercentual));
26     
27      System.out.println("Valor Atual: "+valorInteiro);
28      System.out.println("Valor Formatado: "+inteiro.format(valorInteiro));
29     
30      System.out.println("Valor Atual: "+valorReal);
31      System.out.println("Valor Formatado padrão: "+numberFormat.format(valorReal));
32  }
33 }