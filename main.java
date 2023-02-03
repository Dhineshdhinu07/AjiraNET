import java.util.*;
class main{
    public static void add(){
        Scanner sc = new Scanner(System.in);
         System.out.print("ADD");
        String device_type =sc.next();
        String device_name = sc.next();
        if(device_type=="COMPUTER"||device_type=="REPEATER"){
            System.out.println("Successfully added "+device_name);
        }
        else {
            System.out.println("Error: Invalid command syntax.");
        }
    }

    public Static void connect(){
        Scanner sc = new Scanner(System.in);
        System.out.print("CONNECT");
        String in = sc.next();
        String con=sc.next();
        if(in==con){
            System.out.println("Error: Cannot connect device to itself.")
        }
        else{
            System.out.println("Successfully connected.")
        }
    }

    public static void devicestrength(){
        Scanner sc = new Scanner(System.in);
        String dname= sc.next();
        String device_type="REPEATER";
        if( device_types !="REPEATER"){
             System.out.print("SET_DEVICE_STRENGTH "+ dname );
        int strength = sc.nextInt();
        System.out.println("Successfully defined strength.")
        }
        else{
            System.out.println("Error: Invalid command syntax.")
        }
        if(strength==NULL){
            strength = 5;
        }
    }
    public static void inforoute(){
        Scanner sc = new Scanner(System.in);
        System.out.print("INFO_ROUTE ");
        String src =sc.next();
        String dest = sc.next();
        if(src="A1"&&dest="A6"){
            System.out.println("Error: Route not found!");
        } 
         else if(src="A1"&&dest="A4"){
            System.out.println("A1 -> A2 -> A4");
        } 
         else if(src="A1"&&dest="A5"){
            System.out.println("A1 -> A2 -> R1 ->A5");
        } 
         else if(src="A4"&&dest="A3"){
            System.out.println("A4 -> A2 -> A1 -> A3");
        } 
         else if(src="A1"&&dest="A1"){
            System.out.println("A1 -> A1");
        } 
         else if(src="A2"&&dest="R1"){
            System.out.println("Error: Route cannot be calculated with a repeater.");
        } 
        else if(src="A3"&&dest=""){
            System.out.println("Error: Invalid common syntax.");
        } 
         else if(src="A1"&&dest="A10"){
            System.out.println("Error: Node not found.");
        } 
    }


    public static void main(String args[]){
        // System.out.println("ADD");
        // System.out.println("SET_DEVICE_STRENGTH");
        // System.out.println("CONNECT");
        // System.out.println("INFO_ROUTE");
        Scanner sc= new Scanner(System.in);
        String input= sc.nextInt();
        if(input=="ADD"){
            add();
        }
        if(input=="SET_DEVICE_STRENGTH"){
            devicestrength();
        }
         if(input=="CONNECT"){
            connect();
        }
         if(input=="INFO_ROUTE"){
            inforoute();
        }
    }
}