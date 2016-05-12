_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ForwardingFileObject.java
    public Writer openWriter() throws IOException {

    /**
     * @throws IllegalStateException {@inheritDoc}
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws IOException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ForwardingFileObject.java
    public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException {

    /**
     * @throws IllegalStateException {@inheritDoc}
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws IOException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ForwardingFileObject.java
    public Reader openReader(boolean ignoreEncodingErrors) throws IOException {

    /**
     * @throws IllegalStateException {@inheritDoc}
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws IOException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ForwardingFileObject.java
    public OutputStream openOutputStream() throws IOException {

    /**
     * @throws IllegalStateException {@inheritDoc}
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws IOException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ForwardingFileObject.java
    public InputStream openInputStream() throws IOException {

    /**
     * @throws IllegalStateException {@inheritDoc}
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws IOException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ForwardingFileObject.java
    protected ForwardingFileObject(F fileObject) {

    /**
     * Creates a new instance of ForwardingFileObject.
     * @param fileObject delegate to this file object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ForwardingFileObject.java
    protected final F fileObject;

    /**
     * The file object which all methods are delegated to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ForwardingFileObject.java
public class ForwardingFileObject<F extends FileObject> implements FileObject {

/**
 * Forwards calls to a given file object.  Subclasses of this class
 * might override some of these methods and might also provide
 * additional fields and methods.
 *
 * @param <F> the kind of file object forwarded to by this object
 * @author Peter von der Ah&eacute;
 * @since 1.6
 */
