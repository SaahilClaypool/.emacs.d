_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
        public boolean visitNumberLiteral(ExpressionOwner owner, XNumber num)

        /**
         * Visit a number literal.
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param num The number literal object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
        public boolean visitStringLiteral(ExpressionOwner owner, XString str)

        /**
         * Visit a string literal.
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param str The string literal object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
        public boolean visitUnionPattern(ExpressionOwner owner, UnionPattern pattern)

        /**
         * Visit a union pattern.
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param pattern The union pattern object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
        public boolean visitMatchPattern(ExpressionOwner owner, StepPattern pattern)

        /**
         * Visit a match pattern.
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param pattern The match pattern object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
        public boolean visitFunction(ExpressionOwner owner, Function func)

        /**
         * Visit a function.
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param func The function reference object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
        public boolean visitVariableRef(ExpressionOwner owner, Variable var)

        /**
         * Visit a variable reference.
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param var The variable reference object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
        public boolean visitUnaryOperation(ExpressionOwner owner, UnaryOperation op)

        /**
         * Visit a unary operation.
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param op The operation object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
        public boolean visitBinaryOperation(ExpressionOwner owner, Operation op)

        /**
         * Visit a binary operation.
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param op The operation object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
        public boolean visitPredicate(ExpressionOwner owner, Expression pred)

        /**
         * Visit a predicate within a location path.  Note that there isn't a
         * proper unique component for predicates, and that the expression will
         * be called also for whatever type Expression is.
         *
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param pred The predicate object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
        public boolean visitStep(ExpressionOwner owner, NodeTest step)

        /**
         * Visit a step within a location path.
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param step The Step object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
        public boolean visitUnionPath(ExpressionOwner owner, UnionPathIterator path)

        /**
         * Visit a UnionPath.
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param path The UnionPath object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
        public boolean visitLocationPath(ExpressionOwner owner, LocPathIterator path)

        /**
         * Visit a LocationPath.
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param path The LocationPath object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
public class XPathVisitor

/**
 * A derivation from this class can be passed to a class that implements
 * the XPathVisitable interface, to have the appropriate method called
 * for each component of the XPath.  Aside from possible other uses, the
 * main intention is to provide a reasonable means to perform expression
 * rewriting.
 *
 * <p>Each method has the form
 * <code>boolean visitComponentType(ExpressionOwner owner, ComponentType compType)</code>.
 * The ExpressionOwner argument is the owner of the component, and can
 * be used to reset the expression for rewriting.  If a method returns
 * false, the sub hierarchy will not be traversed.</p>
 *
 * <p>This class is meant to be a base class that will be derived by concrete classes,
 * and doesn't much except return true for each method.</p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
        public boolean visitNumberLiteral(ExpressionOwner owner, XNumber num)

        /**
         * Visit a number literal.
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param num The number literal object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
        public boolean visitStringLiteral(ExpressionOwner owner, XString str)

        /**
         * Visit a string literal.
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param str The string literal object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
        public boolean visitUnionPattern(ExpressionOwner owner, UnionPattern pattern)

        /**
         * Visit a union pattern.
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param pattern The union pattern object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
        public boolean visitMatchPattern(ExpressionOwner owner, StepPattern pattern)

        /**
         * Visit a match pattern.
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param pattern The match pattern object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
        public boolean visitFunction(ExpressionOwner owner, Function func)

        /**
         * Visit a function.
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param func The function reference object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
        public boolean visitVariableRef(ExpressionOwner owner, Variable var)

        /**
         * Visit a variable reference.
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param var The variable reference object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
        public boolean visitUnaryOperation(ExpressionOwner owner, UnaryOperation op)

        /**
         * Visit a unary operation.
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param op The operation object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
        public boolean visitBinaryOperation(ExpressionOwner owner, Operation op)

        /**
         * Visit a binary operation.
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param op The operation object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
        public boolean visitPredicate(ExpressionOwner owner, Expression pred)

        /**
         * Visit a predicate within a location path.  Note that there isn't a
         * proper unique component for predicates, and that the expression will
         * be called also for whatever type Expression is.
         *
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param pred The predicate object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
        public boolean visitStep(ExpressionOwner owner, NodeTest step)

        /**
         * Visit a step within a location path.
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param step The Step object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
        public boolean visitUnionPath(ExpressionOwner owner, UnionPathIterator path)

        /**
         * Visit a UnionPath.
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param path The UnionPath object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
        public boolean visitLocationPath(ExpressionOwner owner, LocPathIterator path)

        /**
         * Visit a LocationPath.
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param path The LocationPath object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitor.java
public class XPathVisitor

/**
 * A derivation from this class can be passed to a class that implements
 * the XPathVisitable interface, to have the appropriate method called
 * for each component of the XPath.  Aside from possible other uses, the
 * main intention is to provide a reasonable means to perform expression
 * rewriting.
 *
 * <p>Each method has the form
 * <code>boolean visitComponentType(ExpressionOwner owner, ComponentType compType)</code>.
 * The ExpressionOwner argument is the owner of the component, and can
 * be used to reset the expression for rewriting.  If a method returns
 * false, the sub hierarchy will not be traversed.</p>
 *
 * <p>This class is meant to be a base class that will be derived by concrete classes,
 * and doesn't much except return true for each method.</p>
 */
