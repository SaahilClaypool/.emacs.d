_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    public InstructionHandle compile(ClassGenerator classGen,
                                     MethodGenerator methodGen,
                                     InstructionHandle continuation)

    /**
     * Compile the code for this test sequence. Compile patterns
     * from highest to lowest priority. Note that since patterns
     * can be share by multiple test sequences, instruction lists
     * must be copied before backpatching.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    private LocationPathPattern getPattern(int n) {

    /**
     * Returns pattern n in this test sequence
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    private InstructionHandle getTemplateHandle(Template template) {

    /**
     * Get the instruction handle to a template's code. This is
     * used when a single template occurs in several test
     * sequences; that is, if its pattern is a union of patterns
     * (e.g. match="A/B | A/C").
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    public void findTemplates(Map<Template, Object> templates) {

    /**
     * Returns, by reference, the templates that are included in
     * this test sequence. Note that a single template can occur
     * in several test sequences if its pattern is a union.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    public void reduce() {

    /**
     * Reduce the patterns in this test sequence. Creates a new
     * vector of patterns and sets the default pattern if it
     * finds a patterns that is fully reduced.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    public int getPosition() {

    /**
     * Returns the position of the highest priority pattern in
     * this test sequence.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    public double getPriority() {

    /**
     * Return the highest priority for a pattern in this test
     * sequence. This is either the priority of the first or
     * of the default pattern.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    public InstructionList getInstructionList() {

    /**
     * Returns the instruction list for this test sequence
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    public String toString() {

    /**
     * Returns a string representation of this test sequence. Notice
     * that test sequences are mutable, so the value returned by this
     * method is different before and after calling reduce().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    public TestSeq(Vector patterns, Mode mode) {

    /**
     * Creates a new test sequence given a set of patterns and a mode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    private InstructionHandle _start = null;

    /**
     * Cached handle to avoid compiling more than once.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    private InstructionList _instructionList;

    /**
     * Instruction list representing this test sequence.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    private Template _default = null;

    /**
     * Default template for this test sequence
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    private Mode _mode = null;

    /**
     * A reference to the Mode object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    private Vector _patterns = null;

    /**
     * Vector of all patterns in the test sequence. May include
     * patterns with "*", "@*" or "node()" kernel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    private int _kernelType;

    /**
     * Integer code for the kernel type of this test sequence
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
final class TestSeq {

/**
 * A test sequence is a sequence of patterns that
 *
 *  (1) occured in templates in the same mode
 *  (2) share the same kernel node type (e.g. A/B and C/C/B)
 *  (3) may also contain patterns matching "*" and "node()"
 *      (element sequence only) or matching "@*" (attribute
 *      sequence only).
 *
 * A test sequence may have a default template, which will be
 * instantiated if none of the other patterns match.
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Erwin Bolwidt <ejb@klomp.org>
 * @author Morten Jorgensen <morten.jorgensen@sun.com>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    public InstructionHandle compile(ClassGenerator classGen,
                                     MethodGenerator methodGen,
                                     InstructionHandle continuation)

    /**
     * Compile the code for this test sequence. Compile patterns
     * from highest to lowest priority. Note that since patterns
     * can be share by multiple test sequences, instruction lists
     * must be copied before backpatching.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    private LocationPathPattern getPattern(int n) {

    /**
     * Returns pattern n in this test sequence
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    private InstructionHandle getTemplateHandle(Template template) {

    /**
     * Get the instruction handle to a template's code. This is
     * used when a single template occurs in several test
     * sequences; that is, if its pattern is a union of patterns
     * (e.g. match="A/B | A/C").
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    public void findTemplates(Map<Template, Object> templates) {

    /**
     * Returns, by reference, the templates that are included in
     * this test sequence. Note that a single template can occur
     * in several test sequences if its pattern is a union.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    public void reduce() {

    /**
     * Reduce the patterns in this test sequence. Creates a new
     * vector of patterns and sets the default pattern if it
     * finds a patterns that is fully reduced.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    public int getPosition() {

    /**
     * Returns the position of the highest priority pattern in
     * this test sequence.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    public double getPriority() {

    /**
     * Return the highest priority for a pattern in this test
     * sequence. This is either the priority of the first or
     * of the default pattern.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    public InstructionList getInstructionList() {

    /**
     * Returns the instruction list for this test sequence
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    public String toString() {

    /**
     * Returns a string representation of this test sequence. Notice
     * that test sequences are mutable, so the value returned by this
     * method is different before and after calling reduce().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    public TestSeq(Vector patterns, Mode mode) {

    /**
     * Creates a new test sequence given a set of patterns and a mode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    private InstructionHandle _start = null;

    /**
     * Cached handle to avoid compiling more than once.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    private InstructionList _instructionList;

    /**
     * Instruction list representing this test sequence.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    private Template _default = null;

    /**
     * Default template for this test sequence
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    private Mode _mode = null;

    /**
     * A reference to the Mode object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    private Vector _patterns = null;

    /**
     * Vector of all patterns in the test sequence. May include
     * patterns with "*", "@*" or "node()" kernel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
    private int _kernelType;

    /**
     * Integer code for the kernel type of this test sequence
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/TestSeq.java
final class TestSeq {

/**
 * A test sequence is a sequence of patterns that
 *
 *  (1) occured in templates in the same mode
 *  (2) share the same kernel node type (e.g. A/B and C/C/B)
 *  (3) may also contain patterns matching "*" and "node()"
 *      (element sequence only) or matching "@*" (attribute
 *      sequence only).
 *
 * A test sequence may have a default template, which will be
 * instantiated if none of the other patterns match.
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Erwin Bolwidt <ejb@klomp.org>
 * @author Morten Jorgensen <morten.jorgensen@sun.com>
 */
