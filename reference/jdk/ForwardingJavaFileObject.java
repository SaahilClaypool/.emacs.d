_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ForwardingJavaFileObject.java
    protected ForwardingJavaFileObject(F fileObject) {

    /**
     * Creates a new instance of ForwardingJavaFileObject.
     * @param fileObject delegate to this file object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ForwardingJavaFileObject.java
public class ForwardingJavaFileObject<F extends JavaFileObject>

/**
 * Forwards calls to a given file object.  Subclasses of this class
 * might override some of these methods and might also provide
 * additional fields and methods.
 *
 * @param <F> the kind of file object forwarded to by this object
 * @author Peter von der Ah&eacute;
 * @since 1.6
 */
