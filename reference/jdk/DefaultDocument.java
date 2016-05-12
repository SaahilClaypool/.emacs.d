_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    public Node renameNode(Node n,String namespaceURI, String name) throws DOMException{

    /** DOM Level 3*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    public DOMConfiguration getDomConfig(){

    /**
     *  The configuration used when <code>Document.normalizeDocument</code> is
     * invoked.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    public void normalizeDocument(){

    /** DOM Level 3*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    public Node adoptNode(Node source) throws DOMException{

    /** DOM Level 3*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    public void setDocumentURI(String documentURI) {

    /**
     * The location of the document or <code>null</code> if undefined.
     * <br>Beware that when the <code>Document</code> supports the feature
     * "HTML" , the href attribute of the HTML BASE element takes precedence
     * over this attribute.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    public String getDocumentURI() {

    /**
     * The location of the document or <code>null</code> if undefined.
     * <br>Beware that when the <code>Document</code> supports the feature
     * "HTML" , the href attribute of the HTML BASE element takes precedence
     * over this attribute.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    public void setStrictErrorChecking(boolean strictErrorChecking){

    /**
     * An attribute specifying whether errors checking is enforced or not.
     * When set to <code>false</code>, the implementation is free to not
     * test every possible error case normally defined on DOM operations,
     * and not raise any <code>DOMException</code>. In case of error, the
     * behavior is undefined. This attribute is <code>true</code> by
     * defaults.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    public boolean getStrictErrorChecking(){

    /**
     * An attribute specifying whether errors checking is enforced or not.
     * When set to <code>false</code>, the implementation is free to not
     * test every possible error case normally defined on DOM operations,
     * and not raise any <code>DOMException</code>. In case of error, the
     * behavior is undefined. This attribute is <code>true</code> by
     * defaults.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    public void setXmlVersion(String version) throws DOMException{

    /**
     * An attribute specifying, as part of the XML declaration, the version
     * number of this document. This is <code>null</code> when unspecified.
     * <br> This attribute represents the property [version] defined in .
     * @exception DOMException
     *   NOT_SUPPORTED_ERR: Raised if the version is set to a value that is
     *   not supported by this <code>Document</code>.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    public String getXmlVersion(){

    /**
     * An attribute specifying, as part of the XML declaration, the version
     * number of this document. This is <code>null</code> when unspecified.
     * <br> This attribute represents the property [version] defined in .
     * @exception DOMException
     *   NOT_SUPPORTED_ERR: Raised if the version is set to a value that is
     *   not supported by this <code>Document</code>.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    public void setXmlStandalone(boolean standalone){

    /**
     * An attribute specifying, as part of the XML declaration, whether this
     * document is standalone.
     * <br> This attribute represents the property [standalone] defined in .
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    /**

    /**
     * An attribute specifying, as part of the XML declaration, the encoding
     * of this document. This is <code>null</code> when unspecified.
     * @since DOM Level 3
    public void setXmlEncoding(String encoding){
        throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "Method not supported");
    }
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    public String getXmlEncoding(){

    /**
    public void setInputEncoding(String actualEncoding){
       throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "Method not supported");
    }
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
public class DefaultDocument extends NodeImpl

/**
 * @xerces.internal
 *
 * @author Rahul Srivastava, Sun Microsystems Inc.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    public Node renameNode(Node n,String namespaceURI, String name) throws DOMException{

    /** DOM Level 3*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    public DOMConfiguration getDomConfig(){

    /**
     *  The configuration used when <code>Document.normalizeDocument</code> is
     * invoked.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    public void normalizeDocument(){

    /** DOM Level 3*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    public Node adoptNode(Node source) throws DOMException{

    /** DOM Level 3*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    public void setDocumentURI(String documentURI) {

    /**
     * The location of the document or <code>null</code> if undefined.
     * <br>Beware that when the <code>Document</code> supports the feature
     * "HTML" , the href attribute of the HTML BASE element takes precedence
     * over this attribute.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    public String getDocumentURI() {

    /**
     * The location of the document or <code>null</code> if undefined.
     * <br>Beware that when the <code>Document</code> supports the feature
     * "HTML" , the href attribute of the HTML BASE element takes precedence
     * over this attribute.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    public void setStrictErrorChecking(boolean strictErrorChecking){

    /**
     * An attribute specifying whether errors checking is enforced or not.
     * When set to <code>false</code>, the implementation is free to not
     * test every possible error case normally defined on DOM operations,
     * and not raise any <code>DOMException</code>. In case of error, the
     * behavior is undefined. This attribute is <code>true</code> by
     * defaults.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    public boolean getStrictErrorChecking(){

    /**
     * An attribute specifying whether errors checking is enforced or not.
     * When set to <code>false</code>, the implementation is free to not
     * test every possible error case normally defined on DOM operations,
     * and not raise any <code>DOMException</code>. In case of error, the
     * behavior is undefined. This attribute is <code>true</code> by
     * defaults.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    public void setXmlVersion(String version) throws DOMException{

    /**
     * An attribute specifying, as part of the XML declaration, the version
     * number of this document. This is <code>null</code> when unspecified.
     * <br> This attribute represents the property [version] defined in .
     * @exception DOMException
     *   NOT_SUPPORTED_ERR: Raised if the version is set to a value that is
     *   not supported by this <code>Document</code>.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    public String getXmlVersion(){

    /**
     * An attribute specifying, as part of the XML declaration, the version
     * number of this document. This is <code>null</code> when unspecified.
     * <br> This attribute represents the property [version] defined in .
     * @exception DOMException
     *   NOT_SUPPORTED_ERR: Raised if the version is set to a value that is
     *   not supported by this <code>Document</code>.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    public void setXmlStandalone(boolean standalone){

    /**
     * An attribute specifying, as part of the XML declaration, whether this
     * document is standalone.
     * <br> This attribute represents the property [standalone] defined in .
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    /**

    /**
     * An attribute specifying, as part of the XML declaration, the encoding
     * of this document. This is <code>null</code> when unspecified.
     * @since DOM Level 3
    public void setXmlEncoding(String encoding){
        throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "Method not supported");
    }
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
    public String getXmlEncoding(){

    /**
    public void setInputEncoding(String actualEncoding){
       throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "Method not supported");
    }
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/DefaultDocument.java
public class DefaultDocument extends NodeImpl

/**
 * @xerces.internal
 *
 * @author Rahul Srivastava, Sun Microsystems Inc.
 *
 */
