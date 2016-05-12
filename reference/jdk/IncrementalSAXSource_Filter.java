_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Filter.java
    /*

  /** Simple unit test. Attempt coroutine parsing of document indicated
   * by first argument (as a URI), report progress.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Filter.java
  public Object deliverMoreNodes(boolean parsemore)

  /** deliverMoreNodes() is a simple API which tells the coroutine
   * parser that we need more nodes.  This is intended to be called
   * from one of our partner routines, and serves to encapsulate the
   * details of how incremental parsing has been achieved.
   *
   * @param parsemore If true, tells the incremental filter to generate
   * another chunk of output. If false, tells the filter that we're
   * satisfied and it can terminate parsing of this document.
   *
   * @return Boolean.TRUE if there may be more events available by invoking
   * deliverMoreNodes() again. Boolean.FALSE if parsing has run to completion (or been
   * terminated by deliverMoreNodes(false). Or an exception object if something
   * malfunctioned. %REVIEW% We _could_ actually throw the exception, but
   * that would require runinng deliverMoreNodes() in a try/catch... and for many
   * applications, exception will be simply be treated as "not TRUE" in
   * any case.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Filter.java
  class StopException extends RuntimeException

  /** Used to quickly terminate parse when running under a
      startParse() thread. Only its type is important. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Filter.java
  public void startParse(InputSource source) throws SAXException

  /** Launch a thread that will run an XMLReader's parse() operation within
   *  a thread, feeding events to this IncrementalSAXSource_Filter. Mostly a convenience
   *  routine, but has the advantage that -- since we invoked parse() --
   *  we can halt parsing quickly via a StopException rather than waiting
   *  for the SAX stream to end by itself.
   *
   * @throws SAXException is parse thread is already in progress
   * or parsing can not be started.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Filter.java
  private void co_yield(boolean moreRemains) throws SAXException

  /**
   * Co_Yield handles coroutine interactions while a parse is in progress.
   *
   * When moreRemains==true, we are pausing after delivering events, to
   * ask if more are needed. We will resume the controller thread with
   *   co_resume(Boolean.TRUE, ...)
   * When control is passed back it may indicate
   *      Boolean.TRUE    indication to continue delivering events
   *      Boolean.FALSE   indication to discontinue events and shut down.
   *
   * When moreRemains==false, we shut down immediately without asking the
   * controller's permission. Normally this means end of document has been
   * reached.
   *
   * Shutting down a IncrementalSAXSource_Filter requires terminating the incoming
   * SAX event stream. If we are in control of that stream (if it came
   * from an XMLReader passed to our startReader() method), we can do so
   * very quickly by throwing a reserved exception to it. If the stream is
   * coming from another source, we can't do that because its caller may
   * not be prepared for this "normal abnormal exit", and instead we put
   * ourselves in a "spin" mode where events are discarded.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Filter.java
  private void co_entry_pause() throws SAXException

  /**
   * co_entry_pause is called in startDocument() before anything else
   * happens. It causes the filter to wait for a "go ahead" request
   * from the controller before delivering any events. Note that
   * the very first thing the controller tells us may be "I don't
   * need events after all"!
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Filter.java
  protected void count_and_yield(boolean moreExpected) throws SAXException

  /** <p>In the SAX delegation code, I've inlined the count-down in
   * the hope of encouraging compilers to deliver better
   * performance. However, if we subclass (eg to directly connect the
   * output to a DTM builder), that would require calling super in
   * order to run that logic... which seems inelegant.  Hence this
   * routine for the convenience of subclasses: every [frequency]
   * invocations, issue a co_yield.</p>
   *
   * @param moreExepected Should always be true unless this is being called
   * at the end of endDocument() handling.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Filter.java
  public CoroutineManager getCoroutineManager()

  /** @return the CoroutineManager this CoroutineFilter object is bound to.
   * If you're using the do...() methods, applications should only
   * need to talk to the CoroutineManager once, to obtain the
   * application's Coroutine ID.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Filter.java
  public void setXMLReader(XMLReader eventsource)

  /** Bind our input streams to an XMLReader.
   *
   * Just a convenience routine; obviously you can explicitly register
   * this as a listener with the same effect.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Filter.java
  public IncrementalSAXSource_Filter(CoroutineManager co, int controllerCoroutineID)

  /** Create a IncrementalSAXSource_Filter which is not yet bound to a specific
   * SAX event source.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Filter.java
final class IncrementalSAXSource_Filter

/** <p>IncrementalSAXSource_Filter implements IncrementalSAXSource, using a
 * standard SAX2 event source as its input and parcelling out those
 * events gradually in reponse to deliverMoreNodes() requests.  Output from the
 * filter will be passed along to a SAX handler registered as our
 * listener, but those callbacks will pass through a counting stage
 * which periodically yields control back to the controller coroutine.
 * </p>
 *
 * <p>%REVIEW%: This filter is not currenly intended to be reusable
 * for parsing additional streams/documents. We may want to consider
 * making it resettable at some point in the future. But it's a
 * small object, so that'd be mostly a convenience issue; the cost
 * of allocating each time is trivial compared to the cost of processing
 * any nontrival stream.</p>
 *
 * <p>For a brief usage example, see the unit-test main() method.</p>
 *
 * <p>This is a simplification of the old CoroutineSAXParser, focusing
 * specifically on filtering. The resulting controller protocol is _far_
 * simpler and less error-prone; the only controller operation is deliverMoreNodes(),
 * and the only requirement is that deliverMoreNodes(false) be called if you want to
 * discard the rest of the stream and the previous deliverMoreNodes() didn't return
 * false.
 *
 * This class is final and package private for security reasons. Please
 * see CR 6537912 for further details.
 *
 * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Filter.java
    /*

  /** Simple unit test. Attempt coroutine parsing of document indicated
   * by first argument (as a URI), report progress.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Filter.java
  public Object deliverMoreNodes(boolean parsemore)

  /** deliverMoreNodes() is a simple API which tells the coroutine
   * parser that we need more nodes.  This is intended to be called
   * from one of our partner routines, and serves to encapsulate the
   * details of how incremental parsing has been achieved.
   *
   * @param parsemore If true, tells the incremental filter to generate
   * another chunk of output. If false, tells the filter that we're
   * satisfied and it can terminate parsing of this document.
   *
   * @return Boolean.TRUE if there may be more events available by invoking
   * deliverMoreNodes() again. Boolean.FALSE if parsing has run to completion (or been
   * terminated by deliverMoreNodes(false). Or an exception object if something
   * malfunctioned. %REVIEW% We _could_ actually throw the exception, but
   * that would require runinng deliverMoreNodes() in a try/catch... and for many
   * applications, exception will be simply be treated as "not TRUE" in
   * any case.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Filter.java
  class StopException extends RuntimeException

  /** Used to quickly terminate parse when running under a
      startParse() thread. Only its type is important. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Filter.java
  public void startParse(InputSource source) throws SAXException

  /** Launch a thread that will run an XMLReader's parse() operation within
   *  a thread, feeding events to this IncrementalSAXSource_Filter. Mostly a convenience
   *  routine, but has the advantage that -- since we invoked parse() --
   *  we can halt parsing quickly via a StopException rather than waiting
   *  for the SAX stream to end by itself.
   *
   * @throws SAXException is parse thread is already in progress
   * or parsing can not be started.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Filter.java
  private void co_yield(boolean moreRemains) throws SAXException

  /**
   * Co_Yield handles coroutine interactions while a parse is in progress.
   *
   * When moreRemains==true, we are pausing after delivering events, to
   * ask if more are needed. We will resume the controller thread with
   *   co_resume(Boolean.TRUE, ...)
   * When control is passed back it may indicate
   *      Boolean.TRUE    indication to continue delivering events
   *      Boolean.FALSE   indication to discontinue events and shut down.
   *
   * When moreRemains==false, we shut down immediately without asking the
   * controller's permission. Normally this means end of document has been
   * reached.
   *
   * Shutting down a IncrementalSAXSource_Filter requires terminating the incoming
   * SAX event stream. If we are in control of that stream (if it came
   * from an XMLReader passed to our startReader() method), we can do so
   * very quickly by throwing a reserved exception to it. If the stream is
   * coming from another source, we can't do that because its caller may
   * not be prepared for this "normal abnormal exit", and instead we put
   * ourselves in a "spin" mode where events are discarded.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Filter.java
  private void co_entry_pause() throws SAXException

  /**
   * co_entry_pause is called in startDocument() before anything else
   * happens. It causes the filter to wait for a "go ahead" request
   * from the controller before delivering any events. Note that
   * the very first thing the controller tells us may be "I don't
   * need events after all"!
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Filter.java
  protected void count_and_yield(boolean moreExpected) throws SAXException

  /** <p>In the SAX delegation code, I've inlined the count-down in
   * the hope of encouraging compilers to deliver better
   * performance. However, if we subclass (eg to directly connect the
   * output to a DTM builder), that would require calling super in
   * order to run that logic... which seems inelegant.  Hence this
   * routine for the convenience of subclasses: every [frequency]
   * invocations, issue a co_yield.</p>
   *
   * @param moreExepected Should always be true unless this is being called
   * at the end of endDocument() handling.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Filter.java
  public CoroutineManager getCoroutineManager()

  /** @return the CoroutineManager this CoroutineFilter object is bound to.
   * If you're using the do...() methods, applications should only
   * need to talk to the CoroutineManager once, to obtain the
   * application's Coroutine ID.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Filter.java
  public void setXMLReader(XMLReader eventsource)

  /** Bind our input streams to an XMLReader.
   *
   * Just a convenience routine; obviously you can explicitly register
   * this as a listener with the same effect.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Filter.java
  public IncrementalSAXSource_Filter(CoroutineManager co, int controllerCoroutineID)

  /** Create a IncrementalSAXSource_Filter which is not yet bound to a specific
   * SAX event source.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource_Filter.java
final class IncrementalSAXSource_Filter

/** <p>IncrementalSAXSource_Filter implements IncrementalSAXSource, using a
 * standard SAX2 event source as its input and parcelling out those
 * events gradually in reponse to deliverMoreNodes() requests.  Output from the
 * filter will be passed along to a SAX handler registered as our
 * listener, but those callbacks will pass through a counting stage
 * which periodically yields control back to the controller coroutine.
 * </p>
 *
 * <p>%REVIEW%: This filter is not currenly intended to be reusable
 * for parsing additional streams/documents. We may want to consider
 * making it resettable at some point in the future. But it's a
 * small object, so that'd be mostly a convenience issue; the cost
 * of allocating each time is trivial compared to the cost of processing
 * any nontrival stream.</p>
 *
 * <p>For a brief usage example, see the unit-test main() method.</p>
 *
 * <p>This is a simplification of the old CoroutineSAXParser, focusing
 * specifically on filtering. The resulting controller protocol is _far_
 * simpler and less error-prone; the only controller operation is deliverMoreNodes(),
 * and the only requirement is that deliverMoreNodes(false) be called if you want to
 * discard the rest of the stream and the previous deliverMoreNodes() didn't return
 * false.
 *
 * This class is final and package private for security reasons. Please
 * see CR 6537912 for further details.
 *
 * */
