_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/JavacTask.java
    public abstract Types getTypes();

    /**
     * Get a utility object for dealing with type mirrors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/JavacTask.java
    public abstract Elements getElements();

    /**
     * Get a utility object for dealing with program elements.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/JavacTask.java
    public abstract TypeMirror getTypeMirror(Iterable<? extends Tree> path);

    /**
     * Get a type mirror of the tree node determined by the specified path.
     * This method has been superceded by methods on
     * {@link com.sun.source.util.Trees Trees}.
     * @see com.sun.source.util.Trees#getTypeMirror
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/JavacTask.java
    public abstract void removeTaskListener(TaskListener taskListener);

    /**
     * The specified listener will no longer receive notification of events
     * describing the progress of this compilation task.
     *
     * This method may be called at any time before or during the compilation.
     *
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/JavacTask.java
    public abstract void addTaskListener(TaskListener taskListener);

    /**
     * The specified listener will receive notification of events
     * describing the progress of this compilation task.
     *
     * This method may be called at any time before or during the compilation.
     *
     * @throws IllegalStateException if the specified listener has already been added.
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/JavacTask.java
    public abstract void setTaskListener(TaskListener taskListener);

    /**
     * The specified listener will receive notification of events
     * describing the progress of this compilation task.
     *
     * If another listener is receiving notifications as a result of a prior
     * call of this method, then that listener will no longer receive notifications.
     *
     * Informally, this method is equivalent to calling {@code removeTaskListener} for
     * any listener that has been previously set, followed by {@code addTaskListener}
     * for the new listener.
     *
     * @throws IllegalStateException if the specified listener has already been added.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/JavacTask.java
    public abstract Iterable<? extends JavaFileObject> generate() throws IOException;

    /**
     * Generate code.
     *
     * @return a list of files that were generated
     * @throws IOException if an unhandled I/O error occurred in the compiler.
     * @throws IllegalStateException if the operation cannot be performed at this time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/JavacTask.java
    public abstract Iterable<? extends Element> analyze() throws IOException;

    /**
     * Complete all analysis.
     *
     * @return a list of elements that were analyzed
     * @throws IOException if an unhandled I/O error occurred in the compiler.
     * @throws IllegalStateException if the operation cannot be performed at this time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/JavacTask.java
    public abstract Iterable<? extends CompilationUnitTree> parse()

    /**
     * Parse the specified files returning a list of abstract syntax trees.
     *
     * @return a list of abstract syntax trees
     * @throws IOException if an unhandled I/O error occurred in the compiler.
     * @throws IllegalStateException if the operation cannot be performed at this time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/JavacTask.java
    public static JavacTask instance(ProcessingEnvironment processingEnvironment) {

    /**
     * Get the {@code JavacTask} for a {@code ProcessingEnvironment}.
     * If the compiler is being invoked using a
     * {@link javax.tools.JavaCompiler.CompilationTask CompilationTask},
     * then that task will be returned.
     * @param processingEnvironment the processing environment
     * @return the {@code JavacTask} for a {@code ProcessingEnvironment}
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/JavacTask.java
@jdk.Exported

/**
 * Provides access to functionality specific to the JDK Java Compiler, javac.
 *
 * @author Peter von der Ah&eacute;
 * @author Jonathan Gibbons
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/JavacTask.java
    public abstract Types getTypes();

    /**
     * Get a utility object for dealing with type mirrors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/JavacTask.java
    public abstract Elements getElements();

    /**
     * Get a utility object for dealing with program elements.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/JavacTask.java
    public abstract TypeMirror getTypeMirror(Iterable<? extends Tree> path);

    /**
     * Get a type mirror of the tree node determined by the specified path.
     * This method has been superceded by methods on
     * {@link com.sun.source.util.Trees Trees}.
     * @see com.sun.source.util.Trees#getTypeMirror
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/JavacTask.java
    public abstract void removeTaskListener(TaskListener taskListener);

    /**
     * The specified listener will no longer receive notification of events
     * describing the progress of this compilation task.
     *
     * This method may be called at any time before or during the compilation.
     *
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/JavacTask.java
    public abstract void addTaskListener(TaskListener taskListener);

    /**
     * The specified listener will receive notification of events
     * describing the progress of this compilation task.
     *
     * This method may be called at any time before or during the compilation.
     *
     * @throws IllegalStateException if the specified listener has already been added.
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/JavacTask.java
    public abstract void setTaskListener(TaskListener taskListener);

    /**
     * The specified listener will receive notification of events
     * describing the progress of this compilation task.
     *
     * If another listener is receiving notifications as a result of a prior
     * call of this method, then that listener will no longer receive notifications.
     *
     * Informally, this method is equivalent to calling {@code removeTaskListener} for
     * any listener that has been previously set, followed by {@code addTaskListener}
     * for the new listener.
     *
     * @throws IllegalStateException if the specified listener has already been added.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/JavacTask.java
    public abstract Iterable<? extends JavaFileObject> generate() throws IOException;

    /**
     * Generate code.
     *
     * @return a list of files that were generated
     * @throws IOException if an unhandled I/O error occurred in the compiler.
     * @throws IllegalStateException if the operation cannot be performed at this time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/JavacTask.java
    public abstract Iterable<? extends Element> analyze() throws IOException;

    /**
     * Complete all analysis.
     *
     * @return a list of elements that were analyzed
     * @throws IOException if an unhandled I/O error occurred in the compiler.
     * @throws IllegalStateException if the operation cannot be performed at this time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/JavacTask.java
    public abstract Iterable<? extends CompilationUnitTree> parse()

    /**
     * Parse the specified files returning a list of abstract syntax trees.
     *
     * @return a list of abstract syntax trees
     * @throws IOException if an unhandled I/O error occurred in the compiler.
     * @throws IllegalStateException if the operation cannot be performed at this time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/JavacTask.java
    public static JavacTask instance(ProcessingEnvironment processingEnvironment) {

    /**
     * Get the {@code JavacTask} for a {@code ProcessingEnvironment}.
     * If the compiler is being invoked using a
     * {@link javax.tools.JavaCompiler.CompilationTask CompilationTask},
     * then that task will be returned.
     * @param processingEnvironment the processing environment
     * @return the {@code JavacTask} for a {@code ProcessingEnvironment}
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/JavacTask.java
@jdk.Exported

/**
 * Provides access to functionality specific to the JDK Java Compiler, javac.
 *
 * @author Peter von der Ah&eacute;
 * @author Jonathan Gibbons
 * @since 1.6
 */
