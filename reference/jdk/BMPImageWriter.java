_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/bmp/BMPImageWriter.java
                    }

                        runCount = -1;/// Only EOF required now
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/bmp/BMPImageWriter.java
                        }

                            runCount = -1;/// Only EOF required now
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/bmp/BMPImageWriter.java
                stream.writeByte(0);

                /// EOF scanline
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/bmp/BMPImageWriter.java
                    stream.writeByte(runCount);

                    /// If there was an existing run
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/bmp/BMPImageWriter.java
                    stream.writeByte(runCount-1);

                    /// Only 255 values permitted
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/bmp/BMPImageWriter.java
                    for (int b=0;b<absVal;b++){

                    /// Absolute Encoding for less than 3
                    /// treated as regular encoding
                    /// Do not include the last element since it will
                    /// be inclued in the next encoding/run
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/bmp/BMPImageWriter.java
                    stream.writeByte(0);

                    /// Check if there was an existing Absolute Run
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/bmp/BMPImageWriter.java
    public BMPImageWriter(ImageWriterSpi originator) {

    /** Constructs <code>BMPImageWriter</code> based on the provided
     *  <code>ImageWriterSpi</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/bmp/BMPImageWriter.java
public class BMPImageWriter extends ImageWriter implements BMPConstants {

/**
 * The Java Image IO plugin writer for encoding a binary RenderedImage into
 * a BMP format.
 *
 * The encoding process may clip, subsample using the parameters
 * specified in the <code>ImageWriteParam</code>.
 *
 * @see javax.imageio.plugins.bmp.BMPImageWriteParam
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/bmp/BMPImageWriter.java
                    }

                        runCount = -1;/// Only EOF required now
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/bmp/BMPImageWriter.java
                        }

                            runCount = -1;/// Only EOF required now
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/bmp/BMPImageWriter.java
                stream.writeByte(0);

                /// EOF scanline
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/bmp/BMPImageWriter.java
                    stream.writeByte(runCount);

                    /// If there was an existing run
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/bmp/BMPImageWriter.java
                    stream.writeByte(runCount-1);

                    /// Only 255 values permitted
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/bmp/BMPImageWriter.java
                    for (int b=0;b<absVal;b++){

                    /// Absolute Encoding for less than 3
                    /// treated as regular encoding
                    /// Do not include the last element since it will
                    /// be inclued in the next encoding/run
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/bmp/BMPImageWriter.java
                    stream.writeByte(0);

                    /// Check if there was an existing Absolute Run
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/bmp/BMPImageWriter.java
    public BMPImageWriter(ImageWriterSpi originator) {

    /** Constructs <code>BMPImageWriter</code> based on the provided
     *  <code>ImageWriterSpi</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/bmp/BMPImageWriter.java
public class BMPImageWriter extends ImageWriter implements BMPConstants {

/**
 * The Java Image IO plugin writer for encoding a binary RenderedImage into
 * a BMP format.
 *
 * The encoding process may clip, subsample using the parameters
 * specified in the <code>ImageWriteParam</code>.
 *
 * @see javax.imageio.plugins.bmp.BMPImageWriteParam
 */
