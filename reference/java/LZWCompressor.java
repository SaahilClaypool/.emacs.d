_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/common/LZWCompressor.java
    public void compress(byte[] buf, int offset, int length)

    /**
     * @param buf data to be compressed to output stream
     * @exception IOException if underlying output stream error
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/common/LZWCompressor.java
    public LZWCompressor(ImageOutputStream out, int codeSize, boolean TIFF)

    /**
     * @param out destination for compressed data
     * @param codeSize the initial code size for the LZW compressor
     * @param TIFF flag indicating that TIFF lzw fudge needs to be applied
     * @exception IOException if underlying output stream error
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/common/LZWCompressor.java
    boolean tiffFudge;

    /** modify the limits of the code values in LZW encoding due to TIFF bug / feature **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/common/LZWCompressor.java
    LZWStringTable lzss;

    /** general purpose LZW string table **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/common/LZWCompressor.java
    BitFile bf;

    /** output destination for bit codes **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/common/LZWCompressor.java
    short prefix;

    /** the prefix code which represents the predecessor string to current input point **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/common/LZWCompressor.java
    int limit;

    /** limit at which current number of bits code size has to be increased **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/common/LZWCompressor.java
    int numBits;

    /** current number bits output for each code **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/common/LZWCompressor.java
    int endOfInfo;

    /** reserved end of data code based on code size **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/common/LZWCompressor.java
    int clearCode;

    /** reserved clear code based on code size **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/common/LZWCompressor.java
    int codeSize;

    /** base underlying code size of data being compressed 8 for TIFF, 1 to 8 for GIF **/
