_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp

////////////////////////////////////////////////////////////
/// \class sf::Utf
/// \ingroup system
///
/// Utility class providing generic functions for UTF conversions.
///
/// sf::Utf is a low-level, generic interface for counting, iterating,
/// encoding and decoding Unicode characters and strings. It is able
/// to handle ANSI, wide, latin-1, UTF-8, UTF-16 and UTF-32 encodings.
///
/// sf::Utf<X> functions are all static, these classes are not meant to
/// be instanciated. All the functions are template, so that you
/// can use any character / string type for a given encoding.
///
/// It has 3 specializations:
/// \li sf::Utf<8> (typedef'd to sf::Utf8)
/// \li sf::Utf<16> (typedef'd to sf::Utf16)
/// \li sf::Utf<32> (typedef'd to sf::Utf32)
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Encode a single UTF-32 character to wide
    ///
    /// This function does not exist in other specializations
    /// of sf::Utf<>, it is defined for convenience (it is used by
    /// several other conversion functions).
    ///
    /// \param codepoint   Iterator pointing to the beginning of the input sequence
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement if the input character is not convertible to wide (use 0 to skip it)
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Encode a single UTF-32 character to ANSI
    ///
    /// This function does not exist in other specializations
    /// of sf::Utf<>, it is defined for convenience (it is used by
    /// several other conversion functions).
    ///
    /// \param codepoint   Iterator pointing to the beginning of the input sequence
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement if the input character is not convertible to ANSI (use 0 to skip it)
    /// \param locale      Locale to use for conversion
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In>

    ////////////////////////////////////////////////////////////
    /// \brief Decode a single wide character to UTF-32
    ///
    /// This function does not exist in other specializations
    /// of sf::Utf<>, it is defined for convenience (it is used by
    /// several other conversion functions).
    ///
    /// \param input Input wide character
    ///
    /// \return Converted character
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In>

    ////////////////////////////////////////////////////////////
    /// \brief Decode a single ANSI character to UTF-32
    ///
    /// This function does not exist in other specializations
    /// of sf::Utf<>, it is defined for convenience (it is used by
    /// several other conversion functions).
    ///
    /// \param input  Input ANSI character
    /// \param locale Locale to use for conversion
    ///
    /// \return Converted character
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a UTF-32 characters range to UTF-32
    ///
    /// This functions does nothing more than a direct copy;
    /// it is defined only to provide the same interface as other
    /// specializations of the sf::Utf<> template, and allow
    /// generic code to be written on top of it.
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a UTF-32 characters range to UTF-16
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a UTF-32 characters range to UTF-8
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert an UTF-16 characters range to latin-1 (ISO-5589-1) characters
    ///
    /// \param begin       Iterator pointing to the beginning of the input sequence
    /// \param end         Iterator pointing to the end of the input sequence
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement for characters not convertible to wide (use 0 to skip them)
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert an UTF-32 characters range to wide characters
    ///
    /// \param begin       Iterator pointing to the beginning of the input sequence
    /// \param end         Iterator pointing to the end of the input sequence
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement for characters not convertible to wide (use 0 to skip them)
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert an UTF-32 characters range to ANSI characters
    ///
    /// The current global locale will be used by default, unless you
    /// pass a custom one in the \a locale parameter.
    ///
    /// \param begin       Iterator pointing to the beginning of the input sequence
    /// \param end         Iterator pointing to the end of the input sequence
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement for characters not convertible to ANSI (use 0 to skip them)
    /// \param locale      Locale to use for conversion
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a latin-1 (ISO-5589-1) characters range to UTF-32
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a wide characters range to UTF-32
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert an ANSI characters range to UTF-32
    ///
    /// The current global locale will be used by default, unless you
    /// pass a custom one in the \a locale parameter.
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    /// \param locale Locale to use for conversion
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In>

    ////////////////////////////////////////////////////////////
    /// \brief Count the number of characters of a UTF-32 sequence
    ///
    /// This function is trivial for UTF-32, which can store
    /// every character in a single storage element.
    ///
    /// \param begin Iterator pointing to the beginning of the input sequence
    /// \param end   Iterator pointing to the end of the input sequence
    ///
    /// \return Iterator pointing to one past the last read element of the input sequence
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In>

    ////////////////////////////////////////////////////////////
    /// \brief Advance to the next UTF-32 character
    ///
    /// This function is trivial for UTF-32, which can store
    /// every character in a single storage element.
    ///
    /// \param begin Iterator pointing to the beginning of the input sequence
    /// \param end   Iterator pointing to the end of the input sequence
    ///
    /// \return Iterator pointing to one past the last read element of the input sequence
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Encode a single UTF-32 character
    ///
    /// Encoding a character means converting a unique 32-bits
    /// code (called the codepoint) in the target encoding, UTF-32.
    /// For UTF-32, the codepoint is the same as the character value.
    ///
    /// \param input       Codepoint to encode as UTF-32
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement for characters not convertible to UTF-32 (use 0 to skip them)
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In>

    ////////////////////////////////////////////////////////////
    /// \brief Decode a single UTF-32 character
    ///
    /// Decoding a character means finding its unique 32-bits
    /// code (called the codepoint) in the Unicode standard.
    /// For UTF-32, the character value is the same as the codepoint.
    ///
    /// \param begin       Iterator pointing to the beginning of the input sequence
    /// \param end         Iterator pointing to the end of the input sequence
    /// \param output      Codepoint of the decoded UTF-32 character
    /// \param replacement Replacement character to use in case the UTF-8 sequence is invalid
    ///
    /// \return Iterator pointing to one past the last read element of the input sequence
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
template <>

