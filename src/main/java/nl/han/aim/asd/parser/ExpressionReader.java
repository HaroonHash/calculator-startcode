package nl.han.aim.asd.parser;

import nl.han.aim.asd.expression.Expression;

import java.util.Stack;

/**
 * Created by Michel Koolwaaij on 10-10-18.
 */
public class ExpressionReader extends ExpressionsBaseListener {
    Stack<Expression> expressions = new Stack<Expression>();

    public Expression getTopExpression() {
        return expressions.peek();
    }

    // TODO 4.3 1b -- Maak een Antlr listener klasse waarmee je
    //  de geparseerde sommen omzet naar de bijbehorende AST’s.

    @Override
    public void exitExpression(ExpressionsParser.ExpressionContext ctx) {
        if (ctx.getChildCount() == 1) {
            Expression e = new Expression();
            e.setContent(ctx.getText());
//        System.out.println(ctx.getText());
            expressions.push(e);
        } else if (ctx.getChildCount() == 3) {
            
        }
    }
}