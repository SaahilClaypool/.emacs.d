_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  public boolean isTreeIncomplete()

  /** @return true if a DTM tree is currently under construction.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  public boolean popRewindMark()

  /** "Tail-pruning" support for RTFs.
   *
   * This function pops the information previously saved by
   * pushRewindMark (which see) and uses it to discard all nodes added
   * to the DTM after that time. We expect that this will allow us to
   * reuse storage more effectively.
   *
   * This is _not_ intended to be called while a document is still being
   * constructed -- only between endDocument and the next startDocument
   *
   * %REVIEW% WARNING: This is the first use of some of the truncation
   * methods.  If Xalan blows up after this is called, that's a likely
   * place to check.
   *
   * %REVIEW% Our original design for DTMs permitted them to share
   * string pools.  If there any risk that this might be happening, we
   * can _not_ rewind and recover the string storage. One solution
   * might to assert that DTMs used for RTFs Must Not take advantage
   * of that feature, but this seems excessively fragile. Another, much
   * less attractive, would be to just let them leak... Nah.
   *
   * @return true if and only if the pop completely emptied the
   * RTF. That response is used when determining how to unspool
   * RTF-started-while-RTF-open situations.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  public void pushRewindMark()

  /** "Tail-pruning" support for RTFs.
   *
   * This function pushes information about the current size of the
   * DTM's data structures onto a stack, for use by popRewindMark()
   * (which see).
   *
   * %REVIEW% I have no idea how to rewind m_elemIndexes. However,
   * RTFs will not be indexed, so I can simply panic if that case
   * arises. Hey, it works...
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  public void endDocument() throws SAXException

  /**
   * Receive notification of the end of the document.
   *
   * %REVIEW% Y'know, this isn't all that much of a deoptimization. We
   * might want to consider folding the start/endDocument changes back
   * into the main SAX2DTM so we don't have to expose so many fields
   * (even as Protected).
   *
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#endDocument
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  public void startDocument() throws SAXException

  /**
   * Receive notification of the beginning of a new RTF document.
   *
   * %REVIEW% Y'know, this isn't all that much of a deoptimization. We
   * might want to consider folding the start/endDocument changes back
   * into the main SAX2DTM so we don't have to expose so many fields
   * (even as Protected) and carry the additional code.
   *
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#startDocument
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  protected int _documentRoot(int nodeIdentifier)

  /**
   * Given a node identifier, find the owning document node.  Unlike the DOM,
   * this considers the owningDocument of a Document to be itself. Note that
   * in shared DTMs this may not be zero.
   *
   * @param nodeIdentifier the id of the starting node.
   * @return int Node identifier of the root of this DTM tree
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  public int getDocumentRoot(int nodeHandle)

  /**
   * Given a node handle, find the owning document node, using DTM semantics
   * (Document owns itself) rather than DOM semantics (Document has no owner).
   *
   * (I'm counting on the fact that getOwnerDocument() is implemented on top
   * of this call, in the superclass, to avoid having to rewrite that one.
   * Be careful if that code changes!)
   *
   * @param nodeHandle the id of the node.
   * @return int Node handle of owning document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  public int getDocument()

  /**
   * Given a DTM, find the owning document node. In the case of
   * SAX2RTFDTM, which may contain multiple documents, this returns
   * the <b>most recently started</b> document, or null if the DTM is
   * empty or no document is currently under construction.
   *
   * %REVIEW% Should we continue to report the most recent after
   * construction has ended? I think not, given that it may have been
   * tail-pruned.
   *
   *  @return int Node handle of Document node, or null if this DTM does not
   *  contain an "active" document.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  int m_emptyDataQNCount;

  /**
   * Tail-pruning mark:  default initial number of dataOrQName slots in use
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  int m_emptyCharsCount;

  /**
   * Tail-pruning mark:  initial number of characters in use
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  int m_emptyDataCount;

  /**
   * Tail-pruning mark:  initial number of data items in use
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  int m_emptyNSDeclSetElemsCount;

  /**
   * Tail-pruning mark:  initial number of namespace declaration elements
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  int m_emptyNSDeclSetCount;

  /**
   * Tail-pruning mark:  initial number of namespace declaration sets
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  int m_emptyNodeCount;

  /**
   * Tail-pruning mark:  initial number of nodes in use
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  IntStack mark_nsdeclset_size=new IntStack();

  /** Tail-pruning mark: Number of namespace declaration sets in use
   * %REVIEW% I don't think number of NS sets is ever different from number
   * of NS elements. We can probabably reduce these to a single stack and save
   * some storage.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  IntStack mark_char_size=new IntStack();

  /** Tail-pruning mark: Number of size-of-data fields in use */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  IntStack mark_size=new IntStack();

  /** Tail-pruning mark: Number of nodes in use */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  private int m_currentDocumentNode=NULL;

  /** Most recently started Document, or null if the DTM is empty.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  private static final boolean DEBUG = false;

  /** Set true to monitor SAX events and similar diagnostic info. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
public class SAX2RTFDTM extends SAX2DTM

/**
 * This is a subclass of SAX2DTM which has been modified to meet the needs of
 * Result Tree Frameworks (RTFs). The differences are:
 *
 * 1) Multiple XML trees may be appended to the single DTM. This means
 * that the root node of each document is _not_ node 0. Some code has
 * had to be deoptimized to support this mode of operation, and an
 * explicit mechanism for obtaining the Node Handle of the root node
 * has been provided.
 *
 * 2) A stack of these documents is maintained, allowing us to "tail-prune" the
 * most recently added trees off the end of the DTM as stylesheet elements
 * (and thus variable contexts) are exited.
 *
 * PLEASE NOTE that this class may be _heavily_ dependent upon the
 * internals of the SAX2DTM superclass, and must be maintained in
 * parallel with that code.  Arguably, they should be conditionals
 * within a single class... but they have deen separated for
 * performance reasons. (In fact, one could even argue about which is
 * the superclass and which is the subclass; the current arrangement
 * is as much about preserving stability of existing code during
 * development as anything else.)
 *
 * %REVIEW% In fact, since the differences are so minor, I think it
 * may be possible/practical to fold them back into the base
 * SAX2DTM. Consider that as a future code-size optimization.
 * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  public boolean isTreeIncomplete()

  /** @return true if a DTM tree is currently under construction.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  public boolean popRewindMark()

  /** "Tail-pruning" support for RTFs.
   *
   * This function pops the information previously saved by
   * pushRewindMark (which see) and uses it to discard all nodes added
   * to the DTM after that time. We expect that this will allow us to
   * reuse storage more effectively.
   *
   * This is _not_ intended to be called while a document is still being
   * constructed -- only between endDocument and the next startDocument
   *
   * %REVIEW% WARNING: This is the first use of some of the truncation
   * methods.  If Xalan blows up after this is called, that's a likely
   * place to check.
   *
   * %REVIEW% Our original design for DTMs permitted them to share
   * string pools.  If there any risk that this might be happening, we
   * can _not_ rewind and recover the string storage. One solution
   * might to assert that DTMs used for RTFs Must Not take advantage
   * of that feature, but this seems excessively fragile. Another, much
   * less attractive, would be to just let them leak... Nah.
   *
   * @return true if and only if the pop completely emptied the
   * RTF. That response is used when determining how to unspool
   * RTF-started-while-RTF-open situations.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  public void pushRewindMark()

  /** "Tail-pruning" support for RTFs.
   *
   * This function pushes information about the current size of the
   * DTM's data structures onto a stack, for use by popRewindMark()
   * (which see).
   *
   * %REVIEW% I have no idea how to rewind m_elemIndexes. However,
   * RTFs will not be indexed, so I can simply panic if that case
   * arises. Hey, it works...
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  public void endDocument() throws SAXException

  /**
   * Receive notification of the end of the document.
   *
   * %REVIEW% Y'know, this isn't all that much of a deoptimization. We
   * might want to consider folding the start/endDocument changes back
   * into the main SAX2DTM so we don't have to expose so many fields
   * (even as Protected).
   *
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#endDocument
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  public void startDocument() throws SAXException

  /**
   * Receive notification of the beginning of a new RTF document.
   *
   * %REVIEW% Y'know, this isn't all that much of a deoptimization. We
   * might want to consider folding the start/endDocument changes back
   * into the main SAX2DTM so we don't have to expose so many fields
   * (even as Protected) and carry the additional code.
   *
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#startDocument
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  protected int _documentRoot(int nodeIdentifier)

  /**
   * Given a node identifier, find the owning document node.  Unlike the DOM,
   * this considers the owningDocument of a Document to be itself. Note that
   * in shared DTMs this may not be zero.
   *
   * @param nodeIdentifier the id of the starting node.
   * @return int Node identifier of the root of this DTM tree
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  public int getDocumentRoot(int nodeHandle)

  /**
   * Given a node handle, find the owning document node, using DTM semantics
   * (Document owns itself) rather than DOM semantics (Document has no owner).
   *
   * (I'm counting on the fact that getOwnerDocument() is implemented on top
   * of this call, in the superclass, to avoid having to rewrite that one.
   * Be careful if that code changes!)
   *
   * @param nodeHandle the id of the node.
   * @return int Node handle of owning document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  public int getDocument()

  /**
   * Given a DTM, find the owning document node. In the case of
   * SAX2RTFDTM, which may contain multiple documents, this returns
   * the <b>most recently started</b> document, or null if the DTM is
   * empty or no document is currently under construction.
   *
   * %REVIEW% Should we continue to report the most recent after
   * construction has ended? I think not, given that it may have been
   * tail-pruned.
   *
   *  @return int Node handle of Document node, or null if this DTM does not
   *  contain an "active" document.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  int m_emptyDataQNCount;

  /**
   * Tail-pruning mark:  default initial number of dataOrQName slots in use
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  int m_emptyCharsCount;

  /**
   * Tail-pruning mark:  initial number of characters in use
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  int m_emptyDataCount;

  /**
   * Tail-pruning mark:  initial number of data items in use
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  int m_emptyNSDeclSetElemsCount;

  /**
   * Tail-pruning mark:  initial number of namespace declaration elements
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  int m_emptyNSDeclSetCount;

  /**
   * Tail-pruning mark:  initial number of namespace declaration sets
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  int m_emptyNodeCount;

  /**
   * Tail-pruning mark:  initial number of nodes in use
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  IntStack mark_nsdeclset_size=new IntStack();

  /** Tail-pruning mark: Number of namespace declaration sets in use
   * %REVIEW% I don't think number of NS sets is ever different from number
   * of NS elements. We can probabably reduce these to a single stack and save
   * some storage.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  IntStack mark_char_size=new IntStack();

  /** Tail-pruning mark: Number of size-of-data fields in use */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  IntStack mark_size=new IntStack();

  /** Tail-pruning mark: Number of nodes in use */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  private int m_currentDocumentNode=NULL;

  /** Most recently started Document, or null if the DTM is empty.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
  private static final boolean DEBUG = false;

  /** Set true to monitor SAX events and similar diagnostic info. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2RTFDTM.java
public class SAX2RTFDTM extends SAX2DTM

/**
 * This is a subclass of SAX2DTM which has been modified to meet the needs of
 * Result Tree Frameworks (RTFs). The differences are:
 *
 * 1) Multiple XML trees may be appended to the single DTM. This means
 * that the root node of each document is _not_ node 0. Some code has
 * had to be deoptimized to support this mode of operation, and an
 * explicit mechanism for obtaining the Node Handle of the root node
 * has been provided.
 *
 * 2) A stack of these documents is maintained, allowing us to "tail-prune" the
 * most recently added trees off the end of the DTM as stylesheet elements
 * (and thus variable contexts) are exited.
 *
 * PLEASE NOTE that this class may be _heavily_ dependent upon the
 * internals of the SAX2DTM superclass, and must be maintained in
 * parallel with that code.  Arguably, they should be conditionals
 * within a single class... but they have deen separated for
 * performance reasons. (In fact, one could even argue about which is
 * the superclass and which is the subclass; the current arrangement
 * is as much about preserving stability of existing code during
 * development as anything else.)
 *
 * %REVIEW% In fact, since the differences are so minor, I think it
 * may be possible/practical to fold them back into the base
 * SAX2DTM. Consider that as a future code-size optimization.
 * */
