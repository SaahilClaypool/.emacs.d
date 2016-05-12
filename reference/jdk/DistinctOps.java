_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/DistinctOps.java
    static <T> ReferencePipeline<T, T> makeRef(AbstractPipeline<?, T, ?> upstream) {

    /**
     * Appends a "distinct" operation to the provided stream, and returns the
     * new stream.
     *
     * @param <T> the type of both input and output elements
     * @param upstream a reference stream with element type T
     * @return the new stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/DistinctOps.java
final class DistinctOps {

/**
 * Factory methods for transforming streams into duplicate-free streams, using
 * {@link Object#equals(Object)} to determine equality.
 *
 * @since 1.8
 */
