_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTrees.java
    public abstract void printMessage(Diagnostic.Kind kind, CharSequence msg,
            com.sun.source.doctree.DocTree t,
            com.sun.source.doctree.DocCommentTree c,
            com.sun.source.tree.CompilationUnitTree root);

    /**
     * Prints a message of the specified kind at the location of the
     * tree within the provided compilation unit
     *
     * @param kind the kind of message
     * @param msg  the message, or an empty string if none
     * @param t    the tree to use as a position hint
     * @param root the compilation unit that contains tree
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTrees.java
    public abstract Element getElement(DocTreePath path);

    /**
     * Gets the language model element referred to by the leaf node of the given
     * {@link DocTreePath}, or null if unknown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTrees.java
    public abstract DocCommentTree getDocCommentTree(TreePath path);

    /**
     * Gets the doc comment tree, if any, for the Tree node identified by a given TreePath.
     * Returns null if no doc comment was found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTrees.java
    public static DocTrees instance(ProcessingEnvironment env) {

    /**
     * Gets a DocTrees object for a given ProcessingEnvironment.
     * @param env the processing environment for which to get the Trees object
     * @throws IllegalArgumentException if the env does not support the Trees API.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTrees.java
    public static DocTrees instance(CompilationTask task) {

    /**
     * Gets a DocTrees object for a given CompilationTask.
     * @param task the compilation task for which to get the Trees object
     * @throws IllegalArgumentException if the task does not support the Trees API.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTrees.java
@jdk.Exported

/**
 * Provides access to syntax trees for doc comments.
 *
 * @since 1.8
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTrees.java
    public abstract void printMessage(Diagnostic.Kind kind, CharSequence msg,
            com.sun.source.doctree.DocTree t,
            com.sun.source.doctree.DocCommentTree c,
            com.sun.source.tree.CompilationUnitTree root);

    /**
     * Prints a message of the specified kind at the location of the
     * tree within the provided compilation unit
     *
     * @param kind the kind of message
     * @param msg  the message, or an empty string if none
     * @param t    the tree to use as a position hint
     * @param root the compilation unit that contains tree
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTrees.java
    public abstract Element getElement(DocTreePath path);

    /**
     * Gets the language model element referred to by the leaf node of the given
     * {@link DocTreePath}, or null if unknown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTrees.java
    public abstract DocCommentTree getDocCommentTree(TreePath path);

    /**
     * Gets the doc comment tree, if any, for the Tree node identified by a given TreePath.
     * Returns null if no doc comment was found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTrees.java
    public static DocTrees instance(ProcessingEnvironment env) {

    /**
     * Gets a DocTrees object for a given ProcessingEnvironment.
     * @param env the processing environment for which to get the Trees object
     * @throws IllegalArgumentException if the env does not support the Trees API.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTrees.java
    public static DocTrees instance(CompilationTask task) {

    /**
     * Gets a DocTrees object for a given CompilationTask.
     * @param task the compilation task for which to get the Trees object
     * @throws IllegalArgumentException if the task does not support the Trees API.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTrees.java
@jdk.Exported

/**
 * Provides access to syntax trees for doc comments.
 *
 * @since 1.8
 */
