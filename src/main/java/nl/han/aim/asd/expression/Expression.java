package nl.han.aim.asd.expression;

public class Expression {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    private Expression left;
    private Expression right;

    @Override
    public String toString() {
        if (left == null && right == null) {
            return content;
        }        else {
            return left.toString() + content + right.toString();
        }
//        if (left == null) {
//            return content + right.toString();
//        }
//        if (right == null) {
//            return left.toString() + content;
//        }
//        if (content == null) {
//            return left.toString() + right.toString();
//        }
    }
}
