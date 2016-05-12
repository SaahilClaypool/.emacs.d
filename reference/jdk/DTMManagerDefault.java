_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  public ExpandedNameTable getExpandedNameTable(DTM dtm)

  /**
   * return the expanded name table.
   *
   * NEEDSDOC @param dtm
   *
   * NEEDSDOC ($objectName$) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
    return null;

    /** @todo: implement this com.sun.org.apache.xml.internal.dtm.DTMManager abstract method */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public DTMIterator createDTMIterator(Object xpathCompiler, int pos)

  /**
   * NEEDSDOC Method createDTMIterator
   *
   *
   * NEEDSDOC @param xpathCompiler
   * NEEDSDOC @param pos
   *
   * NEEDSDOC (createDTMIterator) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
    return null;

    /** @todo: implement this com.sun.org.apache.xml.internal.dtm.DTMManager abstract method */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public DTMIterator createDTMIterator(int node)

  /**
   * NEEDSDOC Method createDTMIterator
   *
   *
   * NEEDSDOC @param node
   *
   * NEEDSDOC (createDTMIterator) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
    return null;

    /** @todo: implement this com.sun.org.apache.xml.internal.dtm.DTMManager abstract method */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public DTMIterator createDTMIterator(String xpathString,
                                       PrefixResolver presolver)

  /**
   * NEEDSDOC Method createDTMIterator
   *
   *
   * NEEDSDOC @param xpathString
   * NEEDSDOC @param presolver
   *
   * NEEDSDOC (createDTMIterator) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
    return null;

    /** @todo: implement this com.sun.org.apache.xml.internal.dtm.DTMManager abstract method */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public DTMIterator createDTMIterator(int whatToShow, DTMFilter filter,
                                       boolean entityReferenceExpansion)

  /**
   * NEEDSDOC Method createDTMIterator
   *
   *
   * NEEDSDOC @param whatToShow
   * NEEDSDOC @param filter
   * NEEDSDOC @param entityReferenceExpansion
   *
   * NEEDSDOC (createDTMIterator) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public DTM createDocumentFragment()

  /**
   * Method createDocumentFragment
   *
   *
   * NEEDSDOC (createDocumentFragment) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public boolean release(DTM dtm, boolean shouldHardDelete)

  /**
   * Release the DTMManager's reference(s) to a DTM, making it unmanaged.
   * This is typically done as part of returning the DTM to the heap after
   * we're done with it.
   *
   * @param dtm the DTM to be released.
   *
   * @param shouldHardDelete If false, this call is a suggestion rather than an
   * order, and we may not actually release the DTM. This is intended to
   * support intelligent caching of documents... which is not implemented
   * in this version of the DTM manager.
   *
   * @return true if the DTM was released, false if shouldHardDelete was set
   * and we decided not to.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public int getDTMIdentity(DTM dtm)

  /**
   * Given a DTM, find the ID number in the DTM tables which addresses
   * the start of the document. If overflow addressing is in use, other
   * DTM IDs may also be assigned to this DTM.
   *
   * @param dtm The DTM which (hopefully) contains this node.
   *
   * @return The DTM ID (as the high bits of a NodeHandle, not as our
   * internal index), or -1 if the DTM doesn't belong to this manager.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public DTM getDTM(int nodeHandle)

  /**
   * Return the DTM object containing a representation of this node.
   *
   * @param nodeHandle DTM Handle indicating which node to retrieve
   *
   * @return a reference to the DTM object containing this node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public void releaseXMLReader(XMLReader reader) {

  /**
   * Indicates that the XMLReader object is no longer in use for the transform.
   *
   * Note that the getXMLReader method may return an XMLReader that was
   * specified on the SAXSource object by the application code.  Such a
   * reader should still be passed to releaseXMLReader, but the reader manager
   * will only re-use XMLReaders that it created.
   *
   * @param reader The XMLReader to be released.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public XMLReader getXMLReader(Source inputSource)

  /**
   * This method returns the SAX2 parser to use with the InputSource
   * obtained from this URI.
   * It may return null if any SAX2-conformant XML parser can be used,
   * or if getInputSource() will also return null. The parser must
   * be free for use (i.e., not currently in use for another parse().
   * After use of the parser is completed, the releaseXMLReader(XMLReader)
   * must be called.
   *
   * @param inputSource The value returned from the URIResolver.
   * @return  a SAX2 XMLReader to use to resolve the inputSource argument.
   *
   * @return non-null XMLReader reference ready to parse.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public int getDTMHandleFromNode(org.w3c.dom.Node node)

  /**
   * Given a W3C DOM node, try and return a DTM handle.
   * Note: calling this may be non-optimal, and there is no guarantee that
   * the node will be found in any particular DTM.
   *
   * @param node Non-null reference to a DOM node.
   *
   * @return a valid DTM handle.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
            // Have the DTM set itself up as IncrementalSAXSource's listener.

            /**************************************************************
            // EXPERIMENTAL 3/22/02
            if (JKESS_XNI_EXPERIMENT && m_incremental &&
                  dtm instanceof XNI2DTM &&
                  coParser instanceof IncrementalSAXSource_Xerces) {
                com.sun.org.apache.xerces.internal.xni.parser.XMLPullParserConfiguration xpc=
                      ((IncrementalSAXSource_Xerces)coParser)
                                           .getXNIParserConfiguration();
              if (xpc!=null) {
                // Bypass SAX; listen to the XNI stream
                ((XNI2DTM)dtm).setIncrementalXNISource(xpc);
              } else {
                  // Listen to the SAX stream (will fail, diagnostically...)
                dtm.setIncrementalSAXSource(coParser);
              }
            } else
            ***************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
          // Create the basic SAX2DTM.

          /**************************************************************
          // EXPERIMENTAL 3/22/02
          else if(JKESS_XNI_EXPERIMENT && m_incremental) {
            dtm = new XNI2DTM(this, source, documentID, whiteSpaceFilter,
                              xstringFactory, doIndexing);
          }
          **************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public DTM getDTM(Source source, boolean unique,
                                 DTMWSFilter whiteSpaceFilter,
                                 boolean incremental, boolean doIndexing)

  /**
   * Get an instance of a DTM, loaded with the content from the
   * specified source.  If the unique flag is true, a new instance will
   * always be returned.  Otherwise it is up to the DTMManager to return a
   * new instance or an instance that it already created and may be being used
   * by someone else.
   *
   * A bit of magic in this implementation: If the source is null, unique is true,
   * and incremental and doIndexing are both false, we return an instance of
   * SAX2RTFDTM, which see.
   *
   * (I think more parameters will need to be added for error handling, and entity
   * resolution, and more explicit control of the RTF situation).
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  public DTMManagerDefault(){}

  /**
   * Constructor DTMManagerDefault
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  private ExpandedNameTable m_expandedNameTable =

  /**
   * The default table for exandedNameID lookups.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public int getFirstFreeDTMID()

  /**
   * Get the first free DTM ID available. %OPT% Linear search is inefficient!
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public void addDTM(DTM dtm, int id, int offset)

  /**
   * Add a DTM to the DTM table.
   *
   * @param dtm Should be a valid reference to a DTM.
   * @param id Integer DTM ID to be bound to this DTM.
   * @param offset Integer addressing offset. The internal DTM Node ID is
   * obtained by adding this offset to the node-number field of the
   * public DTM Handle. For the first DTM ID accessing each DTM, this is 0;
   * for overflow addressing it will be a multiple of 1<<IDENT_DTM_NODE_BITS.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public void addDTM(DTM dtm, int id) {    addDTM(dtm,id,0); }

  /**
   * Add a DTM to the DTM table. This convenience call adds it as the
   * "base DTM ID", with offset 0. The other version of addDTM should
   * be used if you want to add "extended" DTM IDs with nonzero offsets.
   *
   * @param dtm Should be a valid reference to a DTM.
   * @param id Integer DTM ID to be bound to this DTM
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  protected DefaultHandler m_defaultHandler = new DefaultHandler();

  /**
   * The default implementation of ContentHandler, DTDHandler and ErrorHandler.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  protected XMLReaderManager m_readerManager = null;

  /**
   * The cache for XMLReader objects to be used if the user did not
   * supply an XMLReader for a SAXSource or supplied a StreamSource.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  int m_dtm_offsets[] = new int[256];

  /** Map from DTM identifier numbers to offsets. For small DTMs with a
   * single identifier, this will always be 0. In overflow addressing, where
   * additional identifiers are allocated to access nodes beyond the range of
   * a single Node Handle, this table is used to map the handle's node field
   * into the actual node identifier.
   *
   * This array grows as necessary; see addDTM().
   *
   * This array grows as necessary; see addDTM(). Growth is uncommon... but
   * access needs to be blindingly fast since it's used in node addressing.
   * (And at the moment, that includes accessing it from DTMDefaultBase,
   * which is why this is not Protected or Private.)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  protected DTM m_dtms[] = new DTM[256];

  /**
   * Map from DTM identifier numbers to DTM objects that this manager manages.
   * One DTM may have several prefix numbers, if extended node indexing
   * is in use; in that case, m_dtm_offsets[] will used to control which
   * prefix maps to which section of the DTM.
   *
   * This array grows as necessary; see addDTM().
   *
   * This array grows as necessary; see addDTM(). Growth is uncommon... but
   * access needs to be blindingly fast since it's used in node addressing.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  private static final boolean DEBUG = false;

  /** Set this to true if you want a basic diagnostics. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  private static final boolean DUMPTREE = false;

  /** Set this to true if you want a dump of the DTM after creation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
public class DTMManagerDefault extends DTMManager

/**
 * The default implementation for the DTMManager.
 *
 * %REVIEW% There is currently a reentrancy issue, since the finalizer
 * for XRTreeFrag (which runs in the GC thread) wants to call
 * DTMManager.release(), and may do so at the same time that the main
 * transformation thread is accessing the manager. Our current solution is
 * to make most of the manager's methods <code>synchronized</code>.
 * Early tests suggest that doing so is not causing a significant
 * performance hit in Xalan. However, it should be noted that there
 * is a possible alternative solution: rewrite release() so it merely
 * posts a request for release onto a threadsafe queue, and explicitly
 * process that queue on an infrequent basis during main-thread
 * activity (eg, when getDTM() is invoked). The downside of that solution
 * would be a greater delay before the DTM's storage is actually released
 * for reuse.
 * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  public ExpandedNameTable getExpandedNameTable(DTM dtm)

  /**
   * return the expanded name table.
   *
   * NEEDSDOC @param dtm
   *
   * NEEDSDOC ($objectName$) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
    return null;

    /** @todo: implement this com.sun.org.apache.xml.internal.dtm.DTMManager abstract method */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public DTMIterator createDTMIterator(Object xpathCompiler, int pos)

  /**
   * NEEDSDOC Method createDTMIterator
   *
   *
   * NEEDSDOC @param xpathCompiler
   * NEEDSDOC @param pos
   *
   * NEEDSDOC (createDTMIterator) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
    return null;

    /** @todo: implement this com.sun.org.apache.xml.internal.dtm.DTMManager abstract method */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public DTMIterator createDTMIterator(int node)

  /**
   * NEEDSDOC Method createDTMIterator
   *
   *
   * NEEDSDOC @param node
   *
   * NEEDSDOC (createDTMIterator) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
    return null;

    /** @todo: implement this com.sun.org.apache.xml.internal.dtm.DTMManager abstract method */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public DTMIterator createDTMIterator(String xpathString,
                                       PrefixResolver presolver)

  /**
   * NEEDSDOC Method createDTMIterator
   *
   *
   * NEEDSDOC @param xpathString
   * NEEDSDOC @param presolver
   *
   * NEEDSDOC (createDTMIterator) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
    return null;

    /** @todo: implement this com.sun.org.apache.xml.internal.dtm.DTMManager abstract method */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public DTMIterator createDTMIterator(int whatToShow, DTMFilter filter,
                                       boolean entityReferenceExpansion)

  /**
   * NEEDSDOC Method createDTMIterator
   *
   *
   * NEEDSDOC @param whatToShow
   * NEEDSDOC @param filter
   * NEEDSDOC @param entityReferenceExpansion
   *
   * NEEDSDOC (createDTMIterator) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public DTM createDocumentFragment()

  /**
   * Method createDocumentFragment
   *
   *
   * NEEDSDOC (createDocumentFragment) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public boolean release(DTM dtm, boolean shouldHardDelete)

  /**
   * Release the DTMManager's reference(s) to a DTM, making it unmanaged.
   * This is typically done as part of returning the DTM to the heap after
   * we're done with it.
   *
   * @param dtm the DTM to be released.
   *
   * @param shouldHardDelete If false, this call is a suggestion rather than an
   * order, and we may not actually release the DTM. This is intended to
   * support intelligent caching of documents... which is not implemented
   * in this version of the DTM manager.
   *
   * @return true if the DTM was released, false if shouldHardDelete was set
   * and we decided not to.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public int getDTMIdentity(DTM dtm)

  /**
   * Given a DTM, find the ID number in the DTM tables which addresses
   * the start of the document. If overflow addressing is in use, other
   * DTM IDs may also be assigned to this DTM.
   *
   * @param dtm The DTM which (hopefully) contains this node.
   *
   * @return The DTM ID (as the high bits of a NodeHandle, not as our
   * internal index), or -1 if the DTM doesn't belong to this manager.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public DTM getDTM(int nodeHandle)

  /**
   * Return the DTM object containing a representation of this node.
   *
   * @param nodeHandle DTM Handle indicating which node to retrieve
   *
   * @return a reference to the DTM object containing this node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public void releaseXMLReader(XMLReader reader) {

  /**
   * Indicates that the XMLReader object is no longer in use for the transform.
   *
   * Note that the getXMLReader method may return an XMLReader that was
   * specified on the SAXSource object by the application code.  Such a
   * reader should still be passed to releaseXMLReader, but the reader manager
   * will only re-use XMLReaders that it created.
   *
   * @param reader The XMLReader to be released.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public XMLReader getXMLReader(Source inputSource)

  /**
   * This method returns the SAX2 parser to use with the InputSource
   * obtained from this URI.
   * It may return null if any SAX2-conformant XML parser can be used,
   * or if getInputSource() will also return null. The parser must
   * be free for use (i.e., not currently in use for another parse().
   * After use of the parser is completed, the releaseXMLReader(XMLReader)
   * must be called.
   *
   * @param inputSource The value returned from the URIResolver.
   * @return  a SAX2 XMLReader to use to resolve the inputSource argument.
   *
   * @return non-null XMLReader reference ready to parse.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public int getDTMHandleFromNode(org.w3c.dom.Node node)

  /**
   * Given a W3C DOM node, try and return a DTM handle.
   * Note: calling this may be non-optimal, and there is no guarantee that
   * the node will be found in any particular DTM.
   *
   * @param node Non-null reference to a DOM node.
   *
   * @return a valid DTM handle.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
            // Have the DTM set itself up as IncrementalSAXSource's listener.

            /**************************************************************
            // EXPERIMENTAL 3/22/02
            if (JKESS_XNI_EXPERIMENT && m_incremental &&
                  dtm instanceof XNI2DTM &&
                  coParser instanceof IncrementalSAXSource_Xerces) {
                com.sun.org.apache.xerces.internal.xni.parser.XMLPullParserConfiguration xpc=
                      ((IncrementalSAXSource_Xerces)coParser)
                                           .getXNIParserConfiguration();
              if (xpc!=null) {
                // Bypass SAX; listen to the XNI stream
                ((XNI2DTM)dtm).setIncrementalXNISource(xpc);
              } else {
                  // Listen to the SAX stream (will fail, diagnostically...)
                dtm.setIncrementalSAXSource(coParser);
              }
            } else
            ***************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
          // Create the basic SAX2DTM.

          /**************************************************************
          // EXPERIMENTAL 3/22/02
          else if(JKESS_XNI_EXPERIMENT && m_incremental) {
            dtm = new XNI2DTM(this, source, documentID, whiteSpaceFilter,
                              xstringFactory, doIndexing);
          }
          **************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public DTM getDTM(Source source, boolean unique,
                                 DTMWSFilter whiteSpaceFilter,
                                 boolean incremental, boolean doIndexing)

  /**
   * Get an instance of a DTM, loaded with the content from the
   * specified source.  If the unique flag is true, a new instance will
   * always be returned.  Otherwise it is up to the DTMManager to return a
   * new instance or an instance that it already created and may be being used
   * by someone else.
   *
   * A bit of magic in this implementation: If the source is null, unique is true,
   * and incremental and doIndexing are both false, we return an instance of
   * SAX2RTFDTM, which see.
   *
   * (I think more parameters will need to be added for error handling, and entity
   * resolution, and more explicit control of the RTF situation).
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  public DTMManagerDefault(){}

  /**
   * Constructor DTMManagerDefault
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  private ExpandedNameTable m_expandedNameTable =

  /**
   * The default table for exandedNameID lookups.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public int getFirstFreeDTMID()

  /**
   * Get the first free DTM ID available. %OPT% Linear search is inefficient!
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public void addDTM(DTM dtm, int id, int offset)

  /**
   * Add a DTM to the DTM table.
   *
   * @param dtm Should be a valid reference to a DTM.
   * @param id Integer DTM ID to be bound to this DTM.
   * @param offset Integer addressing offset. The internal DTM Node ID is
   * obtained by adding this offset to the node-number field of the
   * public DTM Handle. For the first DTM ID accessing each DTM, this is 0;
   * for overflow addressing it will be a multiple of 1<<IDENT_DTM_NODE_BITS.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  synchronized public void addDTM(DTM dtm, int id) {    addDTM(dtm,id,0); }

  /**
   * Add a DTM to the DTM table. This convenience call adds it as the
   * "base DTM ID", with offset 0. The other version of addDTM should
   * be used if you want to add "extended" DTM IDs with nonzero offsets.
   *
   * @param dtm Should be a valid reference to a DTM.
   * @param id Integer DTM ID to be bound to this DTM
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  protected DefaultHandler m_defaultHandler = new DefaultHandler();

  /**
   * The default implementation of ContentHandler, DTDHandler and ErrorHandler.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  protected XMLReaderManager m_readerManager = null;

  /**
   * The cache for XMLReader objects to be used if the user did not
   * supply an XMLReader for a SAXSource or supplied a StreamSource.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  int m_dtm_offsets[] = new int[256];

  /** Map from DTM identifier numbers to offsets. For small DTMs with a
   * single identifier, this will always be 0. In overflow addressing, where
   * additional identifiers are allocated to access nodes beyond the range of
   * a single Node Handle, this table is used to map the handle's node field
   * into the actual node identifier.
   *
   * This array grows as necessary; see addDTM().
   *
   * This array grows as necessary; see addDTM(). Growth is uncommon... but
   * access needs to be blindingly fast since it's used in node addressing.
   * (And at the moment, that includes accessing it from DTMDefaultBase,
   * which is why this is not Protected or Private.)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  protected DTM m_dtms[] = new DTM[256];

  /**
   * Map from DTM identifier numbers to DTM objects that this manager manages.
   * One DTM may have several prefix numbers, if extended node indexing
   * is in use; in that case, m_dtm_offsets[] will used to control which
   * prefix maps to which section of the DTM.
   *
   * This array grows as necessary; see addDTM().
   *
   * This array grows as necessary; see addDTM(). Growth is uncommon... but
   * access needs to be blindingly fast since it's used in node addressing.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  private static final boolean DEBUG = false;

  /** Set this to true if you want a basic diagnostics. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
  private static final boolean DUMPTREE = false;

  /** Set this to true if you want a dump of the DTM after creation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMManagerDefault.java
public class DTMManagerDefault extends DTMManager

/**
 * The default implementation for the DTMManager.
 *
 * %REVIEW% There is currently a reentrancy issue, since the finalizer
 * for XRTreeFrag (which runs in the GC thread) wants to call
 * DTMManager.release(), and may do so at the same time that the main
 * transformation thread is accessing the manager. Our current solution is
 * to make most of the manager's methods <code>synchronized</code>.
 * Early tests suggest that doing so is not causing a significant
 * performance hit in Xalan. However, it should be noted that there
 * is a possible alternative solution: rewrite release() so it merely
 * posts a request for release onto a threadsafe queue, and explicitly
 * process that queue on an infrequent basis during main-thread
 * activity (eg, when getDTM() is invoked). The downside of that solution
 * would be a greater delay before the DTM's storage is actually released
 * for reuse.
 * */
