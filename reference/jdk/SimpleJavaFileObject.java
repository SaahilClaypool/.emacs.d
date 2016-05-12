_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/SimpleJavaFileObject.java
    public Modifier getAccessLevel()  { return null; }

    /**
     * This implementation returns {@code null}.  Subclasses can
     * change this behavior as long as the contract of
     * {@link JavaFileObject} is obeyed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/SimpleJavaFileObject.java
    public NestingKind getNestingKind() { return null; }

    /**
     * This implementation returns {@code null}.  Subclasses can
     * change this behavior as long as the contract of
     * {@link JavaFileObject} is obeyed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/SimpleJavaFileObject.java
    public boolean isNameCompatible(String simpleName, Kind kind) {

    /**
     * This implementation compares the path of its URI to the given
     * simple name.  This method returns true if the given kind is
     * equal to the kind of this object, and if the path is equal to
     * {@code simpleName + kind.extension} or if it ends with {@code
     * "/" + simpleName + kind.extension}.
     *
     * <p>This method calls {@link #getKind} and {@link #toUri} and
     * does not access the fields {@link #uri} and {@link #kind}
     * directly.
     *
     * <p>Subclasses can change this behavior as long as the contract
     * of {@link JavaFileObject} is obeyed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/SimpleJavaFileObject.java
    public Kind getKind() {

    /**
     * @return {@code this.kind}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/SimpleJavaFileObject.java
    public boolean delete() {

    /**
     * This implementation does nothing.  Subclasses can change this
     * behavior as long as the contract of {@link FileObject} is
     * obeyed.
     *
     * @return {@code false}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/SimpleJavaFileObject.java
    public long getLastModified() {

    /**
     * This implementation returns {@code 0L}.  Subclasses can change
     * this behavior as long as the contract of {@link FileObject} is
     * obeyed.
     *
     * @return {@code 0L}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/SimpleJavaFileObject.java
    public Writer openWriter() throws IOException {

    /**
     * Wraps the result of openOutputStream in a Writer.  Subclasses
     * can change this behavior as long as the contract of {@link
     * FileObject} is obeyed.
     *
     * @return a Writer wrapping the result of openOutputStream
     * @throws IllegalStateException {@inheritDoc}
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws IOException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/SimpleJavaFileObject.java
    public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException {

    /**
     * This implementation always throws {@linkplain
     * UnsupportedOperationException}.  Subclasses can change this
     * behavior as long as the contract of {@link FileObject} is
     * obeyed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/SimpleJavaFileObject.java
    public Reader openReader(boolean ignoreEncodingErrors) throws IOException {

    /**
     * Wraps the result of {@linkplain #getCharContent} in a Reader.
     * Subclasses can change this behavior as long as the contract of
     * {@link FileObject} is obeyed.
     *
     * @param  ignoreEncodingErrors {@inheritDoc}
     * @return a Reader wrapping the result of getCharContent
     * @throws IllegalStateException {@inheritDoc}
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws IOException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/SimpleJavaFileObject.java
    public OutputStream openOutputStream() throws IOException {

    /**
     * This implementation always throws {@linkplain
     * UnsupportedOperationException}.  Subclasses can change this
     * behavior as long as the contract of {@link FileObject} is
     * obeyed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/SimpleJavaFileObject.java
    public InputStream openInputStream() throws IOException {

    /**
     * This implementation always throws {@linkplain
     * UnsupportedOperationException}.  Subclasses can change this
     * behavior as long as the contract of {@link FileObject} is
     * obeyed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/SimpleJavaFileObject.java
    protected SimpleJavaFileObject(URI uri, Kind kind) {

    /**
     * Construct a SimpleJavaFileObject of the given kind and with the
     * given URI.
     *
     * @param uri  the URI for this file object
     * @param kind the kind of this file object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/SimpleJavaFileObject.java
    protected final Kind kind;

    /**
     * The kind of this file object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/SimpleJavaFileObject.java
public class SimpleJavaFileObject implements JavaFileObject {

/**
 * Provides simple implementations for most methods in JavaFileObject.
 * This class is designed to be subclassed and used as a basis for
 * JavaFileObject implementations.  Subclasses can override the
 * implementation and specification of any method of this class as
 * long as the general contract of JavaFileObject is obeyed.
 *
 * @author Peter von der Ah&eacute;
 * @since 1.6
 */
