_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public String toString() {

    /**
     * Returns a string representation of this PageAttributes.
     *
     * @return  the string representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public int hashCode() {

    /**
     * Returns a hash code value for this PageAttributes.
     *
     * @return  the hash code.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public boolean equals(Object obj) {

    /**
     * Determines whether two PageAttributes are equal to each other.
     * <p>
     * Two PageAttributes are equal if and only if each of their attributes are
     * equal. Attributes of enumeration type are equal if and only if the
     * fields refer to the same unique enumeration object. This means that
     * an aliased media is equal to its underlying unique media. Printer
     * resolutions are equal if and only if the feed resolution, cross feed
     * resolution, and units are equal.
     *
     * @param   obj the object whose equality will be checked.
     * @return  whether obj is equal to this PageAttribute according to the
     *          above criteria.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setPrinterResolutionToDefault() {

    /**
     * Sets the printer resolution for pages using these attributes to the
     * default. The default is 72 dpi for both the feed and cross feed
     * resolutions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setPrinterResolution(int printerResolution) {

    /**
     * Specifies the desired cross feed and feed print resolutions in dots per
     * inch for pages using these attributes. The same value is used for both
     * resolutions. The actual resolutions will be determined by the
     * limitations of the implementation and the target printer. Not
     * specifying the property is equivalent to specifying <code>72</code>.
     *
     * @param   printerResolution an integer greater than 0.
     * @throws  IllegalArgumentException if printerResolution is less than or
     *          equal to 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setPrinterResolution(int[] printerResolution) {

    /**
     * Specifies the desired print resolution for pages using these attributes.
     * The actual resolution will be determined by the limitations of the
     * implementation and the target printer. Index 0 of the array specifies
     * the cross feed direction resolution (typically the horizontal
     * resolution). Index 1 of the array specifies the feed direction
     * resolution (typically the vertical resolution). Index 2 of the array
     * specifies whether the resolutions are in dots per inch or dots per
     * centimeter. <code>3</code> denotes dots per inch. <code>4</code>
     * denotes dots per centimeter. Note that the 1.1 printing implementation
     * (Toolkit.getPrintJob) requires that the feed and cross feed resolutions
     * be the same. Not specifying the property is equivalent to calling
     * setPrinterResolution(72).
     *
     * @param   printerResolution an integer array of 3 elements. The first
     *          element must be greater than 0. The second element must be
     *          must be greater than 0. The third element must be either
     *          <code>3</code> or <code>4</code>.
     * @throws  IllegalArgumentException if one or more of the above
     *          conditions is violated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public int[] getPrinterResolution() {

    /**
     * Returns the print resolution for pages using these attributes.
     * Index 0 of the array specifies the cross feed direction resolution
     * (typically the horizontal resolution). Index 1 of the array specifies
     * the feed direction resolution (typically the vertical resolution).
     * Index 2 of the array specifies whether the resolutions are in dots per
     * inch or dots per centimeter. <code>3</code> denotes dots per inch.
     * <code>4</code> denotes dots per centimeter.
     *
     * @return  an integer array of 3 elements. The first
     *          element must be greater than 0. The second element must be
     *          must be greater than 0. The third element must be either
     *          <code>3</code> or <code>4</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setPrintQualityToDefault() {

    /**
     * Sets the print quality for pages using these attributes to the default.
     * The default print quality is normal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setPrintQuality(int printQuality) {

    /**
     * Specifies the print quality for pages using these attributes.
     * Specifying <code>3</code> denotes draft. Specifying <code>4</code>
     * denotes normal. Specifying <code>5</code> denotes high. Specifying
     * any other value will generate an IllegalArgumentException. Not
     * specifying the property is equivalent to calling
     * setPrintQuality(PrintQualityType.NORMAL).
     *
     * @param   printQuality <code>3</code>, <code>4</code>, or <code>5</code>
     * @throws  IllegalArgumentException if printQuality is not <code>3
     *          </code>, <code>4</code>, or <code>5</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setPrintQuality(PrintQualityType printQuality) {

    /**
     * Specifies the print quality for pages using these attributes. Not
     * specifying the property is equivalent to specifying
     * PrintQualityType.NORMAL.
     *
     * @param   printQuality PrintQualityType.DRAFT, PrintQualityType.NORMAL,
     *          or PrintQualityType.HIGH
     * @throws  IllegalArgumentException if printQuality is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public PrintQualityType getPrintQuality() {

    /**
     * Returns the print quality for pages using these attributes. This
     * attribute is updated to the value chosen by the user.
     *
     * @return  PrintQualityType.DRAFT, PrintQualityType.NORMAL, or
     *          PrintQualityType.HIGH
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setOrigin(OriginType origin) {

    /**
     * Specifies whether drawing at (0, 0) to pages using these attributes
     * draws at the upper-left corner of the physical page, or at the
     * upper-left corner of the printable area. (Note that these locations
     * could be equivalent.) Not specifying the property is equivalent to
     * specifying OriginType.PHYSICAL.
     *
     * @param   origin OriginType.PHYSICAL or OriginType.PRINTABLE
     * @throws  IllegalArgumentException if origin is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public OriginType getOrigin() {

    /**
     * Returns whether drawing at (0, 0) to pages using these attributes
     * draws at the upper-left corner of the physical page, or at the
     * upper-left corner of the printable area. (Note that these locations
     * could be equivalent.) This attribute cannot be modified by,
     * and is not subject to any limitations of, the implementation or the
     * target printer.
     *
     * @return  OriginType.PHYSICAL or OriginType.PRINTABLE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setOrientationRequestedToDefault() {

    /**
     * Sets the print orientation for pages using these attributes to the
     * default. The default orientation is portrait.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setOrientationRequested(int orientationRequested) {

    /**
     * Specifies the print orientation for pages using these attributes.
     * Specifying <code>3</code> denotes portrait. Specifying <code>4</code>
     * denotes landscape. Specifying any other value will generate an
     * IllegalArgumentException. Not specifying the property is equivalent
     * to calling setOrientationRequested(OrientationRequestedType.PORTRAIT).
     *
     * @param   orientationRequested <code>3</code> or <code>4</code>
     * @throws  IllegalArgumentException if orientationRequested is not
     *          <code>3</code> or <code>4</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setOrientationRequested(OrientationRequestedType
                                        orientationRequested) {

    /**
     * Specifies the print orientation for pages using these attributes. Not
     * specifying the property is equivalent to specifying
     * OrientationRequestedType.PORTRAIT.
     *
     * @param   orientationRequested OrientationRequestedType.PORTRAIT or
     *          OrientationRequestedType.LANDSCAPE.
     * @throws  IllegalArgumentException if orientationRequested is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public OrientationRequestedType getOrientationRequested() {

    /**
     * Returns the print orientation for pages using these attributes. This
     * attribute is updated to the value chosen by the user.
     *
     * @return  OrientationRequestedType.PORTRAIT or
     *          OrientationRequestedType.LANDSCAPE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setMediaToDefault(){

    /**
     * Sets the paper size for pages using these attributes to the default
     * size for the default locale. The default size for locales in the
     * United States and Canada is MediaType.NA_LETTER. The default size for
     * all other locales is MediaType.ISO_A4.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setMedia(MediaType media) {

    /**
     * Specifies the desired paper size for pages using these attributes. The
     * actual paper size will be determined by the limitations of the target
     * printer. If an exact match cannot be found, an implementation will
     * choose the closest possible match. Not specifying this attribute is
     * equivalent to specifying the default size for the default locale. The
     * default size for locales in the United States and Canada is
     * MediaType.NA_LETTER. The default size for all other locales is
     * MediaType.ISO_A4.
     *
     * @param   media one of the constant fields of the MediaType class.
     * @throws  IllegalArgumentException if media is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public MediaType getMedia() {

    /**
     * Returns the paper size for pages using these attributes. This
     * attribute is updated to the value chosen by the user.
     *
     * @return  one of the constant fields of the MediaType class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setColor(ColorType color) {

    /**
     * Specifies whether pages using these attributes will be rendered in
     * color or monochrome. Not specifying this attribute is equivalent to
     * specifying ColorType.MONOCHROME.
     *
     * @param   color ColorType.COLOR or ColorType.MONOCHROME.
     * @throws  IllegalArgumentException if color is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public ColorType getColor() {

    /**
     * Returns whether pages using these attributes will be rendered in
     * color or monochrome. This attribute is updated to the value chosen
     * by the user.
     *
     * @return  ColorType.COLOR or ColorType.MONOCHROME.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void set(PageAttributes obj) {

    /**
     * Sets all of the attributes of this PageAttributes to the same values as
     * the attributes of obj.
     *
     * @param   obj the PageAttributes to copy.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public Object clone() {

    /**
     * Creates and returns a copy of this PageAttributes.
     *
     * @return  the newly created copy. It is safe to cast this Object into
     *          a PageAttributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public PageAttributes(ColorType color, MediaType media,
                          OrientationRequestedType orientationRequested,
                          OriginType origin, PrintQualityType printQuality,
                          int[] printerResolution) {

    /**
     * Constructs a PageAttributes instance with the specified values for
     * every attribute.
     *
     * @param   color ColorType.COLOR or ColorType.MONOCHROME.
     * @param   media one of the constant fields of the MediaType class.
     * @param   orientationRequested OrientationRequestedType.PORTRAIT or
     *          OrientationRequestedType.LANDSCAPE.
     * @param   origin OriginType.PHYSICAL or OriginType.PRINTABLE
     * @param   printQuality PrintQualityType.DRAFT, PrintQualityType.NORMAL,
     *          or PrintQualityType.HIGH
     * @param   printerResolution an integer array of 3 elements. The first
     *          element must be greater than 0. The second element must be
     *          must be greater than 0. The third element must be either
     *          <code>3</code> or <code>4</code>.
     * @throws  IllegalArgumentException if one or more of the above
     *          conditions is violated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public PageAttributes(PageAttributes obj) {

    /**
     * Constructs a PageAttributes instance which is a copy of the supplied
     * PageAttributes.
     *
     * @param   obj the PageAttributes to copy.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public PageAttributes() {

    /**
     * Constructs a PageAttributes instance with default values for every
     * attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final PrintQualityType DRAFT =

        /**
         * The PrintQualityType instance to use for specifying a draft print
         * quality.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final PrintQualityType NORMAL =

        /**
         * The PrintQualityType instance to use for specifying a normal print
         * quality.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final PrintQualityType HIGH =

        /**
         * The PrintQualityType instance to use for specifying a high print
         * quality.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public static final class PrintQualityType extends AttributeValue {

    /**
     * A type-safe enumeration of possible print qualities. These print
     * qualities are in compliance with IPP 1.1.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final OriginType PHYSICAL = new OriginType(I_PHYSICAL);

        /**
         * The OriginType instance to use for specifying a physical origin.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public static final class OriginType extends AttributeValue {

    /**
     * A type-safe enumeration of possible origins.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final OrientationRequestedType LANDSCAPE =

        /**
         * The OrientationRequestedType instance to use for specifying a
         * landscape orientation.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final OrientationRequestedType PORTRAIT =

        /**
         * The OrientationRequestedType instance to use for specifying a
         * portrait orientation.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public static final class OrientationRequestedType extends AttributeValue {

    /**
     * A type-safe enumeration of possible orientations. These orientations
     * are in partial compliance with IPP 1.1.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType PERSONAL = PERSONAL_ENVELOPE;

        /**
         * An alias for PERSONAL_ENVELOPE.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ITALY = ITALY_ENVELOPE;

        /**
         * An alias for ITALY_ENVELOPE.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ENV_PERSONAL = PERSONAL_ENVELOPE;

        /**
         * An alias for PERSONAL_ENVELOPE.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ENV_ITALY = ITALY_ENVELOPE;

        /**
         * An alias for ITALY_ENVELOPE.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ENV_14 = NA_NUMBER_14_ENVELOPE;

        /**
         * An alias for NA_NUMBER_14_ENVELOPE.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ENV_11 = NA_NUMBER_11_ENVELOPE;

        /**
         * An alias for NA_NUMBER_11_ENVELOPE.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ENV_9 = NA_NUMBER_9_ENVELOPE;

        /**
         * An alias for NA_NUMBER_9_ENVELOPE.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ENV_7X9 = NA_7X9_ENVELOPE;

        /**
         * An alias for NA_7X9_ENVELOPE.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ENV_9X12 = NA_9X12_ENVELOPE;

        /**
         * An alias for NA_9X12_ENVELOPE.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ENV_10X14 = NA_10X14_ENVELOPE;

        /**
         * An alias for NA_10X14_ENVELOPE.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType LEGAL = NA_LEGAL;

        /**
         * An alias for NA_LEGAL.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType LETTER = NA_LETTER;

        /**
         * An alias for NA_LETTER.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType STATEMENT = INVOICE;

        /**
         * An alias for INVOICE.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_DESIGNATED_LONG_ENVELOPE =

        /**
         * An alias for ISO_DESIGNATED_LONG.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType C10 = ISO_C10;

        /**
         * An alias for ISO_C10.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType C9 = ISO_C9;

        /**
         * An alias for ISO_C9.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType C8 = ISO_C8;

        /**
         * An alias for ISO_C8.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType C7 = ISO_C7;

        /**
         * An alias for ISO_C7.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType C6 = ISO_C6;

        /**
         * An alias for ISO_C6.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType C5 = ISO_C5;

        /**
         * An alias for ISO_C5.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType C4 = ISO_C4;

        /**
         * An alias for ISO_C4.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType C3 = ISO_C3;

        /**
         * An alias for ISO_C3.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType C2 = ISO_C2;

        /**
         * An alias for ISO_C2.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType C1 = ISO_C1;

        /**
         * An alias for ISO_C1.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType C0 = ISO_C0;

        /**
         * An alias for ISO_C0.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType B9 = ISO_B9;

        /**
         * An alias for ISO_B9.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType B7 = ISO_B7;

        /**
         * An alias for ISO_B7.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_B5_ENVELOPE = ISO_B5;

        /**
         * An alias for ISO_B5.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_B4_ENVELOPE = ISO_B4;

        /**
         * An alias for ISO_B4.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType B3 = ISO_B3;

        /**
         * An alias for ISO_B3.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType B1 = ISO_B1;

        /**
         * An alias for ISO_B1.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType A10 = ISO_A10;

        /**
         * An alias for ISO_A10.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType A8 = ISO_A8;

        /**
         * An alias for ISO_A8.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType A6 = ISO_A6;

        /**
         * An alias for ISO_A6.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType A4 = ISO_A4;

        /**
         * An alias for ISO_A4.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType A2 = ISO_A2;

        /**
         * An alias for ISO_A2.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType A0 = ISO_A0;

        /**
         * An alias for ISO_A0.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType PERSONAL_ENVELOPE =

        /**
         * The MediaType instance for 6 3/4 envelope, 3 5/8 x 6 1/2 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType MONARCH_ENVELOPE =

        /**
         * The MediaType instance for Monarch Envelope, 3 7/8 x 7 1/2 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ITALY_ENVELOPE =

        /**
         * The MediaType instance for Italy Envelope, 110 x 230 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType INVITE_ENVELOPE =

        /**
         * The MediaType instance for Invitation Envelope, 220 x 220 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_NUMBER_14_ENVELOPE =

        /**
         * The MediaType instance for North American #14 Business Envelope,
         * 5 x 11 1/2 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_NUMBER_12_ENVELOPE =

        /**
         * The MediaType instance for North American #12 Business Envelope,
         * 4 3/4 x 11 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_NUMBER_11_ENVELOPE =

        /**
         * The MediaType instance for North American #11 Business Envelope,
         * 4 1/2 x 10 3/8 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_NUMBER_10_ENVELOPE =

        /**
         * The MediaType instance for North American #10 Business Envelope,
         * 4 1/8 x 9 1/2 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_NUMBER_9_ENVELOPE =

        /**
         * The MediaType instance for North American #9 Business Envelope,
         * 3 7/8 x 8 7/8 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_6X9_ENVELOPE =

        /**
         * The MediaType instance for North American 6 x 9 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_7X9_ENVELOPE =

        /**
         * The MediaType instance for North American 7 x 9 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_9X11_ENVELOPE =

        /**
         * The MediaType instance for North American 9 x 11 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_9X12_ENVELOPE =

        /**
         * The MediaType instance for North American 9 x 12 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_10X13_ENVELOPE =

        /**
         * The MediaType instance for North American 10 x 13 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_10X14_ENVELOPE =

        /**
         * The MediaType instance for North American 10 x 14 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_10X15_ENVELOPE =

        /**
         * The MediaType instance for North American 10 x 15 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType D = new MediaType(I_D);

        /**
         * The MediaType instance for Engineering D, 22 x 34 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType B = new MediaType(I_B);

        /**
         * The MediaType instance for Engineering B, 11 x 17 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType QUARTO = new MediaType(I_QUARTO);

        /**
         * The MediaType instance for Quarto, 215 x 275 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_LETTER = new MediaType(I_NA_LETTER);

        /**
         * The MediaType instance for North American Letter, 8 1/2 x 11 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType INVOICE = new MediaType(I_INVOICE);

        /**
         * The MediaType instance for Invoice, 5 1/2 x 8 1/2 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType EXECUTIVE = new MediaType(I_EXECUTIVE);

        /**
         * The MediaType instance for Executive, 7 1/4 x 10 1/2 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_DESIGNATED_LONG =

        /**
         * The MediaType instance for ISO Designated Long, 110 x 220 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_C9 = new MediaType(I_ISO_C9);

        /**
         * The MediaType instance for ISO/DIN C9, 40 x 57 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_C7 = new MediaType(I_ISO_C7);

        /**
         * The MediaType instance for ISO/DIN C7, 81 x 114 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_C5 = new MediaType(I_ISO_C5);

        /**
         * The MediaType instance for ISO/DIN C5, 162 x 229 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_C3 = new MediaType(I_ISO_C3);

        /**
         * The MediaType instance for ISO/DIN C3, 324 x 458 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_C1 = new MediaType(I_ISO_C1);

        /**
         * The MediaType instance for ISO/DIN C1, 648 x 917 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType JIS_B10 = new MediaType(I_JIS_B10);

        /**
         * The MediaType instance for JIS B10, 32 x 45 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType JIS_B8 = new MediaType(I_JIS_B8);

        /**
         * The MediaType instance for JIS B8, 64 x 91 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType JIS_B6 = new MediaType(I_JIS_B6);

        /**
         * The MediaType instance for JIS B6, 128 x 182 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType JIS_B4 = new MediaType(I_JIS_B4);

        /**
         * The MediaType instance for JIS B4, 257 x 364 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType JIS_B2 = new MediaType(I_JIS_B2);

        /**
         * The MediaType instance for JIS B2, 515 x 728 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType JIS_B0 = new MediaType(I_JIS_B0);

        /**
         * The MediaType instance for JIS B0, 1030 x 1456 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_B9 = new MediaType(I_ISO_B9);

        /**
         * The MediaType instance for ISO/DIN B9, 44 x 62 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_B7 = new MediaType(I_ISO_B7);

        /**
         * The MediaType instance for ISO/DIN B7, 88 x 125 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_B5 = new MediaType(I_ISO_B5);

        /**
         * The MediaType instance for ISO/DIN B5, 176 x 250 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_B3 = new MediaType(I_ISO_B3);

        /**
         * The MediaType instance for ISO/DIN B3, 353 x 500 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_B1 = new MediaType(I_ISO_B1);

        /**
         * The MediaType instance for ISO/DIN B1, 707 x 1000 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_A10 = new MediaType(I_ISO_A10);

        /**
         * The MediaType instance for ISO/DIN and JIS A10, 26 x 37 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_A8 = new MediaType(I_ISO_A8);

        /**
         * The MediaType instance for ISO/DIN and JIS A8, 52 x 74 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_A6 = new MediaType(I_ISO_A6);

        /**
         * The MediaType instance for ISO/DIN and JIS A6, 105 x 148 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_A4 = new MediaType(I_ISO_A4);

        /**
         * The MediaType instance for ISO/DIN and JIS A4, 210 x 297 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_A2 = new MediaType(I_ISO_A2);

        /**
         * The MediaType instance for ISO/DIN and JIS A2, 420 x 594 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_A0 = new MediaType(I_ISO_A0);

        /**
         * The MediaType instance for ISO/DIN and JIS A0, 841 x 1189 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_4A0 = new MediaType(I_ISO_4A0);

        /**
         * The MediaType instance for ISO/DIN and JIS 4A0, 1682 x 2378 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public static final class MediaType extends AttributeValue {

    /**
     * A type-safe enumeration of possible paper sizes. These sizes are in
     * compliance with IPP 1.1.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final ColorType COLOR = new ColorType(I_COLOR);

        /**
         * The ColorType instance to use for specifying color printing.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
public final class PageAttributes implements Cloneable {

/**
 * A set of attributes which control the output of a printed page.
 * <p>
 * Instances of this class control the color state, paper size (media type),
 * orientation, logical origin, print quality, and resolution of every
 * page which uses the instance. Attribute names are compliant with the
 * Internet Printing Protocol (IPP) 1.1 where possible. Attribute values
 * are partially compliant where possible.
 * <p>
 * To use a method which takes an inner class type, pass a reference to
 * one of the constant fields of the inner class. Client code cannot create
 * new instances of the inner class types because none of those classes
 * has a public constructor. For example, to set the color state to
 * monochrome, use the following code:
 * <pre>
 * import java.awt.PageAttributes;
 *
 * public class MonochromeExample {
 *     public void setMonochrome(PageAttributes pageAttributes) {
 *         pageAttributes.setColor(PageAttributes.ColorType.MONOCHROME);
 *     }
 * }
 * </pre>
 * <p>
 * Every IPP attribute which supports an <i>attributeName</i>-default value
 * has a corresponding <code>set<i>attributeName</i>ToDefault</code> method.
 * Default value fields are not provided.
 *
 * @author      David Mendenhall
 * @since 1.3
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public String toString() {

    /**
     * Returns a string representation of this PageAttributes.
     *
     * @return  the string representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public int hashCode() {

    /**
     * Returns a hash code value for this PageAttributes.
     *
     * @return  the hash code.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public boolean equals(Object obj) {

    /**
     * Determines whether two PageAttributes are equal to each other.
     * <p>
     * Two PageAttributes are equal if and only if each of their attributes are
     * equal. Attributes of enumeration type are equal if and only if the
     * fields refer to the same unique enumeration object. This means that
     * an aliased media is equal to its underlying unique media. Printer
     * resolutions are equal if and only if the feed resolution, cross feed
     * resolution, and units are equal.
     *
     * @param   obj the object whose equality will be checked.
     * @return  whether obj is equal to this PageAttribute according to the
     *          above criteria.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setPrinterResolutionToDefault() {

    /**
     * Sets the printer resolution for pages using these attributes to the
     * default. The default is 72 dpi for both the feed and cross feed
     * resolutions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setPrinterResolution(int printerResolution) {

    /**
     * Specifies the desired cross feed and feed print resolutions in dots per
     * inch for pages using these attributes. The same value is used for both
     * resolutions. The actual resolutions will be determined by the
     * limitations of the implementation and the target printer. Not
     * specifying the property is equivalent to specifying <code>72</code>.
     *
     * @param   printerResolution an integer greater than 0.
     * @throws  IllegalArgumentException if printerResolution is less than or
     *          equal to 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setPrinterResolution(int[] printerResolution) {

    /**
     * Specifies the desired print resolution for pages using these attributes.
     * The actual resolution will be determined by the limitations of the
     * implementation and the target printer. Index 0 of the array specifies
     * the cross feed direction resolution (typically the horizontal
     * resolution). Index 1 of the array specifies the feed direction
     * resolution (typically the vertical resolution). Index 2 of the array
     * specifies whether the resolutions are in dots per inch or dots per
     * centimeter. <code>3</code> denotes dots per inch. <code>4</code>
     * denotes dots per centimeter. Note that the 1.1 printing implementation
     * (Toolkit.getPrintJob) requires that the feed and cross feed resolutions
     * be the same. Not specifying the property is equivalent to calling
     * setPrinterResolution(72).
     *
     * @param   printerResolution an integer array of 3 elements. The first
     *          element must be greater than 0. The second element must be
     *          must be greater than 0. The third element must be either
     *          <code>3</code> or <code>4</code>.
     * @throws  IllegalArgumentException if one or more of the above
     *          conditions is violated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public int[] getPrinterResolution() {

    /**
     * Returns the print resolution for pages using these attributes.
     * Index 0 of the array specifies the cross feed direction resolution
     * (typically the horizontal resolution). Index 1 of the array specifies
     * the feed direction resolution (typically the vertical resolution).
     * Index 2 of the array specifies whether the resolutions are in dots per
     * inch or dots per centimeter. <code>3</code> denotes dots per inch.
     * <code>4</code> denotes dots per centimeter.
     *
     * @return  an integer array of 3 elements. The first
     *          element must be greater than 0. The second element must be
     *          must be greater than 0. The third element must be either
     *          <code>3</code> or <code>4</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setPrintQualityToDefault() {

    /**
     * Sets the print quality for pages using these attributes to the default.
     * The default print quality is normal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setPrintQuality(int printQuality) {

    /**
     * Specifies the print quality for pages using these attributes.
     * Specifying <code>3</code> denotes draft. Specifying <code>4</code>
     * denotes normal. Specifying <code>5</code> denotes high. Specifying
     * any other value will generate an IllegalArgumentException. Not
     * specifying the property is equivalent to calling
     * setPrintQuality(PrintQualityType.NORMAL).
     *
     * @param   printQuality <code>3</code>, <code>4</code>, or <code>5</code>
     * @throws  IllegalArgumentException if printQuality is not <code>3
     *          </code>, <code>4</code>, or <code>5</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setPrintQuality(PrintQualityType printQuality) {

    /**
     * Specifies the print quality for pages using these attributes. Not
     * specifying the property is equivalent to specifying
     * PrintQualityType.NORMAL.
     *
     * @param   printQuality PrintQualityType.DRAFT, PrintQualityType.NORMAL,
     *          or PrintQualityType.HIGH
     * @throws  IllegalArgumentException if printQuality is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public PrintQualityType getPrintQuality() {

    /**
     * Returns the print quality for pages using these attributes. This
     * attribute is updated to the value chosen by the user.
     *
     * @return  PrintQualityType.DRAFT, PrintQualityType.NORMAL, or
     *          PrintQualityType.HIGH
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setOrigin(OriginType origin) {

    /**
     * Specifies whether drawing at (0, 0) to pages using these attributes
     * draws at the upper-left corner of the physical page, or at the
     * upper-left corner of the printable area. (Note that these locations
     * could be equivalent.) Not specifying the property is equivalent to
     * specifying OriginType.PHYSICAL.
     *
     * @param   origin OriginType.PHYSICAL or OriginType.PRINTABLE
     * @throws  IllegalArgumentException if origin is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public OriginType getOrigin() {

    /**
     * Returns whether drawing at (0, 0) to pages using these attributes
     * draws at the upper-left corner of the physical page, or at the
     * upper-left corner of the printable area. (Note that these locations
     * could be equivalent.) This attribute cannot be modified by,
     * and is not subject to any limitations of, the implementation or the
     * target printer.
     *
     * @return  OriginType.PHYSICAL or OriginType.PRINTABLE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setOrientationRequestedToDefault() {

    /**
     * Sets the print orientation for pages using these attributes to the
     * default. The default orientation is portrait.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setOrientationRequested(int orientationRequested) {

    /**
     * Specifies the print orientation for pages using these attributes.
     * Specifying <code>3</code> denotes portrait. Specifying <code>4</code>
     * denotes landscape. Specifying any other value will generate an
     * IllegalArgumentException. Not specifying the property is equivalent
     * to calling setOrientationRequested(OrientationRequestedType.PORTRAIT).
     *
     * @param   orientationRequested <code>3</code> or <code>4</code>
     * @throws  IllegalArgumentException if orientationRequested is not
     *          <code>3</code> or <code>4</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setOrientationRequested(OrientationRequestedType
                                        orientationRequested) {

    /**
     * Specifies the print orientation for pages using these attributes. Not
     * specifying the property is equivalent to specifying
     * OrientationRequestedType.PORTRAIT.
     *
     * @param   orientationRequested OrientationRequestedType.PORTRAIT or
     *          OrientationRequestedType.LANDSCAPE.
     * @throws  IllegalArgumentException if orientationRequested is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public OrientationRequestedType getOrientationRequested() {

    /**
     * Returns the print orientation for pages using these attributes. This
     * attribute is updated to the value chosen by the user.
     *
     * @return  OrientationRequestedType.PORTRAIT or
     *          OrientationRequestedType.LANDSCAPE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setMediaToDefault(){

    /**
     * Sets the paper size for pages using these attributes to the default
     * size for the default locale. The default size for locales in the
     * United States and Canada is MediaType.NA_LETTER. The default size for
     * all other locales is MediaType.ISO_A4.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setMedia(MediaType media) {

    /**
     * Specifies the desired paper size for pages using these attributes. The
     * actual paper size will be determined by the limitations of the target
     * printer. If an exact match cannot be found, an implementation will
     * choose the closest possible match. Not specifying this attribute is
     * equivalent to specifying the default size for the default locale. The
     * default size for locales in the United States and Canada is
     * MediaType.NA_LETTER. The default size for all other locales is
     * MediaType.ISO_A4.
     *
     * @param   media one of the constant fields of the MediaType class.
     * @throws  IllegalArgumentException if media is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public MediaType getMedia() {

    /**
     * Returns the paper size for pages using these attributes. This
     * attribute is updated to the value chosen by the user.
     *
     * @return  one of the constant fields of the MediaType class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void setColor(ColorType color) {

    /**
     * Specifies whether pages using these attributes will be rendered in
     * color or monochrome. Not specifying this attribute is equivalent to
     * specifying ColorType.MONOCHROME.
     *
     * @param   color ColorType.COLOR or ColorType.MONOCHROME.
     * @throws  IllegalArgumentException if color is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public ColorType getColor() {

    /**
     * Returns whether pages using these attributes will be rendered in
     * color or monochrome. This attribute is updated to the value chosen
     * by the user.
     *
     * @return  ColorType.COLOR or ColorType.MONOCHROME.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public void set(PageAttributes obj) {

    /**
     * Sets all of the attributes of this PageAttributes to the same values as
     * the attributes of obj.
     *
     * @param   obj the PageAttributes to copy.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public Object clone() {

    /**
     * Creates and returns a copy of this PageAttributes.
     *
     * @return  the newly created copy. It is safe to cast this Object into
     *          a PageAttributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public PageAttributes(ColorType color, MediaType media,
                          OrientationRequestedType orientationRequested,
                          OriginType origin, PrintQualityType printQuality,
                          int[] printerResolution) {

    /**
     * Constructs a PageAttributes instance with the specified values for
     * every attribute.
     *
     * @param   color ColorType.COLOR or ColorType.MONOCHROME.
     * @param   media one of the constant fields of the MediaType class.
     * @param   orientationRequested OrientationRequestedType.PORTRAIT or
     *          OrientationRequestedType.LANDSCAPE.
     * @param   origin OriginType.PHYSICAL or OriginType.PRINTABLE
     * @param   printQuality PrintQualityType.DRAFT, PrintQualityType.NORMAL,
     *          or PrintQualityType.HIGH
     * @param   printerResolution an integer array of 3 elements. The first
     *          element must be greater than 0. The second element must be
     *          must be greater than 0. The third element must be either
     *          <code>3</code> or <code>4</code>.
     * @throws  IllegalArgumentException if one or more of the above
     *          conditions is violated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public PageAttributes(PageAttributes obj) {

    /**
     * Constructs a PageAttributes instance which is a copy of the supplied
     * PageAttributes.
     *
     * @param   obj the PageAttributes to copy.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public PageAttributes() {

    /**
     * Constructs a PageAttributes instance with default values for every
     * attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final PrintQualityType DRAFT =

        /**
         * The PrintQualityType instance to use for specifying a draft print
         * quality.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final PrintQualityType NORMAL =

        /**
         * The PrintQualityType instance to use for specifying a normal print
         * quality.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final PrintQualityType HIGH =

        /**
         * The PrintQualityType instance to use for specifying a high print
         * quality.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public static final class PrintQualityType extends AttributeValue {

    /**
     * A type-safe enumeration of possible print qualities. These print
     * qualities are in compliance with IPP 1.1.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final OriginType PHYSICAL = new OriginType(I_PHYSICAL);

        /**
         * The OriginType instance to use for specifying a physical origin.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public static final class OriginType extends AttributeValue {

    /**
     * A type-safe enumeration of possible origins.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final OrientationRequestedType LANDSCAPE =

        /**
         * The OrientationRequestedType instance to use for specifying a
         * landscape orientation.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final OrientationRequestedType PORTRAIT =

        /**
         * The OrientationRequestedType instance to use for specifying a
         * portrait orientation.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public static final class OrientationRequestedType extends AttributeValue {

    /**
     * A type-safe enumeration of possible orientations. These orientations
     * are in partial compliance with IPP 1.1.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType PERSONAL = PERSONAL_ENVELOPE;

        /**
         * An alias for PERSONAL_ENVELOPE.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ITALY = ITALY_ENVELOPE;

        /**
         * An alias for ITALY_ENVELOPE.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ENV_PERSONAL = PERSONAL_ENVELOPE;

        /**
         * An alias for PERSONAL_ENVELOPE.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ENV_ITALY = ITALY_ENVELOPE;

        /**
         * An alias for ITALY_ENVELOPE.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ENV_14 = NA_NUMBER_14_ENVELOPE;

        /**
         * An alias for NA_NUMBER_14_ENVELOPE.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ENV_11 = NA_NUMBER_11_ENVELOPE;

        /**
         * An alias for NA_NUMBER_11_ENVELOPE.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ENV_9 = NA_NUMBER_9_ENVELOPE;

        /**
         * An alias for NA_NUMBER_9_ENVELOPE.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ENV_7X9 = NA_7X9_ENVELOPE;

        /**
         * An alias for NA_7X9_ENVELOPE.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ENV_9X12 = NA_9X12_ENVELOPE;

        /**
         * An alias for NA_9X12_ENVELOPE.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ENV_10X14 = NA_10X14_ENVELOPE;

        /**
         * An alias for NA_10X14_ENVELOPE.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType LEGAL = NA_LEGAL;

        /**
         * An alias for NA_LEGAL.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType LETTER = NA_LETTER;

        /**
         * An alias for NA_LETTER.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType STATEMENT = INVOICE;

        /**
         * An alias for INVOICE.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_DESIGNATED_LONG_ENVELOPE =

        /**
         * An alias for ISO_DESIGNATED_LONG.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType C10 = ISO_C10;

        /**
         * An alias for ISO_C10.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType C9 = ISO_C9;

        /**
         * An alias for ISO_C9.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType C8 = ISO_C8;

        /**
         * An alias for ISO_C8.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType C7 = ISO_C7;

        /**
         * An alias for ISO_C7.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType C6 = ISO_C6;

        /**
         * An alias for ISO_C6.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType C5 = ISO_C5;

        /**
         * An alias for ISO_C5.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType C4 = ISO_C4;

        /**
         * An alias for ISO_C4.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType C3 = ISO_C3;

        /**
         * An alias for ISO_C3.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType C2 = ISO_C2;

        /**
         * An alias for ISO_C2.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType C1 = ISO_C1;

        /**
         * An alias for ISO_C1.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType C0 = ISO_C0;

        /**
         * An alias for ISO_C0.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType B9 = ISO_B9;

        /**
         * An alias for ISO_B9.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType B7 = ISO_B7;

        /**
         * An alias for ISO_B7.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_B5_ENVELOPE = ISO_B5;

        /**
         * An alias for ISO_B5.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_B4_ENVELOPE = ISO_B4;

        /**
         * An alias for ISO_B4.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType B3 = ISO_B3;

        /**
         * An alias for ISO_B3.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType B1 = ISO_B1;

        /**
         * An alias for ISO_B1.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType A10 = ISO_A10;

        /**
         * An alias for ISO_A10.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType A8 = ISO_A8;

        /**
         * An alias for ISO_A8.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType A6 = ISO_A6;

        /**
         * An alias for ISO_A6.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType A4 = ISO_A4;

        /**
         * An alias for ISO_A4.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType A2 = ISO_A2;

        /**
         * An alias for ISO_A2.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType A0 = ISO_A0;

        /**
         * An alias for ISO_A0.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType PERSONAL_ENVELOPE =

        /**
         * The MediaType instance for 6 3/4 envelope, 3 5/8 x 6 1/2 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType MONARCH_ENVELOPE =

        /**
         * The MediaType instance for Monarch Envelope, 3 7/8 x 7 1/2 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ITALY_ENVELOPE =

        /**
         * The MediaType instance for Italy Envelope, 110 x 230 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType INVITE_ENVELOPE =

        /**
         * The MediaType instance for Invitation Envelope, 220 x 220 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_NUMBER_14_ENVELOPE =

        /**
         * The MediaType instance for North American #14 Business Envelope,
         * 5 x 11 1/2 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_NUMBER_12_ENVELOPE =

        /**
         * The MediaType instance for North American #12 Business Envelope,
         * 4 3/4 x 11 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_NUMBER_11_ENVELOPE =

        /**
         * The MediaType instance for North American #11 Business Envelope,
         * 4 1/2 x 10 3/8 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_NUMBER_10_ENVELOPE =

        /**
         * The MediaType instance for North American #10 Business Envelope,
         * 4 1/8 x 9 1/2 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_NUMBER_9_ENVELOPE =

        /**
         * The MediaType instance for North American #9 Business Envelope,
         * 3 7/8 x 8 7/8 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_6X9_ENVELOPE =

        /**
         * The MediaType instance for North American 6 x 9 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_7X9_ENVELOPE =

        /**
         * The MediaType instance for North American 7 x 9 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_9X11_ENVELOPE =

        /**
         * The MediaType instance for North American 9 x 11 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_9X12_ENVELOPE =

        /**
         * The MediaType instance for North American 9 x 12 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_10X13_ENVELOPE =

        /**
         * The MediaType instance for North American 10 x 13 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_10X14_ENVELOPE =

        /**
         * The MediaType instance for North American 10 x 14 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_10X15_ENVELOPE =

        /**
         * The MediaType instance for North American 10 x 15 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType D = new MediaType(I_D);

        /**
         * The MediaType instance for Engineering D, 22 x 34 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType B = new MediaType(I_B);

        /**
         * The MediaType instance for Engineering B, 11 x 17 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType QUARTO = new MediaType(I_QUARTO);

        /**
         * The MediaType instance for Quarto, 215 x 275 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType NA_LETTER = new MediaType(I_NA_LETTER);

        /**
         * The MediaType instance for North American Letter, 8 1/2 x 11 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType INVOICE = new MediaType(I_INVOICE);

        /**
         * The MediaType instance for Invoice, 5 1/2 x 8 1/2 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType EXECUTIVE = new MediaType(I_EXECUTIVE);

        /**
         * The MediaType instance for Executive, 7 1/4 x 10 1/2 in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_DESIGNATED_LONG =

        /**
         * The MediaType instance for ISO Designated Long, 110 x 220 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_C9 = new MediaType(I_ISO_C9);

        /**
         * The MediaType instance for ISO/DIN C9, 40 x 57 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_C7 = new MediaType(I_ISO_C7);

        /**
         * The MediaType instance for ISO/DIN C7, 81 x 114 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_C5 = new MediaType(I_ISO_C5);

        /**
         * The MediaType instance for ISO/DIN C5, 162 x 229 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_C3 = new MediaType(I_ISO_C3);

        /**
         * The MediaType instance for ISO/DIN C3, 324 x 458 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_C1 = new MediaType(I_ISO_C1);

        /**
         * The MediaType instance for ISO/DIN C1, 648 x 917 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType JIS_B10 = new MediaType(I_JIS_B10);

        /**
         * The MediaType instance for JIS B10, 32 x 45 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType JIS_B8 = new MediaType(I_JIS_B8);

        /**
         * The MediaType instance for JIS B8, 64 x 91 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType JIS_B6 = new MediaType(I_JIS_B6);

        /**
         * The MediaType instance for JIS B6, 128 x 182 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType JIS_B4 = new MediaType(I_JIS_B4);

        /**
         * The MediaType instance for JIS B4, 257 x 364 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType JIS_B2 = new MediaType(I_JIS_B2);

        /**
         * The MediaType instance for JIS B2, 515 x 728 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType JIS_B0 = new MediaType(I_JIS_B0);

        /**
         * The MediaType instance for JIS B0, 1030 x 1456 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_B9 = new MediaType(I_ISO_B9);

        /**
         * The MediaType instance for ISO/DIN B9, 44 x 62 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_B7 = new MediaType(I_ISO_B7);

        /**
         * The MediaType instance for ISO/DIN B7, 88 x 125 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_B5 = new MediaType(I_ISO_B5);

        /**
         * The MediaType instance for ISO/DIN B5, 176 x 250 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_B3 = new MediaType(I_ISO_B3);

        /**
         * The MediaType instance for ISO/DIN B3, 353 x 500 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_B1 = new MediaType(I_ISO_B1);

        /**
         * The MediaType instance for ISO/DIN B1, 707 x 1000 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_A10 = new MediaType(I_ISO_A10);

        /**
         * The MediaType instance for ISO/DIN and JIS A10, 26 x 37 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_A8 = new MediaType(I_ISO_A8);

        /**
         * The MediaType instance for ISO/DIN and JIS A8, 52 x 74 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_A6 = new MediaType(I_ISO_A6);

        /**
         * The MediaType instance for ISO/DIN and JIS A6, 105 x 148 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_A4 = new MediaType(I_ISO_A4);

        /**
         * The MediaType instance for ISO/DIN and JIS A4, 210 x 297 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_A2 = new MediaType(I_ISO_A2);

        /**
         * The MediaType instance for ISO/DIN and JIS A2, 420 x 594 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_A0 = new MediaType(I_ISO_A0);

        /**
         * The MediaType instance for ISO/DIN and JIS A0, 841 x 1189 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final MediaType ISO_4A0 = new MediaType(I_ISO_4A0);

        /**
         * The MediaType instance for ISO/DIN and JIS 4A0, 1682 x 2378 mm.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
    public static final class MediaType extends AttributeValue {

    /**
     * A type-safe enumeration of possible paper sizes. These sizes are in
     * compliance with IPP 1.1.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
        public static final ColorType COLOR = new ColorType(I_COLOR);

        /**
         * The ColorType instance to use for specifying color printing.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PageAttributes.java
public final class PageAttributes implements Cloneable {

/**
 * A set of attributes which control the output of a printed page.
 * <p>
 * Instances of this class control the color state, paper size (media type),
 * orientation, logical origin, print quality, and resolution of every
 * page which uses the instance. Attribute names are compliant with the
 * Internet Printing Protocol (IPP) 1.1 where possible. Attribute values
 * are partially compliant where possible.
 * <p>
 * To use a method which takes an inner class type, pass a reference to
 * one of the constant fields of the inner class. Client code cannot create
 * new instances of the inner class types because none of those classes
 * has a public constructor. For example, to set the color state to
 * monochrome, use the following code:
 * <pre>
 * import java.awt.PageAttributes;
 *
 * public class MonochromeExample {
 *     public void setMonochrome(PageAttributes pageAttributes) {
 *         pageAttributes.setColor(PageAttributes.ColorType.MONOCHROME);
 *     }
 * }
 * </pre>
 * <p>
 * Every IPP attribute which supports an <i>attributeName</i>-default value
 * has a corresponding <code>set<i>attributeName</i>ToDefault</code> method.
 * Default value fields are not provided.
 *
 * @author      David Mendenhall
 * @since 1.3
 */