////////////////////////////////////////////////////////////
/// \brief Specialization of the Utf template for UTF-32
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a UTF-16 characters range to UTF-32
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a UTF-16 characters range to UTF-16
    ///
    /// This functions does nothing more than a direct copy;
    /// it is defined only to provide the same interface as other
    /// specializations of the sf::Utf<> template, and allow
    /// generic code to be written on top of it.
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a UTF-16 characters range to UTF-8
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert an UTF-16 characters range to latin-1 (ISO-5589-1) characters
    ///
    /// \param begin       Iterator pointing to the beginning of the input sequence
    /// \param end         Iterator pointing to the end of the input sequence
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement for characters not convertible to wide (use 0 to skip them)
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert an UTF-16 characters range to wide characters
    ///
    /// \param begin       Iterator pointing to the beginning of the input sequence
    /// \param end         Iterator pointing to the end of the input sequence
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement for characters not convertible to wide (use 0 to skip them)
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert an UTF-16 characters range to ANSI characters
    ///
    /// The current global locale will be used by default, unless you
    /// pass a custom one in the \a locale parameter.
    ///
    /// \param begin       Iterator pointing to the beginning of the input sequence
    /// \param end         Iterator pointing to the end of the input sequence
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement for characters not convertible to ANSI (use 0 to skip them)
    /// \param locale      Locale to use for conversion
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a latin-1 (ISO-5589-1) characters range to UTF-16
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a wide characters range to UTF-16
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert an ANSI characters range to UTF-16
    ///
    /// The current global locale will be used by default, unless you
    /// pass a custom one in the \a locale parameter.
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    /// \param locale Locale to use for conversion
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In>

    ////////////////////////////////////////////////////////////
    /// \brief Count the number of characters of a UTF-16 sequence
    ///
    /// This function is necessary for multi-elements encodings, as
    /// a single character may use more than 1 storage element, thus the
    /// total size can be different from (begin - end).
    ///
    /// \param begin Iterator pointing to the beginning of the input sequence
    /// \param end   Iterator pointing to the end of the input sequence
    ///
    /// \return Iterator pointing to one past the last read element of the input sequence
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In>

    ////////////////////////////////////////////////////////////
    /// \brief Advance to the next UTF-16 character
    ///
    /// This function is necessary for multi-elements encodings, as
    /// a single character may use more than 1 storage element.
    ///
    /// \param begin Iterator pointing to the beginning of the input sequence
    /// \param end   Iterator pointing to the end of the input sequence
    ///
    /// \return Iterator pointing to one past the last read element of the input sequence
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Encode a single UTF-16 character
    ///
    /// Encoding a character means converting a unique 32-bits
    /// code (called the codepoint) in the target encoding, UTF-16.
    ///
    /// \param input       Codepoint to encode as UTF-16
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement for characters not convertible to UTF-16 (use 0 to skip them)
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In>

    ////////////////////////////////////////////////////////////
    /// \brief Decode a single UTF-16 character
    ///
    /// Decoding a character means finding its unique 32-bits
    /// code (called the codepoint) in the Unicode standard.
    ///
    /// \param begin       Iterator pointing to the beginning of the input sequence
    /// \param end         Iterator pointing to the end of the input sequence
    /// \param output      Codepoint of the decoded UTF-16 character
    /// \param replacement Replacement character to use in case the UTF-8 sequence is invalid
    ///
    /// \return Iterator pointing to one past the last read element of the input sequence
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
template <>

