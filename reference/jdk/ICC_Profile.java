_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    protected Object readResolve() throws ObjectStreamException {

    /**
     * Resolves instances being deserialized into instances registered
     * with CMM.
     * @return ICC_Profile object for profile registered with CMM.
     * @throws ObjectStreamException
     *     never thrown, but mandated by the serialization spec.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    private void readObject(ObjectInputStream s)

    /**
     * Reads default serializable fields from the stream.  Reads from
     * the stream a string and an array of bytes as additional data.
     *
     * @param s stream used for deserialization.
     * @throws IOException
     *     thrown by <code>ObjectInputStream</code>.
     * @throws ClassNotFoundException
     *     thrown by <code>ObjectInputStream</code>.
     * @serialData
     *     The <code>String</code> is the name of one of
     *     <code>CS_<var>*</var></code> constants defined in the
     *     {@link ColorSpace} class if the profile object is a profile
     *     for a predefined color space (for example
     *     <code>"CS_sRGB"</code>).  The string is <code>null</code>
     *     otherwise.
     *     <p>
     *     The <code>byte[]</code> array is the profile data for the
     *     profile.  It will usually be <code>null</code> for the
     *     predefined profiles.
     *     <p>
     *     If the string is recognized as a constant name for
     *     predefined color space the object will be resolved into
     *     profile obtained with
     *     <code>getInstance(int&nbsp;cspace)</code> and the profile
     *     data are ignored.  Otherwise the object will be resolved
     *     into profile obtained with
     *     <code>getInstance(byte[]&nbsp;data)</code>.
     * @see #readResolve()
     * @see #getInstance(int)
     * @see #getInstance(byte[])
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    private void writeObject(ObjectOutputStream s)

    /**
     * Writes default serializable fields to the stream.  Writes a
     * string and an array of bytes to the stream as additional data.
     *
     * @param s stream used for serialization.
     * @throws IOException
     *     thrown by <code>ObjectInputStream</code>.
     * @serialData
     *     The <code>String</code> is the name of one of
     *     <code>CS_<var>*</var></code> constants defined in the
     *     {@link ColorSpace} class if the profile object is a profile
     *     for a predefined color space (for example
     *     <code>"CS_sRGB"</code>).  The string is <code>null</code>
     *     otherwise.
     *     <p>
     *     The <code>byte[]</code> array is the profile data for the
     *     profile.  For predefined color spaces <code>null</code> is
     *     written instead of the profile data.  If in the future
     *     versions of Java API new predefined color spaces will be
     *     added, future versions of this class may choose to write
     *     for new predefined color spaces not only the color space
     *     name, but the profile data as well so that older versions
     *     could still deserialize the object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    private int iccProfileSerializedDataVersion = 1;

    /**
     * Version of the format of additional serialized data in the
     * stream.  Version&nbsp;<code>1</code> corresponds to Java&nbsp;2
     * Platform,&nbsp;v1.3.
     * @since 1.3
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    private static boolean standardProfileExists(final String fileName) {

    /**
     * Checks whether built-in profile specified by fileName exists.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    private static boolean isChildOf(File f, String dirName) {

    /**
     * Checks whether given file resides inside give directory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    private static File getStandardProfileFile(String fileName) {

    /**
     * Returns a file object corresponding to a built-in profile
     * specified by fileName.
     * If there is no built-in profile with such name, then the method
     * returns null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    short[] getTRC(int theTagSignature) {

    /**
     * Returns the TRC as an array of shorts.  If the profile has
     * specified the TRC as linear (gamma = 1.0) or as a simple gamma
     * value, this method throws an exception, and the getGamma() method
     * should be used to get the gamma value.  Otherwise the short array
     * returned here represents a lookup table where the input Gray value
     * is conceptually in the range [0.0, 1.0].  Value 0.0 maps
     * to array index 0 and value 1.0 maps to array index length-1.
     * Interpolation may be used to generate output values for
     * input values which do not map exactly to an index in the
     * array.  Output values also map linearly to the range [0.0, 1.0].
     * Value 0.0 is represented by an array value of 0x0000 and
     * value 1.0 by 0xFFFF, i.e. the values are really unsigned
     * short values, although they are returned in a short array.
     * theTagSignature should be one of icSigGrayTRCTag, icSigRedTRCTag,
     * icSigGreenTRCTag, or icSigBlueTRCTag.
     * @return a short array representing the TRC.
     * @exception ProfileDataException if the profile does not specify
     *            the TRC as a table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    float getGamma(int theTagSignature) {

    /**
     * Returns a gamma value representing a tone reproduction
     * curve (TRC).  If the profile represents the TRC as a table rather
     * than a single gamma value, then an exception is thrown.  In this
     * case the actual table can be obtained via getTRC().
     * theTagSignature should be one of icSigGrayTRCTag, icSigRedTRCTag,
     * icSigGreenTRCTag, or icSigBlueTRCTag.
     * @return the gamma value as a float.
     * @exception ProfileDataException if the profile does not specify
     *            the TRC as a single gamma value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    float[] getXYZTag(int theTagSignature) {

    /**
     * Returns a float array of length 3 containing the X, Y, and Z
     * components encoded in an XYZType tag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    float[] getMediaWhitePoint() {

    /**
     * Returns a float array of length 3 containing the X, Y, and Z
     * components of the mediaWhitePointTag in the ICC profile.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public int getNumComponents() {

    /**
     * Returns the number of color components in the "input" color
     * space of this profile.  For example if the color space type
     * of this profile is TYPE_RGB, then this method will return 3.
     *
     * @return The number of color components in the profile's input
     * color space.
     *
     * @throws ProfileDataException if color space is in the profile
     *         is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    int getRenderingIntent() {

    /**
     * Returns the rendering intent of the profile.
     * This is used to select the proper transform from a profile that
     * has multiple transforms.  It is typically set in a source profile
     * to select a transform from an output profile.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    void setRenderingIntent(int renderingIntent) {

    /**
     * Sets the rendering intent of the profile.
     * This is used to select the proper transform from a profile that
     * has multiple transforms.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public void setData(int tagSignature, byte[] tagData) {

    /**
     * Sets a particular tagged data element in the profile from
     * a byte array. The array should contain data in a format, corresponded
     * to the {@code tagSignature} as defined in the ICC specification, section 10.
     * This method is useful for advanced applets or applications which need to
     * access profile data directly.
     *
     * @param tagSignature The ICC tag signature for the data element
     * you want to set.
     * @param tagData the data to set for the specified tag signature
     * @throws IllegalArgumentException if {@code tagSignature} is not a signature
     *         as defined in the ICC specification.
     * @throws IllegalArgumentException if a content of the {@code tagData}
     *         array can not be interpreted as valid tag data, corresponding
     *         to the {@code tagSignature}.
     * @see #getData
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public byte[] getData(int tagSignature) {

    /**
     * Returns a particular tagged data element from the profile as
     * a byte array.  Elements are identified by signatures
     * as defined in the ICC specification.  The signature
     * icSigHead can be used to get the header.  This method is useful
     * for advanced applets or applications which need to access
     * profile data directly.
     *
     * @param tagSignature The ICC tag signature for the data element you
     * want to get.
     *
     * @return A byte array that contains the tagged data element. Returns
     * <code>null</code> if the specified tag doesn't exist.
     * @see #setData(int, byte[])
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public byte[] getData() {

    /**
     * Returns a byte array corresponding to the data of this ICC_Profile.
     * @return A byte array that contains the profile data.
     * @see #setData(int, byte[])
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public void write(OutputStream s) throws IOException {

    /**
     * Write this ICC_Profile to an OutputStream.
     *
     * @param s The stream to write the profile data to.
     *
     * @exception IOException If an I/O error occurs while writing to the
     * stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public void write(String fileName) throws IOException {

    /**
     * Write this ICC_Profile to a file.
     *
     * @param fileName The file to write the profile data to.
     *
     * @exception IOException If the file cannot be opened for writing
     * or an I/O error occurs while writing to the file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public int getPCSType() {

    /**
     * Returns the color space type of the Profile Connection Space (PCS).
     * Returns one of the color space type constants defined by the
     * ColorSpace class.  This is the "output" color space of the
     * profile.  For an input, display, or output profile useful
     * for tagging colors or images, this will be either TYPE_XYZ or
     * TYPE_Lab and should be interpreted as the corresponding specific
     * color space defined in the ICC specification.  For a device
     * link profile, this could be any of the color space type constants.
     * @return One of the color space type constants defined in the
     * <CODE>ColorSpace</CODE> class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public int getColorSpaceType() {

    /**
     * Returns the color space type.  Returns one of the color space type
     * constants defined by the ColorSpace class.  This is the
     * "input" color space of the profile.  The type defines the
     * number of components of the color space and the interpretation,
     * e.g. TYPE_RGB identifies a color space with three components - red,
     * green, and blue.  It does not define the particular color
     * characteristics of the space, e.g. the chromaticities of the
     * primaries.
     * @return One of the color space type constants defined in the
     * <CODE>ColorSpace</CODE> class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public int getProfileClass() {

    /**
     * Returns the profile class.
     * @return One of the predefined profile class constants.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public int getMinorVersion() {

    /**
     * Returns profile minor version.
     * @return The minor version of the profile.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public int getMajorVersion() {

    /**
     * Returns profile major version.
     * @return  The major version of the profile.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    static ICC_Profile getDeferredInstance(ProfileDeferralInfo pdi) {

    /**
     * Constructs an ICC_Profile for which the actual loading of the
     * profile data from a file and the initialization of the CMM should
     * be deferred as long as possible.
     * Deferral is only used for standard profiles.
     * If deferring is disabled, then getStandardProfile() ensures
     * that all of the appropriate access privileges are granted
     * when loading this profile.
     * If deferring is enabled, then the deferred activation
     * code will take care of access privileges.
     * @see activateDeferredProfile()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static ICC_Profile getInstance(InputStream s) throws IOException {

    /**
     * Constructs an ICC_Profile corresponding to the data in an InputStream.
     * This method throws an IllegalArgumentException if the stream does not
     * contain valid ICC Profile data.  It throws an IOException if an I/O
     * error occurs while reading the stream.
     * @param s The input stream from which to read the profile data.
     *
     * @return an <CODE>ICC_Profile</CODE> object corresponding to the
     *     data in the specified <code>InputStream</code>.
     *
     * @exception IOException If an I/O error occurs while reading the stream.
     *
     * @exception IllegalArgumentException If the stream does not
     * contain valid ICC Profile data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static ICC_Profile getInstance(String fileName) throws IOException {

    /**
     * Constructs an ICC_Profile corresponding to the data in a file.
     * fileName may be an absolute or a relative file specification.
     * Relative file names are looked for in several places: first, relative
     * to any directories specified by the java.iccprofile.path property;
     * second, relative to any directories specified by the java.class.path
     * property; finally, in a directory used to store profiles always
     * available, such as the profile for sRGB.  Built-in profiles use .pf as
     * the file name extension for profiles, e.g. sRGB.pf.
     * This method throws an IOException if the specified file cannot be
     * opened or if an I/O error occurs while reading the file.  It throws
     * an IllegalArgumentException if the file does not contain valid ICC
     * Profile data.
     * @param fileName The file that contains the data for the profile.
     *
     * @return an <code>ICC_Profile</code> object corresponding to
     *          the data in the specified file.
     * @exception IOException If the specified file cannot be opened or
     * an I/O error occurs while reading the file.
     *
     * @exception IllegalArgumentException If the file does not
     * contain valid ICC Profile data.
     *
     * @exception SecurityException If a security manager is installed
     * and it does not permit read access to the given file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static ICC_Profile getInstance (int cspace) {

    /**
     * Constructs an ICC_Profile corresponding to one of the specific color
     * spaces defined by the ColorSpace class (for example CS_sRGB).
     * Throws an IllegalArgumentException if cspace is not one of the
     * defined color spaces.
     *
     * @param cspace the type of color space to create a profile for.
     * The specified type is one of the color
     * space constants defined in the  <CODE>ColorSpace</CODE> class.
     *
     * @return an <code>ICC_Profile</code> object corresponding to
     *          the specified <code>ColorSpace</code> type.
     * @exception IllegalArgumentException If <CODE>cspace</CODE> is not
     * one of the predefined color space types.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static ICC_Profile getInstance(byte[] data) {

    /**
     * Constructs an ICC_Profile object corresponding to the data in
     * a byte array.  Throws an IllegalArgumentException if the data
     * does not correspond to a valid ICC Profile.
     * @param data the specified ICC Profile data
     * @return an <code>ICC_Profile</code> object corresponding to
     *          the data in the specified <code>data</code> array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    protected void finalize () {

    /**
     * Frees the resources associated with an ICC_Profile object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    ICC_Profile(ProfileDeferralInfo pdi) {

    /**
     * Constructs an ICC_Profile object whose loading will be deferred.
     * The ID will be 0 until the profile is loaded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    ICC_Profile(Profile p) {

    /**
     * Constructs an ICC_Profile object with a given ID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icXYZNumberX       = 8;    /* XYZNumber X */

    /**
     * ICC Profile Constant: XYZNumber X.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icCurveData        = 12;   /* curveType data */

    /**
     * ICC Profile Constant: curveType data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icCurveCount       = 8;    /* curveType count */

    /**
     * ICC Profile Constant: curveType count.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icTagReserved      = 4;    /* reserved */

    /**
     * ICC Profile Constant: reserved.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icTagType          = 0;    /* tag type signature */

    /**
     * ICC Profile Constant: tag type signaturE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrProfileID = 84; /* Profile's ID */

    /**
     * ICC Profile Header Location: profile's ID.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrCreator      = 80; /* Profile creator */

    /**
     * ICC Profile Header Location: profile creator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrIlluminant   = 68; /* Profile illuminant */

    /**
     * ICC Profile Header Location: profile illuminant.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrRenderingIntent = 64; /* Rendering intent */

    /**
     * ICC Profile Header Location: rendering intent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrAttributes   = 56; /* Device attributes */

    /**
     * ICC Profile Header Location: device attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrModel        = 52; /* Device model number */

    /**
     * ICC Profile Header Location: device model number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrManufacturer = 48; /* Device manufacturer */

    /**
     * ICC Profile Header Location: device manufacturer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrFlags        = 44; /* Various bit settings */

    /**
     * ICC Profile Header Location: various bit settings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrPlatform     = 40; /* Primary Platform */

    /**
     * ICC Profile Header Location: primary platform.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrMagic        = 36; /* icMagicNumber */

    /**
     * ICC Profile Header Location: icMagicNumber.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrDate       = 24; /* Date profile was created */

    /**
     * ICC Profile Header Location: date profile was created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrPcs          = 20; /* PCS - XYZ or Lab only */

    /**
     * ICC Profile Header Location: PCS - XYZ or Lab only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrColorSpace   = 16; /* Color space of data */

    /**
     * ICC Profile Header Location: color space of data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrDeviceClass  = 12; /* Type of profile */

    /**
     * ICC Profile Header Location: type of profile.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrVersion      = 8;  /* Format version number */

    /**
     * ICC Profile Header Location: format version number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrCmmId        = 4;  /* CMM for this profile */

    /**
     * ICC Profile Header Location: CMM for this profile.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrSize         = 0;  /* Profile size in bytes */

    /**
     * ICC Profile Header Location: profile size in bytes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigColorantTableTag = 0x636C7274;    /* 'clrt' */

    /**
     * ICC Profile Tag Signature: 'clrt'.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigColorantOrderTag = 0x636C726F;    /* 'clro' */

    /**
     * ICC Profile Tag Signature: 'clro'.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigChromaticAdaptationTag = 0x63686164;/* 'chad' */

    /**
     * ICC Profile Tag Signature: 'chad'.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigChromaticityTag  = 0x6368726d;    /* 'chrm' */

    /**
     * ICC Profile Tag Signature: 'chrm'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigViewingConditionsTag = 0x76696577;/* 'view' */

    /**
     * ICC Profile Tag Signature: 'view'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigViewingCondDescTag = 0x76756564;  /* 'vued' */

    /**
     * ICC Profile Tag Signature: 'vued'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigUcrBgTag         = 0x62666420;    /* 'bfd ' */

    /**
     * ICC Profile Tag Signature: 'bfd '.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigTechnologyTag    = 0x74656368;    /* 'tech' */

    /**
     * ICC Profile Tag Signature: 'tech'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigScreeningTag     = 0x7363726E;    /* 'scrn' */

    /**
     * ICC Profile Tag Signature: 'scrn'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigScreeningDescTag = 0x73637264;    /* 'scrd' */

    /**
     * ICC Profile Tag Signature: 'scrd'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigRedTRCTag        = 0x72545243;    /* 'rTRC' */

    /**
     * ICC Profile Tag Signature: 'rTRC'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigRedMatrixColumnTag = 0x7258595A;  /* 'rXYZ' */

    /**
     * ICC Profile Tag Signature: 'rXYZ'.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigRedColorantTag   = 0x7258595A;    /* 'rXYZ' */

    /**
     * ICC Profile Tag Signature: 'rXYZ'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigPs2RenderingIntentTag = 0x70733269;

    /**
     * ICC Profile Tag Signature: 'ps2i'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigPs2CSATag        = 0x70733273;    /* 'ps2s' */

    /**
     * ICC Profile Tag Signature: 'ps2s'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigPs2CRD3Tag       = 0x70736433;    /* 'psd3' */

    /**
     * ICC Profile Tag Signature: 'psd3'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigPs2CRD2Tag       = 0x70736432;    /* 'psd2' */

    /**
     * ICC Profile Tag Signature: 'psd2'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigPs2CRD1Tag       = 0x70736431;    /* 'psd1' */

    /**
     * ICC Profile Tag Signature: 'psd1'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigPs2CRD0Tag       = 0x70736430;    /* 'psd0' */

    /**
     * ICC Profile Tag Signature: 'psd0'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigProfileSequenceDescTag = 0x70736571;

    /**
     * ICC Profile Tag Signature: 'pseq'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigProfileDescriptionTag = 0x64657363;

    /**
     * ICC Profile Tag Signature: 'desc'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigPreview2Tag      = 0x70726532;    /* 'pre2' */

    /**
     * ICC Profile Tag Signature: 'pre2'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigPreview1Tag      = 0x70726531;    /* 'pre1' */

    /**
     * ICC Profile Tag Signature: 'pre1'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigPreview0Tag      = 0x70726530;    /* 'pre0' */

    /**
     * ICC Profile Tag Signature: 'pre0'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigOutputResponseTag = 0x72657370;   /* 'resp' */

    /**
     * ICC Profile Tag Signature: 'resp'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigNamedColor2Tag   = 0x6E636C32;    /* 'ncl2' */

    /**
     * ICC Profile Tag Signature: 'ncl2'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigMediaWhitePointTag = 0x77747074;  /* 'wtpt' */

    /**
     * ICC Profile Tag Signature: 'wtpt'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigMediaBlackPointTag = 0x626B7074;  /* 'bkpt' */

    /**
     * ICC Profile Tag Signature: 'bkpt'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigMeasurementTag   = 0x6D656173;    /* 'meas' */

    /**
     * ICC Profile Tag Signature: 'meas'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigLuminanceTag     = 0x6C756d69;    /* 'lumi' */

    /**
     * ICC Profile Tag Signature: 'lumi'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigGreenTRCTag      = 0x67545243;    /* 'gTRC' */

    /**
     * ICC Profile Tag Signature: 'gTRC'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigGreenMatrixColumnTag = 0x6758595A;/* 'gXYZ' */

    /**
     * ICC Profile Tag Signature: 'gXYZ'.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigGreenColorantTag = 0x6758595A;    /* 'gXYZ' */

    /**
     * ICC Profile Tag Signature: 'gXYZ'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigGrayTRCTag       = 0x6b545243;    /* 'kTRC' */

    /**
     * ICC Profile Tag Signature: 'kTRC'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigGamutTag         = 0x67616D74;    /* 'gamt' */

    /**
     * ICC Profile Tag Signature: 'gamt'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigDeviceSettingsTag =  0x64657673;  /* 'devs' */

    /**
     * ICC Profile Tag Signature: 'devs'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigDeviceModelDescTag = 0x646D6464;  /* 'dmdd' */

    /**
     * ICC Profile Tag Signature: 'dmdd'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigDeviceMfgDescTag = 0x646D6E64;    /* 'dmnd' */

    /**
     * ICC Profile Tag Signature: 'dmnd'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigCrdInfoTag       = 0x63726469;    /* 'crdi' */

    /**
     * ICC Profile Tag Signature: 'crdi'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigCopyrightTag     = 0x63707274;    /* 'cprt' */

    /**
     * ICC Profile Tag Signature: 'cprt'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigCharTargetTag    = 0x74617267;    /* 'targ' */

    /**
     * ICC Profile Tag Signature: 'targ'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigCalibrationDateTimeTag = 0x63616C74;

    /**
     * ICC Profile Tag Signature: 'calt'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigBToA2Tag         = 0x42324132;    /* 'B2A2' */

    /**
     * ICC Profile Tag Signature: 'B2A2'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigBToA1Tag         = 0x42324131;    /* 'B2A1' */

    /**
     * ICC Profile Tag Signature: 'B2A1'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigBToA0Tag         = 0x42324130;    /* 'B2A0' */

    /**
     * ICC Profile Tag Signature: 'B2A0'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigBlueTRCTag       = 0x62545243;    /* 'bTRC' */

    /**
     * ICC Profile Tag Signature: 'bTRC'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigBlueMatrixColumnTag = 0x6258595A; /* 'bXYZ' */

    /**
     * ICC Profile Tag Signature: 'bXYZ'.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigBlueColorantTag  = 0x6258595A;    /* 'bXYZ' */

    /**
     * ICC Profile Tag Signature: 'bXYZ'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigAToB2Tag         = 0x41324232;    /* 'A2B2' */

    /**
     * ICC Profile Tag Signature: 'A2B2'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigAToB1Tag         = 0x41324231;    /* 'A2B1' */

    /**
     * ICC Profile Tag Signature: 'A2B1'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigAToB0Tag         = 0x41324230;    /* 'A2B0' */

    /**
     * ICC Profile Tag Signature: 'A2B0'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigHead      = 0x68656164; /* 'head' - special */

    /**
     * ICC Profile Tag Signature: 'head' - special.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icICCAbsoluteColorimetric = 3;

    /**
     * ICC Profile Rendering Intent: ICC-AbsoluteColorimetric.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icAbsoluteColorimetric    = 3;

    /**
     * ICC Profile Rendering Intent: AbsoluteColorimetric.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSaturation            = 2;

    /**
     * ICC Profile Rendering Intent: Saturation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icMediaRelativeColorimetric = 1;

    /**
     * ICC Profile Rendering Intent: Media-RelativeColorimetric.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icRelativeColorimetric    = 1;

    /**
     * ICC Profile Rendering Intent: RelativeColorimetric.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icPerceptual            = 0;

    /**
     * ICC Profile Rendering Intent: Perceptual.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigNamedColorClass  = 0x6e6d636c;    /* 'nmcl' */

    /**
     * ICC Profile Class Signature: 'nmcl'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigColorSpaceClass  = 0x73706163;    /* 'spac' */

    /**
     * ICC Profile Class Signature: 'spac'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigAbstractClass    = 0x61627374;    /* 'abst' */

    /**
     * ICC Profile Class Signature: 'abst'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigLinkClass        = 0x6C696E6B;    /* 'link' */

    /**
     * ICC Profile Class Signature: 'link'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigOutputClass      = 0x70727472;    /* 'prtr' */

    /**
     * ICC Profile Class Signature: 'prtr'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigDisplayClass     = 0x6D6E7472;    /* 'mntr' */

    /**
     * ICC Profile Class Signature: 'mntr'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigInputClass       = 0x73636E72;    /* 'scnr' */

    /**
     * ICC Profile Class Signature: 'scnr'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpaceFCLR        = 0x46434C52;    /* 'FCLR' */

    /**
     * ICC Profile Color Space Type Signature: 'FCLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpaceECLR        = 0x45434C52;    /* 'ECLR' */

    /**
     * ICC Profile Color Space Type Signature: 'ECLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpaceDCLR        = 0x44434C52;    /* 'DCLR' */

    /**
     * ICC Profile Color Space Type Signature: 'DCLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpaceCCLR        = 0x43434C52;    /* 'CCLR' */

    /**
     * ICC Profile Color Space Type Signature: 'CCLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpaceBCLR        = 0x42434C52;    /* 'BCLR' */

    /**
     * ICC Profile Color Space Type Signature: 'BCLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpaceACLR        = 0x41434C52;    /* 'ACLR' */

    /**
     * ICC Profile Color Space Type Signature: 'ACLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpace9CLR        = 0x39434C52;    /* '9CLR' */

    /**
     * ICC Profile Color Space Type Signature: '9CLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpace8CLR        = 0x38434C52;    /* '8CLR' */

    /**
     * ICC Profile Color Space Type Signature: '8CLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpace7CLR        = 0x37434C52;    /* '7CLR' */

    /**
     * ICC Profile Color Space Type Signature: '7CLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpace6CLR        = 0x36434C52;    /* '6CLR' */

    /**
     * ICC Profile Color Space Type Signature: '6CLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpace5CLR        = 0x35434C52;    /* '5CLR' */

    /**
     * ICC Profile Color Space Type Signature: '5CLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpace4CLR        = 0x34434C52;    /* '4CLR' */

    /**
     * ICC Profile Color Space Type Signature: '4CLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpace3CLR        = 0x33434C52;    /* '3CLR' */

    /**
     * ICC Profile Color Space Type Signature: '3CLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpace2CLR        = 0x32434C52;    /* '2CLR' */

    /**
     * ICC Profile Color Space Type Signature: '2CLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigCmyData        = 0x434D5920;    /* 'CMY ' */

    /**
     * ICC Profile Color Space Type Signature: 'CMY '.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigCmykData        = 0x434D594B;    /* 'CMYK' */

    /**
     * ICC Profile Color Space Type Signature: 'CMYK'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigHlsData        = 0x484C5320;    /* 'HLS ' */

    /**
     * ICC Profile Color Space Type Signature: 'HLS'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigHsvData        = 0x48535620;    /* 'HSV ' */

    /**
     * ICC Profile Color Space Type Signature: 'HSV'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigGrayData        = 0x47524159;    /* 'GRAY' */

    /**
     * ICC Profile Color Space Type Signature: 'GRAY'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigRgbData        = 0x52474220;    /* 'RGB ' */

    /**
     * ICC Profile Color Space Type Signature: 'RGB '.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigYxyData        = 0x59787920;    /* 'Yxy ' */

    /**
     * ICC Profile Color Space Type Signature: 'Yxy '.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigYCbCrData        = 0x59436272;    /* 'YCbr' */

    /**
     * ICC Profile Color Space Type Signature: 'YCbr'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigLuvData        = 0x4C757620;    /* 'Luv ' */

    /**
     * ICC Profile Color Space Type Signature: 'Luv '.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigLabData        = 0x4C616220;    /* 'Lab ' */

    /**
     * ICC Profile Color Space Type Signature: 'Lab '.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigXYZData        = 0x58595A20;    /* 'XYZ ' */

    /**
     * ICC Profile Color Space Type Signature: 'XYZ '.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int CLASS_NAMEDCOLOR = 6;

    /**
     * Profile class is named color.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int CLASS_ABSTRACT = 5;

    /**
     * Profile class is abstract.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int CLASS_COLORSPACECONVERSION = 4;

    /**
     * Profile class is color space conversion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int CLASS_DEVICELINK = 3;

    /**
     * Profile class is device link.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int CLASS_OUTPUT = 2;

    /**
     * Profile class is output.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int CLASS_DISPLAY = 1;

    /**
     * Profile class is display.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int CLASS_INPUT = 0;

    /**
     * Profile class is input.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
public class ICC_Profile implements Serializable {

/**
 * A representation of color profile data for device independent and
 * device dependent color spaces based on the International Color
 * Consortium Specification ICC.1:2001-12, File Format for Color Profiles,
 * (see <A href="http://www.color.org"> http://www.color.org</A>).
 * <p>
 * An ICC_ColorSpace object can be constructed from an appropriate
 * ICC_Profile.
 * Typically, an ICC_ColorSpace would be associated with an ICC
 * Profile which is either an input, display, or output profile (see
 * the ICC specification).  There are also device link, abstract,
 * color space conversion, and named color profiles.  These are less
 * useful for tagging a color or image, but are useful for other
 * purposes (in particular device link profiles can provide improved
 * performance for converting from one device's color space to
 * another's).
 * <p>
 * ICC Profiles represent transformations from the color space of
 * the profile (e.g. a monitor) to a Profile Connection Space (PCS).
 * Profiles of interest for tagging images or colors have a PCS
 * which is one of the two specific device independent
 * spaces (one CIEXYZ space and one CIELab space) defined in the
 * ICC Profile Format Specification.  Most profiles of interest
 * either have invertible transformations or explicitly specify
 * transformations going both directions.
 * @see ICC_ColorSpace
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    protected Object readResolve() throws ObjectStreamException {

    /**
     * Resolves instances being deserialized into instances registered
     * with CMM.
     * @return ICC_Profile object for profile registered with CMM.
     * @throws ObjectStreamException
     *     never thrown, but mandated by the serialization spec.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    private void readObject(ObjectInputStream s)

    /**
     * Reads default serializable fields from the stream.  Reads from
     * the stream a string and an array of bytes as additional data.
     *
     * @param s stream used for deserialization.
     * @throws IOException
     *     thrown by <code>ObjectInputStream</code>.
     * @throws ClassNotFoundException
     *     thrown by <code>ObjectInputStream</code>.
     * @serialData
     *     The <code>String</code> is the name of one of
     *     <code>CS_<var>*</var></code> constants defined in the
     *     {@link ColorSpace} class if the profile object is a profile
     *     for a predefined color space (for example
     *     <code>"CS_sRGB"</code>).  The string is <code>null</code>
     *     otherwise.
     *     <p>
     *     The <code>byte[]</code> array is the profile data for the
     *     profile.  It will usually be <code>null</code> for the
     *     predefined profiles.
     *     <p>
     *     If the string is recognized as a constant name for
     *     predefined color space the object will be resolved into
     *     profile obtained with
     *     <code>getInstance(int&nbsp;cspace)</code> and the profile
     *     data are ignored.  Otherwise the object will be resolved
     *     into profile obtained with
     *     <code>getInstance(byte[]&nbsp;data)</code>.
     * @see #readResolve()
     * @see #getInstance(int)
     * @see #getInstance(byte[])
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    private void writeObject(ObjectOutputStream s)

    /**
     * Writes default serializable fields to the stream.  Writes a
     * string and an array of bytes to the stream as additional data.
     *
     * @param s stream used for serialization.
     * @throws IOException
     *     thrown by <code>ObjectInputStream</code>.
     * @serialData
     *     The <code>String</code> is the name of one of
     *     <code>CS_<var>*</var></code> constants defined in the
     *     {@link ColorSpace} class if the profile object is a profile
     *     for a predefined color space (for example
     *     <code>"CS_sRGB"</code>).  The string is <code>null</code>
     *     otherwise.
     *     <p>
     *     The <code>byte[]</code> array is the profile data for the
     *     profile.  For predefined color spaces <code>null</code> is
     *     written instead of the profile data.  If in the future
     *     versions of Java API new predefined color spaces will be
     *     added, future versions of this class may choose to write
     *     for new predefined color spaces not only the color space
     *     name, but the profile data as well so that older versions
     *     could still deserialize the object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    private int iccProfileSerializedDataVersion = 1;

    /**
     * Version of the format of additional serialized data in the
     * stream.  Version&nbsp;<code>1</code> corresponds to Java&nbsp;2
     * Platform,&nbsp;v1.3.
     * @since 1.3
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    private static boolean standardProfileExists(final String fileName) {

    /**
     * Checks whether built-in profile specified by fileName exists.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    private static boolean isChildOf(File f, String dirName) {

    /**
     * Checks whether given file resides inside give directory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    private static File getStandardProfileFile(String fileName) {

    /**
     * Returns a file object corresponding to a built-in profile
     * specified by fileName.
     * If there is no built-in profile with such name, then the method
     * returns null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    short[] getTRC(int theTagSignature) {

    /**
     * Returns the TRC as an array of shorts.  If the profile has
     * specified the TRC as linear (gamma = 1.0) or as a simple gamma
     * value, this method throws an exception, and the getGamma() method
     * should be used to get the gamma value.  Otherwise the short array
     * returned here represents a lookup table where the input Gray value
     * is conceptually in the range [0.0, 1.0].  Value 0.0 maps
     * to array index 0 and value 1.0 maps to array index length-1.
     * Interpolation may be used to generate output values for
     * input values which do not map exactly to an index in the
     * array.  Output values also map linearly to the range [0.0, 1.0].
     * Value 0.0 is represented by an array value of 0x0000 and
     * value 1.0 by 0xFFFF, i.e. the values are really unsigned
     * short values, although they are returned in a short array.
     * theTagSignature should be one of icSigGrayTRCTag, icSigRedTRCTag,
     * icSigGreenTRCTag, or icSigBlueTRCTag.
     * @return a short array representing the TRC.
     * @exception ProfileDataException if the profile does not specify
     *            the TRC as a table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    float getGamma(int theTagSignature) {

    /**
     * Returns a gamma value representing a tone reproduction
     * curve (TRC).  If the profile represents the TRC as a table rather
     * than a single gamma value, then an exception is thrown.  In this
     * case the actual table can be obtained via getTRC().
     * theTagSignature should be one of icSigGrayTRCTag, icSigRedTRCTag,
     * icSigGreenTRCTag, or icSigBlueTRCTag.
     * @return the gamma value as a float.
     * @exception ProfileDataException if the profile does not specify
     *            the TRC as a single gamma value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    float[] getXYZTag(int theTagSignature) {

    /**
     * Returns a float array of length 3 containing the X, Y, and Z
     * components encoded in an XYZType tag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    float[] getMediaWhitePoint() {

    /**
     * Returns a float array of length 3 containing the X, Y, and Z
     * components of the mediaWhitePointTag in the ICC profile.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public int getNumComponents() {

    /**
     * Returns the number of color components in the "input" color
     * space of this profile.  For example if the color space type
     * of this profile is TYPE_RGB, then this method will return 3.
     *
     * @return The number of color components in the profile's input
     * color space.
     *
     * @throws ProfileDataException if color space is in the profile
     *         is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    int getRenderingIntent() {

    /**
     * Returns the rendering intent of the profile.
     * This is used to select the proper transform from a profile that
     * has multiple transforms.  It is typically set in a source profile
     * to select a transform from an output profile.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    void setRenderingIntent(int renderingIntent) {

    /**
     * Sets the rendering intent of the profile.
     * This is used to select the proper transform from a profile that
     * has multiple transforms.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public void setData(int tagSignature, byte[] tagData) {

    /**
     * Sets a particular tagged data element in the profile from
     * a byte array. The array should contain data in a format, corresponded
     * to the {@code tagSignature} as defined in the ICC specification, section 10.
     * This method is useful for advanced applets or applications which need to
     * access profile data directly.
     *
     * @param tagSignature The ICC tag signature for the data element
     * you want to set.
     * @param tagData the data to set for the specified tag signature
     * @throws IllegalArgumentException if {@code tagSignature} is not a signature
     *         as defined in the ICC specification.
     * @throws IllegalArgumentException if a content of the {@code tagData}
     *         array can not be interpreted as valid tag data, corresponding
     *         to the {@code tagSignature}.
     * @see #getData
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public byte[] getData(int tagSignature) {

    /**
     * Returns a particular tagged data element from the profile as
     * a byte array.  Elements are identified by signatures
     * as defined in the ICC specification.  The signature
     * icSigHead can be used to get the header.  This method is useful
     * for advanced applets or applications which need to access
     * profile data directly.
     *
     * @param tagSignature The ICC tag signature for the data element you
     * want to get.
     *
     * @return A byte array that contains the tagged data element. Returns
     * <code>null</code> if the specified tag doesn't exist.
     * @see #setData(int, byte[])
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public byte[] getData() {

    /**
     * Returns a byte array corresponding to the data of this ICC_Profile.
     * @return A byte array that contains the profile data.
     * @see #setData(int, byte[])
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public void write(OutputStream s) throws IOException {

    /**
     * Write this ICC_Profile to an OutputStream.
     *
     * @param s The stream to write the profile data to.
     *
     * @exception IOException If an I/O error occurs while writing to the
     * stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public void write(String fileName) throws IOException {

    /**
     * Write this ICC_Profile to a file.
     *
     * @param fileName The file to write the profile data to.
     *
     * @exception IOException If the file cannot be opened for writing
     * or an I/O error occurs while writing to the file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public int getPCSType() {

    /**
     * Returns the color space type of the Profile Connection Space (PCS).
     * Returns one of the color space type constants defined by the
     * ColorSpace class.  This is the "output" color space of the
     * profile.  For an input, display, or output profile useful
     * for tagging colors or images, this will be either TYPE_XYZ or
     * TYPE_Lab and should be interpreted as the corresponding specific
     * color space defined in the ICC specification.  For a device
     * link profile, this could be any of the color space type constants.
     * @return One of the color space type constants defined in the
     * <CODE>ColorSpace</CODE> class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public int getColorSpaceType() {

    /**
     * Returns the color space type.  Returns one of the color space type
     * constants defined by the ColorSpace class.  This is the
     * "input" color space of the profile.  The type defines the
     * number of components of the color space and the interpretation,
     * e.g. TYPE_RGB identifies a color space with three components - red,
     * green, and blue.  It does not define the particular color
     * characteristics of the space, e.g. the chromaticities of the
     * primaries.
     * @return One of the color space type constants defined in the
     * <CODE>ColorSpace</CODE> class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public int getProfileClass() {

    /**
     * Returns the profile class.
     * @return One of the predefined profile class constants.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public int getMinorVersion() {

    /**
     * Returns profile minor version.
     * @return The minor version of the profile.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public int getMajorVersion() {

    /**
     * Returns profile major version.
     * @return  The major version of the profile.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    static ICC_Profile getDeferredInstance(ProfileDeferralInfo pdi) {

    /**
     * Constructs an ICC_Profile for which the actual loading of the
     * profile data from a file and the initialization of the CMM should
     * be deferred as long as possible.
     * Deferral is only used for standard profiles.
     * If deferring is disabled, then getStandardProfile() ensures
     * that all of the appropriate access privileges are granted
     * when loading this profile.
     * If deferring is enabled, then the deferred activation
     * code will take care of access privileges.
     * @see activateDeferredProfile()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static ICC_Profile getInstance(InputStream s) throws IOException {

    /**
     * Constructs an ICC_Profile corresponding to the data in an InputStream.
     * This method throws an IllegalArgumentException if the stream does not
     * contain valid ICC Profile data.  It throws an IOException if an I/O
     * error occurs while reading the stream.
     * @param s The input stream from which to read the profile data.
     *
     * @return an <CODE>ICC_Profile</CODE> object corresponding to the
     *     data in the specified <code>InputStream</code>.
     *
     * @exception IOException If an I/O error occurs while reading the stream.
     *
     * @exception IllegalArgumentException If the stream does not
     * contain valid ICC Profile data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static ICC_Profile getInstance(String fileName) throws IOException {

    /**
     * Constructs an ICC_Profile corresponding to the data in a file.
     * fileName may be an absolute or a relative file specification.
     * Relative file names are looked for in several places: first, relative
     * to any directories specified by the java.iccprofile.path property;
     * second, relative to any directories specified by the java.class.path
     * property; finally, in a directory used to store profiles always
     * available, such as the profile for sRGB.  Built-in profiles use .pf as
     * the file name extension for profiles, e.g. sRGB.pf.
     * This method throws an IOException if the specified file cannot be
     * opened or if an I/O error occurs while reading the file.  It throws
     * an IllegalArgumentException if the file does not contain valid ICC
     * Profile data.
     * @param fileName The file that contains the data for the profile.
     *
     * @return an <code>ICC_Profile</code> object corresponding to
     *          the data in the specified file.
     * @exception IOException If the specified file cannot be opened or
     * an I/O error occurs while reading the file.
     *
     * @exception IllegalArgumentException If the file does not
     * contain valid ICC Profile data.
     *
     * @exception SecurityException If a security manager is installed
     * and it does not permit read access to the given file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static ICC_Profile getInstance (int cspace) {

    /**
     * Constructs an ICC_Profile corresponding to one of the specific color
     * spaces defined by the ColorSpace class (for example CS_sRGB).
     * Throws an IllegalArgumentException if cspace is not one of the
     * defined color spaces.
     *
     * @param cspace the type of color space to create a profile for.
     * The specified type is one of the color
     * space constants defined in the  <CODE>ColorSpace</CODE> class.
     *
     * @return an <code>ICC_Profile</code> object corresponding to
     *          the specified <code>ColorSpace</code> type.
     * @exception IllegalArgumentException If <CODE>cspace</CODE> is not
     * one of the predefined color space types.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static ICC_Profile getInstance(byte[] data) {

    /**
     * Constructs an ICC_Profile object corresponding to the data in
     * a byte array.  Throws an IllegalArgumentException if the data
     * does not correspond to a valid ICC Profile.
     * @param data the specified ICC Profile data
     * @return an <code>ICC_Profile</code> object corresponding to
     *          the data in the specified <code>data</code> array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    protected void finalize () {

    /**
     * Frees the resources associated with an ICC_Profile object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    ICC_Profile(ProfileDeferralInfo pdi) {

    /**
     * Constructs an ICC_Profile object whose loading will be deferred.
     * The ID will be 0 until the profile is loaded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    ICC_Profile(Profile p) {

    /**
     * Constructs an ICC_Profile object with a given ID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icXYZNumberX       = 8;    /* XYZNumber X */

    /**
     * ICC Profile Constant: XYZNumber X.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icCurveData        = 12;   /* curveType data */

    /**
     * ICC Profile Constant: curveType data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icCurveCount       = 8;    /* curveType count */

    /**
     * ICC Profile Constant: curveType count.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icTagReserved      = 4;    /* reserved */

    /**
     * ICC Profile Constant: reserved.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icTagType          = 0;    /* tag type signature */

    /**
     * ICC Profile Constant: tag type signaturE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrProfileID = 84; /* Profile's ID */

    /**
     * ICC Profile Header Location: profile's ID.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrCreator      = 80; /* Profile creator */

    /**
     * ICC Profile Header Location: profile creator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrIlluminant   = 68; /* Profile illuminant */

    /**
     * ICC Profile Header Location: profile illuminant.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrRenderingIntent = 64; /* Rendering intent */

    /**
     * ICC Profile Header Location: rendering intent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrAttributes   = 56; /* Device attributes */

    /**
     * ICC Profile Header Location: device attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrModel        = 52; /* Device model number */

    /**
     * ICC Profile Header Location: device model number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrManufacturer = 48; /* Device manufacturer */

    /**
     * ICC Profile Header Location: device manufacturer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrFlags        = 44; /* Various bit settings */

    /**
     * ICC Profile Header Location: various bit settings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrPlatform     = 40; /* Primary Platform */

    /**
     * ICC Profile Header Location: primary platform.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrMagic        = 36; /* icMagicNumber */

    /**
     * ICC Profile Header Location: icMagicNumber.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrDate       = 24; /* Date profile was created */

    /**
     * ICC Profile Header Location: date profile was created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrPcs          = 20; /* PCS - XYZ or Lab only */

    /**
     * ICC Profile Header Location: PCS - XYZ or Lab only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrColorSpace   = 16; /* Color space of data */

    /**
     * ICC Profile Header Location: color space of data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrDeviceClass  = 12; /* Type of profile */

    /**
     * ICC Profile Header Location: type of profile.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrVersion      = 8;  /* Format version number */

    /**
     * ICC Profile Header Location: format version number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrCmmId        = 4;  /* CMM for this profile */

    /**
     * ICC Profile Header Location: CMM for this profile.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icHdrSize         = 0;  /* Profile size in bytes */

    /**
     * ICC Profile Header Location: profile size in bytes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigColorantTableTag = 0x636C7274;    /* 'clrt' */

    /**
     * ICC Profile Tag Signature: 'clrt'.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigColorantOrderTag = 0x636C726F;    /* 'clro' */

    /**
     * ICC Profile Tag Signature: 'clro'.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigChromaticAdaptationTag = 0x63686164;/* 'chad' */

    /**
     * ICC Profile Tag Signature: 'chad'.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigChromaticityTag  = 0x6368726d;    /* 'chrm' */

    /**
     * ICC Profile Tag Signature: 'chrm'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigViewingConditionsTag = 0x76696577;/* 'view' */

    /**
     * ICC Profile Tag Signature: 'view'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigViewingCondDescTag = 0x76756564;  /* 'vued' */

    /**
     * ICC Profile Tag Signature: 'vued'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigUcrBgTag         = 0x62666420;    /* 'bfd ' */

    /**
     * ICC Profile Tag Signature: 'bfd '.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigTechnologyTag    = 0x74656368;    /* 'tech' */

    /**
     * ICC Profile Tag Signature: 'tech'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigScreeningTag     = 0x7363726E;    /* 'scrn' */

    /**
     * ICC Profile Tag Signature: 'scrn'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigScreeningDescTag = 0x73637264;    /* 'scrd' */

    /**
     * ICC Profile Tag Signature: 'scrd'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigRedTRCTag        = 0x72545243;    /* 'rTRC' */

    /**
     * ICC Profile Tag Signature: 'rTRC'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigRedMatrixColumnTag = 0x7258595A;  /* 'rXYZ' */

    /**
     * ICC Profile Tag Signature: 'rXYZ'.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigRedColorantTag   = 0x7258595A;    /* 'rXYZ' */

    /**
     * ICC Profile Tag Signature: 'rXYZ'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigPs2RenderingIntentTag = 0x70733269;

    /**
     * ICC Profile Tag Signature: 'ps2i'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigPs2CSATag        = 0x70733273;    /* 'ps2s' */

    /**
     * ICC Profile Tag Signature: 'ps2s'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigPs2CRD3Tag       = 0x70736433;    /* 'psd3' */

    /**
     * ICC Profile Tag Signature: 'psd3'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigPs2CRD2Tag       = 0x70736432;    /* 'psd2' */

    /**
     * ICC Profile Tag Signature: 'psd2'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigPs2CRD1Tag       = 0x70736431;    /* 'psd1' */

    /**
     * ICC Profile Tag Signature: 'psd1'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigPs2CRD0Tag       = 0x70736430;    /* 'psd0' */

    /**
     * ICC Profile Tag Signature: 'psd0'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigProfileSequenceDescTag = 0x70736571;

    /**
     * ICC Profile Tag Signature: 'pseq'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigProfileDescriptionTag = 0x64657363;

    /**
     * ICC Profile Tag Signature: 'desc'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigPreview2Tag      = 0x70726532;    /* 'pre2' */

    /**
     * ICC Profile Tag Signature: 'pre2'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigPreview1Tag      = 0x70726531;    /* 'pre1' */

    /**
     * ICC Profile Tag Signature: 'pre1'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigPreview0Tag      = 0x70726530;    /* 'pre0' */

    /**
     * ICC Profile Tag Signature: 'pre0'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigOutputResponseTag = 0x72657370;   /* 'resp' */

    /**
     * ICC Profile Tag Signature: 'resp'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigNamedColor2Tag   = 0x6E636C32;    /* 'ncl2' */

    /**
     * ICC Profile Tag Signature: 'ncl2'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigMediaWhitePointTag = 0x77747074;  /* 'wtpt' */

    /**
     * ICC Profile Tag Signature: 'wtpt'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigMediaBlackPointTag = 0x626B7074;  /* 'bkpt' */

    /**
     * ICC Profile Tag Signature: 'bkpt'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigMeasurementTag   = 0x6D656173;    /* 'meas' */

    /**
     * ICC Profile Tag Signature: 'meas'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigLuminanceTag     = 0x6C756d69;    /* 'lumi' */

    /**
     * ICC Profile Tag Signature: 'lumi'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigGreenTRCTag      = 0x67545243;    /* 'gTRC' */

    /**
     * ICC Profile Tag Signature: 'gTRC'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigGreenMatrixColumnTag = 0x6758595A;/* 'gXYZ' */

    /**
     * ICC Profile Tag Signature: 'gXYZ'.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigGreenColorantTag = 0x6758595A;    /* 'gXYZ' */

    /**
     * ICC Profile Tag Signature: 'gXYZ'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigGrayTRCTag       = 0x6b545243;    /* 'kTRC' */

    /**
     * ICC Profile Tag Signature: 'kTRC'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigGamutTag         = 0x67616D74;    /* 'gamt' */

    /**
     * ICC Profile Tag Signature: 'gamt'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigDeviceSettingsTag =  0x64657673;  /* 'devs' */

    /**
     * ICC Profile Tag Signature: 'devs'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigDeviceModelDescTag = 0x646D6464;  /* 'dmdd' */

    /**
     * ICC Profile Tag Signature: 'dmdd'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigDeviceMfgDescTag = 0x646D6E64;    /* 'dmnd' */

    /**
     * ICC Profile Tag Signature: 'dmnd'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigCrdInfoTag       = 0x63726469;    /* 'crdi' */

    /**
     * ICC Profile Tag Signature: 'crdi'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigCopyrightTag     = 0x63707274;    /* 'cprt' */

    /**
     * ICC Profile Tag Signature: 'cprt'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigCharTargetTag    = 0x74617267;    /* 'targ' */

    /**
     * ICC Profile Tag Signature: 'targ'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigCalibrationDateTimeTag = 0x63616C74;

    /**
     * ICC Profile Tag Signature: 'calt'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigBToA2Tag         = 0x42324132;    /* 'B2A2' */

    /**
     * ICC Profile Tag Signature: 'B2A2'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigBToA1Tag         = 0x42324131;    /* 'B2A1' */

    /**
     * ICC Profile Tag Signature: 'B2A1'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigBToA0Tag         = 0x42324130;    /* 'B2A0' */

    /**
     * ICC Profile Tag Signature: 'B2A0'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigBlueTRCTag       = 0x62545243;    /* 'bTRC' */

    /**
     * ICC Profile Tag Signature: 'bTRC'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigBlueMatrixColumnTag = 0x6258595A; /* 'bXYZ' */

    /**
     * ICC Profile Tag Signature: 'bXYZ'.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigBlueColorantTag  = 0x6258595A;    /* 'bXYZ' */

    /**
     * ICC Profile Tag Signature: 'bXYZ'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigAToB2Tag         = 0x41324232;    /* 'A2B2' */

    /**
     * ICC Profile Tag Signature: 'A2B2'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigAToB1Tag         = 0x41324231;    /* 'A2B1' */

    /**
     * ICC Profile Tag Signature: 'A2B1'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigAToB0Tag         = 0x41324230;    /* 'A2B0' */

    /**
     * ICC Profile Tag Signature: 'A2B0'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigHead      = 0x68656164; /* 'head' - special */

    /**
     * ICC Profile Tag Signature: 'head' - special.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icICCAbsoluteColorimetric = 3;

    /**
     * ICC Profile Rendering Intent: ICC-AbsoluteColorimetric.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icAbsoluteColorimetric    = 3;

    /**
     * ICC Profile Rendering Intent: AbsoluteColorimetric.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSaturation            = 2;

    /**
     * ICC Profile Rendering Intent: Saturation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icMediaRelativeColorimetric = 1;

    /**
     * ICC Profile Rendering Intent: Media-RelativeColorimetric.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icRelativeColorimetric    = 1;

    /**
     * ICC Profile Rendering Intent: RelativeColorimetric.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icPerceptual            = 0;

    /**
     * ICC Profile Rendering Intent: Perceptual.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigNamedColorClass  = 0x6e6d636c;    /* 'nmcl' */

    /**
     * ICC Profile Class Signature: 'nmcl'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigColorSpaceClass  = 0x73706163;    /* 'spac' */

    /**
     * ICC Profile Class Signature: 'spac'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigAbstractClass    = 0x61627374;    /* 'abst' */

    /**
     * ICC Profile Class Signature: 'abst'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigLinkClass        = 0x6C696E6B;    /* 'link' */

    /**
     * ICC Profile Class Signature: 'link'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigOutputClass      = 0x70727472;    /* 'prtr' */

    /**
     * ICC Profile Class Signature: 'prtr'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigDisplayClass     = 0x6D6E7472;    /* 'mntr' */

    /**
     * ICC Profile Class Signature: 'mntr'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigInputClass       = 0x73636E72;    /* 'scnr' */

    /**
     * ICC Profile Class Signature: 'scnr'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpaceFCLR        = 0x46434C52;    /* 'FCLR' */

    /**
     * ICC Profile Color Space Type Signature: 'FCLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpaceECLR        = 0x45434C52;    /* 'ECLR' */

    /**
     * ICC Profile Color Space Type Signature: 'ECLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpaceDCLR        = 0x44434C52;    /* 'DCLR' */

    /**
     * ICC Profile Color Space Type Signature: 'DCLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpaceCCLR        = 0x43434C52;    /* 'CCLR' */

    /**
     * ICC Profile Color Space Type Signature: 'CCLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpaceBCLR        = 0x42434C52;    /* 'BCLR' */

    /**
     * ICC Profile Color Space Type Signature: 'BCLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpaceACLR        = 0x41434C52;    /* 'ACLR' */

    /**
     * ICC Profile Color Space Type Signature: 'ACLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpace9CLR        = 0x39434C52;    /* '9CLR' */

    /**
     * ICC Profile Color Space Type Signature: '9CLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpace8CLR        = 0x38434C52;    /* '8CLR' */

    /**
     * ICC Profile Color Space Type Signature: '8CLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpace7CLR        = 0x37434C52;    /* '7CLR' */

    /**
     * ICC Profile Color Space Type Signature: '7CLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpace6CLR        = 0x36434C52;    /* '6CLR' */

    /**
     * ICC Profile Color Space Type Signature: '6CLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpace5CLR        = 0x35434C52;    /* '5CLR' */

    /**
     * ICC Profile Color Space Type Signature: '5CLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpace4CLR        = 0x34434C52;    /* '4CLR' */

    /**
     * ICC Profile Color Space Type Signature: '4CLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpace3CLR        = 0x33434C52;    /* '3CLR' */

    /**
     * ICC Profile Color Space Type Signature: '3CLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigSpace2CLR        = 0x32434C52;    /* '2CLR' */

    /**
     * ICC Profile Color Space Type Signature: '2CLR'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigCmyData        = 0x434D5920;    /* 'CMY ' */

    /**
     * ICC Profile Color Space Type Signature: 'CMY '.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigCmykData        = 0x434D594B;    /* 'CMYK' */

    /**
     * ICC Profile Color Space Type Signature: 'CMYK'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigHlsData        = 0x484C5320;    /* 'HLS ' */

    /**
     * ICC Profile Color Space Type Signature: 'HLS'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigHsvData        = 0x48535620;    /* 'HSV ' */

    /**
     * ICC Profile Color Space Type Signature: 'HSV'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigGrayData        = 0x47524159;    /* 'GRAY' */

    /**
     * ICC Profile Color Space Type Signature: 'GRAY'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigRgbData        = 0x52474220;    /* 'RGB ' */

    /**
     * ICC Profile Color Space Type Signature: 'RGB '.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigYxyData        = 0x59787920;    /* 'Yxy ' */

    /**
     * ICC Profile Color Space Type Signature: 'Yxy '.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigYCbCrData        = 0x59436272;    /* 'YCbr' */

    /**
     * ICC Profile Color Space Type Signature: 'YCbr'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigLuvData        = 0x4C757620;    /* 'Luv ' */

    /**
     * ICC Profile Color Space Type Signature: 'Luv '.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigLabData        = 0x4C616220;    /* 'Lab ' */

    /**
     * ICC Profile Color Space Type Signature: 'Lab '.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int icSigXYZData        = 0x58595A20;    /* 'XYZ ' */

    /**
     * ICC Profile Color Space Type Signature: 'XYZ '.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int CLASS_NAMEDCOLOR = 6;

    /**
     * Profile class is named color.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int CLASS_ABSTRACT = 5;

    /**
     * Profile class is abstract.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int CLASS_COLORSPACECONVERSION = 4;

    /**
     * Profile class is color space conversion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int CLASS_DEVICELINK = 3;

    /**
     * Profile class is device link.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int CLASS_OUTPUT = 2;

    /**
     * Profile class is output.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int CLASS_DISPLAY = 1;

    /**
     * Profile class is display.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
    public static final int CLASS_INPUT = 0;

    /**
     * Profile class is input.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/color/ICC_Profile.java
public class ICC_Profile implements Serializable {

/**
 * A representation of color profile data for device independent and
 * device dependent color spaces based on the International Color
 * Consortium Specification ICC.1:2001-12, File Format for Color Profiles,
 * (see <A href="http://www.color.org"> http://www.color.org</A>).
 * <p>
 * An ICC_ColorSpace object can be constructed from an appropriate
 * ICC_Profile.
 * Typically, an ICC_ColorSpace would be associated with an ICC
 * Profile which is either an input, display, or output profile (see
 * the ICC specification).  There are also device link, abstract,
 * color space conversion, and named color profiles.  These are less
 * useful for tagging a color or image, but are useful for other
 * purposes (in particular device link profiles can provide improved
 * performance for converting from one device's color space to
 * another's).
 * <p>
 * ICC Profiles represent transformations from the color space of
 * the profile (e.g. a monitor) to a Profile Connection Space (PCS).
 * Profiles of interest for tagging images or colors have a PCS
 * which is one of the two specific device independent
 * spaces (one CIEXYZ space and one CIELab space) defined in the
 * ICC Profile Format Specification.  Most profiles of interest
 * either have invertible transformations or explicitly specify
 * transformations going both directions.
 * @see ICC_ColorSpace
 */
