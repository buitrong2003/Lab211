package p0011;


/**
 *
 * @author Nam Ast
 */
public class p0011 {
     public static void main(String[] args) {
        do{
        //1 Required user choose the base input value
            int baseInput = getData.getBase("Enter the base input: ", 1, 4, 0);
        //2 Required user choose the base output value
            int baseOutput = getData.getBase("Enter the base output: ", 1, 4, baseInput);
        //3 Input value to convert
            String valueInput = getData.getInput("Enter the input value: ", baseInput);
        //4 Program process 
            String result = Manager.convertValue(valueInput, baseInput,  baseOutput);
            //display output value
            displayData.displayResult(result);
        }while(true);
    }
}
