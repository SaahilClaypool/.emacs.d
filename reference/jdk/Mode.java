_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private static boolean isNamespaceName(String qname) {

    /**
     * Auxiliary method to determine if a qname is a namespace
     * qualified "*".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private static boolean isAttributeName(String qname) {

    /**
     * Auxiliary method to determine if a qname is an attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private void peepHoleOptimization(MethodGenerator methodGen) {

    /**
      * Peephole optimization.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    public void compileApplyTemplates(ClassGenerator classGen) {

   /**
     * Compiles the applyTemplates() method and adds it to the translet.
     * This is the main dispatch method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private InstructionList compileDefaultText(ClassGenerator classGen,
                                               MethodGenerator methodGen,
                                               InstructionHandle next) {

    /**
     * Compiles the default action for DOM text nodes and attribute nodes:
     * output the node's text value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private InstructionList compileDefaultRecursion(ClassGenerator classGen,
                                                    MethodGenerator methodGen,
                                                    InstructionHandle next) {

    /**
     * Compiles the default handling for DOM elements: traverse all children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private void prepareTestSequences() {

    /**
     * Build test sequences. The first step is to complete the test sequences
     * by including patterns of "*" and "node()" kernel to all element test
     * sequences, and of "@*" to all attribute test sequences.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private void completeTestSequences(int nodeType, Vector patterns) {

    /**
     * Complete test sequences of a given type by adding all patterns
     * from a given group.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private void addPattern(int kernelType, LocationPathPattern pattern) {

    /**
     * Adds a pattern to a pattern group
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private void addPatternToGroup(final LocationPathPattern lpp) {

    /**
     * Group patterns by NodeTests of their last Step
     * Keep them sorted by priority within group
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private void flattenAlternative(Pattern pattern,
                                    Template template,
                                    Map<String, Key> keys) {

    /**
     * This method will break up alternative patterns (ie. unions of patterns,
     * such as match="A/B | C/B") and add the basic patterns to their
     * respective pattern groups.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    public void processPatterns(Map<String, Key> keys) {

    /**
     * Process all the test patterns in this mode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private String getClassName() {

    /**
     * Shortcut to get the class compiled for this mode (will be inlined).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    public String functionName() {

    /**
     * Returns the name of the method (_not_ function) that will be
     * compiled for this mode. Normally takes the form 'applyTemplates()'
     * or * 'applyTemplates2()'.
     *
     * @return Method name for this mode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    public Mode(QName name, Stylesheet stylesheet, String suffix) {

    /**
     * Creates a new Mode.
     *
     * @param name A textual representation of the mode's QName
     * @param stylesheet The Stylesheet in which the mode occured
     * @param suffix A suffix to append to the method name for this mode
     *               (normally a sequence number - still in a String).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private int _currentIndex;

    /**
     * Variable index for the current node used in code generation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private Map<String, Key> _keys = null;

    /**
     * A mapping between key names and keys.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private Map<Integer, Integer> _importLevels = null;

    /**
     * Stores ranges of template precendences for the compilation
     * of apply-imports.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private LocationPathPattern _rootPattern = null;

    /**
     * A reference to the pattern matching the root node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private Map<Template, InstructionList> _templateILs = new HashMap<>();

    /**
     * A mapping between templates and instruction lists.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private Map<Template, InstructionHandle> _templateIHs = new HashMap<>();

    /**
     * A mapping between templates and instruction handles.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private Map<Template, Mode> _namedTemplates = new HashMap<>();

    /**
     * A mapping between named templates and Mode objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private Map<Template, Object> _neededTemplates = new HashMap<>();

    /**
     * A mapping between templates and test sequences.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private TestSeq[] _testSeq;

    /**
     * Test sequence for patterns with any other kernel type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private Vector[] _patternGroups;

    /**
     * Group for patterns with any other kernel type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private TestSeq _idxTestSeq = null;

    /**
     * Test sequence for patterns with id() or key()-type kernel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private Vector _idxGroup = null;

    /**
     * Group for patterns with id() or key()-type kernel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private TestSeq _attribNodeTestSeq = null;

    /**
     * Test sequence for patterns with node()-type kernel and attribute axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private Vector _attribNodeGroup = null;

    /**
     * Group for patterns with node()-type kernel and attribute axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private TestSeq _childNodeTestSeq = null;

    /**
     * Test sequence for patterns with node()-type kernel and child axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private Vector _childNodeGroup = null;

    /**
     * Group for patterns with node()-type kernel and child axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private Vector _templates;

    /**
     * A vector of all the templates in this mode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private final String _methodName;

    /**
     * The name of the method in which this mode is compiled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private final Stylesheet _stylesheet;

    /**
     * A reference to the stylesheet object that owns this mode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private final QName _name;

    /**
     * The name of this mode as defined in the stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
final class Mode implements Constants {

/**
 * Mode gathers all the templates belonging to a given mode;
 * it is responsible for generating an appropriate
 * applyTemplates + (mode name) method in the translet.
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 * @author Erwin Bolwidt <ejb@klomp.org>
 * @author G. Todd Miller
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private static boolean isNamespaceName(String qname) {

    /**
     * Auxiliary method to determine if a qname is a namespace
     * qualified "*".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private static boolean isAttributeName(String qname) {

    /**
     * Auxiliary method to determine if a qname is an attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private void peepHoleOptimization(MethodGenerator methodGen) {

    /**
      * Peephole optimization.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    public void compileApplyTemplates(ClassGenerator classGen) {

   /**
     * Compiles the applyTemplates() method and adds it to the translet.
     * This is the main dispatch method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private InstructionList compileDefaultText(ClassGenerator classGen,
                                               MethodGenerator methodGen,
                                               InstructionHandle next) {

    /**
     * Compiles the default action for DOM text nodes and attribute nodes:
     * output the node's text value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private InstructionList compileDefaultRecursion(ClassGenerator classGen,
                                                    MethodGenerator methodGen,
                                                    InstructionHandle next) {

    /**
     * Compiles the default handling for DOM elements: traverse all children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private void prepareTestSequences() {

    /**
     * Build test sequences. The first step is to complete the test sequences
     * by including patterns of "*" and "node()" kernel to all element test
     * sequences, and of "@*" to all attribute test sequences.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private void completeTestSequences(int nodeType, Vector patterns) {

    /**
     * Complete test sequences of a given type by adding all patterns
     * from a given group.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private void addPattern(int kernelType, LocationPathPattern pattern) {

    /**
     * Adds a pattern to a pattern group
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private void addPatternToGroup(final LocationPathPattern lpp) {

    /**
     * Group patterns by NodeTests of their last Step
     * Keep them sorted by priority within group
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private void flattenAlternative(Pattern pattern,
                                    Template template,
                                    Map<String, Key> keys) {

    /**
     * This method will break up alternative patterns (ie. unions of patterns,
     * such as match="A/B | C/B") and add the basic patterns to their
     * respective pattern groups.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    public void processPatterns(Map<String, Key> keys) {

    /**
     * Process all the test patterns in this mode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private String getClassName() {

    /**
     * Shortcut to get the class compiled for this mode (will be inlined).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    public String functionName() {

    /**
     * Returns the name of the method (_not_ function) that will be
     * compiled for this mode. Normally takes the form 'applyTemplates()'
     * or * 'applyTemplates2()'.
     *
     * @return Method name for this mode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    public Mode(QName name, Stylesheet stylesheet, String suffix) {

    /**
     * Creates a new Mode.
     *
     * @param name A textual representation of the mode's QName
     * @param stylesheet The Stylesheet in which the mode occured
     * @param suffix A suffix to append to the method name for this mode
     *               (normally a sequence number - still in a String).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private int _currentIndex;

    /**
     * Variable index for the current node used in code generation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private Map<String, Key> _keys = null;

    /**
     * A mapping between key names and keys.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private Map<Integer, Integer> _importLevels = null;

    /**
     * Stores ranges of template precendences for the compilation
     * of apply-imports.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private LocationPathPattern _rootPattern = null;

    /**
     * A reference to the pattern matching the root node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private Map<Template, InstructionList> _templateILs = new HashMap<>();

    /**
     * A mapping between templates and instruction lists.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private Map<Template, InstructionHandle> _templateIHs = new HashMap<>();

    /**
     * A mapping between templates and instruction handles.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private Map<Template, Mode> _namedTemplates = new HashMap<>();

    /**
     * A mapping between named templates and Mode objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private Map<Template, Object> _neededTemplates = new HashMap<>();

    /**
     * A mapping between templates and test sequences.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private TestSeq[] _testSeq;

    /**
     * Test sequence for patterns with any other kernel type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private Vector[] _patternGroups;

    /**
     * Group for patterns with any other kernel type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private TestSeq _idxTestSeq = null;

    /**
     * Test sequence for patterns with id() or key()-type kernel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private Vector _idxGroup = null;

    /**
     * Group for patterns with id() or key()-type kernel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private TestSeq _attribNodeTestSeq = null;

    /**
     * Test sequence for patterns with node()-type kernel and attribute axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private Vector _attribNodeGroup = null;

    /**
     * Group for patterns with node()-type kernel and attribute axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private TestSeq _childNodeTestSeq = null;

    /**
     * Test sequence for patterns with node()-type kernel and child axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private Vector _childNodeGroup = null;

    /**
     * Group for patterns with node()-type kernel and child axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private Vector _templates;

    /**
     * A vector of all the templates in this mode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private final String _methodName;

    /**
     * The name of the method in which this mode is compiled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private final Stylesheet _stylesheet;

    /**
     * A reference to the stylesheet object that owns this mode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
    private final QName _name;

    /**
     * The name of this mode as defined in the stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Mode.java
final class Mode implements Constants {

/**
 * Mode gathers all the templates belonging to a given mode;
 * it is responsible for generating an appropriate
 * applyTemplates + (mode name) method in the translet.
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 * @author Erwin Bolwidt <ejb@klomp.org>
 * @author G. Todd Miller
 */
