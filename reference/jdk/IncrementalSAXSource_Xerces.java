_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Xerces.java
  public static void _main(String args[])

  /** Simple unit test. Attempt coroutine parsing of document indicated
   * by first argument (as a URI), report progress.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Xerces.java
  public Object deliverMoreNodes (boolean parsemore)

  /** deliverMoreNodes() is a simple API which tells the coroutine
   * parser that we need more nodes.  This is intended to be called
   * from one of our partner routines, and serves to encapsulate the
   * details of how incremental parsing has been achieved.
   *
   * @param parsemore If true, tells the incremental parser to generate
   * another chunk of output. If false, tells the parser that we're
   * satisfied and it can terminate parsing of this document.
   * @return Boolean.TRUE if the CoroutineParser believes more data may be available
   * for further parsing. Boolean.FALSE if parsing ran to completion.
   * Exception if the parser objected for some reason.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Xerces.java
  public void startParse(InputSource source) throws SAXException

  /** startParse() is a simple API which tells the IncrementalSAXSource
   * to begin reading a document.
   *
   * @throws SAXException is parse thread is already in progress
   * or parsing can not be started.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Xerces.java
  public IncrementalSAXSource_Xerces(SAXParser parser)

  /** Create a IncrementalSAXSource_Xerces wrapped around
   * an existing SAXParser. Currently this works only for recent
   * releases of Xerces-1.  Xerces-2 incremental is currently possible
   * only if we are allowed to create the parser instance, due to
   * limitations in the API exposed by Xerces-2 Beta 3; see the
   * no-args constructor for that code.
   *
   * @exception if the SAXParser class doesn't support the Xerces
   * incremental parse operations. In that case, caller should
   * fall back upon the IncrementalSAXSource_Filter approach.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Xerces.java
  public IncrementalSAXSource_Xerces()

  /** Create a IncrementalSAXSource_Xerces, and create a SAXParser
   * to go with it. Xerces2 incremental parsing is only supported if
   * this constructor is used, due to limitations in the Xerces2 API (as of
   * Beta 3). If you don't like that restriction, tell the Xerces folks that
   * there should be a simpler way to request incremental SAX parsing.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Xerces.java
public class IncrementalSAXSource_Xerces

/** <p>IncrementalSAXSource_Xerces takes advantage of the fact that Xerces1
 * incremental mode is already a coroutine of sorts, and just wraps our
 * IncrementalSAXSource API around it.</p>
 *
 * <p>Usage example: See main().</p>
 *
 * <p>Status: Passes simple main() unit-test. NEEDS JAVADOC.</p>
 * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Xerces.java
  public static void _main(String args[])

  /** Simple unit test. Attempt coroutine parsing of document indicated
   * by first argument (as a URI), report progress.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Xerces.java
  public Object deliverMoreNodes (boolean parsemore)

  /** deliverMoreNodes() is a simple API which tells the coroutine
   * parser that we need more nodes.  This is intended to be called
   * from one of our partner routines, and serves to encapsulate the
   * details of how incremental parsing has been achieved.
   *
   * @param parsemore If true, tells the incremental parser to generate
   * another chunk of output. If false, tells the parser that we're
   * satisfied and it can terminate parsing of this document.
   * @return Boolean.TRUE if the CoroutineParser believes more data may be available
   * for further parsing. Boolean.FALSE if parsing ran to completion.
   * Exception if the parser objected for some reason.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Xerces.java
  public void startParse(InputSource source) throws SAXException

  /** startParse() is a simple API which tells the IncrementalSAXSource
   * to begin reading a document.
   *
   * @throws SAXException is parse thread is already in progress
   * or parsing can not be started.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Xerces.java
  public IncrementalSAXSource_Xerces(SAXParser parser)

  /** Create a IncrementalSAXSource_Xerces wrapped around
   * an existing SAXParser. Currently this works only for recent
   * releases of Xerces-1.  Xerces-2 incremental is currently possible
   * only if we are allowed to create the parser instance, due to
   * limitations in the API exposed by Xerces-2 Beta 3; see the
   * no-args constructor for that code.
   *
   * @exception if the SAXParser class doesn't support the Xerces
   * incremental parse operations. In that case, caller should
   * fall back upon the IncrementalSAXSource_Filter approach.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Xerces.java
  public IncrementalSAXSource_Xerces()

  /** Create a IncrementalSAXSource_Xerces, and create a SAXParser
   * to go with it. Xerces2 incremental parsing is only supported if
   * this constructor is used, due to limitations in the Xerces2 API (as of
   * Beta 3). If you don't like that restriction, tell the Xerces folks that
   * there should be a simpler way to request incremental SAX parsing.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Xerces.java
public class IncrementalSAXSource_Xerces

/** <p>IncrementalSAXSource_Xerces takes advantage of the fact that Xerces1
 * incremental mode is already a coroutine of sorts, and just wraps our
 * IncrementalSAXSource API around it.</p>
 *
 * <p>Usage example: See main().</p>
 *
 * <p>Status: Passes simple main() unit-test. NEEDS JAVADOC.</p>
 * */
