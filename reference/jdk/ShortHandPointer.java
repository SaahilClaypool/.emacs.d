_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
    public void setSchemeData(String schemeData) {

    /**
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#setSchemeData(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
    public void setSchemeName(String schemeName) {

    /**
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#setSchemeName(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
    public String getSchemeData() {

    /**
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#getSchemeData()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
    public String getSchemeName() {

    /**
     * Returns the name of the ShortHand pointer
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#getSchemeName()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
    public boolean isChildFragmentResolved() {

    /**
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#isChildFragmentResolved()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
    public boolean isFragmentResolved() {

    /**
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#isFragmentResolved()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
    public String getChildrenSchemaDeterminedID(XMLAttributes attributes,
            int index) throws XNIException {

    /**
     * Not quite sure how this can be correctly implemented.
     *
     * @param attributes
     * @param index
     * @return String - We return null since we currenly do not supprt this.
     * @throws XNIException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
    public String getSchemaDeterminedID(XMLAttributes attributes, int index)

    /**
     * Returns the schema-determined-ID.
     *
     *
     * @param attributes
     * @param index
     * @return A String containing the schema-determined ID.
     * @throws XNIException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
    public String getDTDDeterminedID(XMLAttributes attributes, int index)

    /**
     * Rerturns the DTD determine-ID
     *
     * @param attributes
     * @param index
     * @return String
     * @throws XNIException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
    private boolean hasMatchingIdentifier(QName element,
            XMLAttributes attributes, Augmentations augs, int event)

    /**
     *
     * @param element
     * @param attributes
     * @param augs
     * @param event
     * @return
     * @throws XNIException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
    int fMatchingChildCount = 0;

    /**
     * Resolves the XPointer ShortHand pointer based on the rules defined in
     * Section 3.2 of the XPointer Framework Recommendation.
     * Note that in the current implementation only supports DTD determined ID's.
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#resolveXPointer(com.sun.org.apache.xerces.internal.xni.QName, com.sun.org.apache.xerces.internal.xni.XMLAttributes, com.sun.org.apache.xerces.internal.xni.Augmentations, int event)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
    public void parseXPointer(String part) throws XNIException {

    /**
     * The XPointerProcessor takes care of this.  Simply set the ShortHand Pointer here.
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#parseXPointer(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
class ShortHandPointer implements XPointerPart {

/**
 * <p>
 * Implements the XPointerPart interface and handles processing of
 * ShortHand Pointers.  It identifies at most one element in the
 * resource's information set; specifically, the first one (if any)
 * in document order that has a matching NCName as an identifier.
 * </p>
 *
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
    public void setSchemeData(String schemeData) {

    /**
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#setSchemeData(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
    public void setSchemeName(String schemeName) {

    /**
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#setSchemeName(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
    public String getSchemeData() {

    /**
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#getSchemeData()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
    public String getSchemeName() {

    /**
     * Returns the name of the ShortHand pointer
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#getSchemeName()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
    public boolean isChildFragmentResolved() {

    /**
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#isChildFragmentResolved()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
    public boolean isFragmentResolved() {

    /**
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#isFragmentResolved()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
    public String getChildrenSchemaDeterminedID(XMLAttributes attributes,
            int index) throws XNIException {

    /**
     * Not quite sure how this can be correctly implemented.
     *
     * @param attributes
     * @param index
     * @return String - We return null since we currenly do not supprt this.
     * @throws XNIException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
    public String getSchemaDeterminedID(XMLAttributes attributes, int index)

    /**
     * Returns the schema-determined-ID.
     *
     *
     * @param attributes
     * @param index
     * @return A String containing the schema-determined ID.
     * @throws XNIException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
    public String getDTDDeterminedID(XMLAttributes attributes, int index)

    /**
     * Rerturns the DTD determine-ID
     *
     * @param attributes
     * @param index
     * @return String
     * @throws XNIException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
    private boolean hasMatchingIdentifier(QName element,
            XMLAttributes attributes, Augmentations augs, int event)

    /**
     *
     * @param element
     * @param attributes
     * @param augs
     * @param event
     * @return
     * @throws XNIException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
    int fMatchingChildCount = 0;

    /**
     * Resolves the XPointer ShortHand pointer based on the rules defined in
     * Section 3.2 of the XPointer Framework Recommendation.
     * Note that in the current implementation only supports DTD determined ID's.
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#resolveXPointer(com.sun.org.apache.xerces.internal.xni.QName, com.sun.org.apache.xerces.internal.xni.XMLAttributes, com.sun.org.apache.xerces.internal.xni.Augmentations, int event)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
    public void parseXPointer(String part) throws XNIException {

    /**
     * The XPointerProcessor takes care of this.  Simply set the ShortHand Pointer here.
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#parseXPointer(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ShortHandPointer.java
class ShortHandPointer implements XPointerPart {

/**
 * <p>
 * Implements the XPointerPart interface and handles processing of
 * ShortHand Pointers.  It identifies at most one element in the
 * resource's information set; specifically, the first one (if any)
 * in document order that has a matching NCName as an identifier.
 * </p>
 *
 *
 */