////////////////////////////////////////////////////////////
/// \brief Specialization of the Utf template for UTF-16
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a UTF-8 characters range to UTF-32
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a UTF-8 characters range to UTF-16
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a UTF-8 characters range to UTF-8
    ///
    /// This functions does nothing more than a direct copy;
    /// it is defined only to provide the same interface as other
    /// specializations of the sf::Utf<> template, and allow
    /// generic code to be written on top of it.
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert an UTF-8 characters range to latin-1 (ISO-5589-1) characters
    ///
    /// \param begin       Iterator pointing to the beginning of the input sequence
    /// \param end         Iterator pointing to the end of the input sequence
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement for characters not convertible to wide (use 0 to skip them)
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert an UTF-8 characters range to wide characters
    ///
    /// \param begin       Iterator pointing to the beginning of the input sequence
    /// \param end         Iterator pointing to the end of the input sequence
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement for characters not convertible to wide (use 0 to skip them)
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert an UTF-8 characters range to ANSI characters
    ///
    /// The current global locale will be used by default, unless you
    /// pass a custom one in the \a locale parameter.
    ///
    /// \param begin       Iterator pointing to the beginning of the input sequence
    /// \param end         Iterator pointing to the end of the input sequence
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement for characters not convertible to ANSI (use 0 to skip them)
    /// \param locale      Locale to use for conversion
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a latin-1 (ISO-5589-1) characters range to UTF-8
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a wide characters range to UTF-8
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert an ANSI characters range to UTF-8
    ///
    /// The current global locale will be used by default, unless you
    /// pass a custom one in the \a locale parameter.
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    /// \param locale Locale to use for conversion
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In>

    ////////////////////////////////////////////////////////////
    /// \brief Count the number of characters of a UTF-8 sequence
    ///
    /// This function is necessary for multi-elements encodings, as
    /// a single character may use more than 1 storage element, thus the
    /// total size can be different from (begin - end).
    ///
    /// \param begin Iterator pointing to the beginning of the input sequence
    /// \param end   Iterator pointing to the end of the input sequence
    ///
    /// \return Iterator pointing to one past the last read element of the input sequence
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In>

    ////////////////////////////////////////////////////////////
    /// \brief Advance to the next UTF-8 character
    ///
    /// This function is necessary for multi-elements encodings, as
    /// a single character may use more than 1 storage element.
    ///
    /// \param begin Iterator pointing to the beginning of the input sequence
    /// \param end   Iterator pointing to the end of the input sequence
    ///
    /// \return Iterator pointing to one past the last read element of the input sequence
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Encode a single UTF-8 character
    ///
    /// Encoding a character means converting a unique 32-bits
    /// code (called the codepoint) in the target encoding, UTF-8.
    ///
    /// \param input       Codepoint to encode as UTF-8
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement for characters not convertible to UTF-8 (use 0 to skip them)
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In>

    ////////////////////////////////////////////////////////////
    /// \brief Decode a single UTF-8 character
    ///
    /// Decoding a character means finding its unique 32-bits
    /// code (called the codepoint) in the Unicode standard.
    ///
    /// \param begin       Iterator pointing to the beginning of the input sequence
    /// \param end         Iterator pointing to the end of the input sequence
    /// \param output      Codepoint of the decoded UTF-8 character
    /// \param replacement Replacement character to use in case the UTF-8 sequence is invalid
    ///
    /// \return Iterator pointing to one past the last read element of the input sequence
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
template <>

////////////////////////////////////////////////////////////
/// \brief Specialization of the Utf template for UTF-8
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
#include <SFML/Config.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
#ifndef SFML_UTF_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp

