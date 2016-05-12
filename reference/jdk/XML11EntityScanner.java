_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public boolean skipString(String s) throws IOException {

    /**
     * Skips the specified string appearing immediately on the input.
     * <p>
     * <strong>Note:</strong> The characters are consumed only if they are
     * space characters.
     *
     * @param s The string to skip.
     *
     * @return Returns true if the string was skipped.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public boolean skipSpaces() throws IOException {

    /**
     * Skips space characters appearing immediately on the input.
     * <p>
     * <strong>Note:</strong> The characters are consumed only if they are
     * space characters.
     *
     * @return Returns true if at least one space character was skipped.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     *
     * @see com.sun.org.apache.xerces.internal.util.XMLChar#isSpace
     * @see com.sun.org.apache.xerces.internal.util.XML11Char#isXML11Space
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public boolean skipChar(int c) throws IOException {

    /**
     * Skips a character appearing immediately on the input.
     * <p>
     * <strong>Note:</strong> The character is consumed only if it matches
     * the specified character.
     *
     * @param c The character to skip.
     *
     * @return Returns true if the character was skipped.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
                        else {

                        /*** NEWLINE NORMALIZATION ***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public boolean scanData(String delimiter, XMLStringBuffer buffer)

    /**
     * Scans a range of character data up to the specicied delimiter,
     * setting the fields of the XMLString structure, appropriately.
     * <p>
     * <strong>Note:</strong> The characters are consumed.
     * <p>
     * <strong>Note:</strong> This assumes that the internal buffer is
     * at least the same size, or bigger, than the length of the delimiter
     * and that the delimiter contains at least one character.
     * <p>
     * <strong>Note:</strong> This method does not guarantee to return
     * the longest run of character data. This method may return before
     * the delimiter due to reaching the end of the input buffer or any
     * other reason.
     * <p>
     * <strong>Note:</strong> The fields contained in the XMLString
     * structure are not guaranteed to remain valid upon subsequent calls
     * to the entity scanner. Therefore, the caller is responsible for
     * immediately using the returned character data or making a copy of
     * the character data.
     *
     * @param delimiter The string that signifies the end of the character
     *                  data to be scanned.
     * @param data      The data structure to fill.
     *
     * @return Returns true if there is more data to scan, false otherwise.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
                    else {

                    /*** NEWLINE NORMALIZATION ***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public int scanLiteral(int quote, XMLString content)

    /**
     * Scans a range of attribute value data, setting the fields of the
     * XMLString structure, appropriately.
     * <p>
     * <strong>Note:</strong> The characters are consumed.
     * <p>
     * <strong>Note:</strong> This method does not guarantee to return
     * the longest run of attribute value data. This method may return
     * before the quote character due to reaching the end of the input
     * buffer or any other reason.
     * <p>
     * <strong>Note:</strong> The fields contained in the XMLString
     * structure are not guaranteed to remain valid upon subsequent calls
     * to the entity scanner. Therefore, the caller is responsible for
     * immediately using the returned character data or making a copy of
     * the character data.
     *
     * @param quote   The quote character that signifies the end of the
     *                attribute value data.
     * @param content The content structure to fill.
     *
     * @return Returns the next character on the input, if known. This
     *         value may be -1 but this does <em>note</em> designate
     *         end of file.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
                    else {

                    /*** NEWLINE NORMALIZATION ***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public int scanContent(XMLString content) throws IOException {

    /**
     * Scans a range of parsed character data, setting the fields of the
     * XMLString structure, appropriately.
     * <p>
     * <strong>Note:</strong> The characters are consumed.
     * <p>
     * <strong>Note:</strong> This method does not guarantee to return
     * the longest run of parsed character data. This method may return
     * before markup due to reaching the end of the input buffer or any
     * other reason.
     * <p>
     * <strong>Note:</strong> The fields contained in the XMLString
     * structure are not guaranteed to remain valid upon subsequent calls
     * to the entity scanner. Therefore, the caller is responsible for
     * immediately using the returned character data or making a copy of
     * the character data.
     *
     * @param content The content structure to fill.
     *
     * @return Returns the next character on the input, if known. This
     *         value may be -1 but this does <em>note</em> designate
     *         end of file.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public boolean scanQName(QName qname) throws IOException {

    /**
     * Scans a qualified name from the input, setting the fields of the
     * QName structure appropriately.
     * <p>
     * <strong>Note:</strong> The qualified name characters are consumed.
     * <p>
     * <strong>Note:</strong> The strings used to set the values of the
     * QName structure must be symbols. The SymbolTable can be used for
     * this purpose.
     *
     * @param qname The qualified name structure to fill.
     *
     * @return Returns true if a qualified name appeared immediately on
     *         the input and was scanned, false otherwise.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     *
     * @see com.sun.org.apache.xerces.internal.util.SymbolTable
     * @see com.sun.org.apache.xerces.internal.util.XML11Char#isXML11Name
     * @see com.sun.org.apache.xerces.internal.util.XML11Char#isXML11NameStart
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public String scanNCName() throws IOException {

    /**
     * Returns a string matching the NCName production appearing immediately
     * on the input as a symbol, or null if no NCName string is present.
     * <p>
     * <strong>Note:</strong> The NCName characters are consumed.
     * <p>
     * <strong>Note:</strong> The string returned must be a symbol. The
     * SymbolTable can be used for this purpose.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     *
     * @see com.sun.org.apache.xerces.internal.util.SymbolTable
     * @see com.sun.org.apache.xerces.internal.util.XML11Char#isXML11NCName
     * @see com.sun.org.apache.xerces.internal.util.XML11Char#isXML11NCNameStart
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public String scanName() throws IOException {

    /**
     * Returns a string matching the Name production appearing immediately
     * on the input as a symbol, or null if no Name string is present.
     * <p>
     * <strong>Note:</strong> The Name characters are consumed.
     * <p>
     * <strong>Note:</strong> The string returned must be a symbol. The
     * SymbolTable can be used for this purpose.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     *
     * @see com.sun.org.apache.xerces.internal.util.SymbolTable
     * @see com.sun.org.apache.xerces.internal.util.XML11Char#isXML11Name
     * @see com.sun.org.apache.xerces.internal.util.XML11Char#isXML11NameStart
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public String scanNmtoken() throws IOException {

    /**
     * Returns a string matching the NMTOKEN production appearing immediately
     * on the input as a symbol, or null if NMTOKEN Name string is present.
     * <p>
     * <strong>Note:</strong> The NMTOKEN characters are consumed.
     * <p>
     * <strong>Note:</strong> The string returned must be a symbol. The
     * SymbolTable can be used for this purpose.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     *
     * @see com.sun.org.apache.xerces.internal.util.SymbolTable
     * @see com.sun.org.apache.xerces.internal.util.XML11Char#isXML11Name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public int scanChar() throws IOException {

    /**
     * Returns the next character on the input.
     * <p>
     * <strong>Note:</strong> The character is consumed.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public int peekChar() throws IOException {

    /**
     * Returns the next character on the input.
     * <p>
     * <strong>Note:</strong> The character is <em>not</em> consumed.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public XML11EntityScanner() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
public class XML11EntityScanner

/**
 * Implements the entity scanner methods in
 * the context of XML 1.1.
 *
 * @xerces.internal
 *
 * @author Michael Glavassevich, IBM
 * @author Neil Graham, IBM
 * @version $Id: XML11EntityScanner.java,v 1.5 2010-11-01 04:39:40 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public boolean skipString(String s) throws IOException {

    /**
     * Skips the specified string appearing immediately on the input.
     * <p>
     * <strong>Note:</strong> The characters are consumed only if they are
     * space characters.
     *
     * @param s The string to skip.
     *
     * @return Returns true if the string was skipped.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public boolean skipSpaces() throws IOException {

    /**
     * Skips space characters appearing immediately on the input.
     * <p>
     * <strong>Note:</strong> The characters are consumed only if they are
     * space characters.
     *
     * @return Returns true if at least one space character was skipped.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     *
     * @see com.sun.org.apache.xerces.internal.util.XMLChar#isSpace
     * @see com.sun.org.apache.xerces.internal.util.XML11Char#isXML11Space
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public boolean skipChar(int c) throws IOException {

    /**
     * Skips a character appearing immediately on the input.
     * <p>
     * <strong>Note:</strong> The character is consumed only if it matches
     * the specified character.
     *
     * @param c The character to skip.
     *
     * @return Returns true if the character was skipped.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
                        else {

                        /*** NEWLINE NORMALIZATION ***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public boolean scanData(String delimiter, XMLStringBuffer buffer)

    /**
     * Scans a range of character data up to the specicied delimiter,
     * setting the fields of the XMLString structure, appropriately.
     * <p>
     * <strong>Note:</strong> The characters are consumed.
     * <p>
     * <strong>Note:</strong> This assumes that the internal buffer is
     * at least the same size, or bigger, than the length of the delimiter
     * and that the delimiter contains at least one character.
     * <p>
     * <strong>Note:</strong> This method does not guarantee to return
     * the longest run of character data. This method may return before
     * the delimiter due to reaching the end of the input buffer or any
     * other reason.
     * <p>
     * <strong>Note:</strong> The fields contained in the XMLString
     * structure are not guaranteed to remain valid upon subsequent calls
     * to the entity scanner. Therefore, the caller is responsible for
     * immediately using the returned character data or making a copy of
     * the character data.
     *
     * @param delimiter The string that signifies the end of the character
     *                  data to be scanned.
     * @param data      The data structure to fill.
     *
     * @return Returns true if there is more data to scan, false otherwise.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
                    else {

                    /*** NEWLINE NORMALIZATION ***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public int scanLiteral(int quote, XMLString content)

    /**
     * Scans a range of attribute value data, setting the fields of the
     * XMLString structure, appropriately.
     * <p>
     * <strong>Note:</strong> The characters are consumed.
     * <p>
     * <strong>Note:</strong> This method does not guarantee to return
     * the longest run of attribute value data. This method may return
     * before the quote character due to reaching the end of the input
     * buffer or any other reason.
     * <p>
     * <strong>Note:</strong> The fields contained in the XMLString
     * structure are not guaranteed to remain valid upon subsequent calls
     * to the entity scanner. Therefore, the caller is responsible for
     * immediately using the returned character data or making a copy of
     * the character data.
     *
     * @param quote   The quote character that signifies the end of the
     *                attribute value data.
     * @param content The content structure to fill.
     *
     * @return Returns the next character on the input, if known. This
     *         value may be -1 but this does <em>note</em> designate
     *         end of file.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
                    else {

                    /*** NEWLINE NORMALIZATION ***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public int scanContent(XMLString content) throws IOException {

    /**
     * Scans a range of parsed character data, setting the fields of the
     * XMLString structure, appropriately.
     * <p>
     * <strong>Note:</strong> The characters are consumed.
     * <p>
     * <strong>Note:</strong> This method does not guarantee to return
     * the longest run of parsed character data. This method may return
     * before markup due to reaching the end of the input buffer or any
     * other reason.
     * <p>
     * <strong>Note:</strong> The fields contained in the XMLString
     * structure are not guaranteed to remain valid upon subsequent calls
     * to the entity scanner. Therefore, the caller is responsible for
     * immediately using the returned character data or making a copy of
     * the character data.
     *
     * @param content The content structure to fill.
     *
     * @return Returns the next character on the input, if known. This
     *         value may be -1 but this does <em>note</em> designate
     *         end of file.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public boolean scanQName(QName qname) throws IOException {

    /**
     * Scans a qualified name from the input, setting the fields of the
     * QName structure appropriately.
     * <p>
     * <strong>Note:</strong> The qualified name characters are consumed.
     * <p>
     * <strong>Note:</strong> The strings used to set the values of the
     * QName structure must be symbols. The SymbolTable can be used for
     * this purpose.
     *
     * @param qname The qualified name structure to fill.
     *
     * @return Returns true if a qualified name appeared immediately on
     *         the input and was scanned, false otherwise.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     *
     * @see com.sun.org.apache.xerces.internal.util.SymbolTable
     * @see com.sun.org.apache.xerces.internal.util.XML11Char#isXML11Name
     * @see com.sun.org.apache.xerces.internal.util.XML11Char#isXML11NameStart
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public String scanNCName() throws IOException {

    /**
     * Returns a string matching the NCName production appearing immediately
     * on the input as a symbol, or null if no NCName string is present.
     * <p>
     * <strong>Note:</strong> The NCName characters are consumed.
     * <p>
     * <strong>Note:</strong> The string returned must be a symbol. The
     * SymbolTable can be used for this purpose.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     *
     * @see com.sun.org.apache.xerces.internal.util.SymbolTable
     * @see com.sun.org.apache.xerces.internal.util.XML11Char#isXML11NCName
     * @see com.sun.org.apache.xerces.internal.util.XML11Char#isXML11NCNameStart
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public String scanName() throws IOException {

    /**
     * Returns a string matching the Name production appearing immediately
     * on the input as a symbol, or null if no Name string is present.
     * <p>
     * <strong>Note:</strong> The Name characters are consumed.
     * <p>
     * <strong>Note:</strong> The string returned must be a symbol. The
     * SymbolTable can be used for this purpose.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     *
     * @see com.sun.org.apache.xerces.internal.util.SymbolTable
     * @see com.sun.org.apache.xerces.internal.util.XML11Char#isXML11Name
     * @see com.sun.org.apache.xerces.internal.util.XML11Char#isXML11NameStart
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public String scanNmtoken() throws IOException {

    /**
     * Returns a string matching the NMTOKEN production appearing immediately
     * on the input as a symbol, or null if NMTOKEN Name string is present.
     * <p>
     * <strong>Note:</strong> The NMTOKEN characters are consumed.
     * <p>
     * <strong>Note:</strong> The string returned must be a symbol. The
     * SymbolTable can be used for this purpose.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     *
     * @see com.sun.org.apache.xerces.internal.util.SymbolTable
     * @see com.sun.org.apache.xerces.internal.util.XML11Char#isXML11Name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public int scanChar() throws IOException {

    /**
     * Returns the next character on the input.
     * <p>
     * <strong>Note:</strong> The character is consumed.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public int peekChar() throws IOException {

    /**
     * Returns the next character on the input.
     * <p>
     * <strong>Note:</strong> The character is <em>not</em> consumed.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
    public XML11EntityScanner() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11EntityScanner.java
public class XML11EntityScanner

/**
 * Implements the entity scanner methods in
 * the context of XML 1.1.
 *
 * @xerces.internal
 *
 * @author Michael Glavassevich, IBM
 * @author Neil Graham, IBM
 * @version $Id: XML11EntityScanner.java,v 1.5 2010-11-01 04:39:40 joehw Exp $
 */
