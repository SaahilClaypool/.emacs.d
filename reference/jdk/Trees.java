_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract TypeMirror getLub(CatchTree tree);

    /**
     * Gets the lub of an exception parameter declared in a catch clause.
     * @param tree the tree for the catch clause
     * @return The lub of the exception parameter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract void printMessage(Diagnostic.Kind kind, CharSequence msg,
            com.sun.source.tree.Tree t,
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract TypeMirror getOriginalType(ErrorType errorType);

    /**
      * Gets the original type from the ErrorType object.
      * @param errorType The errorType for which we want to get the original type.
      * @return javax.lang.model.type.TypeMirror corresponding to the original type, replaced by the ErrorType.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract boolean isAccessible(Scope scope, Element member, DeclaredType type);

    /**
     * Checks whether the given element is accessible as a member of the given
     * type in a given scope.
     * @param scope the scope to be checked
     * @param member the member to be checked
     * @param type the type for which to check if the member is accessible
     * @return true if {@code member} is accessible in {@code type}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract boolean isAccessible(Scope scope, TypeElement type);

    /**
     * Checks whether a given type is accessible in a given scope.
     * @param scope the scope to be checked
     * @param type the type to be checked
     * @return true if {@code type} is accessible
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract String getDocComment(TreePath path);

    /**
     * Gets the doc comment, if any, for the Tree node identified by a given TreePath.
     * Returns null if no doc comment was found.
     * @see DocTrees#getDocCommentTree(TreePath)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract Scope getScope(TreePath path);

    /**
     * Gets the Scope for the Tree node identified by a given TreePath.
     * Returns null if the Scope is not available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract TypeMirror getTypeMirror(TreePath path);

    /**
     * Gets the TypeMirror for the Tree node identified by a given TreePath.
     * Returns null if the TypeMirror is not available.
     * @throws IllegalArgumentException is the TreePath does not identify
     * a Tree node that might have an associated TypeMirror.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract Element getElement(TreePath path);

    /**
     * Gets the Element for the Tree node identified by a given TreePath.
     * Returns null if the element is not available.
     * @throws IllegalArgumentException is the TreePath does not identify
     * a Tree node that might have an associated Element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract TreePath getPath(Element e, AnnotationMirror a, AnnotationValue v);

    /**
     * Gets the TreePath node for an AnnotationValue for an AnnotationMirror on a given Element.
     * Returns null if the node can not be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract TreePath getPath(Element e, AnnotationMirror a);

    /**
     * Gets the TreePath node for an AnnotationMirror on a given Element.
     * Returns null if the node can not be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract TreePath getPath(Element e);

    /**
     * Gets the TreePath node for a given Element.
     * Returns null if the node can not be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract TreePath getPath(CompilationUnitTree unit, Tree node);

    /**
     * Gets the path to tree node within the specified compilation unit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract Tree getTree(Element e, AnnotationMirror a, AnnotationValue v);

    /**
     * Gets the Tree node for an AnnotationValue for an AnnotationMirror on a given Element.
     * Returns null if the node can not be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract Tree getTree(Element e, AnnotationMirror a);

    /**
     * Gets the Tree node for an AnnotationMirror on a given Element.
     * Returns null if the node can not be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract MethodTree getTree(ExecutableElement method);

    /**
     * Gets the MethodTree node for a given ExecutableElement.
     * Returns null if the node can not be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract ClassTree getTree(TypeElement element);

    /**
     * Gets the ClassTree node for a given TypeElement.
     * Returns null if the node can not be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract Tree getTree(Element element);

    /**
     * Gets the Tree node for a given Element.
     * Returns null if the node can not be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract SourcePositions getSourcePositions();

    /**
     * Gets a utility object for obtaining source positions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public static Trees instance(ProcessingEnvironment env) {

    /**
     * Gets a Trees object for a given ProcessingEnvironment.
     * @param env the processing environment for which to get the Trees object
     * @throws IllegalArgumentException if the env does not support the Trees API.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public static Trees instance(CompilationTask task) {

    /**
     * Gets a Trees object for a given CompilationTask.
     * @param task the compilation task for which to get the Trees object
     * @throws IllegalArgumentException if the task does not support the Trees API.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
@jdk.Exported

/**
 * Bridges JSR 199, JSR 269, and the Tree API.
 *
 * @author Peter von der Ah&eacute;
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract TypeMirror getLub(CatchTree tree);

    /**
     * Gets the lub of an exception parameter declared in a catch clause.
     * @param tree the tree for the catch clause
     * @return The lub of the exception parameter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract void printMessage(Diagnostic.Kind kind, CharSequence msg,
            com.sun.source.tree.Tree t,
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract TypeMirror getOriginalType(ErrorType errorType);

    /**
      * Gets the original type from the ErrorType object.
      * @param errorType The errorType for which we want to get the original type.
      * @return javax.lang.model.type.TypeMirror corresponding to the original type, replaced by the ErrorType.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract boolean isAccessible(Scope scope, Element member, DeclaredType type);

    /**
     * Checks whether the given element is accessible as a member of the given
     * type in a given scope.
     * @param scope the scope to be checked
     * @param member the member to be checked
     * @param type the type for which to check if the member is accessible
     * @return true if {@code member} is accessible in {@code type}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract boolean isAccessible(Scope scope, TypeElement type);

    /**
     * Checks whether a given type is accessible in a given scope.
     * @param scope the scope to be checked
     * @param type the type to be checked
     * @return true if {@code type} is accessible
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract String getDocComment(TreePath path);

    /**
     * Gets the doc comment, if any, for the Tree node identified by a given TreePath.
     * Returns null if no doc comment was found.
     * @see DocTrees#getDocCommentTree(TreePath)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract Scope getScope(TreePath path);

    /**
     * Gets the Scope for the Tree node identified by a given TreePath.
     * Returns null if the Scope is not available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract TypeMirror getTypeMirror(TreePath path);

    /**
     * Gets the TypeMirror for the Tree node identified by a given TreePath.
     * Returns null if the TypeMirror is not available.
     * @throws IllegalArgumentException is the TreePath does not identify
     * a Tree node that might have an associated TypeMirror.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract Element getElement(TreePath path);

    /**
     * Gets the Element for the Tree node identified by a given TreePath.
     * Returns null if the element is not available.
     * @throws IllegalArgumentException is the TreePath does not identify
     * a Tree node that might have an associated Element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract TreePath getPath(Element e, AnnotationMirror a, AnnotationValue v);

    /**
     * Gets the TreePath node for an AnnotationValue for an AnnotationMirror on a given Element.
     * Returns null if the node can not be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract TreePath getPath(Element e, AnnotationMirror a);

    /**
     * Gets the TreePath node for an AnnotationMirror on a given Element.
     * Returns null if the node can not be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract TreePath getPath(Element e);

    /**
     * Gets the TreePath node for a given Element.
     * Returns null if the node can not be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract TreePath getPath(CompilationUnitTree unit, Tree node);

    /**
     * Gets the path to tree node within the specified compilation unit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract Tree getTree(Element e, AnnotationMirror a, AnnotationValue v);

    /**
     * Gets the Tree node for an AnnotationValue for an AnnotationMirror on a given Element.
     * Returns null if the node can not be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract Tree getTree(Element e, AnnotationMirror a);

    /**
     * Gets the Tree node for an AnnotationMirror on a given Element.
     * Returns null if the node can not be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract MethodTree getTree(ExecutableElement method);

    /**
     * Gets the MethodTree node for a given ExecutableElement.
     * Returns null if the node can not be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract ClassTree getTree(TypeElement element);

    /**
     * Gets the ClassTree node for a given TypeElement.
     * Returns null if the node can not be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract Tree getTree(Element element);

    /**
     * Gets the Tree node for a given Element.
     * Returns null if the node can not be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public abstract SourcePositions getSourcePositions();

    /**
     * Gets a utility object for obtaining source positions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public static Trees instance(ProcessingEnvironment env) {

    /**
     * Gets a Trees object for a given ProcessingEnvironment.
     * @param env the processing environment for which to get the Trees object
     * @throws IllegalArgumentException if the env does not support the Trees API.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
    public static Trees instance(CompilationTask task) {

    /**
     * Gets a Trees object for a given CompilationTask.
     * @param task the compilation task for which to get the Trees object
     * @throws IllegalArgumentException if the task does not support the Trees API.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/Trees.java
@jdk.Exported

/**
 * Bridges JSR 199, JSR 269, and the Tree API.
 *
 * @author Peter von der Ah&eacute;
 */
