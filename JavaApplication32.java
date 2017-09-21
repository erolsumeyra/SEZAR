
package javaapplication32;


import java.util.Scanner;
public class JavaApplication32 {


    public static void main(String[] args) {
         Scanner scan=new Scanner (System.in);
        System.out.println("Kelime Giriniz:");
        String ad=scan.nextLine();
        System.out.println("Oteleme miktarini giriniz:");
        int otele=scan.nextInt();
        char sezar[]=new char[52];
        int k=0,temp;
        for(int i=65;i<91;i++)
        {
            sezar[k]=(char)i;
            k++;
        }
        for(int i=97;i<123;i++){
            sezar[k]=(char)i;
            k++;
        }
        for(int i=0;i<ad.length();i++){
        for(int j=0;j<52;j++){
            if(ad.charAt(i)==sezar[j])
            {if(j<26){
                temp=j+otele;
                temp%=26;
                System.out.println((char)sezar[temp]);
                
            }
            else{
                temp=j+otele;
                if(temp>51){
                    temp=(temp%52)+26;
                    System.out.println((char)sezar[temp]);
                    break;
                }
                else
                    temp=(temp%52);
                System.out.println((char)sezar[temp]);
            }}}}}
    }
