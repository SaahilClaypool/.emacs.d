_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    private static MethodGenerator compileExtract(Vector sortObjects,
                                         NodeSortRecordGenerator sortRecord,
                                         ConstantPoolGen cpg,
                                         String className) {

    /**
     * Compiles a method that overloads NodeSortRecord.extractValueFromDOM()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    private static MethodGenerator compileInit(Vector sortObjects,
                                           NodeSortRecordGenerator sortRecord,
                                           ConstantPoolGen cpg,
                                           String className)

    /**
     * Create a constructor for the new class. Updates the reference to the
     * collator in the super calls only when the stylesheet specifies a new
     * language in xsl:sort.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    private static String compileSortRecord(Vector sortObjects,
                                            ClassGenerator classGen,
                                            MethodGenerator methodGen) {

    /**
     * Create a new auxillary class extending NodeSortRecord.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    public static void compileSortRecordFactory(Vector sortObjects,
        ClassGenerator classGen, MethodGenerator methodGen)

    /**
     * Compiles code that instantiates a NodeSortRecordFactory object which
     * will produce NodeSortRecord objects of a specific type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    public static void translateSortIterator(ClassGenerator classGen,
                                      MethodGenerator methodGen,
                                      Expression nodeSet,
                                      Vector sortObjects)

    /**
     * Compiles code that instantiates a SortingIterator object.
     * This object's constructor needs referencdes to the current iterator
     * and a node sort record producing objects as its parameters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * This method should not produce any code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    public void translateSelect(ClassGenerator classGen,
                                MethodGenerator methodGen) {

    /**
     * This method compiles code for the select expression for this
     * xsl:sort element. The method is called from the static code-generating
     * methods in this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    public void translateSortType(ClassGenerator classGen,
                                  MethodGenerator methodGen) {

    /**
     * These two methods are needed in the static methods that compile the
     * overloaded NodeSortRecord.compareType() and NodeSortRecord.sortOrder()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Run type checks on the attributes; expression must return a string
     * which we will use as a sort key
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    public void parseContents(Parser parser) {

    /**
     * Parse the attributes of the xsl:sort element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    public void addVariable(VariableRefBase variableRef) {

    /**
     * Add new variable to the closure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    public String getInnerClassName() {

    /**
     * Returns the name of the auxiliary class or null if this predicate
     * is compiled inside the Translet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    public Closure getParentClosure() {

    /**
     * Returns a reference to its parent closure or null if outermost.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    public boolean inInnerClass() {

    /**
     * Returns true if this closure is compiled in an inner class (i.e.
     * if this is a real closure).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
final class Sort extends Instruction implements Closure {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    private static MethodGenerator compileExtract(Vector sortObjects,
                                         NodeSortRecordGenerator sortRecord,
                                         ConstantPoolGen cpg,
                                         String className) {

    /**
     * Compiles a method that overloads NodeSortRecord.extractValueFromDOM()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    private static MethodGenerator compileInit(Vector sortObjects,
                                           NodeSortRecordGenerator sortRecord,
                                           ConstantPoolGen cpg,
                                           String className)

    /**
     * Create a constructor for the new class. Updates the reference to the
     * collator in the super calls only when the stylesheet specifies a new
     * language in xsl:sort.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    private static String compileSortRecord(Vector sortObjects,
                                            ClassGenerator classGen,
                                            MethodGenerator methodGen) {

    /**
     * Create a new auxillary class extending NodeSortRecord.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    public static void compileSortRecordFactory(Vector sortObjects,
        ClassGenerator classGen, MethodGenerator methodGen)

    /**
     * Compiles code that instantiates a NodeSortRecordFactory object which
     * will produce NodeSortRecord objects of a specific type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    public static void translateSortIterator(ClassGenerator classGen,
                                      MethodGenerator methodGen,
                                      Expression nodeSet,
                                      Vector sortObjects)

    /**
     * Compiles code that instantiates a SortingIterator object.
     * This object's constructor needs referencdes to the current iterator
     * and a node sort record producing objects as its parameters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * This method should not produce any code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    public void translateSelect(ClassGenerator classGen,
                                MethodGenerator methodGen) {

    /**
     * This method compiles code for the select expression for this
     * xsl:sort element. The method is called from the static code-generating
     * methods in this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    public void translateSortType(ClassGenerator classGen,
                                  MethodGenerator methodGen) {

    /**
     * These two methods are needed in the static methods that compile the
     * overloaded NodeSortRecord.compareType() and NodeSortRecord.sortOrder()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Run type checks on the attributes; expression must return a string
     * which we will use as a sort key
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    public void parseContents(Parser parser) {

    /**
     * Parse the attributes of the xsl:sort element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    public void addVariable(VariableRefBase variableRef) {

    /**
     * Add new variable to the closure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    public String getInnerClassName() {

    /**
     * Returns the name of the auxiliary class or null if this predicate
     * is compiled inside the Translet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    public Closure getParentClosure() {

    /**
     * Returns a reference to its parent closure or null if outermost.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
    public boolean inInnerClass() {

    /**
     * Returns true if this closure is compiled in an inner class (i.e.
     * if this is a real closure).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Sort.java
final class Sort extends Instruction implements Closure {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
