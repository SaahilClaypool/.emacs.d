_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLine.java
    static boolean advanceToFirstFont(AttributedCharacterIterator aci) {

    /**
     * When this returns, the ACI's current position will be at the start of the
     * first run which does NOT contain a GraphicAttribute.  If no such run exists
     * the ACI's position will be at the end, and this method will return false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLine.java
    public static TextLine standardCreateTextLine(FontRenderContext frc,
                                                  AttributedCharacterIterator text,
                                                  char[] chars,
                                                  float[] baselineOffsets) {

    /**
     * Create a TextLine from the text.  chars is just the text in the iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLine.java
    private static int[] computeComponentOrder(TextLineComponent[] components,
                                               int[] charsLtoV) {

    /**
     * Compute the components order from the given components array and
     * logical-to-visual character mapping.  May return null if canonical.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLine.java
    public static TextLine createLineFromText(char[] chars,
                                              StyledParagraph styledParagraph,
                                              TextLabelFactory factory,
                                              boolean isDirectionLTR,
                                              float[] baselineOffsets) {

    /**
     * Create a TextLine from the Font and character data over the
     * range.  The range is relative to both the StyledParagraph and the
     * character array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLine.java
    public static TextLineComponent[] getComponents(StyledParagraph styledParagraph,
                                                    char[] chars,
                                                    int textStart,
                                                    int textLimit,
                                                    int[] charsLtoV,
                                                    byte[] levels,
                                                    TextLabelFactory factory) {

    /**
     * Returns an array (in logical order) of the TextLineComponents representing
     * the text.  The components are both logically and visually contiguous.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLine.java
    public static TextLineComponent[] createComponentsOnRun(int runStart,
                                                            int runLimit,
                                                            char[] chars,
                                                            int[] charsLtoV,
                                                            byte[] levels,
                                                            TextLabelFactory factory,
                                                            Font font,
                                                            CoreMetrics cm,
                                                            FontRenderContext frc,
                                                            Decoration decorator,
                                                            TextLineComponent[] components,
                                                            int numComponents) {

    /**
     * Returns an array in logical order of the TextLineComponents on
     * the text in the given range, with the given attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLine.java
    public static TextLine fastCreateTextLine(FontRenderContext frc,
                                              char[] chars,
                                              Font font,
                                              CoreMetrics lm,
                                              Map<? extends Attribute, ?> attributes) {

    /**
     * Create a TextLine from the text.  The Font must be able to
     * display all of the text.
     * attributes==null is equivalent to using an empty Map for
     * attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLine.java
    public Rectangle2D getVisualBounds() {

    /**
     * Return the union of the visual bounds of all the components.
     * This incorporates the path.  It does not include logical
     * bounds (used by carets).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLine.java
    private int getComponentVisualIndex(int li) {

    /**
     * map a component logical index to the visual index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLine.java
    private int getComponentLogicalIndex(int vi) {

    /**
     * map a component visual index to the logical index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLine.java
    static boolean advanceToFirstFont(AttributedCharacterIterator aci) {

    /**
     * When this returns, the ACI's current position will be at the start of the
     * first run which does NOT contain a GraphicAttribute.  If no such run exists
     * the ACI's position will be at the end, and this method will return false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLine.java
    public static TextLine standardCreateTextLine(FontRenderContext frc,
                                                  AttributedCharacterIterator text,
                                                  char[] chars,
                                                  float[] baselineOffsets) {

    /**
     * Create a TextLine from the text.  chars is just the text in the iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLine.java
    private static int[] computeComponentOrder(TextLineComponent[] components,
                                               int[] charsLtoV) {

    /**
     * Compute the components order from the given components array and
     * logical-to-visual character mapping.  May return null if canonical.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLine.java
    public static TextLine createLineFromText(char[] chars,
                                              StyledParagraph styledParagraph,
                                              TextLabelFactory factory,
                                              boolean isDirectionLTR,
                                              float[] baselineOffsets) {

    /**
     * Create a TextLine from the Font and character data over the
     * range.  The range is relative to both the StyledParagraph and the
     * character array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLine.java
    public static TextLineComponent[] getComponents(StyledParagraph styledParagraph,
                                                    char[] chars,
                                                    int textStart,
                                                    int textLimit,
                                                    int[] charsLtoV,
                                                    byte[] levels,
                                                    TextLabelFactory factory) {

    /**
     * Returns an array (in logical order) of the TextLineComponents representing
     * the text.  The components are both logically and visually contiguous.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLine.java
    public static TextLineComponent[] createComponentsOnRun(int runStart,
                                                            int runLimit,
                                                            char[] chars,
                                                            int[] charsLtoV,
                                                            byte[] levels,
                                                            TextLabelFactory factory,
                                                            Font font,
                                                            CoreMetrics cm,
                                                            FontRenderContext frc,
                                                            Decoration decorator,
                                                            TextLineComponent[] components,
                                                            int numComponents) {

    /**
     * Returns an array in logical order of the TextLineComponents on
     * the text in the given range, with the given attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLine.java
    public static TextLine fastCreateTextLine(FontRenderContext frc,
                                              char[] chars,
                                              Font font,
                                              CoreMetrics lm,
                                              Map<? extends Attribute, ?> attributes) {

    /**
     * Create a TextLine from the text.  The Font must be able to
     * display all of the text.
     * attributes==null is equivalent to using an empty Map for
     * attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLine.java
    public Rectangle2D getVisualBounds() {

    /**
     * Return the union of the visual bounds of all the components.
     * This incorporates the path.  It does not include logical
     * bounds (used by carets).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLine.java
    private int getComponentVisualIndex(int li) {

    /**
     * map a component logical index to the visual index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLine.java
    private int getComponentLogicalIndex(int vi) {

    /**
     * map a component visual index to the logical index.
     */
