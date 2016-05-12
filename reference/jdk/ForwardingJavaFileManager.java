_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ForwardingJavaFileManager.java
    public FileObject getFileForOutput(Location location,
                                       String packageName,
                                       String relativeName,
                                       FileObject sibling)

    /**
     * @throws IllegalArgumentException {@inheritDoc}
     * @throws IllegalStateException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ForwardingJavaFileManager.java
    public FileObject getFileForInput(Location location,
                                      String packageName,
                                      String relativeName)

    /**
     * @throws IllegalArgumentException {@inheritDoc}
     * @throws IllegalStateException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ForwardingJavaFileManager.java
    public JavaFileObject getJavaFileForOutput(Location location,
                                               String className,
                                               Kind kind,
                                               FileObject sibling)

    /**
     * @throws IllegalArgumentException {@inheritDoc}
     * @throws IllegalStateException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ForwardingJavaFileManager.java
    public JavaFileObject getJavaFileForInput(Location location,
                                              String className,
                                              Kind kind)

    /**
     * @throws IllegalArgumentException {@inheritDoc}
     * @throws IllegalStateException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ForwardingJavaFileManager.java
    public boolean handleOption(String current, Iterator<String> remaining) {

    /**
     * @throws IllegalArgumentException {@inheritDoc}
     * @throws IllegalStateException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ForwardingJavaFileManager.java
    public boolean isSameFile(FileObject a, FileObject b) {

    /**
     * @throws IllegalArgumentException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ForwardingJavaFileManager.java
    public String inferBinaryName(Location location, JavaFileObject file) {

    /**
     * @throws IllegalStateException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ForwardingJavaFileManager.java
    public Iterable<JavaFileObject> list(Location location,
                                         String packageName,
                                         Set<Kind> kinds,
                                         boolean recurse)

    /**
     * @throws IOException {@inheritDoc}
     * @throws IllegalStateException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ForwardingJavaFileManager.java
    public ClassLoader getClassLoader(Location location) {

    /**
     * @throws SecurityException {@inheritDoc}
     * @throws IllegalStateException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ForwardingJavaFileManager.java
    protected ForwardingJavaFileManager(M fileManager) {

    /**
     * Creates a new instance of ForwardingJavaFileManager.
     * @param fileManager delegate to this file manager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ForwardingJavaFileManager.java
    protected final M fileManager;

    /**
     * The file manager which all methods are delegated to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ForwardingJavaFileManager.java
public class ForwardingJavaFileManager<M extends JavaFileManager> implements JavaFileManager {

/**
 * Forwards calls to a given file manager.  Subclasses of this class
 * might override some of these methods and might also provide
 * additional fields and methods.
 *
 * @param <M> the kind of file manager forwarded to by this object
 * @author Peter von der Ah&eacute;
 * @since 1.6
 */
