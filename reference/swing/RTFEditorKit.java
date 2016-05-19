_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFEditorKit.java
    public void write(Writer out, Document doc, int pos, int len)

    /**
     * Write content from a document to the given stream
     * as plain text.
     *
     * @param out  The stream to write to
     * @param doc The source for the write.
     * @param pos The location in the document to fetch the
     *   content.
     * @param len The amount to write out.
     * @exception IOException on any I/O error
     * @exception BadLocationException if pos represents an invalid
     *   location within the document.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFEditorKit.java
    public void read(Reader in, Document doc, int pos)

    /**
     * Insert content from the given stream, which will be
     * treated as plain text.
     *
     * @param in  The stream to read from
     * @param doc The destination for the insertion.
     * @param pos The location in the document to place the
     *   content.
     * @exception IOException on any I/O error
     * @exception BadLocationException if pos represents an invalid
     *   location within the document.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFEditorKit.java
    public void write(OutputStream out, Document doc, int pos, int len)

    /**
     * Write content from a document to the given stream
     * in a format appropriate for this kind of content handler.
     *
     * @param out  The stream to write to
     * @param doc The source for the write.
     * @param pos The location in the document to fetch the
     *   content.
     * @param len The amount to write out.
     * @exception IOException on any I/O error
     * @exception BadLocationException if pos represents an invalid
     *   location within the document.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFEditorKit.java
    public void read(InputStream in, Document doc, int pos) throws IOException, BadLocationException {

    /**
     * Insert content from the given stream which is expected
     * to be in a format appropriate for this kind of content
     * handler.
     *
     * @param in  The stream to read from
     * @param doc The destination for the insertion.
     * @param pos The location in the document to place the
     *   content.
     * @exception IOException on any I/O error
     * @exception BadLocationException if pos represents an invalid
     *   location within the document.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFEditorKit.java
    public String getContentType() {

    /**
     * Get the MIME type of the data that this
     * kit represents support for.  This kit supports
     * the type <code>text/rtf</code>.
     *
     * @return the type
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFEditorKit.java
    public RTFEditorKit() {

    /**
     * Constructs an RTFEditorKit.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFEditorKit.java
public class RTFEditorKit extends StyledEditorKit {

/**
 * This is the default implementation of RTF editing
 * functionality.  The RTF support was not written by the
 * Swing team.  In the future we hope to improve the support
 * provided.
 *
 * @author  Timothy Prinzing (of this class, not the package!)
 */
