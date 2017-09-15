
int input1; //represents input line 1
String input2; //represents input line 2

public class Plus_Minus_slattumwr{

     public static void main(String[] args) {
          int input1 = args[0]; //represents input line 1
          String input2 = args[1]; //represents input line 2

          //Convert arg input into array of integers
          //1. loop through and grab each manually
          //FINISH THIS
          int[] inputArray = new int[input1];
          for(int y = 0; y < input2.length(); y++){
               inputArray[y] = input2.substring(0, input2.indexOf(" "));
          }

          //2. create array with String split (had to look up syntax)
          int[] inputArray = input2.split("\\s+");

          int numberPositive = 0;
          int numberNegative = 0;
          int numberZero = 0;

          Scanner scan = new Scanner(input2);


          for(int x = 0; x < inputArray.length; x++){
               //Greater than 0
               if(inputArray[x] > 0){
                    numberPositive++;
               }
               //Less than 0
               else if(inputArray[x] < 0){
                    numberNegative++;
               }
               //Equal to 0
               else{
                    numberZero ++;
               }
          }

          //Doubles representing %
          double percentPositive = numberPositive/inputArray.length;
          double percentNegative = numberNegative/inputArray.length;
          double percentZero = numberZero/inputArray.length;

          //How to trim to 6 digits?

          //1. string trim to 6 spaces after '.', have to convert double to String
          String positiveOut = Double.toString(percentPositive);
          String negativeOut = Double.toString(percentNegative);
          String zeroOut = Double.toString(percentZero);

          System.out.println(positiveOut.substring(0, (positiveOut.indexOf('.') + 6)));
          System.out.println(negativeOut.substring(0, (negativeOut.indexOf('.') + 6)));
          System.out.println(zeroOut.substring(0, (zeroOut.indexOf('.') + 6)));

          //2. DecimalFormat class (had to look up)
          DecimalFormat formatDecimals = new DecimalFormat("0.000000");

          System.out.println(formatDecimals.format(percentPositive));
          System.out.println(formatDecimals.format(percentNegative));
          System.out.println(formatDecimals.format(percentZero));

     }
}
