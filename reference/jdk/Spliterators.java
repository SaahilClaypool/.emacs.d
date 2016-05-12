_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        public DoubleIteratorSpliterator(PrimitiveIterator.OfDouble iterator, int characteristics) {

        /**
         * Creates a spliterator using the given iterator for a
         * source of unknown size, reporting the given
         * characteristics.
         *
         * @param iterator the iterator for the source
         * @param characteristics properties of this spliterator's
         * source or elements.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        public DoubleIteratorSpliterator(PrimitiveIterator.OfDouble iterator, long size, int characteristics) {

        /**
         * Creates a spliterator using the given iterator
         * for traversal, and reporting the given initial size
         * and characteristics.
         *
         * @param iterator the iterator for the source
         * @param size the number of elements in the source
         * @param characteristics properties of this spliterator's
         * source or elements.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        public LongIteratorSpliterator(PrimitiveIterator.OfLong iterator, int characteristics) {

        /**
         * Creates a spliterator using the given iterator for a
         * source of unknown size, reporting the given
         * characteristics.
         *
         * @param iterator the iterator for the source
         * @param characteristics properties of this spliterator's
         * source or elements.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        public LongIteratorSpliterator(PrimitiveIterator.OfLong iterator, long size, int characteristics) {

        /**
         * Creates a spliterator using the given iterator
         * for traversal, and reporting the given initial size
         * and characteristics.
         *
         * @param iterator the iterator for the source
         * @param size the number of elements in the source
         * @param characteristics properties of this spliterator's
         * source or elements.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        public IntIteratorSpliterator(PrimitiveIterator.OfInt iterator, int characteristics) {

        /**
         * Creates a spliterator using the given iterator for a
         * source of unknown size, reporting the given
         * characteristics.
         *
         * @param iterator the iterator for the source
         * @param characteristics properties of this spliterator's
         * source or elements.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        public IntIteratorSpliterator(PrimitiveIterator.OfInt iterator, long size, int characteristics) {

        /**
         * Creates a spliterator using the given iterator
         * for traversal, and reporting the given initial size
         * and characteristics.
         *
         * @param iterator the iterator for the source
         * @param size the number of elements in the source
         * @param characteristics properties of this spliterator's
         * source or elements.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    static final class IntIteratorSpliterator implements Spliterator.OfInt {

    /**
     * A Spliterator.OfInt using a given IntStream.IntIterator for element
     * operations. The spliterator implements {@code trySplit} to
     * permit limited parallelism.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        public IteratorSpliterator(Iterator<? extends T> iterator, int characteristics) {

        /**
         * Creates a spliterator using the given iterator
         * for traversal, and reporting the given initial size
         * and characteristics.
         *
         * @param iterator the iterator for the source
         * @param characteristics properties of this spliterator's
         * source or elements.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        public IteratorSpliterator(Iterator<? extends T> iterator, long size, int characteristics) {

        /**
         * Creates a spliterator using the given iterator
         * for traversal, and reporting the given initial size
         * and characteristics.
         *
         * @param iterator the iterator for the source
         * @param size the number of elements in the source
         * @param characteristics properties of this spliterator's
         * source or elements.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        public IteratorSpliterator(Collection<? extends T> collection, int characteristics) {

        /**
         * Creates a spliterator using the given given
         * collection's {@link java.util.Collection#iterator()) for traversal,
         * and reporting its {@link java.util.Collection#size()) as its initial
         * size.
         *
         * @param c the collection
         * @param characteristics properties of this spliterator's
         *        source or elements.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    static class IteratorSpliterator<T> implements Spliterator<T> {

    /**
     * A Spliterator using a given Iterator for element
     * operations. The spliterator implements {@code trySplit} to
     * permit limited parallelism.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        @Override

        /**
         * {@inheritDoc}
         *
         * @implSpec
         * This implementation returns the characteristics as reported when
         * created.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        @Override

        /**
         * {@inheritDoc}
         *
         * @implSpec
         * This implementation returns the estimated size as reported when
         * created and, if the estimate size is known, decreases in size when
         * split.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        @Override

        /**
         * {@inheritDoc}
         *
         * This implementation permits limited parallelism.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        protected AbstractDoubleSpliterator(long est, int additionalCharacteristics) {

        /**
         * Creates a spliterator reporting the given estimated size and
         * characteristics.
         *
         * @param est the estimated size of this spliterator if known, otherwise
         *        {@code Long.MAX_VALUE}.
         * @param additionalCharacteristics properties of this spliterator's
         *        source or elements.  If {@code SIZED} is reported then this
         *        spliterator will additionally report {@code SUBSIZED}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static abstract class AbstractDoubleSpliterator implements Spliterator.OfDouble {

    /**
     * An abstract {@code Spliterator.OfDouble} that implements
     * {@code trySplit} to permit limited parallelism.
     *
     * <p>To implement a spliterator an extending class need only
     * implement {@link #tryAdvance(java.util.function.DoubleConsumer)}
     * tryAdvance}.  The extending class should override
     * {@link #forEachRemaining(java.util.function.DoubleConsumer)} forEach} if
     * it can provide a more performant implementation.
     *
     * @apiNote
     * This class is a useful aid for creating a spliterator when it is not
     * possible or difficult to efficiently partition elements in a manner
     * allowing balanced parallel computation.
     *
     * <p>An alternative to using this class, that also permits limited
     * parallelism, is to create a spliterator from an iterator
     * (see {@link #spliterator(java.util.PrimitiveIterator.OfDouble, long, int)}.
     * Depending on the circumstances using an iterator may be easier or more
     * convenient than extending this class. For example, if there is already an
     * iterator available to use then there is no need to extend this class.
     *
     * @see #spliterator(java.util.PrimitiveIterator.OfDouble, long, int)
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        @Override

        /**
         * {@inheritDoc}
         *
         * @implSpec
         * This implementation returns the characteristics as reported when
         * created.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        @Override

        /**
         * {@inheritDoc}
         *
         * @implSpec
         * This implementation returns the estimated size as reported when
         * created and, if the estimate size is known, decreases in size when
         * split.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        @Override

        /**
         * {@inheritDoc}
         *
         * This implementation permits limited parallelism.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        protected AbstractLongSpliterator(long est, int additionalCharacteristics) {

        /**
         * Creates a spliterator reporting the given estimated size and
         * characteristics.
         *
         * @param est the estimated size of this spliterator if known, otherwise
         *        {@code Long.MAX_VALUE}.
         * @param additionalCharacteristics properties of this spliterator's
         *        source or elements.  If {@code SIZED} is reported then this
         *        spliterator will additionally report {@code SUBSIZED}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static abstract class AbstractLongSpliterator implements Spliterator.OfLong {

    /**
     * An abstract {@code Spliterator.OfLong} that implements {@code trySplit}
     * to permit limited parallelism.
     *
     * <p>To implement a spliterator an extending class need only
     * implement {@link #tryAdvance(java.util.function.LongConsumer)}
     * tryAdvance}.  The extending class should override
     * {@link #forEachRemaining(java.util.function.LongConsumer)} forEach} if it
     * can provide a more performant implementation.
     *
     * @apiNote
     * This class is a useful aid for creating a spliterator when it is not
     * possible or difficult to efficiently partition elements in a manner
     * allowing balanced parallel computation.
     *
     * <p>An alternative to using this class, that also permits limited
     * parallelism, is to create a spliterator from an iterator
     * (see {@link #spliterator(java.util.PrimitiveIterator.OfLong, long, int)}.
     * Depending on the circumstances using an iterator may be easier or more
     * convenient than extending this class. For example, if there is already an
     * iterator available to use then there is no need to extend this class.
     *
     * @see #spliterator(java.util.PrimitiveIterator.OfLong, long, int)
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        @Override

        /**
         * {@inheritDoc}
         *
         * @implSpec
         * This implementation returns the characteristics as reported when
         * created.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        @Override

        /**
         * {@inheritDoc}
         *
         * @implSpec
         * This implementation returns the estimated size as reported when
         * created and, if the estimate size is known, decreases in size when
         * split.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        @Override

        /**
         * {@inheritDoc}
         *
         * This implementation permits limited parallelism.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        protected AbstractIntSpliterator(long est, int additionalCharacteristics) {

        /**
         * Creates a spliterator reporting the given estimated size and
         * characteristics.
         *
         * @param est the estimated size of this spliterator if known, otherwise
         *        {@code Long.MAX_VALUE}.
         * @param additionalCharacteristics properties of this spliterator's
         *        source or elements.  If {@code SIZED} is reported then this
         *        spliterator will additionally report {@code SUBSIZED}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static abstract class AbstractIntSpliterator implements Spliterator.OfInt {

    /**
     * An abstract {@code Spliterator.OfInt} that implements {@code trySplit} to
     * permit limited parallelism.
     *
     * <p>To implement a spliterator an extending class need only
     * implement {@link #tryAdvance(java.util.function.IntConsumer)}
     * tryAdvance}.  The extending class should override
     * {@link #forEachRemaining(java.util.function.IntConsumer)} forEach} if it
     * can provide a more performant implementation.
     *
     * @apiNote
     * This class is a useful aid for creating a spliterator when it is not
     * possible or difficult to efficiently partition elements in a manner
     * allowing balanced parallel computation.
     *
     * <p>An alternative to using this class, that also permits limited
     * parallelism, is to create a spliterator from an iterator
     * (see {@link #spliterator(java.util.PrimitiveIterator.OfInt, long, int)}.
     * Depending on the circumstances using an iterator may be easier or more
     * convenient than extending this class. For example, if there is already an
     * iterator available to use then there is no need to extend this class.
     *
     * @see #spliterator(java.util.PrimitiveIterator.OfInt, long, int)
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        @Override

        /**
         * {@inheritDoc}
         *
         * @implSpec
         * This implementation returns the characteristics as reported when
         * created.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        @Override

        /**
         * {@inheritDoc}
         *
         * @implSpec
         * This implementation returns the estimated size as reported when
         * created and, if the estimate size is known, decreases in size when
         * split.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        @Override

        /**
         * {@inheritDoc}
         *
         * This implementation permits limited parallelism.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        protected AbstractSpliterator(long est, int additionalCharacteristics) {

        /**
         * Creates a spliterator reporting the given estimated size and
         * additionalCharacteristics.
         *
         * @param est the estimated size of this spliterator if known, otherwise
         *        {@code Long.MAX_VALUE}.
         * @param additionalCharacteristics properties of this spliterator's
         *        source or elements.  If {@code SIZED} is reported then this
         *        spliterator will additionally report {@code SUBSIZED}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static abstract class AbstractSpliterator<T> implements Spliterator<T> {

    /**
     * An abstract {@code Spliterator} that implements {@code trySplit} to
     * permit limited parallelism.
     *
     * <p>An extending class need only
     * implement {@link #tryAdvance(java.util.function.Consumer) tryAdvance}.
     * The extending class should override
     * {@link #forEachRemaining(java.util.function.Consumer) forEach} if it can
     * provide a more performant implementation.
     *
     * @apiNote
     * This class is a useful aid for creating a spliterator when it is not
     * possible or difficult to efficiently partition elements in a manner
     * allowing balanced parallel computation.
     *
     * <p>An alternative to using this class, that also permits limited
     * parallelism, is to create a spliterator from an iterator
     * (see {@link #spliterator(Iterator, long, int)}.  Depending on the
     * circumstances using an iterator may be easier or more convenient than
     * extending this class, such as when there is already an iterator
     * available to use.
     *
     * @see #spliterator(Iterator, long, int)
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        public DoubleArraySpliterator(double[] array, int origin, int fence, int additionalCharacteristics) {

        /**
         * Creates a spliterator covering the given array and range
         * @param array the array, assumed to be unmodified during use
         * @param origin the least index (inclusive) to cover
         * @param fence one past the greatest index to cover
         * @param additionalCharacteristics Additional spliterator characteristics
         *        of this spliterator's source or elements beyond {@code SIZED} and
         *        {@code SUBSIZED} which are are always reported
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        public DoubleArraySpliterator(double[] array, int additionalCharacteristics) {

        /**
         * Creates a spliterator covering all of the given array.
         * @param array the array, assumed to be unmodified during use
         * @param additionalCharacteristics Additional spliterator characteristics
         *        of this spliterator's source or elements beyond {@code SIZED} and
         *        {@code SUBSIZED} which are are always reported
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    static final class DoubleArraySpliterator implements Spliterator.OfDouble {

    /**
     * A Spliterator.OfDouble designed for use by sources that traverse and split
     * elements maintained in an unmodifiable {@code int[]} array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        public LongArraySpliterator(long[] array, int origin, int fence, int additionalCharacteristics) {

        /**
         * Creates a spliterator covering the given array and range
         * @param array the array, assumed to be unmodified during use
         * @param origin the least index (inclusive) to cover
         * @param fence one past the greatest index to cover
         * @param additionalCharacteristics Additional spliterator characteristics
         *        of this spliterator's source or elements beyond {@code SIZED} and
         *        {@code SUBSIZED} which are are always reported
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        public LongArraySpliterator(long[] array, int additionalCharacteristics) {

        /**
         * Creates a spliterator covering all of the given array.
         * @param array the array, assumed to be unmodified during use
         * @param additionalCharacteristics Additional spliterator characteristics
         *        of this spliterator's source or elements beyond {@code SIZED} and
         *        {@code SUBSIZED} which are are always reported
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    static final class LongArraySpliterator implements Spliterator.OfLong {

    /**
     * A Spliterator.OfLong designed for use by sources that traverse and split
     * elements maintained in an unmodifiable {@code int[]} array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        public IntArraySpliterator(int[] array, int origin, int fence, int additionalCharacteristics) {

        /**
         * Creates a spliterator covering the given array and range
         * @param array the array, assumed to be unmodified during use
         * @param origin the least index (inclusive) to cover
         * @param fence one past the greatest index to cover
         * @param additionalCharacteristics Additional spliterator characteristics
         *        of this spliterator's source or elements beyond {@code SIZED} and
         *        {@code SUBSIZED} which are are always reported
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        public IntArraySpliterator(int[] array, int additionalCharacteristics) {

        /**
         * Creates a spliterator covering all of the given array.
         * @param array the array, assumed to be unmodified during use
         * @param additionalCharacteristics Additional spliterator characteristics
         *        of this spliterator's source or elements beyond {@code SIZED} and
         *        {@code SUBSIZED} which are are always reported
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    static final class IntArraySpliterator implements Spliterator.OfInt {

    /**
     * A Spliterator.OfInt designed for use by sources that traverse and split
     * elements maintained in an unmodifiable {@code int[]} array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        public ArraySpliterator(Object[] array, int origin, int fence, int additionalCharacteristics) {

        /**
         * Creates a spliterator covering the given array and range
         * @param array the array, assumed to be unmodified during use
         * @param origin the least index (inclusive) to cover
         * @param fence one past the greatest index to cover
         * @param additionalCharacteristics Additional spliterator characteristics
         * of this spliterator's source or elements beyond {@code SIZED} and
         * {@code SUBSIZED} which are are always reported
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
        public ArraySpliterator(Object[] array, int additionalCharacteristics) {

        /**
         * Creates a spliterator covering all of the given array.
         * @param array the array, assumed to be unmodified during use
         * @param additionalCharacteristics Additional spliterator characteristics
         * of this spliterator's source or elements beyond {@code SIZED} and
         * {@code SUBSIZED} which are are always reported
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    static final class ArraySpliterator<T> implements Spliterator<T> {

    /**
     * A Spliterator designed for use by sources that traverse and split
     * elements maintained in an unmodifiable {@code Object[]} array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static PrimitiveIterator.OfDouble iterator(Spliterator.OfDouble spliterator) {

    /**
     * Creates an {@code PrimitiveIterator.OfDouble} from a
     * {@code Spliterator.OfDouble}.
     *
     * <p>Traversal of elements should be accomplished through the iterator.
     * The behaviour of traversal is undefined if the spliterator is operated
     * after the iterator is returned.
     *
     * @param spliterator The spliterator
     * @return An iterator
     * @throws NullPointerException if the given spliterator is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static PrimitiveIterator.OfLong iterator(Spliterator.OfLong spliterator) {

    /**
     * Creates an {@code PrimitiveIterator.OfLong} from a
     * {@code Spliterator.OfLong}.
     *
     * <p>Traversal of elements should be accomplished through the iterator.
     * The behaviour of traversal is undefined if the spliterator is operated
     * after the iterator is returned.
     *
     * @param spliterator The spliterator
     * @return An iterator
     * @throws NullPointerException if the given spliterator is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static PrimitiveIterator.OfInt iterator(Spliterator.OfInt spliterator) {

    /**
     * Creates an {@code PrimitiveIterator.OfInt} from a
     * {@code Spliterator.OfInt}.
     *
     * <p>Traversal of elements should be accomplished through the iterator.
     * The behaviour of traversal is undefined if the spliterator is operated
     * after the iterator is returned.
     *
     * @param spliterator The spliterator
     * @return An iterator
     * @throws NullPointerException if the given spliterator is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static<T> Iterator<T> iterator(Spliterator<? extends T> spliterator) {

    /**
     * Creates an {@code Iterator} from a {@code Spliterator}.
     *
     * <p>Traversal of elements should be accomplished through the iterator.
     * The behaviour of traversal is undefined if the spliterator is operated
     * after the iterator is returned.
     *
     * @param <T> Type of elements
     * @param spliterator The spliterator
     * @return An iterator
     * @throws NullPointerException if the given spliterator is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static Spliterator.OfDouble spliteratorUnknownSize(PrimitiveIterator.OfDouble iterator,
                                                              int characteristics) {

    /**
     * Creates a {@code Spliterator.OfDouble} using a given
     * {@code DoubleStream.DoubleIterator} as the source of elements, with no
     * initial size estimate.
     *
     * <p>The spliterator is not
     * <em><a href="Spliterator.html#binding">late-binding</a></em>, inherits
     * the <em>fail-fast</em> properties of the iterator, and implements
     * {@code trySplit} to permit limited parallelism.
     *
     * <p>Traversal of elements should be accomplished through the spliterator.
     * The behaviour of splitting and traversal is undefined if the iterator is
     * operated on after the spliterator is returned.
     *
     * @param iterator The iterator for the source
     * @param characteristics Characteristics of this spliterator's source
     *        or elements ({@code SIZED} and {@code SUBSIZED}, if supplied, are
     *        ignored and are not reported.)
     * @return A spliterator from an iterator
     * @throws NullPointerException if the given iterator is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static Spliterator.OfDouble spliterator(PrimitiveIterator.OfDouble iterator,
                                                   long size,
                                                   int characteristics) {

    /**
     * Creates a {@code Spliterator.OfDouble} using a given
     * {@code DoubleStream.DoubleIterator} as the source of elements, and with a
     * given initially reported size.
     *
     * <p>The spliterator is not
     * <em><a href="Spliterator.html#binding">late-binding</a></em>, inherits
     * the <em>fail-fast</em> properties of the iterator, and implements
     * {@code trySplit} to permit limited parallelism.
     *
     * <p>Traversal of elements should be accomplished through the spliterator.
     * The behaviour of splitting and traversal is undefined if the iterator is
     * operated on after the spliterator is returned, or the initially reported
     * size is not equal to the actual number of elements in the source.
     *
     * @param iterator The iterator for the source
     * @param size The number of elements in the source, to be reported as
     *        initial {@code estimateSize}
     * @param characteristics Characteristics of this spliterator's source or
     *        elements.  The characteristics {@code SIZED} and {@code SUBSIZED}
     *        are additionally reported unless {@code CONCURRENT} is supplied.
     * @return A spliterator from an iterator
     * @throws NullPointerException if the given iterator is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static Spliterator.OfLong spliteratorUnknownSize(PrimitiveIterator.OfLong iterator,
                                                            int characteristics) {

    /**
     * Creates a {@code Spliterator.OfLong} using a given
     * {@code LongStream.LongIterator} as the source of elements, with no
     * initial size estimate.
     *
     * <p>The spliterator is not
     * <em><a href="Spliterator.html#binding">late-binding</a></em>, inherits
     * the <em>fail-fast</em> properties of the iterator, and implements
     * {@code trySplit} to permit limited parallelism.
     *
     * <p>Traversal of elements should be accomplished through the spliterator.
     * The behaviour of splitting and traversal is undefined if the iterator is
     * operated on after the spliterator is returned.
     *
     * @param iterator The iterator for the source
     * @param characteristics Characteristics of this spliterator's source
     *        or elements ({@code SIZED} and {@code SUBSIZED}, if supplied, are
     *        ignored and are not reported.)
     * @return A spliterator from an iterator
     * @throws NullPointerException if the given iterator is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static Spliterator.OfLong spliterator(PrimitiveIterator.OfLong iterator,
                                                 long size,
                                                 int characteristics) {

    /**
     * Creates a {@code Spliterator.OfLong} using a given
     * {@code LongStream.LongIterator} as the source of elements, and with a
     * given initially reported size.
     *
     * <p>The spliterator is not
     * <em><a href="Spliterator.html#binding">late-binding</a></em>, inherits
     * the <em>fail-fast</em> properties of the iterator, and implements
     * {@code trySplit} to permit limited parallelism.
     *
     * <p>Traversal of elements should be accomplished through the spliterator.
     * The behaviour of splitting and traversal is undefined if the iterator is
     * operated on after the spliterator is returned, or the initially reported
     * size is not equal to the actual number of elements in the source.
     *
     * @param iterator The iterator for the source
     * @param size The number of elements in the source, to be reported as
     *        initial {@code estimateSize}.
     * @param characteristics Characteristics of this spliterator's source or
     *        elements.  The characteristics {@code SIZED} and {@code SUBSIZED}
     *        are additionally reported unless {@code CONCURRENT} is supplied.
     * @return A spliterator from an iterator
     * @throws NullPointerException if the given iterator is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static Spliterator.OfInt spliteratorUnknownSize(PrimitiveIterator.OfInt iterator,
                                                           int characteristics) {

    /**
     * Creates a {@code Spliterator.OfInt} using a given
     * {@code IntStream.IntIterator} as the source of elements, with no initial
     * size estimate.
     *
     * <p>The spliterator is not
     * <em><a href="Spliterator.html#binding">late-binding</a></em>, inherits
     * the <em>fail-fast</em> properties of the iterator, and implements
     * {@code trySplit} to permit limited parallelism.
     *
     * <p>Traversal of elements should be accomplished through the spliterator.
     * The behaviour of splitting and traversal is undefined if the iterator is
     * operated on after the spliterator is returned.
     *
     * @param iterator The iterator for the source
     * @param characteristics Characteristics of this spliterator's source
     *        or elements ({@code SIZED} and {@code SUBSIZED}, if supplied, are
     *        ignored and are not reported.)
     * @return A spliterator from an iterator
     * @throws NullPointerException if the given iterator is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static Spliterator.OfInt spliterator(PrimitiveIterator.OfInt iterator,
                                                long size,
                                                int characteristics) {

    /**
     * Creates a {@code Spliterator.OfInt} using a given
     * {@code IntStream.IntIterator} as the source of elements, and with a given
     * initially reported size.
     *
     * <p>The spliterator is not
     * <em><a href="Spliterator.html#binding">late-binding</a></em>, inherits
     * the <em>fail-fast</em> properties of the iterator, and implements
     * {@code trySplit} to permit limited parallelism.
     *
     * <p>Traversal of elements should be accomplished through the spliterator.
     * The behaviour of splitting and traversal is undefined if the iterator is
     * operated on after the spliterator is returned, or the initially reported
     * size is not equal to the actual number of elements in the source.
     *
     * @param iterator The iterator for the source
     * @param size The number of elements in the source, to be reported as
     *        initial {@code estimateSize}.
     * @param characteristics Characteristics of this spliterator's source or
     *        elements.  The characteristics {@code SIZED} and {@code SUBSIZED}
     *        are additionally reported unless {@code CONCURRENT} is supplied.
     * @return A spliterator from an iterator
     * @throws NullPointerException if the given iterator is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static <T> Spliterator<T> spliteratorUnknownSize(Iterator<? extends T> iterator,
                                                            int characteristics) {

    /**
     * Creates a {@code Spliterator} using a given {@code Iterator}
     * as the source of elements, with no initial size estimate.
     *
     * <p>The spliterator is not
     * <em><a href="Spliterator.html#binding">late-binding</a></em>, inherits
     * the <em>fail-fast</em> properties of the iterator, and implements
     * {@code trySplit} to permit limited parallelism.
     *
     * <p>Traversal of elements should be accomplished through the spliterator.
     * The behaviour of splitting and traversal is undefined if the iterator is
     * operated on after the spliterator is returned.
     *
     * @param <T> Type of elements
     * @param iterator The iterator for the source
     * @param characteristics Characteristics of this spliterator's source
     *        or elements ({@code SIZED} and {@code SUBSIZED}, if supplied, are
     *        ignored and are not reported.)
     * @return A spliterator from an iterator
     * @throws NullPointerException if the given iterator is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static <T> Spliterator<T> spliterator(Iterator<? extends T> iterator,
                                                 long size,
                                                 int characteristics) {

    /**
     * Creates a {@code Spliterator} using a given {@code Iterator}
     * as the source of elements, and with a given initially reported size.
     *
     * <p>The spliterator is not
     * <em><a href="Spliterator.html#binding">late-binding</a></em>, inherits
     * the <em>fail-fast</em> properties of the iterator, and implements
     * {@code trySplit} to permit limited parallelism.
     *
     * <p>Traversal of elements should be accomplished through the spliterator.
     * The behaviour of splitting and traversal is undefined if the iterator is
     * operated on after the spliterator is returned, or the initially reported
     * size is not equal to the actual number of elements in the source.
     *
     * @param <T> Type of elements
     * @param iterator The iterator for the source
     * @param size The number of elements in the source, to be reported as
     *        initial {@code estimateSize}
     * @param characteristics Characteristics of this spliterator's source or
     *        elements.  The characteristics {@code SIZED} and {@code SUBSIZED}
     *        are additionally reported unless {@code CONCURRENT} is supplied.
     * @return A spliterator from an iterator
     * @throws NullPointerException if the given iterator is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static <T> Spliterator<T> spliterator(Collection<? extends T> c,
                                                 int characteristics) {

    /**
     * Creates a {@code Spliterator} using the given collection's
     * {@link java.util.Collection#iterator()} as the source of elements, and
     * reporting its {@link java.util.Collection#size()} as its initial size.
     *
     * <p>The spliterator is
     * <em><a href="Spliterator.html#binding">late-binding</a></em>, inherits
     * the <em>fail-fast</em> properties of the collection's iterator, and
     * implements {@code trySplit} to permit limited parallelism.
     *
     * @param <T> Type of elements
     * @param c The collection
     * @param characteristics Characteristics of this spliterator's source or
     *        elements.  The characteristics {@code SIZED} and {@code SUBSIZED}
     *        are additionally reported unless {@code CONCURRENT} is supplied.
     * @return A spliterator from an iterator
     * @throws NullPointerException if the given collection is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    private static void checkFromToBounds(int arrayLength, int origin, int fence) {

    /**
     * Validate inclusive start index and exclusive end index against the length
     * of an array.
     * @param arrayLength The length of the array
     * @param origin The inclusive start index
     * @param fence The exclusive end index
     * @throws ArrayIndexOutOfBoundsException if the start index is greater than
     * the end index, if the start index is negative, or the end index is
     * greater than the array length
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static Spliterator.OfDouble spliterator(double[] array, int fromIndex, int toIndex,
                                                   int additionalCharacteristics) {

    /**
     * Creates a {@code Spliterator.OfDouble} covering a range of elements of a
     * given array, using a customized set of spliterator characteristics.
     *
     * <p>This method is provided as an implementation convenience for
     * Spliterators which store portions of their elements in arrays, and need
     * fine control over Spliterator characteristics.  Most other situations in
     * which a Spliterator for an array is needed should use
     * {@link Arrays#spliterator(double[], int, int)}.
     *
     * <p>The returned spliterator always reports the characteristics
     * {@code SIZED} and {@code SUBSIZED}.  The caller may provide additional
     * characteristics for the spliterator to report.  (For example, if it is
     * known the array will not be further modified, specify {@code IMMUTABLE};
     * if the array data is considered to have an an encounter order, specify
     * {@code ORDERED}).  The method {@link Arrays#spliterator(long[], int, int)} can
     * often be used instead, which returns a spliterator that reports
     * {@code SIZED}, {@code SUBSIZED}, {@code IMMUTABLE}, and {@code ORDERED}.
     *
     * @param array The array, assumed to be unmodified during use
     * @param fromIndex The least index (inclusive) to cover
     * @param toIndex One past the greatest index to cover
     * @param additionalCharacteristics Additional spliterator characteristics
     *        of this spliterator's source or elements beyond {@code SIZED} and
     *        {@code SUBSIZED} which are are always reported
     * @return A spliterator for an array
     * @throws NullPointerException if the given array is {@code null}
     * @throws ArrayIndexOutOfBoundsException if {@code fromIndex} is negative,
     *         {@code toIndex} is less than {@code fromIndex}, or
     *         {@code toIndex} is greater than the array size
     * @see Arrays#spliterator(double[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static Spliterator.OfDouble spliterator(double[] array,
                                                   int additionalCharacteristics) {

    /**
     * Creates a {@code Spliterator.OfDouble} covering the elements of a given array,
     * using a customized set of spliterator characteristics.
     *
     * <p>This method is provided as an implementation convenience for
     * Spliterators which store portions of their elements in arrays, and need
     * fine control over Spliterator characteristics.  Most other situations in
     * which a Spliterator for an array is needed should use
     * {@link Arrays#spliterator(double[])}.
     *
     * <p>The returned spliterator always reports the characteristics
     * {@code SIZED} and {@code SUBSIZED}.  The caller may provide additional
     * characteristics for the spliterator to report; it is common to
     * additionally specify {@code IMMUTABLE} and {@code ORDERED}.
     *
     * @param array The array, assumed to be unmodified during use
     * @param additionalCharacteristics Additional spliterator characteristics
     *        of this spliterator's source or elements beyond {@code SIZED} and
     *        {@code SUBSIZED} which are are always reported
     * @return A spliterator for an array
     * @throws NullPointerException if the given array is {@code null}
     * @see Arrays#spliterator(double[])
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static Spliterator.OfLong spliterator(long[] array, int fromIndex, int toIndex,
                                                 int additionalCharacteristics) {

    /**
     * Creates a {@code Spliterator.OfLong} covering a range of elements of a
     * given array, using a customized set of spliterator characteristics.
     *
     * <p>This method is provided as an implementation convenience for
     * Spliterators which store portions of their elements in arrays, and need
     * fine control over Spliterator characteristics.  Most other situations in
     * which a Spliterator for an array is needed should use
     * {@link Arrays#spliterator(long[], int, int)}.
     *
     * <p>The returned spliterator always reports the characteristics
     * {@code SIZED} and {@code SUBSIZED}.  The caller may provide additional
     * characteristics for the spliterator to report.  (For example, if it is
     * known the array will not be further modified, specify {@code IMMUTABLE};
     * if the array data is considered to have an an encounter order, specify
     * {@code ORDERED}).  The method {@link Arrays#spliterator(long[], int, int)} can
     * often be used instead, which returns a spliterator that reports
     * {@code SIZED}, {@code SUBSIZED}, {@code IMMUTABLE}, and {@code ORDERED}.
     *
     * @param array The array, assumed to be unmodified during use
     * @param fromIndex The least index (inclusive) to cover
     * @param toIndex One past the greatest index to cover
     * @param additionalCharacteristics Additional spliterator characteristics
     *        of this spliterator's source or elements beyond {@code SIZED} and
     *        {@code SUBSIZED} which are are always reported
     * @return A spliterator for an array
     * @throws NullPointerException if the given array is {@code null}
     * @throws ArrayIndexOutOfBoundsException if {@code fromIndex} is negative,
     *         {@code toIndex} is less than {@code fromIndex}, or
     *         {@code toIndex} is greater than the array size
     * @see Arrays#spliterator(long[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static Spliterator.OfLong spliterator(long[] array,
                                                 int additionalCharacteristics) {

    /**
     * Creates a {@code Spliterator.OfLong} covering the elements of a given array,
     * using a customized set of spliterator characteristics.
     *
     * <p>This method is provided as an implementation convenience for
     * Spliterators which store portions of their elements in arrays, and need
     * fine control over Spliterator characteristics.  Most other situations in
     * which a Spliterator for an array is needed should use
     * {@link Arrays#spliterator(long[])}.
     *
     * <p>The returned spliterator always reports the characteristics
     * {@code SIZED} and {@code SUBSIZED}.  The caller may provide additional
     * characteristics for the spliterator to report; it is common to
     * additionally specify {@code IMMUTABLE} and {@code ORDERED}.
     *
     * @param array The array, assumed to be unmodified during use
     * @param additionalCharacteristics Additional spliterator characteristics
     *        of this spliterator's source or elements beyond {@code SIZED} and
     *        {@code SUBSIZED} which are are always reported
     * @return A spliterator for an array
     * @throws NullPointerException if the given array is {@code null}
     * @see Arrays#spliterator(long[])
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static Spliterator.OfInt spliterator(int[] array, int fromIndex, int toIndex,
                                                int additionalCharacteristics) {

    /**
     * Creates a {@code Spliterator.OfInt} covering a range of elements of a
     * given array, using a customized set of spliterator characteristics.
     *
     * <p>This method is provided as an implementation convenience for
     * Spliterators which store portions of their elements in arrays, and need
     * fine control over Spliterator characteristics.  Most other situations in
     * which a Spliterator for an array is needed should use
     * {@link Arrays#spliterator(int[], int, int)}.
     *
     * <p>The returned spliterator always reports the characteristics
     * {@code SIZED} and {@code SUBSIZED}.  The caller may provide additional
     * characteristics for the spliterator to report; it is common to
     * additionally specify {@code IMMUTABLE} and {@code ORDERED}.
     *
     * @param array The array, assumed to be unmodified during use
     * @param fromIndex The least index (inclusive) to cover
     * @param toIndex One past the greatest index to cover
     * @param additionalCharacteristics Additional spliterator characteristics
     *        of this spliterator's source or elements beyond {@code SIZED} and
     *        {@code SUBSIZED} which are are always reported
     * @return A spliterator for an array
     * @throws NullPointerException if the given array is {@code null}
     * @throws ArrayIndexOutOfBoundsException if {@code fromIndex} is negative,
     *         {@code toIndex} is less than {@code fromIndex}, or
     *         {@code toIndex} is greater than the array size
     * @see Arrays#spliterator(int[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static Spliterator.OfInt spliterator(int[] array,
                                                int additionalCharacteristics) {

    /**
     * Creates a {@code Spliterator.OfInt} covering the elements of a given array,
     * using a customized set of spliterator characteristics.
     *
     * <p>This method is provided as an implementation convenience for
     * Spliterators which store portions of their elements in arrays, and need
     * fine control over Spliterator characteristics.  Most other situations in
     * which a Spliterator for an array is needed should use
     * {@link Arrays#spliterator(int[])}.
     *
     * <p>The returned spliterator always reports the characteristics
     * {@code SIZED} and {@code SUBSIZED}.  The caller may provide additional
     * characteristics for the spliterator to report; it is common to
     * additionally specify {@code IMMUTABLE} and {@code ORDERED}.
     *
     * @param array The array, assumed to be unmodified during use
     * @param additionalCharacteristics Additional spliterator characteristics
     *        of this spliterator's source or elements beyond {@code SIZED} and
     *        {@code SUBSIZED} which are are always reported
     * @return A spliterator for an array
     * @throws NullPointerException if the given array is {@code null}
     * @see Arrays#spliterator(int[])
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static <T> Spliterator<T> spliterator(Object[] array, int fromIndex, int toIndex,
                                                 int additionalCharacteristics) {

    /**
     * Creates a {@code Spliterator} covering a range of elements of a given
     * array, using a customized set of spliterator characteristics.
     *
     * <p>This method is provided as an implementation convenience for
     * Spliterators which store portions of their elements in arrays, and need
     * fine control over Spliterator characteristics.  Most other situations in
     * which a Spliterator for an array is needed should use
     * {@link Arrays#spliterator(Object[])}.
     *
     * <p>The returned spliterator always reports the characteristics
     * {@code SIZED} and {@code SUBSIZED}.  The caller may provide additional
     * characteristics for the spliterator to report; it is common to
     * additionally specify {@code IMMUTABLE} and {@code ORDERED}.
     *
     * @param <T> Type of elements
     * @param array The array, assumed to be unmodified during use
     * @param fromIndex The least index (inclusive) to cover
     * @param toIndex One past the greatest index to cover
     * @param additionalCharacteristics Additional spliterator characteristics
     *        of this spliterator's source or elements beyond {@code SIZED} and
     *        {@code SUBSIZED} which are are always reported
     * @return A spliterator for an array
     * @throws NullPointerException if the given array is {@code null}
     * @throws ArrayIndexOutOfBoundsException if {@code fromIndex} is negative,
     *         {@code toIndex} is less than {@code fromIndex}, or
     *         {@code toIndex} is greater than the array size
     * @see Arrays#spliterator(Object[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static <T> Spliterator<T> spliterator(Object[] array,
                                                 int additionalCharacteristics) {

    /**
     * Creates a {@code Spliterator} covering the elements of a given array,
     * using a customized set of spliterator characteristics.
     *
     * <p>This method is provided as an implementation convenience for
     * Spliterators which store portions of their elements in arrays, and need
     * fine control over Spliterator characteristics.  Most other situations in
     * which a Spliterator for an array is needed should use
     * {@link Arrays#spliterator(Object[])}.
     *
     * <p>The returned spliterator always reports the characteristics
     * {@code SIZED} and {@code SUBSIZED}.  The caller may provide additional
     * characteristics for the spliterator to report; it is common to
     * additionally specify {@code IMMUTABLE} and {@code ORDERED}.
     *
     * @param <T> Type of elements
     * @param array The array, assumed to be unmodified during use
     * @param additionalCharacteristics Additional spliterator characteristics
     *        of this spliterator's source or elements beyond {@code SIZED} and
     *        {@code SUBSIZED} which are are always reported
     * @return A spliterator for an array
     * @throws NullPointerException if the given array is {@code null}
     * @see Arrays#spliterator(Object[])
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static Spliterator.OfDouble emptyDoubleSpliterator() {

    /**
     * Creates an empty {@code Spliterator.OfDouble}
     *
     * <p>The empty spliterator reports {@link Spliterator#SIZED} and
     * {@link Spliterator#SUBSIZED}.  Calls to
     * {@link java.util.Spliterator#trySplit()} always return {@code null}.
     *
     * @return An empty spliterator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static Spliterator.OfLong emptyLongSpliterator() {

    /**
     * Creates an empty {@code Spliterator.OfLong}
     *
     * <p>The empty spliterator reports {@link Spliterator#SIZED} and
     * {@link Spliterator#SUBSIZED}.  Calls to
     * {@link java.util.Spliterator#trySplit()} always return {@code null}.
     *
     * @return An empty spliterator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    public static Spliterator.OfInt emptyIntSpliterator() {

    /**
     * Creates an empty {@code Spliterator.OfInt}
     *
     * <p>The empty spliterator reports {@link Spliterator#SIZED} and
     * {@link Spliterator#SUBSIZED}.  Calls to
     * {@link java.util.Spliterator#trySplit()} always return {@code null}.
     *
     * @return An empty spliterator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
    @SuppressWarnings("unchecked")

    /**
     * Creates an empty {@code Spliterator}
     *
     * <p>The empty spliterator reports {@link Spliterator#SIZED} and
     * {@link Spliterator#SUBSIZED}.  Calls to
     * {@link java.util.Spliterator#trySplit()} always return {@code null}.
     *
     * @param <T> Type of elements
     * @return An empty spliterator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Spliterators.java
public final class Spliterators {

/**
 * Static classes and methods for operating on or creating instances of
 * {@link Spliterator} and its primitive specializations
 * {@link Spliterator.OfInt}, {@link Spliterator.OfLong}, and
 * {@link Spliterator.OfDouble}.
 *
 * @see Spliterator
 * @since 1.8
 */
