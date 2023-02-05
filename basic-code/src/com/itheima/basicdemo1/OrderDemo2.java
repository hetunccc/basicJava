package com.itheima.basicdemo1;

public class OrderDemo2 {
    public static void main(String[] args) {
        //switch(){
        // case 値１：１；
        // break------> over
        //default:
        //n+1;
        //break
        // }
        //Scanner sc = new Scanner(System.in);
        //System.out.println("which do you want to eat");
        String a = "lamen";
        switch (a){
            case"lamen":
                System.out.println("eat lamen");
            break;
            case "wuhanreganmian":
                System.out.println("eat wuhanreganmian");
            break;
            case"youpomian":
                System.out.println("eat youpomian");
            break;
            default:
                System.out.println("eat cupnuddles");
                break;
        }
    }
}
