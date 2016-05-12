_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/JarEntry.java
    public CodeSigner[] getCodeSigners() {

    /**
     * Returns the <code>CodeSigner</code> objects for this entry, or
     * <code>null</code> if none. This method can only be called once
     * the <code>JarEntry</code> has been completely verified by reading
     * from the entry input stream until the end of the stream has been
     * reached. Otherwise, this method will return <code>null</code>.
     *
     * <p>The returned array comprises all the code signers that have signed
     * this entry.
     *
     * @return the <code>CodeSigner</code> objects for this entry, or
     * <code>null</code> if none.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/JarEntry.java
    public Certificate[] getCertificates() {

    /**
     * Returns the <code>Certificate</code> objects for this entry, or
     * <code>null</code> if none. This method can only be called once
     * the <code>JarEntry</code> has been completely verified by reading
     * from the entry input stream until the end of the stream has been
     * reached. Otherwise, this method will return <code>null</code>.
     *
     * <p>The returned certificate array comprises all the signer certificates
     * that were used to verify this entry. Each signer certificate is
     * followed by its supporting certificate chain (which may be empty).
     * Each signer certificate and its supporting certificate chain are ordered
     * bottom-to-top (i.e., with the signer certificate first and the (root)
     * certificate authority last).
     *
     * @return the <code>Certificate</code> objects for this entry, or
     * <code>null</code> if none.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/JarEntry.java
    public Attributes getAttributes() throws IOException {

    /**
     * Returns the <code>Manifest</code> <code>Attributes</code> for this
     * entry, or <code>null</code> if none.
     *
     * @return the <code>Manifest</code> <code>Attributes</code> for this
     * entry, or <code>null</code> if none
     * @throws IOException  if an I/O error has occurred
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/JarEntry.java
    public JarEntry(JarEntry je) {

    /**
     * Creates a new <code>JarEntry</code> with fields taken from the
     * specified <code>JarEntry</code> object.
     *
     * @param je the <code>JarEntry</code> to copy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/JarEntry.java
    public JarEntry(ZipEntry ze) {

    /**
     * Creates a new <code>JarEntry</code> with fields taken from the
     * specified <code>ZipEntry</code> object.
     * @param ze the <code>ZipEntry</code> object to create the
     *           <code>JarEntry</code> from
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/JarEntry.java
    public JarEntry(String name) {

    /**
     * Creates a new <code>JarEntry</code> for the specified JAR file
     * entry name.
     *
     * @param name the JAR file entry name
     * @exception NullPointerException if the entry name is <code>null</code>
     * @exception IllegalArgumentException if the entry name is longer than
     *            0xFFFF bytes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/JarEntry.java
public

/**
 * This class is used to represent a JAR file entry.
 */
