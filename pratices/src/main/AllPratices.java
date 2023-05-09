package main;

import java.util.Scanner;

public class AllPratices {

    // 0.Yazilmish reqemi soze chevirin meselen: 125 : bir yuz iyirmi besh
    public static void pratices1(){
        int reqem = 125;
        String e = String.valueOf(reqem);
        System.out.println("reqem versiyasi: "+reqem);

        String[] reqemSozleri = {"yuz","iyrimi","bes"};

        for (int i=0;i<reqemSozleri.length;i++){
            System.out.print(reqemSozleri[i]);
        }
    }

    //1. 0-dan verilmish edede qeder butun 2-ye bolune bilen ededleri chap et. Ipucu: % ve / istifade edeceksiniz
    public static void pratices2(){
        Scanner sc= new Scanner(System.in);
        System.out.println("eded daxil edin: ");
        int r = sc.nextInt();
        for (int i=0;i<r;i++){
            if (i%2==0){
                System.out.println("cut ededler : "+i);
            }else{
                System.out.println("tek ededler: "+i);
            }
        }
    }

    //verilmis ededinlerin cemini tap
    public static void pratices3(){
        int value = 12345;
        int cem=0;

        while(value>0){
            int qaliq = value%10; //her defe bolunende ededin qaliqin verir
            value = value/10; // her defe ededlerin tamini verir,qaliqi cixandan sonra
            cem += qaliq; // ve her qaliq olanlari toplayir neticesin verir.
        }
        System.out.println(cem);
    }

    //3cu deyisenden istifade etmeden,verilmis deyerlerin yerini deyis
    public static void pratices4(){
        int a = 5;
        int b = 7;

        System.out.println(a);
        System.out.println(b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }

    //faktorial for ile
    public static void pratices5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter values: ");
        int value = sc.nextInt();
        int result =1;

        for (int i=1;i<=value;i++){
            result*=i;
        }
        System.out.println(result);
    }
    //faktorial forsuz
    public static int pratices6(int n){
        if (n == 0){
            return 1;
        }else {
            return (n*pratices6(n-1));
        }
    }

    //reqemlerin tersi ile duzunu yoxlamag
    public static int pratices7(int value){
        int reverse = 0;
        while (value>0){
            reverse*=10;
            reverse+= value%10;
            value = value/10;
        }
        return reverse;
    }

    public static boolean pratices8(int value){
        return value== pratices7(value);
    }

    //Stringde olan sozun tersi ile duzunu yoxlamag.
    public static boolean pratices9(){
        String str = "SOSO";
        for (int i=0;i<str.length();i++){
            char sol = str.charAt(i);
            char sag = str.charAt(str.length()-1-i);
            if (sol != sag){
                return false;
            }
        }
        return true;
    }

    //method 1 reqem,1 simvol,1 boolean qebul edir,a qeder c symvolunu cap etsin eger boolean truedise alt alta,eks halda yan yana cap etsin
    public static void sendMethodsParametr(int i,char c, boolean b){
        for (int value=0;value<i;value++){
            if (b == true){
                System.out.println(c);
            }else {
                System.out.print(c);
            }
        }
    }


//    method 3 reqem qebul edir a,b,c,
//    public static void foo(int a, int b, int c)
//    a-dan b-ye qeder butun ededleri c qeder quvvete yukseldir Math.pow-dan istifadə edərək

    public static void quvveteYuksetmeCqeder(int a,int b,int c){
        for (;a<=b;a++){
            System.out.println(Math.pow(a,c));
        }
    }


    //methoda daxil edilen reqemin musbet, menfi yoxsa 0 oldugunu teyin eden method yazin.
    public static void ededinMefiMusbetBereberliyiYoxlayan(int i){
        if (i<0){
            System.out.println("-1");
        }else if (i>0){
            System.out.println("+1");
        }else {
            System.out.println("0");
        }
    }

}