////////////////////////////////////////////////////////////
/// \class sf::Utf
/// \ingroup system
///
/// Utility class providing generic functions for UTF conversions.
///
/// sf::Utf is a low-level, generic interface for counting, iterating,
/// encoding and decoding Unicode characters and strings. It is able
/// to handle ANSI, wide, latin-1, UTF-8, UTF-16 and UTF-32 encodings.
///
/// sf::Utf<X> functions are all static, these classes are not meant to
/// be instanciated. All the functions are template, so that you
/// can use any character / string type for a given encoding.
///
/// It has 3 specializations:
/// \li sf::Utf<8> (typedef'd to sf::Utf8)
/// \li sf::Utf<16> (typedef'd to sf::Utf16)
/// \li sf::Utf<32> (typedef'd to sf::Utf32)
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Encode a single UTF-32 character to wide
    ///
    /// This function does not exist in other specializations
    /// of sf::Utf<>, it is defined for convenience (it is used by
    /// several other conversion functions).
    ///
    /// \param codepoint   Iterator pointing to the beginning of the input sequence
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement if the input character is not convertible to wide (use 0 to skip it)
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Encode a single UTF-32 character to ANSI
    ///
    /// This function does not exist in other specializations
    /// of sf::Utf<>, it is defined for convenience (it is used by
    /// several other conversion functions).
    ///
    /// \param codepoint   Iterator pointing to the beginning of the input sequence
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement if the input character is not convertible to ANSI (use 0 to skip it)
    /// \param locale      Locale to use for conversion
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In>

    ////////////////////////////////////////////////////////////
    /// \brief Decode a single wide character to UTF-32
    ///
    /// This function does not exist in other specializations
    /// of sf::Utf<>, it is defined for convenience (it is used by
    /// several other conversion functions).
    ///
    /// \param input Input wide character
    ///
    /// \return Converted character
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In>

    ////////////////////////////////////////////////////////////
    /// \brief Decode a single ANSI character to UTF-32
    ///
    /// This function does not exist in other specializations
    /// of sf::Utf<>, it is defined for convenience (it is used by
    /// several other conversion functions).
    ///
    /// \param input  Input ANSI character
    /// \param locale Locale to use for conversion
    ///
    /// \return Converted character
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a UTF-32 characters range to UTF-32
    ///
    /// This functions does nothing more than a direct copy;
    /// it is defined only to provide the same interface as other
    /// specializations of the sf::Utf<> template, and allow
    /// generic code to be written on top of it.
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a UTF-32 characters range to UTF-16
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a UTF-32 characters range to UTF-8
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert an UTF-16 characters range to latin-1 (ISO-5589-1) characters
    ///
    /// \param begin       Iterator pointing to the beginning of the input sequence
    /// \param end         Iterator pointing to the end of the input sequence
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement for characters not convertible to wide (use 0 to skip them)
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert an UTF-32 characters range to wide characters
    ///
    /// \param begin       Iterator pointing to the beginning of the input sequence
    /// \param end         Iterator pointing to the end of the input sequence
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement for characters not convertible to wide (use 0 to skip them)
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert an UTF-32 characters range to ANSI characters
    ///
    /// The current global locale will be used by default, unless you
    /// pass a custom one in the \a locale parameter.
    ///
    /// \param begin       Iterator pointing to the beginning of the input sequence
    /// \param end         Iterator pointing to the end of the input sequence
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement for characters not convertible to ANSI (use 0 to skip them)
    /// \param locale      Locale to use for conversion
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a latin-1 (ISO-5589-1) characters range to UTF-32
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a wide characters range to UTF-32
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert an ANSI characters range to UTF-32
    ///
    /// The current global locale will be used by default, unless you
    /// pass a custom one in the \a locale parameter.
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    /// \param locale Locale to use for conversion
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In>

    ////////////////////////////////////////////////////////////
    /// \brief Count the number of characters of a UTF-32 sequence
    ///
    /// This function is trivial for UTF-32, which can store
    /// every character in a single storage element.
    ///
    /// \param begin Iterator pointing to the beginning of the input sequence
    /// \param end   Iterator pointing to the end of the input sequence
    ///
    /// \return Iterator pointing to one past the last read element of the input sequence
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In>

    ////////////////////////////////////////////////////////////
    /// \brief Advance to the next UTF-32 character
    ///
    /// This function is trivial for UTF-32, which can store
    /// every character in a single storage element.
    ///
    /// \param begin Iterator pointing to the beginning of the input sequence
    /// \param end   Iterator pointing to the end of the input sequence
    ///
    /// \return Iterator pointing to one past the last read element of the input sequence
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Encode a single UTF-32 character
    ///
    /// Encoding a character means converting a unique 32-bits
    /// code (called the codepoint) in the target encoding, UTF-32.
    /// For UTF-32, the codepoint is the same as the character value.
    ///
    /// \param input       Codepoint to encode as UTF-32
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement for characters not convertible to UTF-32 (use 0 to skip them)
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In>

    ////////////////////////////////////////////////////////////
    /// \brief Decode a single UTF-32 character
    ///
    /// Decoding a character means finding its unique 32-bits
    /// code (called the codepoint) in the Unicode standard.
    /// For UTF-32, the character value is the same as the codepoint.
    ///
    /// \param begin       Iterator pointing to the beginning of the input sequence
    /// \param end         Iterator pointing to the end of the input sequence
    /// \param output      Codepoint of the decoded UTF-32 character
    /// \param replacement Replacement character to use in case the UTF-8 sequence is invalid
    ///
    /// \return Iterator pointing to one past the last read element of the input sequence
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
template <>

