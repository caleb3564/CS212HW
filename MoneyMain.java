package Lab17;

public class MoneyMain {
   
    static String[] dataSource =  {"B5","Q","B20","Q","P","D","N","D"};
    static Money[] wallet = new Money[dataSource.length];
    
    public static void main (String[] args) {
             
       for (int i=0;i<dataSource.length;i++){
          char dataItem = dataSource[i].charAt(0);
          if (dataItem == 'B') {
             int billValue= Integer.parseInt(dataSource[i].substring(1,dataSource[i].length()));
             wallet[i]= new Bill(billValue);
          }   
             if (dataItem == 'Q')
                wallet[i]=new Quarter();
          else
             if (dataItem == 'P')
                wallet[i]=new Penny();
          else
             if (dataItem == 'D')
                wallet[i]=new Dime();
          else
             if (dataItem == 'N')
                wallet[i]=new Nickel();
          }
       printWallet();
       sumWallet();
    }
    public static void printWallet () {
       for (int i=0;i<wallet.length;i++) System.out.println(wallet[i]);
    }
   public static void sumWallet(){
      double sum = 0;
      for (int i = 0; i <wallet.length; i++){
         sum += Double.parseDouble(wallet[i].toString().substring(1,5));
      }
      System.out.printf("The total in the wallet is: $%.2f",sum);
      System.out.println(); 
   }
 }