package Interpreter;

class OperationExpression implements Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;
    private final char operator;

    public OperationExpression(Expression leftExpression, Expression rightExpression, char operator) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator = operator;
    }

    @Override
    public int interpret() {
        switch (operator) {
            case '+':
                return leftExpression.interpret() + rightExpression.interpret();
            case '-':
                return leftExpression.interpret() - rightExpression.interpret();
            default:
                throw new UnsupportedOperationException("Unsupported operation");
        }
    }
}