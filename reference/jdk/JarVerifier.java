_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/JarVerifier.java
    void doneWithMeta()

    /**
     * called to let us know we have processed all the
     * META-INF entries, and if we re-read one of them, don't
     * re-process it. Also gets rid of any data structures
     * we needed when parsing META-INF entries.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/JarVerifier.java
    boolean nothingToVerify()

    /**
     * returns true if there no files to verify.
     * should only be called after all the META-INF entries
     * have been processed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/JarVerifier.java
    public CodeSigner[] getCodeSigners(String name)

    /**
     * return an array of CodeSigner objects for
     * the given file in the jar. this array is not cloned.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/JarVerifier.java
    @Deprecated

    /**
     * Return an array of java.security.cert.Certificate objects for
     * the given file in the jar.
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/JarVerifier.java
    private void processEntry(ManifestEntryVerifier mev)

    /**
     * called when we reach the end of entry in one of the read() methods.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/JarVerifier.java
    public void update(int n, byte[] b, int off, int len,
                       ManifestEntryVerifier mev)

    /**
     * update an array of bytes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/JarVerifier.java
    public void update(int b, ManifestEntryVerifier mev)

    /**
     * update a single byte.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/JarVerifier.java
    public void beginEntry(JarEntry je, ManifestEntryVerifier mev)

    /**
     * This method scans to see which entry we're parsing and
     * keeps various state information depending on what type of
     * file is being parsed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/JarVerifier.java
    private List<Object> manifestDigests;

    /** collect -DIGEST-MANIFEST values for blacklist */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/JarVerifier.java
    private Object csdomain = new Object();

    /** makes code source singleton instances unique to us */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/JarVerifier.java
    boolean eagerValidation;

    /** controls eager signature validation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/JarVerifier.java
    byte manifestRawBytes[] = null;

    /** the bytes for the manDig object */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/JarVerifier.java
    private volatile ManifestDigester manDig;

    /** The ManifestDigester object */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/JarVerifier.java
    private ArrayList<SignatureFileVerifier> pendingBlocks;

    /** "queue" of pending PKCS7 blocks that we couldn't parse
     *  until we parsed the .SF file */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/JarVerifier.java
class JarVerifier {

/**
 *
 * @author      Roland Schemers
 */
