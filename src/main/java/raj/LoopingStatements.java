package raj;
/*
for loop
do while loop
while loop
-----------------------------------------
   increment by one -> i =i + 1;   === i++
   increment by two -> i = i + n;

   decrement by one -> i = i -1 ; === i--
   decrement by two -> i = i- n;

   ++i = pre increment
      i = 1;
       2 * 2; = 4
       i++ * 2 =2
       i = 2
   i++ = post increment
   --i = pre decrement
   i-- = post decrement


for(<intialization>;<condition>;<increment/decrement>){
        // Code which has to be repeated
        }

        eg: for(int i=0;i<10;i++){

        }

        int i = 0;
        while(i<10){
        // Code to be interated
        i++;
        }

        do {

        } while(<condition>);

        eg:
        int i =0;
        do {
        // Code to be repeated
        } while(i++<10);
 */
public class LoopingStatements {
    int i =0;
    String msg = "Repeat:";
    public void forLoop(){
        System.out.println("For loop");
        for(int i=0;i<10;i++){
            System.out.println(msg+i);
        }

        /*
          for(;i<10;i++){
          }

          for(int i=10;i<21;i++) {
          }

          for(int i=10;i>0;i--) {
          }

          for(int i=0;i%2==0;i++){
          }

          for(int i=0;i%2 == 1;i++){
          }

          for(;;){
            System.out.println("Infinite loop");
          }
         */
    }

    public void whileLoop(){
        /*
          while(true){
              System.out.println("Infinite loop");
          }
         */
        System.out.println("While loop");
        while(i<10){
            System.out.println(msg+(i++));
        }
    }

    public void doWhileLoop(){
        System.out.println("doWhile loop");
        /*
          do {
             System.out.println("Infinite loop");
          } while(true);
         */
        i = 0;
        do {
            System.out.println(msg+(i));
        }while(i++<9);
    }

    public void conditionalStatements(){
        int resultEven = 0;
        int resultOdd = 0;
        for(int i=0;i<10;i++){
            if(i%2 == 0) {
                resultEven = resultEven + i;
            }else {
                resultOdd = resultOdd + i;
            }
        }
        System.out.println("Even Sum:"+resultEven);
        System.out.println("Odd Sum:"+resultOdd);
    }

    public void compareNumbers(int a,int b){
        if(a>b){
            System.out.println(a+" is greater than "+b);
        } else if(a<b){
            System.out.println(b+" is greater than "+a);
        }
        else {
            System.out.println(b+" is equal to "+a);
        }
    }

    public void breakAndContinue(){
        /*
           And  -   &&  - Both the conditions on left and right side has to be true
           Or   -   ||  - Any of the conditions can be true
         */
        for(int i=0;i<10;i++){
            if(i==0 && i%2==0 ){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        LoopingStatements loopingStatements=new LoopingStatements();
        loopingStatements.forLoop();
        loopingStatements.whileLoop();
        loopingStatements.doWhileLoop();
        loopingStatements.conditionalStatements();
        loopingStatements.compareNumbers(2,3);
        loopingStatements.compareNumbers(4,2);
        loopingStatements.compareNumbers(5,5);
        loopingStatements.breakAndContinue();
    }
}
