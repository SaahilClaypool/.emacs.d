_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/XSLTCDTMManager.java
  public DTM getDTM(Source source, boolean unique,
                    DTMWSFilter whiteSpaceFilter, boolean incremental,
                    boolean doIndexing, boolean hasUserReader, int size,
                    boolean buildIdIndex, boolean newNameTable)

  /**
     * Get an instance of a DTM, loaded with the content from the
     * specified source.  If the unique flag is true, a new instance will
     * always be returned.  Otherwise it is up to the DTMManager to return a
     * new instance or an instance that it already created and may be being used
     * by someone else.
     * (I think more parameters will need to be added for error handling, and
     * entity resolution).
     *
     * @param source the specification of the source object.
     * @param unique true if the returned DTM must be unique, probably because it
     * is going to be mutated.
     * @param whiteSpaceFilter Enables filtering of whitespace nodes, and may
     *                         be null.
     * @param incremental true if the DTM should be built incrementally, if
     *                    possible.
     * @param doIndexing true if the caller considers it worth it to use
     *                   indexing schemes.
     * @param hasUserReader true if <code>source</code> is a
     *                      <code>SAXSource</code> object that has an
     *                      <code>XMLReader</code>, that was specified by the
     *                      user.
     * @param size  Specifies initial size of tables that represent the DTM
     * @param buildIdIndex true if the id index table should be built.
     * @param newNameTable true if we want to use a separate ExpandedNameTable
     *                     for this DTM.
     *
     * @return a non-null DTM reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/XSLTCDTMManager.java
    public DTM getDTM(Source source, boolean unique,
                      DTMWSFilter whiteSpaceFilter, boolean incremental,
                      boolean doIndexing, boolean hasUserReader, int size,
                      boolean buildIdIndex)

  /**
     * Get an instance of a DTM, loaded with the content from the
     * specified source.  If the unique flag is true, a new instance will
     * always be returned.  Otherwise it is up to the DTMManager to return a
     * new instance or an instance that it already created and may be being used
     * by someone else.
     * (I think more parameters will need to be added for error handling, and
     * entity resolution).
     *
     * @param source the specification of the source object.
     * @param unique true if the returned DTM must be unique, probably because it
     * is going to be mutated.
     * @param whiteSpaceFilter Enables filtering of whitespace nodes, and may
     *                         be null.
     * @param incremental true if the DTM should be built incrementally, if
     *                    possible.
     * @param doIndexing true if the caller considers it worth it to use
     *                   indexing schemes.
     * @param hasUserReader true if <code>source</code> is a
     *                      <code>SAXSource</code> object that has an
     *                      <code>XMLReader</code>, that was specified by the
     *                      user.
     * @param size  Specifies initial size of tables that represent the DTM
     * @param buildIdIndex true if the id index table should be built.
     *
     * @return a non-null DTM reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/XSLTCDTMManager.java
  public DTM getDTM(Source source, boolean unique,
                    DTMWSFilter whiteSpaceFilter, boolean incremental,
                    boolean doIndexing, boolean buildIdIndex,
                    boolean newNameTable)

    /**
     * Get an instance of a DTM, loaded with the content from the
     * specified source.  If the unique flag is true, a new instance will
     * always be returned.  Otherwise it is up to the DTMManager to return a
     * new instance or an instance that it already created and may be being used
     * by someone else.
     * (I think more parameters will need to be added for error handling, and
     * entity resolution).
     *
     * @param source the specification of the source object.
     * @param unique true if the returned DTM must be unique, probably because it
     * is going to be mutated.
     * @param whiteSpaceFilter Enables filtering of whitespace nodes, and may
     *                         be null.
     * @param incremental true if the DTM should be built incrementally, if
     *                    possible.
     * @param doIndexing true if the caller considers it worth it to use
     *                   indexing schemes.
     * @param buildIdIndex true if the id index table should be built.
     * @param newNameTable true if we want to use a separate ExpandedNameTable
     *                     for this DTM.
     *
     * @return a non-null DTM reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/XSLTCDTMManager.java
    public DTM getDTM(Source source, boolean unique,
                      DTMWSFilter whiteSpaceFilter, boolean incremental,
                      boolean doIndexing, boolean buildIdIndex)

    /**
     * Get an instance of a DTM, loaded with the content from the
     * specified source.  If the unique flag is true, a new instance will
     * always be returned.  Otherwise it is up to the DTMManager to return a
     * new instance or an instance that it already created and may be being used
     * by someone else.
     * (I think more parameters will need to be added for error handling, and
     * entity resolution).
     *
     * @param source the specification of the source object.
     * @param unique true if the returned DTM must be unique, probably because it
     * is going to be mutated.
     * @param whiteSpaceFilter Enables filtering of whitespace nodes, and may
     *                         be null.
     * @param incremental true if the DTM should be built incrementally, if
     *                    possible.
     * @param doIndexing true if the caller considers it worth it to use
     *                   indexing schemes.
     * @param buildIdIndex true if the id index table should be built.
     *
     * @return a non-null DTM reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/XSLTCDTMManager.java
    @Override

    /**
     * Get an instance of a DTM, loaded with the content from the
     * specified source.  If the unique flag is true, a new instance will
     * always be returned.  Otherwise it is up to the DTMManager to return a
     * new instance or an instance that it already created and may be being used
     * by someone else.
     * (I think more parameters will need to be added for error handling, and
     * entity resolution).
     *
     * @param source the specification of the source object.
     * @param unique true if the returned DTM must be unique, probably because it
     * is going to be mutated.
     * @param whiteSpaceFilter Enables filtering of whitespace nodes, and may
     *                         be null.
     * @param incremental true if the DTM should be built incrementally, if
     *                    possible.
     * @param doIndexing true if the caller considers it worth it to use
     *                   indexing schemes.
     *
     * @return a non-null DTM reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/XSLTCDTMManager.java
      public static XSLTCDTMManager createNewDTMManagerInstance() {

    /**
     * Creates a new instance of the XSLTC DTM Manager service.
     * Creates a new instance of the default class
     * <code>com.sun.org.apache.xalan.internal.xsltc.dom.XSLTCDTMManager</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/XSLTCDTMManager.java
    public static XSLTCDTMManager newInstance()

    /**
     * Obtain a new instance of a <code>DTMManager</code>.
     * This static method creates a new factory instance.
     * The current implementation just returns a new XSLTCDTMManager instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/XSLTCDTMManager.java
    public XSLTCDTMManager()

    /**
     * Constructor DTMManagerDefault
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/XSLTCDTMManager.java
    private static final boolean DEBUG = false;

    /** Set this to true if you want basic diagnostics */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/XSLTCDTMManager.java
    private static final boolean DUMPTREE = false;

    /** Set this to true if you want a dump of the DTM after creation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/XSLTCDTMManager.java
public class XSLTCDTMManager extends DTMManagerDefault

/**
 * The default implementation for the DTMManager.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/XSLTCDTMManager.java
  public DTM getDTM(Source source, boolean unique,
                    DTMWSFilter whiteSpaceFilter, boolean incremental,
                    boolean doIndexing, boolean hasUserReader, int size,
                    boolean buildIdIndex, boolean newNameTable)

  /**
     * Get an instance of a DTM, loaded with the content from the
     * specified source.  If the unique flag is true, a new instance will
     * always be returned.  Otherwise it is up to the DTMManager to return a
     * new instance or an instance that it already created and may be being used
     * by someone else.
     * (I think more parameters will need to be added for error handling, and
     * entity resolution).
     *
     * @param source the specification of the source object.
     * @param unique true if the returned DTM must be unique, probably because it
     * is going to be mutated.
     * @param whiteSpaceFilter Enables filtering of whitespace nodes, and may
     *                         be null.
     * @param incremental true if the DTM should be built incrementally, if
     *                    possible.
     * @param doIndexing true if the caller considers it worth it to use
     *                   indexing schemes.
     * @param hasUserReader true if <code>source</code> is a
     *                      <code>SAXSource</code> object that has an
     *                      <code>XMLReader</code>, that was specified by the
     *                      user.
     * @param size  Specifies initial size of tables that represent the DTM
     * @param buildIdIndex true if the id index table should be built.
     * @param newNameTable true if we want to use a separate ExpandedNameTable
     *                     for this DTM.
     *
     * @return a non-null DTM reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/XSLTCDTMManager.java
    public DTM getDTM(Source source, boolean unique,
                      DTMWSFilter whiteSpaceFilter, boolean incremental,
                      boolean doIndexing, boolean hasUserReader, int size,
                      boolean buildIdIndex)

  /**
     * Get an instance of a DTM, loaded with the content from the
     * specified source.  If the unique flag is true, a new instance will
     * always be returned.  Otherwise it is up to the DTMManager to return a
     * new instance or an instance that it already created and may be being used
     * by someone else.
     * (I think more parameters will need to be added for error handling, and
     * entity resolution).
     *
     * @param source the specification of the source object.
     * @param unique true if the returned DTM must be unique, probably because it
     * is going to be mutated.
     * @param whiteSpaceFilter Enables filtering of whitespace nodes, and may
     *                         be null.
     * @param incremental true if the DTM should be built incrementally, if
     *                    possible.
     * @param doIndexing true if the caller considers it worth it to use
     *                   indexing schemes.
     * @param hasUserReader true if <code>source</code> is a
     *                      <code>SAXSource</code> object that has an
     *                      <code>XMLReader</code>, that was specified by the
     *                      user.
     * @param size  Specifies initial size of tables that represent the DTM
     * @param buildIdIndex true if the id index table should be built.
     *
     * @return a non-null DTM reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/XSLTCDTMManager.java
  public DTM getDTM(Source source, boolean unique,
                    DTMWSFilter whiteSpaceFilter, boolean incremental,
                    boolean doIndexing, boolean buildIdIndex,
                    boolean newNameTable)

    /**
     * Get an instance of a DTM, loaded with the content from the
     * specified source.  If the unique flag is true, a new instance will
     * always be returned.  Otherwise it is up to the DTMManager to return a
     * new instance or an instance that it already created and may be being used
     * by someone else.
     * (I think more parameters will need to be added for error handling, and
     * entity resolution).
     *
     * @param source the specification of the source object.
     * @param unique true if the returned DTM must be unique, probably because it
     * is going to be mutated.
     * @param whiteSpaceFilter Enables filtering of whitespace nodes, and may
     *                         be null.
     * @param incremental true if the DTM should be built incrementally, if
     *                    possible.
     * @param doIndexing true if the caller considers it worth it to use
     *                   indexing schemes.
     * @param buildIdIndex true if the id index table should be built.
     * @param newNameTable true if we want to use a separate ExpandedNameTable
     *                     for this DTM.
     *
     * @return a non-null DTM reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/XSLTCDTMManager.java
    public DTM getDTM(Source source, boolean unique,
                      DTMWSFilter whiteSpaceFilter, boolean incremental,
                      boolean doIndexing, boolean buildIdIndex)

    /**
     * Get an instance of a DTM, loaded with the content from the
     * specified source.  If the unique flag is true, a new instance will
     * always be returned.  Otherwise it is up to the DTMManager to return a
     * new instance or an instance that it already created and may be being used
     * by someone else.
     * (I think more parameters will need to be added for error handling, and
     * entity resolution).
     *
     * @param source the specification of the source object.
     * @param unique true if the returned DTM must be unique, probably because it
     * is going to be mutated.
     * @param whiteSpaceFilter Enables filtering of whitespace nodes, and may
     *                         be null.
     * @param incremental true if the DTM should be built incrementally, if
     *                    possible.
     * @param doIndexing true if the caller considers it worth it to use
     *                   indexing schemes.
     * @param buildIdIndex true if the id index table should be built.
     *
     * @return a non-null DTM reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/XSLTCDTMManager.java
    @Override

    /**
     * Get an instance of a DTM, loaded with the content from the
     * specified source.  If the unique flag is true, a new instance will
     * always be returned.  Otherwise it is up to the DTMManager to return a
     * new instance or an instance that it already created and may be being used
     * by someone else.
     * (I think more parameters will need to be added for error handling, and
     * entity resolution).
     *
     * @param source the specification of the source object.
     * @param unique true if the returned DTM must be unique, probably because it
     * is going to be mutated.
     * @param whiteSpaceFilter Enables filtering of whitespace nodes, and may
     *                         be null.
     * @param incremental true if the DTM should be built incrementally, if
     *                    possible.
     * @param doIndexing true if the caller considers it worth it to use
     *                   indexing schemes.
     *
     * @return a non-null DTM reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/XSLTCDTMManager.java
      public static XSLTCDTMManager createNewDTMManagerInstance() {

    /**
     * Creates a new instance of the XSLTC DTM Manager service.
     * Creates a new instance of the default class
     * <code>com.sun.org.apache.xalan.internal.xsltc.dom.XSLTCDTMManager</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/XSLTCDTMManager.java
    public static XSLTCDTMManager newInstance()

    /**
     * Obtain a new instance of a <code>DTMManager</code>.
     * This static method creates a new factory instance.
     * The current implementation just returns a new XSLTCDTMManager instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/XSLTCDTMManager.java
    public XSLTCDTMManager()

    /**
     * Constructor DTMManagerDefault
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/XSLTCDTMManager.java
    private static final boolean DEBUG = false;

    /** Set this to true if you want basic diagnostics */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/XSLTCDTMManager.java
    private static final boolean DUMPTREE = false;

    /** Set this to true if you want a dump of the DTM after creation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/XSLTCDTMManager.java
public class XSLTCDTMManager extends DTMManagerDefault

/**
 * The default implementation for the DTMManager.
 */
