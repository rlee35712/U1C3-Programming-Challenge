public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    private String calcModel;
    private int idNumber;

    public Solution(String model, int id) {
        calcModel = model; 
        idNumber = id; 
    }

    public Solution(int id) {
        calcModel = "TI-84"; 
    }

    public String getCalcModel() {
        calc.getCalcModel();  
        calc.getIdNumber(); 
        return "";
    }

    public void setCalcModel(String newModel) {
        newModel = calcModel; 
    }

    public int getIdNumber() {
        //implement code here
        return 0;
    }

    public void setIdNumber(int newId) {
        newId = idNumber; 
    }

    public void incrementId() {
        newId += 1; 
    }

    public double add(double num1, double num2) {
        double added; 
        add = num1 + num2; 
    }

    public double subtract(double num1, double num2) {
        double subtracted; 
        subtracted = num1 - num2; 
        return subtracted; 
    }

    public double multiply(double num1, double num2) {
        double multiplied; 
        multiplied = num1 * num2; 
        return multiplied; 
    }

    public int quotient(int num1, int num2) {
        int divided; 
        divided = num1 / num2; 
        return divided; 
    }

    public int remainder(int num1, int num2) {
        int remain; 
        remain = num1 % num2; 
        return remain; 
    }

    public String divisionResult(int num1, int num2) {
        return divided + " R " + remain; 
    }

    public String coordinatePair(int x, int y) {
        return "(" + x + ", " + y + ")"; 
    }

    public int average(int num1, int num2) {
        return (num1 + num2) / 2; 
    }

    public String info() {
        return "This calculator is a model " + newModel + " with id " + newId; 
    }

}
