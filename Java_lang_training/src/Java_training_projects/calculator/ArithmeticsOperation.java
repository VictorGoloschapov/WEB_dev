package Java_training_projects.calculator;

public interface ArithmeticsOperation {
    int getNumber();
    char getMathOperation();
    int calculation(int num1, int num2, char mathOperator);
}