////////////////////////////////////////////////////////////
/// \brief Specialization of the Utf template for UTF-32
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a UTF-16 characters range to UTF-32
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a UTF-16 characters range to UTF-16
    ///
    /// This functions does nothing more than a direct copy;
    /// it is defined only to provide the same interface as other
    /// specializations of the sf::Utf<> template, and allow
    /// generic code to be written on top of it.
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a UTF-16 characters range to UTF-8
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert an UTF-16 characters range to latin-1 (ISO-5589-1) characters
    ///
    /// \param begin       Iterator pointing to the beginning of the input sequence
    /// \param end         Iterator pointing to the end of the input sequence
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement for characters not convertible to wide (use 0 to skip them)
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert an UTF-16 characters range to wide characters
    ///
    /// \param begin       Iterator pointing to the beginning of the input sequence
    /// \param end         Iterator pointing to the end of the input sequence
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement for characters not convertible to wide (use 0 to skip them)
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert an UTF-16 characters range to ANSI characters
    ///
    /// The current global locale will be used by default, unless you
    /// pass a custom one in the \a locale parameter.
    ///
    /// \param begin       Iterator pointing to the beginning of the input sequence
    /// \param end         Iterator pointing to the end of the input sequence
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement for characters not convertible to ANSI (use 0 to skip them)
    /// \param locale      Locale to use for conversion
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a latin-1 (ISO-5589-1) characters range to UTF-16
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a wide characters range to UTF-16
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert an ANSI characters range to UTF-16
    ///
    /// The current global locale will be used by default, unless you
    /// pass a custom one in the \a locale parameter.
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    /// \param locale Locale to use for conversion
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In>

    ////////////////////////////////////////////////////////////
    /// \brief Count the number of characters of a UTF-16 sequence
    ///
    /// This function is necessary for multi-elements encodings, as
    /// a single character may use more than 1 storage element, thus the
    /// total size can be different from (begin - end).
    ///
    /// \param begin Iterator pointing to the beginning of the input sequence
    /// \param end   Iterator pointing to the end of the input sequence
    ///
    /// \return Iterator pointing to one past the last read element of the input sequence
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In>

    ////////////////////////////////////////////////////////////
    /// \brief Advance to the next UTF-16 character
    ///
    /// This function is necessary for multi-elements encodings, as
    /// a single character may use more than 1 storage element.
    ///
    /// \param begin Iterator pointing to the beginning of the input sequence
    /// \param end   Iterator pointing to the end of the input sequence
    ///
    /// \return Iterator pointing to one past the last read element of the input sequence
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Encode a single UTF-16 character
    ///
    /// Encoding a character means converting a unique 32-bits
    /// code (called the codepoint) in the target encoding, UTF-16.
    ///
    /// \param input       Codepoint to encode as UTF-16
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement for characters not convertible to UTF-16 (use 0 to skip them)
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In>

    ////////////////////////////////////////////////////////////
    /// \brief Decode a single UTF-16 character
    ///
    /// Decoding a character means finding its unique 32-bits
    /// code (called the codepoint) in the Unicode standard.
    ///
    /// \param begin       Iterator pointing to the beginning of the input sequence
    /// \param end         Iterator pointing to the end of the input sequence
    /// \param output      Codepoint of the decoded UTF-16 character
    /// \param replacement Replacement character to use in case the UTF-8 sequence is invalid
    ///
    /// \return Iterator pointing to one past the last read element of the input sequence
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
template <>

