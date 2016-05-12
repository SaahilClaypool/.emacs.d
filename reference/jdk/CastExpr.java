_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/CastExpr.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Type checking a cast expression amounts to verifying that the
     * type conversion is legal. Cast expressions are created during
     * type checking, but typeCheck() is usually not called on them.
     * As a result, this method is called from the constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/CastExpr.java
    public boolean hasPositionCall() {

    /**
     * Returns true if this expressions contains a call to position(). This is
     * needed for context changes in node steps containing multiple predicates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/CastExpr.java
    public CastExpr(Expression left, Type type) throws TypeCheckError {

    /**
     * Construct a cast expression and check that the conversion is
     * valid by calling typeCheck().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/CastExpr.java
    private static final MultiHashtable<Type, Type> InternalTypeMap = new MultiHashtable<>();

    /**
     * Legal conversions between internal types.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/CastExpr.java
final class CastExpr extends Expression {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 * @author Erwin Bolwidt <ejb@klomp.org>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/CastExpr.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Type checking a cast expression amounts to verifying that the
     * type conversion is legal. Cast expressions are created during
     * type checking, but typeCheck() is usually not called on them.
     * As a result, this method is called from the constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/CastExpr.java
    public boolean hasPositionCall() {

    /**
     * Returns true if this expressions contains a call to position(). This is
     * needed for context changes in node steps containing multiple predicates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/CastExpr.java
    public CastExpr(Expression left, Type type) throws TypeCheckError {

    /**
     * Construct a cast expression and check that the conversion is
     * valid by calling typeCheck().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/CastExpr.java
    private static final MultiHashtable<Type, Type> InternalTypeMap = new MultiHashtable<>();

    /**
     * Legal conversions between internal types.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/CastExpr.java
final class CastExpr extends Expression {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 * @author Erwin Bolwidt <ejb@klomp.org>
 */
