_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public void refresh(int refreshPosition){

    /**
     * receives callbacks from {@link XMLEntityReader } when buffer
     * is being changed.
     * @param refreshPosition
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public void refresh(){

    /**
     * Implements XMLBufferListener interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected XMLString getString(){

    /** this function gets an XMLString (which is used to store the attribute value) from the special pool
     *  maintained for attributes.
     *  fAttributeCacheUsedCount tracks the number of attributes that has been consumed from the pool.
     *  if all the attributes has been consumed, it adds a new XMLString inthe pool and returns the same
     *  XMLString.
     *
     * @return XMLString XMLString used to store an attribute value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        protected void endOfFileHook(EOFException e)

        /**
         * End of file hook. This method is a hook for subclasses to
         * add code that handles the end of file. The end of file in
         * a document fragment is OK if the markup depth is zero.
         * However, when scanning a full XML document, an end of file
         * is always premature.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        protected boolean scanRootElementHook()

        /**
         * Scan for root element hook. This method is a hook for
         * subclasses to add code that handles scanning for the root
         * element. When scanning a document fragment, there is no
         * "root" element. However, when scanning a full XML document,
         * the scanner must handle the root element specially.
         *
         * @return True if the caller should stop and return true which
         *          allows the scanner to switch to a new scanning
         *          driver. A return value of false indicates that
         *          the content driver should continue as normal.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        protected boolean elementDepthIsZeroHook()

        /**
         * Element depth iz zero. This methos is a hook for subclasses
         * to add code to handle when the element depth hits zero. When
         * scanning a document fragment, an element depth of zero is
         * normal. However, when scanning a full XML document, the
         * scanner must handle the trailing miscellanous section of
         * the document after the end of the document's root element.
         *
         * @return True if the caller should stop and return true which
         *          allows the scanner to switch to a new scanning
         *          driver. A return value of false indicates that
         *          the content driver should continue as normal.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        protected boolean scanForDoctypeHook()

        /**
         * Scan for DOCTYPE hook. This method is a hook for subclasses
         * to add code to handle scanning for a the "DOCTYPE" string
         * after the string "<!" has been scanned.
         *
         * @return True if the "DOCTYPE" was scanned; false if "DOCTYPE"
         *          was not scanned.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
                            else if (c != -1 && isInvalidLiteral(c)) {

                            }///xxx since this part is also characters, it should be merged...
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public int next() throws IOException, XNIException {

        /**
         * Drives the parser to the next state/event on the input. Parser is guaranteed
         * to stop at the next state/event. Internally XML document
         * is divided into several states. Each state represents a sections of XML
         * document. When this functions returns normally, it has read the section
         * of XML document and returns the state corresponding to section of
         * document which has been read. For optimizations, a particular driver
         * can read ahead of the section of document (state returned) just read and
         * can maintain a different internal state.
         *
         * State returned corresponds to Stax states.
         *
         * @return state representing the section of document just read.
         *
         * @throws IOException  Thrown on i/o error.
         * @throws XNIException Thrown on parse error.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public void decideSubState() throws IOException {

        /**
         *
         * SCANNER_STATE_CONTENT and SCANNER_STATE_START_OF_MARKUP are two super states of the parser.
         * At any point of time when in doubt over the current state of the parser, the state should be
         * set to SCANNER_STATE_CONTENT. Parser will automatically revive itself and will set state of
         * the parser to one of its sub state.
         * sub states are defined in the parser on the basis of different XML component like
         * SCANNER_STATE_ENTITY_REFERENCE , SCANNER_STATE_START_ELEMENT, SCANNER_STATE_CDATA etc..
         * These sub states help the parser to have fine control over the parsing. These are the
         * different milepost, parser stops at each sub state (milepost). Based on this state it is
         * decided if paresr needs to stop at next milepost ??
         *
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        private void startOfMarkup() throws IOException {

        /**
         *  decides the appropriate state of the parser
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected class FragmentContentDriver

    /**
     * Driver to handle content scanning. This driver is capable of reading
     * the fragment of XML document. When it has finished reading fragment
     * of XML documents, it can pass the job of reading to another driver.
     *
     * This class has been modified as per the new design which is more suited to
     * efficiently build pull parser. Lot of performance improvements have been done and
     * the code has been added to support stax functionality/features.
     *
     * @author Neeraj Bajaj, Sun Microsystems
     *
     *
     * @author Andy Clark, IBM
     * @author Eric Ye, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public int next() throws IOException, XNIException;

        /**
         * Drives the parser to the next state/event on the input. Parser is guaranteed
         * to stop at the next state/event.
         *
         * Internally XML document is divided into several states. Each state represents
         * a sections of XML document. When this functions returns normally, it has read
         * the section of XML document and returns the state corresponding to section of
         * document which has been read. For optimizations, a particular driver
         * can read ahead of the section of document (state returned) just read and
         * can maintain a different internal state.
         *
         * @return state representing the section of document just read.
         *
         * @throws IOException  Thrown on i/o error.
         * @throws XNIException Thrown on parse error.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected interface Driver {

    /**
     * Drives the parser to the next state/event on the input. Parser is guaranteed
     * to stop at the next state/event.
     *
     * Internally XML document is divided into several states. Each state represents
     * a sections of XML document. When this functions returns normally, it has read
     * the section of XML document and returns the state corresponding to section of
     * document which has been read. For optimizations, a particular driver
     * can read ahead of the section of document (state returned) just read and
     * can maintain a different internal state.
     *
     *
     * @author Neeraj Bajaj, Sun Microsystems
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public QName getLastPoppedElement(){

        /**
         * This function is as a result of optimization done for endElement --
         * we dont need to set the value for every end element encouterd.
         * For Well formedness checks we can have the same QName object that was pushed.
         * the values will be set only if application need to know about the endElement
         * -- neeraj.bajaj@sun.com
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public void clear() {

        /** Clears the stack without throwing away existing QName objects. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public void reposition(){

        /** Reposition the stack. fInt [] contains all the opened tags at particular depth.
         * Transfer all the opened tags starting from depth '2' to the current depth and reposition them
         *as per the depth.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public QName popElement() {

        /**
         * Pops an element off of the stack by setting the values of
         * the specified QName.
         * <p>
         * <strong>Note:</strong> The object returned is <em>not</em>
         * orphaned to the caller. Therefore, the caller should consider
         * the object to be read-only.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public QName nextElement() {

        /**
         * Returns the next element on the stack.
         *
         * @return Returns the actual QName object. Callee should
         * use this object to store the details of next element encountered.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public boolean matchElement(QName element) {

        /** Check if the element scanned during the start element
         *matches the stored element.
         *
         *@return true if the match suceeds.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public void push(){

        /** This function should be called only when element was skipped sucessfully.
         * 1. Increase the depth - because element was sucessfully skipped.
         *2. Store the position of the element token in array  "last opened tag" at depth.
         *3. increase the position counter so as to point to the next element in the array
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public QName getNext(){

        /** Note that this function is considerably different than nextElement()
         * This function just returns the previously stored elements
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        //XXX: THIS FUNCTION IS NOT USED

        /**
         * Pushes an element on the stack.
         * <p>
         * <strong>Note:</strong> The QName values are copied into the
         * stack. In other words, the caller does <em>not</em> orphan
         * the element to the stack. Also, the QName object returned
         * is <em>not</em> orphaned to the caller. It should be
         * considered read-only.
         *
         * @param element The element to push onto the stack.
         *
         * @return Returns the actual QName object that stores the
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public ElementStack() {

        /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        protected QName[] fElements;

        /** The stack data. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected class ElementStack {

    /**
     * Element stack. This stack operates without synchronization, error
     * checking, and it re-uses objects instead of throwing popped items
     * away.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public void clear() {

        /** Clears the stack without throwing away existing QName objects. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public int popElement(){

        /** returns the current depth
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public QName getNext(){

        /** Note that this function is considerably different than nextElement()
         * This function just returns the previously stored elements
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public QName nextElement() {

        /**
         * This function doesn't increase depth. The function in this function is
         *broken down into two functions for efficiency. <@see>matchElement</see>.
         * This function just returns the pointer to the object and its values are set.
         *
         *@return QName reference to the next element in the list
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public boolean matchElement(QName element) {

        /** Check if the element scanned during the start element
         *matches the stored element.
         *
         *@return true if the match suceeds.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
            //resize QNames

            /**
             * int length = fElements.length;
             * Element [] temp = new Element[length * 2];
             * System.arraycopy(fElements, 0, temp, 0, length);
             * fElements = temp;
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public ElementStack2() {

        /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        protected QName [] fQName = new QName[20];

        /** The stack data. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected class ElementStack2 {

    /**
     * Element stack.
     *
     * @author Neeraj Bajaj, Sun Microsystems.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public Element(QName qname, Element next) {

        /**
         * Constructs a new Element from the given QName and next Element
         * reference.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public Element next;

        /** The next Element entry. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public QName qname;

        /** Symbol. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final class Element {

    /**
     * @author Neeraj Bajaj, Sun Microsystems.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    String checkAccess(String systemId, String allowedProtocols) throws IOException {

    /**
     * Check the protocol used in the systemId against allowed protocols
     *
     * @param systemId the Id of the URI
     * @param allowedProtocols a list of allowed protocols separated by comma
     * @return the name of the protocol if rejected, null otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public String getDriverName(Driver driver) {

    /** Returns the driver name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected String getScannerStateName(int state) {

    /** Returns the scanner state name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected final void setDriver(Driver driver) {

    /**
     * Sets the Driver.
     *
     * @param Driver The new Driver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected final void setScannerState(int state) {

    /**
     * Sets the scanner state.
     *
     * @param state The new scanner state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    private void handleCharacter(char c, String entity, XMLStringBuffer content) throws XNIException {

    /**
     * Calls document handler with a single character resulting from
     * built-in entity resolution.
     *
     * @param c
     * @param entity built-in name
     * @param XMLStringBuffer append the character to buffer
     *
     * we really dont need to call this function -- this function is only required when
     * we integrate with rest of Xerces2. SO maintaining the current behavior and still
     * calling this function to hanlde built-in entity reference.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    void checkDepth(String elementName) {

    /**
     * Check if the depth exceeds the maxElementDepth limit
     * @param elementName name of the current element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected void scanEntityReference(XMLStringBuffer content) throws IOException, XNIException {

    /**
     * Scans an entity reference.
     *
     * @return returns true if the new entity is started. If it was built-in entity
     *         'false' is returned.
     * @throws IOException  Thrown if i/o error occurs.
     * @throws XNIException Thrown if handler throws exception upon
     *                      notification.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected void scanCharReference()

    /**
     * Scans a character reference.
     * <p>
     * <pre>
     * [66] CharRef ::= '&#' [0-9]+ ';' | '&#x' [0-9a-fA-F]+ ';'
     * </pre>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected int scanEndElement() throws IOException, XNIException {

    /**
     * Scans an end element.
     * <p>
     * <pre>
     * [42] ETag ::= '&lt;/' Name S? '>'
     * </pre>
     * <p>
     * <strong>Note:</strong> This method uses the fElementQName variable.
     * The contents of this variable will be destroyed. The caller should
     * copy the needed information out of this variable before calling
     * this method.
     *
     * @return The element depth.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
            } else {

                /** We dont need all this code if we pass ']]>' as delimeter..
                 * int brackets = 2;
                 * while (fEntityScanner.skipChar(']')) {
                 * brackets++;
                 * }
                 *
                 * //When we find more than 2 square brackets
                 * if (fDocumentHandler != null && brackets > 2) {
                 * //we dont need to clear the buffer..
                 * //contentBuffer.clear();
                 * for (int i = 2; i < brackets; i++) {
                 * contentBuffer.append(']');
                 * }
                 * fDocumentHandler.characters(contentBuffer, null);
                 * }
                 *
                 * if (fEntityScanner.skipChar('>')) {
                 * break;
                 * }
                 * if (fDocumentHandler != null) {
                 * //we dont need to clear the buffer now..
                 * //contentBuffer.clear();
                 * contentBuffer.append("]]");
                 * fDocumentHandler.characters(contentBuffer, null);
                 * }
                 **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    //CHANGED:

    /**
     * Scans a CDATA section.
     * <p>
     * <strong>Note:</strong> This method uses the fTempString and
     * fStringBuffer variables.
     *
     * @param complete True if the CDATA section is to be scanned
     *                 completely.
     *
     * @return True if CDATA is completely scanned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    //CHANGED:

    /**
     * Scans element content.
     *
     * @return Returns the next character on the stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        //attributes.setNonNormalizedValue(oldLen, fTempString2.toString());

        ///xxx: nonNormalizedValue is not being set as it is not required by SAX & DOM
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        //this function doesn't use 'attIndex'. We are adding the attribute later

        ///fTempString2 would store attribute non-normalized value
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected void scanAttribute(XMLAttributes attributes)

    /**
     * Scans an attribute name value pair.
     * <p>
     * <pre>
     * [41] Attribute ::= Name Eq AttValue
     * </pre>
     * <p>
     * <strong>Note:</strong> This method assumes that the next
     * character on the stream is the first character of the attribute
     * name.
     * <p>
     * <strong>Note:</strong> This method uses the fAttributeQName and
     * fQName variables. The contents of these variables will be
     * destroyed.
     *
     * @param attributes The attributes list for the scanned attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public boolean isStandAlone(){

    /** return if the doucment is standalone */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public boolean standaloneSet(){

    /** return if standalone is set */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public XMLAttributesIteratorImpl getAttributeIterator(){

    /** return the attribute iterator implementation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    /*

    /**xxx there is one check of duplicate attribute that has been removed.
     * attributes.addAttribute(fAttributeQName, XMLSymbols.fCDATASymbol, null);
     *
     * // WFC: Unique Att Spec
     * if (oldLen == attributes.getLength()) {
     * reportFatalError("AttributeNotUnique",
     * new Object[]{fCurrentElement.rawname,
     * fAttributeQName.rawname});
     * }
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    /**

    /**
     * Scans an attribute.
     * <p>
     * <pre>
     * [41] Attribute ::= Name Eq AttValue
     * </pre>
     * <p>
     * <strong>Note:</strong> This method assumes that the next
     * character on the stream is the first character of the attribute
     * name.
     * <p>
     * <strong>Note:</strong> This method uses the fAttributeQName and
     * fQName variables. The contents of these variables will be
     * destroyed.
     *
     * @param attributes The attributes list for the scanned attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected boolean seekCloseOfStartTag() throws IOException, XNIException {

    /**
     * Looks for the close of start tag, i.e. if it finds '>' or '/>'
     * Characters are consumed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    // fElementQName will have the details of element just read..

    /**
     * Scans a start element. This method will handle the binding of
     * namespace information and notifying the handler of the start
     * of the element.
     * <p>
     * <pre>
     * [44] EmptyElemTag ::= '&lt;' Name (S Attribute)* S? '/>'
     * [40] STag ::= '&lt;' Name (S Attribute)* S? '>'
     * </pre>
     * <p>
     * <strong>Note:</strong> This method assumes that the leading
     * '&lt;' character has been consumed.
     * <p>
     * <strong>Note:</strong> This method uses the fElementQName and
     * fAttributes variables. The contents of these variables will be
     * destroyed. The caller should copy important information out of
     * these variables before calling this method.
     * NB: Content in fAttributes is valid only till the state of the parser is XMLEvent.START_ELEMENT
     *
     * @return True if element is empty. (i.e. It matches
     *          production [44].
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected void scanComment() throws IOException, XNIException {

    /**
     * Scans a comment.
     * <p>
     * <pre>
     * [15] Comment ::= '&lt!--' ((Char - '-') | ('-' (Char - '-')))* '-->'
     * </pre>
     * <p>
     * <strong>Note:</strong> Called after scanning past '&lt;!--'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected void scanPIData(String target, XMLStringBuffer data)

    /**
     * Scans a processing data. This is needed to handle the situation
     * where a document starts with a processing instruction whose
     * target name <em>starts with</em> "xml". (e.g. xmlfoo)
     *
     * @param target The PI target
     * @param data The XMLStringBuffer to fill in with the data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        //but this information is only related with Document Entity.

        ///xxx see where its used.. this is not used anywhere. it may be useful for entity to store this information
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected void scanXMLDeclOrTextDecl(boolean scanningTextDecl)

    /**
     * Scans an XML or text declaration.
     * <p>
     * <pre>
     * [23] XMLDecl ::= '&lt;?xml' VersionInfo EncodingDecl? SDDecl? S? '?>'
     * [24] VersionInfo ::= S 'version' Eq (' VersionNum ' | " VersionNum ")
     * [80] EncodingDecl ::= S 'encoding' Eq ('"' EncName '"' |  "'" EncName "'" )
     * [81] EncName ::= [A-Za-z] ([A-Za-z0-9._] | '-')*
     * [32] SDDecl ::= S 'standalone' Eq (("'" ('yes' | 'no') "'")
     *                 | ('"' ('yes' | 'no') '"'))
     *
     * [77] TextDecl ::= '&lt;?xml' VersionInfo? EncodingDecl S? '?>'
     * </pre>
     *
     * @param scanningTextDecl True if a text declaration is to
     *                         be scanned instead of an XML
     *                         declaration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected Driver createContentDriver() {

    /** Creates a content Driver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        // call handler

        /**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        super.endEntity(name, augs);

        /**
         * // flush possible pending output buffer - see scanContent
         * if (fInScanContent && fStringBuffer.length != 0
         * && fDocumentHandler != null) {
         * fDocumentHandler.characters(fStringBuffer, null);
         * fStringBuffer.length = 0; // make sure we know it's been flushed
         * }
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public void endEntity(String name, Augmentations augs) throws IOException, XNIException {

    /**
     * This method notifies the end of an entity. The DTD has the pseudo-name
     * of "[dtd]" parameter entity names start with '%'; and general entities
     * are just specified by their name.
     *
     * @param name The name of the entity.
     * @param augs Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        // call handler

        /** we are not calling the handlers yet.. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public void startEntity(String name,
            XMLResourceIdentifier identifier,
            String encoding, Augmentations augs) throws XNIException {

    /**
     * This method notifies of the start of an entity. The DTD has the
     * pseudo-name of "[dtd]" parameter entity names start with '%'; and
     * general entities are just specified by their name.
     *
     * @param name     The name of the entity.
     * @param identifier The resource identifier.
     * @param encoding The auto-detected IANA encoding name of the entity
     *                 stream. This value will be null in those situations
     *                 where the entity encoding is not auto-detected (e.g.
     *                 internal entities or a document entity that is
     *                 parsed from a java.io.Reader).
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public XMLDocumentHandler getDocumentHandler(){

    /** Returns the document handler */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public void setDocumentHandler(XMLDocumentHandler documentHandler) {

    /**
     * setDocumentHandler
     *
     * @param documentHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public Object getPropertyDefault(String propertyId) {

    /**
     * Returns the default state for a property, or null if this
     * component does not want to report a default value for this
     * property.
     *
     * @param propertyId The property identifier.
     *
     * @since Xerces 2.2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public Boolean getFeatureDefault(String featureId) {

    /**
     * Returns the default state for a feature, or null if this
     * component does not want to report a default value for this
     * feature.
     *
     * @param featureId The feature identifier.
     *
     * @since Xerces 2.2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public void setProperty(String propertyId, Object value)

    /**
     * Sets the value of a property. This method is called by the component
     * manager any time after reset when a property changes value.
     * <p>
     * <strong>Note:</strong> Components should silently ignore properties
     * that do not affect the operation of the component.
     *
     * @param propertyId The property identifier.
     * @param value      The value of the property.
     *
     * @throws SAXNotRecognizedException The component should not throw
     *                                   this exception.
     * @throws SAXNotSupportedException The component should not throw
     *                                  this exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public String[] getRecognizedProperties() {

    /**
     * Returns a list of property identifiers that are recognized by
     * this component. This method may return null if no properties
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public void setFeature(String featureId, boolean state)

    /**
     * Sets the state of a feature. This method is called by the component
     * manager any time after reset when a feature changes state.
     * <p>
     * <strong>Note:</strong> Components should silently ignore features
     * that do not affect the operation of the component.
     *
     * @param featureId The feature identifier.
     * @param state     The state of the feature.
     *
     * @throws SAXNotRecognizedException The component should not throw
     *                                   this exception.
     * @throws SAXNotSupportedException The component should not throw
     *                                  this exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public String[] getRecognizedFeatures() {

    /**
     * Returns a list of feature identifiers that are recognized by
     * this component. This method may return null if no features
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public void reset(XMLComponentManager componentManager)

    /**
     * Resets the component. The component can query the component manager
     * about any features and properties that affect the operation of the
     * component.
     *
     * @param componentManager The component manager.
     *
     * @throws SAXException Thrown by component on initialization error.
     *                      For example, if a feature or property is
     *                      required for the operation of the component, the
     *                      component manager may throw a
     *                      SAXNotRecognizedException or a
     *                      SAXNotSupportedException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public int next() throws IOException, XNIException {

    /** return the next state on the input
     * @return int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public boolean scanDocument(boolean complete)

    /**
     * Scans a document.
     *
     * @param complete True if the scanner should scan the document
     *                 completely, pushing all events to the registered
     *                 document handler. A value of false indicates that
     *                 that the scanner should only scan the next portion
     *                 of the document and return. A scanner instance is
     *                 permitted to completely scan a document if it does
     *                 not support this "pull" scanning model.
     *
     * @return True if there is more to scan, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public void setInputSource(XMLInputSource inputSource) throws IOException {

    /**
     * Sets the input source.
     *
     * @param inputSource The input source.
     *
     * @throws IOException Thrown on i/o error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public XMLDocumentFragmentScannerImpl() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    private Augmentations fTempAugmentations = null;

    /** Reusable Augmentations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    private final char[] fSingleChar = new char[1];

    /** Single character array. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    /** Making the buffer accesible to derived class -- stores PI data */

    /** stores character data. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected XMLStringBuffer fStringBuffer2 = new XMLStringBuffer();

    /** Making the buffer accesible to derived class -- String buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected XMLStringBuffer fStringBuffer = new XMLStringBuffer();

    /** Making the buffer accesible to derived class -- String buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    private String[] fStrings = new String[3];

    /** Array of 3 strings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected XMLString fTempString2 = new XMLString();

    /** String. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected XMLString fTempString = new XMLString();

    /** String. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected XMLAttributesIteratorImpl fAttributes = new XMLAttributesIteratorImpl();

    /**
     * CHANGED: Using XMLAttributesIteratorImpl instead of XMLAttributesImpl. This class
     * implements Iterator interface so we can directly give Attributes in the form of
     * iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected QName fAttributeQName = new QName();

    /** Attribute QName. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected QName fElementQName = new QName();

    /** Element QName. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected Driver fContentDriver = createContentDriver();

    /** Content driver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected Driver fDriver;

    /** Active driver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected boolean fStrictURI;

    /**
     * standard uri conformant (strict uri).
     * http://apache.org/xml/features/standard-uri-conformant
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected String fAccessExternalDTD = EXTERNAL_ACCESS_DEFAULT;

    /**
     * comma-delimited list of protocols that are allowed for the purpose
     * of accessing external dtd or entity references
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected boolean fDisallowDoctype = false;

    /** Xerces Feature: Disallow doctype declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected boolean fNotifyBuiltInRefs = false;

    /** Notify built-in references. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected String fPITarget ;

    /** Document system identifier.
     * REVISIT:  So what's this used for?  - NG
     * protected String fDocumentSystemId;
     ******/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected ElementStack fElementStack = new ElementStack();

    /** Element stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected QName fCurrentElement;

    /** Current element. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected boolean fStandaloneSet;

    /** Standalone. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected boolean fHasExternalDTD;

    /** has external dtd */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected boolean fInScanContent = false;

    /** SubScanner state: inside scanContent method. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected int fScannerState;

    /** Scanner state. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected int fMarkupDepth;

    /** Markup depth. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected int[] fEntityStack = new int[4];

    /** Entity stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected XMLEntityStorage fEntityStore;

    /** Entity Storage */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected XMLDocumentHandler fDocumentHandler;

    /** Document handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final boolean DEBUG = false;

    /** Debug driver next */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final boolean DEBUG_NEXT = false ;

    /** Debug driver next */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final boolean DEBUG_START_END_ELEMENT = false;

    /** Debug content driver scanning. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    private static final boolean DEBUG_DISPATCHER = false;

    /** Debug driver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    private static final boolean DEBUG_SCANNER_STATE = false;

    /** Debug scanner state. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    private static final Object[] PROPERTY_DEFAULTS = {

    /** Property defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    private static final String[] RECOGNIZED_PROPERTIES = {

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    private static final Boolean[] FEATURE_DEFAULTS = {

    /** Feature defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    private static final String[] RECOGNIZED_FEATURES = {

    /** Recognized features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    final static String EXTERNAL_ACCESS_DEFAULT = Constants.EXTERNAL_ACCESS_DEFAULT;

    /** access external dtd: file protocol
     *  For DOM/SAX, the secure feature is set to true by default
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    private static final String XML_SECURITY_PROPERTY_MANAGER =

    /** Property identifier: Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final String STANDARD_URI_CONFORMANT =

    /** Feature identifier: standard uri conformant */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final String ENTITY_RESOLVER =

    /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final String NOTIFY_BUILTIN_REFS =

    /** Feature identifier: notify built-in refereces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_CHARACTER_DATA = 37;

    /** Scanner state: Text declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_TEXT_DECL = 36;

    /** Scanner state: Text declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_CDATA = 35;

    /** Scanner state: CDATA section. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_TERMINATED = 34;

    /** Scanner state: terminated. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_END_OF_INPUT = 33;

    /** Scanner state: end of input. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    //protected static final int SCANNER_STATE_TRAILING_MISC = 32;

    /** Scanner state: trailing misc. USED BY DOCUMENT_SCANNER_IMPL*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_REFERENCE = 28;

    /** Scanner state: reference. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_COMMENT = 27;

    /** Scanner state: comment. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_ROOT_ELEMENT = 26;

    /** Scanner state: root element. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_XML_DECL = 25;

    /** Scanner state: XML Declaration */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_DOCTYPE = 24;

    /** Scanner state: DOCTYPE. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_PI = 23;

    /** Scanner state: processing instruction. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_CONTENT = 22;

    /** Scanner state: content. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_START_OF_MARKUP = 21;

    /** Scanner state: start of markup. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected ExternalSubsetResolver fExternalSubsetResolver;

    /** External subset resolver. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
public class XMLDocumentFragmentScannerImpl

/**
 *
 * This class is responsible for scanning the structure and content
 * of document fragments.
 *
 * This class has been modified as per the new design which is more suited to
 * efficiently build pull parser. Lot of improvements have been done and
 * the code has been added to support stax functionality/features.
 *
 * @author Neeraj Bajaj SUN Microsystems
 * @author K.Venugopal SUN Microsystems
 * @author Glenn Marcy, IBM
 * @author Andy Clark, IBM
 * @author Arnaud  Le Hors, IBM
 * @author Eric Ye, IBM
 * @author Sunitha Reddy, SUN Microsystems
 * @version $Id: XMLDocumentFragmentScannerImpl.java,v 1.19 2010-11-02 19:54:55 joehw Exp $
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public void refresh(int refreshPosition){

    /**
     * receives callbacks from {@link XMLEntityReader } when buffer
     * is being changed.
     * @param refreshPosition
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public void refresh(){

    /**
     * Implements XMLBufferListener interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected XMLString getString(){

    /** this function gets an XMLString (which is used to store the attribute value) from the special pool
     *  maintained for attributes.
     *  fAttributeCacheUsedCount tracks the number of attributes that has been consumed from the pool.
     *  if all the attributes has been consumed, it adds a new XMLString inthe pool and returns the same
     *  XMLString.
     *
     * @return XMLString XMLString used to store an attribute value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        protected void endOfFileHook(EOFException e)

        /**
         * End of file hook. This method is a hook for subclasses to
         * add code that handles the end of file. The end of file in
         * a document fragment is OK if the markup depth is zero.
         * However, when scanning a full XML document, an end of file
         * is always premature.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        protected boolean scanRootElementHook()

        /**
         * Scan for root element hook. This method is a hook for
         * subclasses to add code that handles scanning for the root
         * element. When scanning a document fragment, there is no
         * "root" element. However, when scanning a full XML document,
         * the scanner must handle the root element specially.
         *
         * @return True if the caller should stop and return true which
         *          allows the scanner to switch to a new scanning
         *          driver. A return value of false indicates that
         *          the content driver should continue as normal.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        protected boolean elementDepthIsZeroHook()

        /**
         * Element depth iz zero. This methos is a hook for subclasses
         * to add code to handle when the element depth hits zero. When
         * scanning a document fragment, an element depth of zero is
         * normal. However, when scanning a full XML document, the
         * scanner must handle the trailing miscellanous section of
         * the document after the end of the document's root element.
         *
         * @return True if the caller should stop and return true which
         *          allows the scanner to switch to a new scanning
         *          driver. A return value of false indicates that
         *          the content driver should continue as normal.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        protected boolean scanForDoctypeHook()

        /**
         * Scan for DOCTYPE hook. This method is a hook for subclasses
         * to add code to handle scanning for a the "DOCTYPE" string
         * after the string "<!" has been scanned.
         *
         * @return True if the "DOCTYPE" was scanned; false if "DOCTYPE"
         *          was not scanned.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
                            else if (c != -1 && isInvalidLiteral(c)) {

                            }///xxx since this part is also characters, it should be merged...
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public int next() throws IOException, XNIException {

        /**
         * Drives the parser to the next state/event on the input. Parser is guaranteed
         * to stop at the next state/event. Internally XML document
         * is divided into several states. Each state represents a sections of XML
         * document. When this functions returns normally, it has read the section
         * of XML document and returns the state corresponding to section of
         * document which has been read. For optimizations, a particular driver
         * can read ahead of the section of document (state returned) just read and
         * can maintain a different internal state.
         *
         * State returned corresponds to Stax states.
         *
         * @return state representing the section of document just read.
         *
         * @throws IOException  Thrown on i/o error.
         * @throws XNIException Thrown on parse error.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public void decideSubState() throws IOException {

        /**
         *
         * SCANNER_STATE_CONTENT and SCANNER_STATE_START_OF_MARKUP are two super states of the parser.
         * At any point of time when in doubt over the current state of the parser, the state should be
         * set to SCANNER_STATE_CONTENT. Parser will automatically revive itself and will set state of
         * the parser to one of its sub state.
         * sub states are defined in the parser on the basis of different XML component like
         * SCANNER_STATE_ENTITY_REFERENCE , SCANNER_STATE_START_ELEMENT, SCANNER_STATE_CDATA etc..
         * These sub states help the parser to have fine control over the parsing. These are the
         * different milepost, parser stops at each sub state (milepost). Based on this state it is
         * decided if paresr needs to stop at next milepost ??
         *
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        private void startOfMarkup() throws IOException {

        /**
         *  decides the appropriate state of the parser
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected class FragmentContentDriver

    /**
     * Driver to handle content scanning. This driver is capable of reading
     * the fragment of XML document. When it has finished reading fragment
     * of XML documents, it can pass the job of reading to another driver.
     *
     * This class has been modified as per the new design which is more suited to
     * efficiently build pull parser. Lot of performance improvements have been done and
     * the code has been added to support stax functionality/features.
     *
     * @author Neeraj Bajaj, Sun Microsystems
     *
     *
     * @author Andy Clark, IBM
     * @author Eric Ye, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public int next() throws IOException, XNIException;

        /**
         * Drives the parser to the next state/event on the input. Parser is guaranteed
         * to stop at the next state/event.
         *
         * Internally XML document is divided into several states. Each state represents
         * a sections of XML document. When this functions returns normally, it has read
         * the section of XML document and returns the state corresponding to section of
         * document which has been read. For optimizations, a particular driver
         * can read ahead of the section of document (state returned) just read and
         * can maintain a different internal state.
         *
         * @return state representing the section of document just read.
         *
         * @throws IOException  Thrown on i/o error.
         * @throws XNIException Thrown on parse error.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected interface Driver {

    /**
     * Drives the parser to the next state/event on the input. Parser is guaranteed
     * to stop at the next state/event.
     *
     * Internally XML document is divided into several states. Each state represents
     * a sections of XML document. When this functions returns normally, it has read
     * the section of XML document and returns the state corresponding to section of
     * document which has been read. For optimizations, a particular driver
     * can read ahead of the section of document (state returned) just read and
     * can maintain a different internal state.
     *
     *
     * @author Neeraj Bajaj, Sun Microsystems
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public QName getLastPoppedElement(){

        /**
         * This function is as a result of optimization done for endElement --
         * we dont need to set the value for every end element encouterd.
         * For Well formedness checks we can have the same QName object that was pushed.
         * the values will be set only if application need to know about the endElement
         * -- neeraj.bajaj@sun.com
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public void clear() {

        /** Clears the stack without throwing away existing QName objects. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public void reposition(){

        /** Reposition the stack. fInt [] contains all the opened tags at particular depth.
         * Transfer all the opened tags starting from depth '2' to the current depth and reposition them
         *as per the depth.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public QName popElement() {

        /**
         * Pops an element off of the stack by setting the values of
         * the specified QName.
         * <p>
         * <strong>Note:</strong> The object returned is <em>not</em>
         * orphaned to the caller. Therefore, the caller should consider
         * the object to be read-only.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public QName nextElement() {

        /**
         * Returns the next element on the stack.
         *
         * @return Returns the actual QName object. Callee should
         * use this object to store the details of next element encountered.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public boolean matchElement(QName element) {

        /** Check if the element scanned during the start element
         *matches the stored element.
         *
         *@return true if the match suceeds.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public void push(){

        /** This function should be called only when element was skipped sucessfully.
         * 1. Increase the depth - because element was sucessfully skipped.
         *2. Store the position of the element token in array  "last opened tag" at depth.
         *3. increase the position counter so as to point to the next element in the array
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public QName getNext(){

        /** Note that this function is considerably different than nextElement()
         * This function just returns the previously stored elements
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        //XXX: THIS FUNCTION IS NOT USED

        /**
         * Pushes an element on the stack.
         * <p>
         * <strong>Note:</strong> The QName values are copied into the
         * stack. In other words, the caller does <em>not</em> orphan
         * the element to the stack. Also, the QName object returned
         * is <em>not</em> orphaned to the caller. It should be
         * considered read-only.
         *
         * @param element The element to push onto the stack.
         *
         * @return Returns the actual QName object that stores the
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public ElementStack() {

        /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        protected QName[] fElements;

        /** The stack data. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected class ElementStack {

    /**
     * Element stack. This stack operates without synchronization, error
     * checking, and it re-uses objects instead of throwing popped items
     * away.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public void clear() {

        /** Clears the stack without throwing away existing QName objects. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public int popElement(){

        /** returns the current depth
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public QName getNext(){

        /** Note that this function is considerably different than nextElement()
         * This function just returns the previously stored elements
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public QName nextElement() {

        /**
         * This function doesn't increase depth. The function in this function is
         *broken down into two functions for efficiency. <@see>matchElement</see>.
         * This function just returns the pointer to the object and its values are set.
         *
         *@return QName reference to the next element in the list
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public boolean matchElement(QName element) {

        /** Check if the element scanned during the start element
         *matches the stored element.
         *
         *@return true if the match suceeds.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
            //resize QNames

            /**
             * int length = fElements.length;
             * Element [] temp = new Element[length * 2];
             * System.arraycopy(fElements, 0, temp, 0, length);
             * fElements = temp;
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public ElementStack2() {

        /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        protected QName [] fQName = new QName[20];

        /** The stack data. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected class ElementStack2 {

    /**
     * Element stack.
     *
     * @author Neeraj Bajaj, Sun Microsystems.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public Element(QName qname, Element next) {

        /**
         * Constructs a new Element from the given QName and next Element
         * reference.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public Element next;

        /** The next Element entry. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        public QName qname;

        /** Symbol. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final class Element {

    /**
     * @author Neeraj Bajaj, Sun Microsystems.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    String checkAccess(String systemId, String allowedProtocols) throws IOException {

    /**
     * Check the protocol used in the systemId against allowed protocols
     *
     * @param systemId the Id of the URI
     * @param allowedProtocols a list of allowed protocols separated by comma
     * @return the name of the protocol if rejected, null otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public String getDriverName(Driver driver) {

    /** Returns the driver name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected String getScannerStateName(int state) {

    /** Returns the scanner state name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected final void setDriver(Driver driver) {

    /**
     * Sets the Driver.
     *
     * @param Driver The new Driver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected final void setScannerState(int state) {

    /**
     * Sets the scanner state.
     *
     * @param state The new scanner state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    private void handleCharacter(char c, String entity, XMLStringBuffer content) throws XNIException {

    /**
     * Calls document handler with a single character resulting from
     * built-in entity resolution.
     *
     * @param c
     * @param entity built-in name
     * @param XMLStringBuffer append the character to buffer
     *
     * we really dont need to call this function -- this function is only required when
     * we integrate with rest of Xerces2. SO maintaining the current behavior and still
     * calling this function to hanlde built-in entity reference.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    void checkDepth(String elementName) {

    /**
     * Check if the depth exceeds the maxElementDepth limit
     * @param elementName name of the current element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected void scanEntityReference(XMLStringBuffer content) throws IOException, XNIException {

    /**
     * Scans an entity reference.
     *
     * @return returns true if the new entity is started. If it was built-in entity
     *         'false' is returned.
     * @throws IOException  Thrown if i/o error occurs.
     * @throws XNIException Thrown if handler throws exception upon
     *                      notification.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected void scanCharReference()

    /**
     * Scans a character reference.
     * <p>
     * <pre>
     * [66] CharRef ::= '&#' [0-9]+ ';' | '&#x' [0-9a-fA-F]+ ';'
     * </pre>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected int scanEndElement() throws IOException, XNIException {

    /**
     * Scans an end element.
     * <p>
     * <pre>
     * [42] ETag ::= '&lt;/' Name S? '>'
     * </pre>
     * <p>
     * <strong>Note:</strong> This method uses the fElementQName variable.
     * The contents of this variable will be destroyed. The caller should
     * copy the needed information out of this variable before calling
     * this method.
     *
     * @return The element depth.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
            } else {

                /** We dont need all this code if we pass ']]>' as delimeter..
                 * int brackets = 2;
                 * while (fEntityScanner.skipChar(']')) {
                 * brackets++;
                 * }
                 *
                 * //When we find more than 2 square brackets
                 * if (fDocumentHandler != null && brackets > 2) {
                 * //we dont need to clear the buffer..
                 * //contentBuffer.clear();
                 * for (int i = 2; i < brackets; i++) {
                 * contentBuffer.append(']');
                 * }
                 * fDocumentHandler.characters(contentBuffer, null);
                 * }
                 *
                 * if (fEntityScanner.skipChar('>')) {
                 * break;
                 * }
                 * if (fDocumentHandler != null) {
                 * //we dont need to clear the buffer now..
                 * //contentBuffer.clear();
                 * contentBuffer.append("]]");
                 * fDocumentHandler.characters(contentBuffer, null);
                 * }
                 **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    //CHANGED:

    /**
     * Scans a CDATA section.
     * <p>
     * <strong>Note:</strong> This method uses the fTempString and
     * fStringBuffer variables.
     *
     * @param complete True if the CDATA section is to be scanned
     *                 completely.
     *
     * @return True if CDATA is completely scanned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    //CHANGED:

    /**
     * Scans element content.
     *
     * @return Returns the next character on the stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        //attributes.setNonNormalizedValue(oldLen, fTempString2.toString());

        ///xxx: nonNormalizedValue is not being set as it is not required by SAX & DOM
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        //this function doesn't use 'attIndex'. We are adding the attribute later

        ///fTempString2 would store attribute non-normalized value
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected void scanAttribute(XMLAttributes attributes)

    /**
     * Scans an attribute name value pair.
     * <p>
     * <pre>
     * [41] Attribute ::= Name Eq AttValue
     * </pre>
     * <p>
     * <strong>Note:</strong> This method assumes that the next
     * character on the stream is the first character of the attribute
     * name.
     * <p>
     * <strong>Note:</strong> This method uses the fAttributeQName and
     * fQName variables. The contents of these variables will be
     * destroyed.
     *
     * @param attributes The attributes list for the scanned attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public boolean isStandAlone(){

    /** return if the doucment is standalone */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public boolean standaloneSet(){

    /** return if standalone is set */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public XMLAttributesIteratorImpl getAttributeIterator(){

    /** return the attribute iterator implementation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    /*

    /**xxx there is one check of duplicate attribute that has been removed.
     * attributes.addAttribute(fAttributeQName, XMLSymbols.fCDATASymbol, null);
     *
     * // WFC: Unique Att Spec
     * if (oldLen == attributes.getLength()) {
     * reportFatalError("AttributeNotUnique",
     * new Object[]{fCurrentElement.rawname,
     * fAttributeQName.rawname});
     * }
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    /**

    /**
     * Scans an attribute.
     * <p>
     * <pre>
     * [41] Attribute ::= Name Eq AttValue
     * </pre>
     * <p>
     * <strong>Note:</strong> This method assumes that the next
     * character on the stream is the first character of the attribute
     * name.
     * <p>
     * <strong>Note:</strong> This method uses the fAttributeQName and
     * fQName variables. The contents of these variables will be
     * destroyed.
     *
     * @param attributes The attributes list for the scanned attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected boolean seekCloseOfStartTag() throws IOException, XNIException {

    /**
     * Looks for the close of start tag, i.e. if it finds '>' or '/>'
     * Characters are consumed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    // fElementQName will have the details of element just read..

    /**
     * Scans a start element. This method will handle the binding of
     * namespace information and notifying the handler of the start
     * of the element.
     * <p>
     * <pre>
     * [44] EmptyElemTag ::= '&lt;' Name (S Attribute)* S? '/>'
     * [40] STag ::= '&lt;' Name (S Attribute)* S? '>'
     * </pre>
     * <p>
     * <strong>Note:</strong> This method assumes that the leading
     * '&lt;' character has been consumed.
     * <p>
     * <strong>Note:</strong> This method uses the fElementQName and
     * fAttributes variables. The contents of these variables will be
     * destroyed. The caller should copy important information out of
     * these variables before calling this method.
     * NB: Content in fAttributes is valid only till the state of the parser is XMLEvent.START_ELEMENT
     *
     * @return True if element is empty. (i.e. It matches
     *          production [44].
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected void scanComment() throws IOException, XNIException {

    /**
     * Scans a comment.
     * <p>
     * <pre>
     * [15] Comment ::= '&lt!--' ((Char - '-') | ('-' (Char - '-')))* '-->'
     * </pre>
     * <p>
     * <strong>Note:</strong> Called after scanning past '&lt;!--'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected void scanPIData(String target, XMLStringBuffer data)

    /**
     * Scans a processing data. This is needed to handle the situation
     * where a document starts with a processing instruction whose
     * target name <em>starts with</em> "xml". (e.g. xmlfoo)
     *
     * @param target The PI target
     * @param data The XMLStringBuffer to fill in with the data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        //but this information is only related with Document Entity.

        ///xxx see where its used.. this is not used anywhere. it may be useful for entity to store this information
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected void scanXMLDeclOrTextDecl(boolean scanningTextDecl)

    /**
     * Scans an XML or text declaration.
     * <p>
     * <pre>
     * [23] XMLDecl ::= '&lt;?xml' VersionInfo EncodingDecl? SDDecl? S? '?>'
     * [24] VersionInfo ::= S 'version' Eq (' VersionNum ' | " VersionNum ")
     * [80] EncodingDecl ::= S 'encoding' Eq ('"' EncName '"' |  "'" EncName "'" )
     * [81] EncName ::= [A-Za-z] ([A-Za-z0-9._] | '-')*
     * [32] SDDecl ::= S 'standalone' Eq (("'" ('yes' | 'no') "'")
     *                 | ('"' ('yes' | 'no') '"'))
     *
     * [77] TextDecl ::= '&lt;?xml' VersionInfo? EncodingDecl S? '?>'
     * </pre>
     *
     * @param scanningTextDecl True if a text declaration is to
     *                         be scanned instead of an XML
     *                         declaration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected Driver createContentDriver() {

    /** Creates a content Driver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        // call handler

        /**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        super.endEntity(name, augs);

        /**
         * // flush possible pending output buffer - see scanContent
         * if (fInScanContent && fStringBuffer.length != 0
         * && fDocumentHandler != null) {
         * fDocumentHandler.characters(fStringBuffer, null);
         * fStringBuffer.length = 0; // make sure we know it's been flushed
         * }
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public void endEntity(String name, Augmentations augs) throws IOException, XNIException {

    /**
     * This method notifies the end of an entity. The DTD has the pseudo-name
     * of "[dtd]" parameter entity names start with '%'; and general entities
     * are just specified by their name.
     *
     * @param name The name of the entity.
     * @param augs Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
        // call handler

        /** we are not calling the handlers yet.. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public void startEntity(String name,
            XMLResourceIdentifier identifier,
            String encoding, Augmentations augs) throws XNIException {

    /**
     * This method notifies of the start of an entity. The DTD has the
     * pseudo-name of "[dtd]" parameter entity names start with '%'; and
     * general entities are just specified by their name.
     *
     * @param name     The name of the entity.
     * @param identifier The resource identifier.
     * @param encoding The auto-detected IANA encoding name of the entity
     *                 stream. This value will be null in those situations
     *                 where the entity encoding is not auto-detected (e.g.
     *                 internal entities or a document entity that is
     *                 parsed from a java.io.Reader).
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public XMLDocumentHandler getDocumentHandler(){

    /** Returns the document handler */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public void setDocumentHandler(XMLDocumentHandler documentHandler) {

    /**
     * setDocumentHandler
     *
     * @param documentHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public Object getPropertyDefault(String propertyId) {

    /**
     * Returns the default state for a property, or null if this
     * component does not want to report a default value for this
     * property.
     *
     * @param propertyId The property identifier.
     *
     * @since Xerces 2.2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public Boolean getFeatureDefault(String featureId) {

    /**
     * Returns the default state for a feature, or null if this
     * component does not want to report a default value for this
     * feature.
     *
     * @param featureId The feature identifier.
     *
     * @since Xerces 2.2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public void setProperty(String propertyId, Object value)

    /**
     * Sets the value of a property. This method is called by the component
     * manager any time after reset when a property changes value.
     * <p>
     * <strong>Note:</strong> Components should silently ignore properties
     * that do not affect the operation of the component.
     *
     * @param propertyId The property identifier.
     * @param value      The value of the property.
     *
     * @throws SAXNotRecognizedException The component should not throw
     *                                   this exception.
     * @throws SAXNotSupportedException The component should not throw
     *                                  this exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public String[] getRecognizedProperties() {

    /**
     * Returns a list of property identifiers that are recognized by
     * this component. This method may return null if no properties
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public void setFeature(String featureId, boolean state)

    /**
     * Sets the state of a feature. This method is called by the component
     * manager any time after reset when a feature changes state.
     * <p>
     * <strong>Note:</strong> Components should silently ignore features
     * that do not affect the operation of the component.
     *
     * @param featureId The feature identifier.
     * @param state     The state of the feature.
     *
     * @throws SAXNotRecognizedException The component should not throw
     *                                   this exception.
     * @throws SAXNotSupportedException The component should not throw
     *                                  this exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public String[] getRecognizedFeatures() {

    /**
     * Returns a list of feature identifiers that are recognized by
     * this component. This method may return null if no features
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public void reset(XMLComponentManager componentManager)

    /**
     * Resets the component. The component can query the component manager
     * about any features and properties that affect the operation of the
     * component.
     *
     * @param componentManager The component manager.
     *
     * @throws SAXException Thrown by component on initialization error.
     *                      For example, if a feature or property is
     *                      required for the operation of the component, the
     *                      component manager may throw a
     *                      SAXNotRecognizedException or a
     *                      SAXNotSupportedException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public int next() throws IOException, XNIException {

    /** return the next state on the input
     * @return int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public boolean scanDocument(boolean complete)

    /**
     * Scans a document.
     *
     * @param complete True if the scanner should scan the document
     *                 completely, pushing all events to the registered
     *                 document handler. A value of false indicates that
     *                 that the scanner should only scan the next portion
     *                 of the document and return. A scanner instance is
     *                 permitted to completely scan a document if it does
     *                 not support this "pull" scanning model.
     *
     * @return True if there is more to scan, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public void setInputSource(XMLInputSource inputSource) throws IOException {

    /**
     * Sets the input source.
     *
     * @param inputSource The input source.
     *
     * @throws IOException Thrown on i/o error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    public XMLDocumentFragmentScannerImpl() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    private Augmentations fTempAugmentations = null;

    /** Reusable Augmentations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    private final char[] fSingleChar = new char[1];

    /** Single character array. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    /** Making the buffer accesible to derived class -- stores PI data */

    /** stores character data. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected XMLStringBuffer fStringBuffer2 = new XMLStringBuffer();

    /** Making the buffer accesible to derived class -- String buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected XMLStringBuffer fStringBuffer = new XMLStringBuffer();

    /** Making the buffer accesible to derived class -- String buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    private String[] fStrings = new String[3];

    /** Array of 3 strings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected XMLString fTempString2 = new XMLString();

    /** String. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected XMLString fTempString = new XMLString();

    /** String. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected XMLAttributesIteratorImpl fAttributes = new XMLAttributesIteratorImpl();

    /**
     * CHANGED: Using XMLAttributesIteratorImpl instead of XMLAttributesImpl. This class
     * implements Iterator interface so we can directly give Attributes in the form of
     * iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected QName fAttributeQName = new QName();

    /** Attribute QName. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected QName fElementQName = new QName();

    /** Element QName. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected Driver fContentDriver = createContentDriver();

    /** Content driver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected Driver fDriver;

    /** Active driver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected boolean fStrictURI;

    /**
     * standard uri conformant (strict uri).
     * http://apache.org/xml/features/standard-uri-conformant
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected String fAccessExternalDTD = EXTERNAL_ACCESS_DEFAULT;

    /**
     * comma-delimited list of protocols that are allowed for the purpose
     * of accessing external dtd or entity references
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected boolean fDisallowDoctype = false;

    /** Xerces Feature: Disallow doctype declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected boolean fNotifyBuiltInRefs = false;

    /** Notify built-in references. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected String fPITarget ;

    /** Document system identifier.
     * REVISIT:  So what's this used for?  - NG
     * protected String fDocumentSystemId;
     ******/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected ElementStack fElementStack = new ElementStack();

    /** Element stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected QName fCurrentElement;

    /** Current element. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected boolean fStandaloneSet;

    /** Standalone. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected boolean fHasExternalDTD;

    /** has external dtd */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected boolean fInScanContent = false;

    /** SubScanner state: inside scanContent method. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected int fScannerState;

    /** Scanner state. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected int fMarkupDepth;

    /** Markup depth. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected int[] fEntityStack = new int[4];

    /** Entity stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected XMLEntityStorage fEntityStore;

    /** Entity Storage */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected XMLDocumentHandler fDocumentHandler;

    /** Document handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final boolean DEBUG = false;

    /** Debug driver next */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final boolean DEBUG_NEXT = false ;

    /** Debug driver next */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final boolean DEBUG_START_END_ELEMENT = false;

    /** Debug content driver scanning. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    private static final boolean DEBUG_DISPATCHER = false;

    /** Debug driver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    private static final boolean DEBUG_SCANNER_STATE = false;

    /** Debug scanner state. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    private static final Object[] PROPERTY_DEFAULTS = {

    /** Property defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    private static final String[] RECOGNIZED_PROPERTIES = {

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    private static final Boolean[] FEATURE_DEFAULTS = {

    /** Feature defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    private static final String[] RECOGNIZED_FEATURES = {

    /** Recognized features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    final static String EXTERNAL_ACCESS_DEFAULT = Constants.EXTERNAL_ACCESS_DEFAULT;

    /** access external dtd: file protocol
     *  For DOM/SAX, the secure feature is set to true by default
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    private static final String XML_SECURITY_PROPERTY_MANAGER =

    /** Property identifier: Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final String STANDARD_URI_CONFORMANT =

    /** Feature identifier: standard uri conformant */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final String ENTITY_RESOLVER =

    /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final String NOTIFY_BUILTIN_REFS =

    /** Feature identifier: notify built-in refereces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_CHARACTER_DATA = 37;

    /** Scanner state: Text declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_TEXT_DECL = 36;

    /** Scanner state: Text declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_CDATA = 35;

    /** Scanner state: CDATA section. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_TERMINATED = 34;

    /** Scanner state: terminated. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_END_OF_INPUT = 33;

    /** Scanner state: end of input. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    //protected static final int SCANNER_STATE_TRAILING_MISC = 32;

    /** Scanner state: trailing misc. USED BY DOCUMENT_SCANNER_IMPL*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_REFERENCE = 28;

    /** Scanner state: reference. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_COMMENT = 27;

    /** Scanner state: comment. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_ROOT_ELEMENT = 26;

    /** Scanner state: root element. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_XML_DECL = 25;

    /** Scanner state: XML Declaration */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_DOCTYPE = 24;

    /** Scanner state: DOCTYPE. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_PI = 23;

    /** Scanner state: processing instruction. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_CONTENT = 22;

    /** Scanner state: content. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected static final int SCANNER_STATE_START_OF_MARKUP = 21;

    /** Scanner state: start of markup. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
    protected ExternalSubsetResolver fExternalSubsetResolver;

    /** External subset resolver. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentFragmentScannerImpl.java
public class XMLDocumentFragmentScannerImpl

/**
 *
 * This class is responsible for scanning the structure and content
 * of document fragments.
 *
 * This class has been modified as per the new design which is more suited to
 * efficiently build pull parser. Lot of improvements have been done and
 * the code has been added to support stax functionality/features.
 *
 * @author Neeraj Bajaj SUN Microsystems
 * @author K.Venugopal SUN Microsystems
 * @author Glenn Marcy, IBM
 * @author Andy Clark, IBM
 * @author Arnaud  Le Hors, IBM
 * @author Eric Ye, IBM
 * @author Sunitha Reddy, SUN Microsystems
 * @version $Id: XMLDocumentFragmentScannerImpl.java,v 1.19 2010-11-02 19:54:55 joehw Exp $
 *
 */
