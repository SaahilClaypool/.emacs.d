_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGCodec.java
        public static JPEGEncodeParam getDefaultJPEGEncodeParam(JPEGDecodeParam jdp)

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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGCodec.java
        public static JPEGEncodeParam getDefaultJPEGEncodeParam(int numBands,
                                                                int colorID)

        /**
          * This is a factory method for creating JPEGEncodeParam objects.  It
          * is the users responsiblity to match the colorID with the given
          * number of bands, which should match the data being encoded.
          * Failure to do so may lead to poor compression and/or poor image
          * quality.  If you don't understand much about JPEG it is strongly
          * recommended that you stick to the BufferedImage interface.
          *
          * This can also be used as a factory for a JPEGDecodeParam object.
          * However this usage is extremely rare, as one needs to be decoding
          * abbreviated JPEG streams where the JPEG tables are coming from
          * some source other than a JPEG tables only stream.
          *
          * @param numBands the number of bands that will be encoded (max of four).
          * @param colorID the COLOR_ID for the encoded data.  This is used to
          * set reasonable defaults in the parameter object.  This must match
          * the number of bands given.
          */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGCodec.java
        public static JPEGEncodeParam getDefaultJPEGEncodeParam(Raster ras,
                                                                int colorID)

        /**
          * This is a factory method for creating JPEGEncodeParam objects.
          * It is the users responsiblity to match the colorID with the
          * data contained in the Raster.  Failure to do so may lead to
          * either poor compression or poor image quality.  If you don't
          * understand much about JPEG it is strongly recommended that you
          * stick to the BufferedImage interface.
          * @param ras Raster that is similar to those to be encoded later.
          * @param colorID the COLOR_ID for the encoded data.  This should
          *        match the data in the raster.
          */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGCodec.java
        public static JPEGEncodeParam getDefaultJPEGEncodeParam(BufferedImage bi)

        /**
          * This is a factory method for creating JPEGEncodeParam objects.
          * The returned object should do a credible job of encoding the
          * given BufferedImage.
          * @param bi A BufferedImage that is similar to the BufferedImage(s)
          * that will encoded using the returned JPEGEncodeParam object.
          */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGCodec.java
        public static JPEGImageEncoder createJPEGEncoder(OutputStream dest,
                                                                                                         JPEGEncodeParam jep) {

        /**
         * This creates an instance of a JPEGImageEncoder that can be used
         * to encode image data as JPEG Data streams.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGCodec.java
        public static JPEGImageEncoder createJPEGEncoder(OutputStream dest) {

        /**
         * This creates an instance of a JPEGImageEncoder that can be used
         * to encode image data as JPEG Data streams.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGCodec.java
        public static JPEGImageDecoder createJPEGDecoder(InputStream src,
                                                                                                         JPEGDecodeParam jdp) {

        /**
         * This creates an instance of a JPEGImageDecoder that can be used
         * to decode JPEG Data streams.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGCodec.java
        public static JPEGImageDecoder createJPEGDecoder(InputStream src) {

        /**
         * This creates an instance of a JPEGImageDecoder that can be used
         * to decode JPEG Data streams.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGCodec.java
public class JPEGCodec {

/**
 * This class is a factory for implementations of the JPEG Image
 * Decoder/Encoder.
 * <p>
 * Note that the classes in the com.sun.image.codec.jpeg package are not
 * part of the core Java APIs.  They are a part of Sun's JDK and JRE
 * distributions.  Although other licensees may choose to distribute these
 * classes, developers cannot depend on their availability in non-Sun
 * implementations.  We expect that equivalent functionality will eventually
 * be available in a core API or standard extension.
 * <p>
 *
 * @see JPEGImageDecoder
 * @see JPEGImageEncoder
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGCodec.java
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
