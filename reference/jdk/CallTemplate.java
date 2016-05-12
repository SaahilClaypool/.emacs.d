_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/CallTemplate.java
    private void buildParameterList() {

    /**
     * Build the list of effective parameters in this CallTemplate.
     * The parameters of the called template are put into the array first.
     * Then we visit the WithParam children of this CallTemplate and replace
     * the Param with a corresponding WithParam having the same name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/CallTemplate.java
    public Template getCalleeTemplate() {

    /**
     * Return the simple named template which this CallTemplate calls.
     * Return false if there is no matched template or the matched
     * template is not a simple named template.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/CallTemplate.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Verify that a template with this name exists.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/CallTemplate.java
    private Template _calleeTemplate = null;

    /**
     * The corresponding template which this CallTemplate calls.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/CallTemplate.java
    private Object[] _parameters = null;

    /**
     * The array of effective parameters in this CallTemplate. An object in
     * this array can be either a WithParam or a Param if no WithParam
     * exists for a particular parameter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/CallTemplate.java
    private QName _name;

    /**
     * Name of template to call.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/CallTemplate.java
final class CallTemplate extends Instruction {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Erwin Bolwidt <ejb@klomp.org>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/CallTemplate.java
    private void buildParameterList() {

    /**
     * Build the list of effective parameters in this CallTemplate.
     * The parameters of the called template are put into the array first.
     * Then we visit the WithParam children of this CallTemplate and replace
     * the Param with a corresponding WithParam having the same name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/CallTemplate.java
    public Template getCalleeTemplate() {

    /**
     * Return the simple named template which this CallTemplate calls.
     * Return false if there is no matched template or the matched
     * template is not a simple named template.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/CallTemplate.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Verify that a template with this name exists.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/CallTemplate.java
    private Template _calleeTemplate = null;

    /**
     * The corresponding template which this CallTemplate calls.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/CallTemplate.java
    private Object[] _parameters = null;

    /**
     * The array of effective parameters in this CallTemplate. An object in
     * this array can be either a WithParam or a Param if no WithParam
     * exists for a particular parameter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/CallTemplate.java
    private QName _name;

    /**
     * Name of template to call.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/CallTemplate.java
final class CallTemplate extends Instruction {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Erwin Bolwidt <ejb@klomp.org>
 */
