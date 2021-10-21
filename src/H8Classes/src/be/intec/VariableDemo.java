package be.intec;

public class VariableDemo {
    private int instanceVariable;

    public void method(){
        int localVariable = 1;


        if (true){
            int variable2 = 2;
        }

        int testVariable = instanceVariable;
        testVariable = localVariable;
//        testVariable = variable2;
        // shows variable2 is inaccessible outside if statement
    }
}