////////////////////////////////////////////////////////////
/// \brief Specialization of the Utf template for UTF-16
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a UTF-8 characters range to UTF-32
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a UTF-8 characters range to UTF-16
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a UTF-8 characters range to UTF-8
    ///
    /// This functions does nothing more than a direct copy;
    /// it is defined only to provide the same interface as other
    /// specializations of the sf::Utf<> template, and allow
    /// generic code to be written on top of it.
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert an UTF-8 characters range to latin-1 (ISO-5589-1) characters
    ///
    /// \param begin       Iterator pointing to the beginning of the input sequence
    /// \param end         Iterator pointing to the end of the input sequence
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement for characters not convertible to wide (use 0 to skip them)
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert an UTF-8 characters range to wide characters
    ///
    /// \param begin       Iterator pointing to the beginning of the input sequence
    /// \param end         Iterator pointing to the end of the input sequence
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement for characters not convertible to wide (use 0 to skip them)
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert an UTF-8 characters range to ANSI characters
    ///
    /// The current global locale will be used by default, unless you
    /// pass a custom one in the \a locale parameter.
    ///
    /// \param begin       Iterator pointing to the beginning of the input sequence
    /// \param end         Iterator pointing to the end of the input sequence
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement for characters not convertible to ANSI (use 0 to skip them)
    /// \param locale      Locale to use for conversion
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a latin-1 (ISO-5589-1) characters range to UTF-8
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert a wide characters range to UTF-8
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In, typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Convert an ANSI characters range to UTF-8
    ///
    /// The current global locale will be used by default, unless you
    /// pass a custom one in the \a locale parameter.
    ///
    /// \param begin  Iterator pointing to the beginning of the input sequence
    /// \param end    Iterator pointing to the end of the input sequence
    /// \param output Iterator pointing to the beginning of the output sequence
    /// \param locale Locale to use for conversion
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In>

    ////////////////////////////////////////////////////////////
    /// \brief Count the number of characters of a UTF-8 sequence
    ///
    /// This function is necessary for multi-elements encodings, as
    /// a single character may use more than 1 storage element, thus the
    /// total size can be different from (begin - end).
    ///
    /// \param begin Iterator pointing to the beginning of the input sequence
    /// \param end   Iterator pointing to the end of the input sequence
    ///
    /// \return Iterator pointing to one past the last read element of the input sequence
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In>

    ////////////////////////////////////////////////////////////
    /// \brief Advance to the next UTF-8 character
    ///
    /// This function is necessary for multi-elements encodings, as
    /// a single character may use more than 1 storage element.
    ///
    /// \param begin Iterator pointing to the beginning of the input sequence
    /// \param end   Iterator pointing to the end of the input sequence
    ///
    /// \return Iterator pointing to one past the last read element of the input sequence
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename Out>

    ////////////////////////////////////////////////////////////
    /// \brief Encode a single UTF-8 character
    ///
    /// Encoding a character means converting a unique 32-bits
    /// code (called the codepoint) in the target encoding, UTF-8.
    ///
    /// \param input       Codepoint to encode as UTF-8
    /// \param output      Iterator pointing to the beginning of the output sequence
    /// \param replacement Replacement for characters not convertible to UTF-8 (use 0 to skip them)
    ///
    /// \return Iterator to the end of the output sequence which has been written
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
    template <typename In>

    ////////////////////////////////////////////////////////////
    /// \brief Decode a single UTF-8 character
    ///
    /// Decoding a character means finding its unique 32-bits
    /// code (called the codepoint) in the Unicode standard.
    ///
    /// \param begin       Iterator pointing to the beginning of the input sequence
    /// \param end         Iterator pointing to the end of the input sequence
    /// \param output      Codepoint of the decoded UTF-8 character
    /// \param replacement Replacement character to use in case the UTF-8 sequence is invalid
    ///
    /// \return Iterator pointing to one past the last read element of the input sequence
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
template <>

////////////////////////////////////////////////////////////
/// \brief Specialization of the Utf template for UTF-8
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
#include <SFML/Config.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
#ifndef SFML_UTF_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Utf.hpp
//

////////////////////////////////////////////////////////////
