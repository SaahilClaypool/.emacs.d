_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGImageEncoder.java
        public void encode(Raster ras, JPEGEncodeParam jep)

        /**
         * Encode a Raster as a JPEG data stream.  Note that no color
         * conversion takes place.  It is required that you match the
         * Raster to the encoded COLOR_ID contained in the JPEGEncodeParam
         * object.

         * If jep is null a new JPEGEncodeParam object will be created by
         * calling getDefaultJPEGEncodeParam with ras and
         * COLOR_ID_UNKNOWN.

         * @param ras The Raster to encode.
         * @param jep The JPEGEncodeParam object used to control the encoding.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGImageEncoder.java
        public void encode(Raster ras)

        /**
         * Encode a Raster as a JPEG data stream.  Note that no color
         * conversion takes place.  It is required that you match the
         * Raster to the encoded COLOR_ID contained in the current
         * JPEGEncodeParam object.<P>

         * If no JPEGEncodeParam object has been provided yet a
         * new JPEGEncodeParam object will be created by calling
         * getDefaultJPEGEncodeParam with ras and COLOR_ID_UNKNOWN.

         * @param ras The Raster to encode.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGImageEncoder.java
        public JPEGEncodeParam getDefaultJPEGEncodeParam(JPEGDecodeParam jdp)

        /**
         * This is a factory method for creating a JPEGEncodeParam from a
         * JPEGDecodeParam.  This will return a new JPEGEncodeParam object
         * that is initialized from the JPEGDecodeParam object.  All major
         * pieces of information will be initialized from the DecodeParam
         * (Markers, Tables, mappings).
         * @param jdp The JPEGDecodeParam object to copy.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGImageEncoder.java
        public JPEGEncodeParam getDefaultJPEGEncodeParam(int numBands,
                                                         int colorID)

        /**
          * This is a factory method for creating JPEGEncodeParam objects.  It
          * is the users responsiblity to match the colorID with the given
          * number of bands, which should match the data being encoded.
          * Failure to do so may lead to poor compression and/or poor image
          * quality.  If you don't understand much about JPEG it is strongly
          * recommended that you stick to the BufferedImage interface.
          *
          * @param numBands the number of bands that will be encoded (max of
          * four).
          * @param colorID the COLOR_ID for the encoded data.  This is used to
          * set reasonable defaults in the parameter object.  This must match
          * the number of bands given.
          */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGImageEncoder.java
        public JPEGEncodeParam getDefaultJPEGEncodeParam(Raster ras, int colorID)

        /**
         * This is a factory method for creating JPEGEncodeParam objects.
         * It is the users responsiblity to match the colorID with the
         * data contained in the Raster.  Failure to do so may lead to
         * either poor compression or poor image quality.  If you don't
         * understand much about JPEG it is strongly reccomended that you
         * stick to the BufferedImage interfaces.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGImageEncoder.java
        public int getDefaultColorId(ColorModel cm);

        /**
         * Returns the 'default' encoded COLOR_ID for a given ColorModel.
         * This method is not needed in the simple case of encoding
         * Buffered Images (the library will figure things out for you).
         * It can be useful for encoding Rasters.  To determine what needs
         * to be done to the image prior to encoding.

         * @param cm The ColorModel to map to an jpeg encoded COLOR_ID.
         * @return The default mapping of cm to a jpeg Color_ID note that
         * in a few cases color conversion is required.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGImageEncoder.java
        public void encode(BufferedImage bi, JPEGEncodeParam jep)

        /**
         * Encode a BufferedImage as a JPEG data stream.  Note, some color
         * conversions may takes place.  The jep's encoded COLOR_ID should
         * match the value returned by getDefaultColorID when given the
         * BufferedImage's ColorModel.<P>

         * This call also sets the current JPEGEncodeParam object.  The
         * given JPEGEncodeParam object will be used for this and future
         * encodings.  If jep is null then a new JPEGEncodeParam object
         * will be created by calling getDefaultJPEGEncodeParam with bi.

         * @param bi  The BufferedImage to encode.
         * @param jep The JPEGEncodeParam object used to control the encoding.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGImageEncoder.java
        public void encode(BufferedImage bi)

        /**
         * Encode a BufferedImage as a JPEG data stream.  Note, some color
         * conversions may takes place.  The current JPEGEncodeParam's
         * encoded COLOR_ID should match the value returned by
         * getDefaultColorID when given the BufferedImage's ColorModel.<P>

         * If no JPEGEncodeParam object has been provided yet a default
         * one will be created by calling getDefaultJPEGEncodeParam with
         * bi.

         * @param bi The BufferedImage to encode.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGImageEncoder.java
        public JPEGEncodeParam getDefaultJPEGEncodeParam(BufferedImage bi)

        /**
         * This is a factory method for creating JPEGEncodeParam objects.
         * The returned object will do a credible job of encoding the
         * given BufferedImage.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGImageEncoder.java
        public JPEGEncodeParam getJPEGEncodeParam();

        /**
         * This returns a copy of the current JPEGEncodeParam object, if
         * you want changes to affect the encoding process you must 'set'
         * it back into the encoder (either through setJPEGEncodeParam or
         * by providing the modified param object in the call to encode.
         * @return A copy of the current JPEGEncodeParam object
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGImageEncoder.java
        public void setJPEGEncodeParam(JPEGEncodeParam jep);

        /**
         * Set the JPEGEncodeParam object that is to be used for future
         * encoding operations. 'jep' is copied so changes will not be
         * tracked, unless you call this method again.
         * @param jep The JPEGEncodeParam object to use for future encodings.
         *
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGImageEncoder.java
        public OutputStream getOutputStream();

        /**
         * Return the stream the Encoder is currenlt associated with.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGImageEncoder.java
public interface JPEGImageEncoder {

/**
 * JPEGImageEncoder encodes buffers of image data into JPEG data
 * streams.  Users of this interface are required to provide image data in
 * a Raster or a BufferedImage, set the necessary parameters in the
 * JPEGEncodeParams object and successfully open the
 * <code>OutputStream</code> that is the destination of the encoded
 * JPEG stream.
 *
 * The JPEGImageEncoder interface can encode image data into interchange,
 * and abbreviated JPEG data streams that are written to the
 * OutputStream provided to the encoder.
 * <p>
 * Note that the classes in the com.sun.image.codec.jpeg package are not
 * part of the core Java APIs.  They are a part of Sun's JDK and JRE
 * distributions.  Although other licensees may choose to distribute these
 * classes, developers cannot depend on their availability in non-Sun
 * implementations.  We expect that equivalent functionality will eventually
 * be available in a core API or standard extension.
 * <p>
 *
 * @see         JPEGCodec
 * @see         JPEGEncodeParam
 * @see         Raster
 * @see         BufferedImage
 * @see         OutputStream
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGImageEncoder.java
import java.io.OutputStream;

/**
 * JPEGImageEncoder Interface
 *
 * JPEGImageEncoder compresses images into JPEG data streams and
 * writes the JPEG stream to an OutputStream.  Image data that is to
 * be encoded can be passed in as a Raster of image data or as a
 * BufferedImage.  Encoding or the image data into the output JPEG
 * stream is controlled by the parameters setting found in the
 * JPEGEncodeParam object.<P>
 *
 * ColorSpace comments: First off JPEG by specification is color
 * blind!  That said, this interface will perform some color space
 * conversion in the name of better compression ratios.  There is no
 * explicit mechanism in the JPEGEncodeParam interface for controlling
 * the Encoded ColorSpace of the data when it is written to the JPEG
 * data stream.  If an approriate colorspace setting is not already
 * defined it is recommended that colorspace unknown is used.  Some
 * updates to the standard color space designations have been made to
 * allow this decoder to handle alpha channels.  See the
 * JPEGEncodeParam description for more details on additional color
 * space designations ( @see JPEGEncodeParam ).<P>
 *
 * This encoder will process interchange, and abbreviated JPEG
 * streams.
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGImageEncoder.java
package com.sun.image.codec.jpeg;

/**********************************************************************
 **********************************************************************
 **********************************************************************
 *** COPYRIGHT (c) 1997-1998 Eastman Kodak Company.                 ***
 *** As  an unpublished  work pursuant to Title 17 of the United    ***
 *** States Code.  All rights reserved.                             ***
 **********************************************************************
 **********************************************************************
 **********************************************************************/
