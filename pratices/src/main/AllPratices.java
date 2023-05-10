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

    //Methoda 4 reqem daxil edilir
    // eger bu reqemlerden her hansisa 2-si bir birine beraberdirse geriye true qaytarsin

    public static boolean reqemlerin2birbirineBereberdirse(int a,int b,int c,int d){
        if (a == b || a == c || a == d){
            return true;
        }else if (b == a || b == c || b == d){
            return true;
        }else if (c == a || c == b || c == d){
            return true;
        }else if (d == a || d == b || d == c){
            return true;
        }else {
            return false;
        }
//        return false;
    }

    //Methoda 4 reqem daxil edilir.a,b,c,d eger ededler artan
    // ardicilliqla daxil edilibse geriye true qaytarsin eks halda false

    public static boolean reqemlerinArdiciliqlaArtirilmasiniYoxlamaq(int a,int b,int c,int d){
        if (a <= b && b <= c && c <= d){
            return true;
        }
        return false;
    }

    //Method bir String ve bir int qebul edir ve
    // hemin String-in hemin index-inde olan simvolunu qaytarsin.

    public static char returnStringInCharAtNumbers(String s,int i){
        return s.charAt(i);
    }

    //Method 2 String qebul edir ve onlarin beraber olub olmadigini return edir true ve ya false
    public static boolean StringinBirBiriIleDuzOlubOlmadiginiYoxlamag(String s,String a){
        return s.equals(a);
    }


    //Method String s, char c, int count qebul edir. S-i count qeder c ile birleshdirir ve geriye return edir

    public static String chariCountQederArtirStringeMenimset(String s,int count,char c){
        for (int i=0;i<count;i++){
            s+=c;
        }
        return s;
    }

    //Method 3 String qebul edir. String a, String b, String c. A ve b-nin ichinde c varsa onda true eks halda false
    public static boolean gonderilenStringlerIcindeCstringiVarsa(String a,String b,String c){
        if (a.contains(c) || b.contains(c)){
            return true;
        }
        return false;
    }

    //method String a, int begin, int end daxil edilir. A-nin begin ve end arasini alt alta chap edir.

    public static void stiringSozunAraliqi(String s,int begin,int end){
        for (int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }

    //2 soz daxil edilir uzunlugu boyuk olan String geriye return edilir.
    public static String uzunluguOlanStringReturnEdir(String str,String str2){
        int a = str.length();
        int b = str2.length();

        if (a >= b){
            return str;
        }else {
            return str2;
        }
    }

    //Ele bir method yazin ki: HeLLo WorlD-> chevrilsin olsun hEllO wORLd.

    public static void balacalariBoyuyeBoyukleriBalacayaCevirme(String str){
        String modified = "";

        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                modified+=Character.toLowerCase(c);
            }else {
                modified+=Character.toUpperCase(c);
            }
        }
        System.out.println(modified);
    }

    //”     Salam necesen ishler nece gedir      “ metnini “Salam necesen ishler nece gedir” halina getirin.
    public static void solSagBosluqlariniSilmek(String str){
        System.out.println(str.trim());
    }





}
