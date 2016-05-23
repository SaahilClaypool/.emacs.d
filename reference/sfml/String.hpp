_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp

////////////////////////////////////////////////////////////
/// \class sf::String
/// \ingroup system
///
/// sf::String is a utility string class defined mainly for
/// convenience. It is a Unicode string (implemented using
/// UTF-32), thus it can store any character in the world
/// (european, chinese, arabic, hebrew, etc.).
///
/// It automatically handles conversions from/to ANSI and
/// wide strings, so that you can work with standard string
/// classes and still be compatible with functions taking a
/// sf::String.
///
/// \code
/// sf::String s;
///
/// std::string s1 = s;  // automatically converted to ANSI string
/// std::wstring s2 = s; // automatically converted to wide string
/// s = "hello";         // automatically converted from ANSI string
/// s = L"hello";        // automatically converted from wide string
/// s += 'a';            // automatically converted from ANSI string
/// s += L'a';           // automatically converted from wide string
/// \endcode
///
/// Conversions involving ANSI strings use the default user locale. However
/// it is possible to use a custom locale if necessary:
/// \code
/// std::locale locale;
/// sf::String s;
/// ...
/// std::string s1 = s.toAnsiString(locale);
/// s = sf::String("hello", locale);
/// \endcode
///
/// sf::String defines the most important functions of the
/// standard std::string class: removing, random access, iterating,
/// appending, comparing, etc. However it is a simple class
/// provided for convenience, and you may have to consider using
/// a more optimized class if your program requires complex string
/// handling. The automatic conversion functions will then take
/// care of converting your string to sf::String whenever SFML
/// requires it.
///
/// Please note that SFML also defines a low-level, generic
/// interface for Unicode handling, see the sf::Utf classes.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API String operator +(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of binary + operator to concatenate two strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return Concatenated string
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator >=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of >= operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically greater or equal than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator <=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of <= operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically lesser or equal than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator >(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of > operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically greater than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator <(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of < operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically lesser than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator !=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of != operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if both strings are different
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator ==(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of == operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if both strings are equal
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
};

    ////////////////////////////////////////////////////////////
    std::basic_string<Uint32> m_string; ///< Internal string of UTF-32 characters
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ConstIterator end() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// The end iterator refers to 1 position past the last character;
    /// thus it represents an invalid character and should never be
    /// accessed.
    ///
    /// \return Read-only iterator to the end of the string characters
    ///
    /// \see begin
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Iterator end();

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// The end iterator refers to 1 position past the last character;
    /// thus it represents an invalid character and should never be
    /// accessed.
    ///
    /// \return Read-write iterator to the end of the string characters
    ///
    /// \see begin
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ConstIterator begin() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// \return Read-only iterator to the beginning of the string characters
    ///
    /// \see end
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Iterator begin();

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// \return Read-write iterator to the beginning of the string characters
    ///
    /// \see end
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    const Uint32* getData() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get a pointer to the C-style array of characters
    ///
    /// This functions provides a read-only access to a
    /// null-terminated C-style representation of the string.
    /// The returned pointer is temporary and is meant only for
    /// immediate use, thus it is not recommended to store it.
    ///
    /// \return Read-only pointer to the array of characters
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::size_t find(const String& str, std::size_t start = 0) const;

    ////////////////////////////////////////////////////////////
    /// \brief Find a sequence of one or more characters in the string
    ///
    /// This function searches for the characters of \a str
    /// into the string, starting from \a start.
    ///
    /// \param str   Characters to find
    /// \param start Where to begin searching
    ///
    /// \return Position of \a str in the string, or String::InvalidPos if not found
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void insert(std::size_t position, const String& str);

    ////////////////////////////////////////////////////////////
    /// \brief Insert one or more characters into the string
    ///
    /// This function inserts the characters of \a str
    /// into the string, starting from \a position.
    ///
    /// \param position Position of insertion
    /// \param str      Characters to insert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void erase(std::size_t position, std::size_t count = 1);

    ////////////////////////////////////////////////////////////
    /// \brief Erase one or more characters from the string
    ///
    /// This function removes a sequence of \a count characters
    /// starting from \a position.
    ///
    /// \param position Position of the first character to erase
    /// \param count    Number of characters to erase
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    bool isEmpty() const;

    ////////////////////////////////////////////////////////////
    /// \brief Check whether the string is empty or not
    ///
    /// \return True if the string is empty (i.e. contains no character)
    ///
    /// \see clear, getSize
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::size_t getSize() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the size of the string
    ///
    /// \return Number of characters in the string
    ///
    /// \see isEmpty
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void clear();

    ////////////////////////////////////////////////////////////
    /// \brief Clear the string
    ///
    /// This function removes all the characters from the string.
    ///
    /// \see isEmpty, erase
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Uint32& operator [](std::size_t index);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of [] operator to access a character by its position
    ///
    /// This function provides read and write access to characters.
    /// Note: this function doesn't throw if \a index is out of range.
    ///
    /// \param index Index of the character to get
    ///
    /// \return Reference to the character at position \a index
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Uint32 operator [](std::size_t index) const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of [] operator to access a character by its position
    ///
    /// This function provides read-only access to characters.
    /// Note: this function doesn't throw if \a index is out of range.
    ///
    /// \param index Index of the character to get
    ///
    /// \return Character at position \a index
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String& operator +=(const String& right);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of += operator to append an UTF-32 string
    ///
    /// \param right String to append
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String& operator =(const String& right);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of assignment operator
    ///
    /// \param right Instance to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::wstring toWideString() const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert the unicode string to a wide string
    ///
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    ///
    /// \return Converted wide string
    ///
    /// \see toAnsiString, operator std::wstring
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::string toAnsiString(const std::locale& locale = std::locale()) const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert the unicode string to an ANSI string
    ///
    /// The UTF-32 string is converted to an ANSI string in
    /// the encoding defined by \a locale.
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    ///
    /// \param locale Locale to use for conversion
    ///
    /// \return Converted ANSI string
    ///
    /// \see toWideString, operator std::string
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    operator std::wstring() const;

    ////////////////////////////////////////////////////////////
    /// \brief Implicit cast operator to std::wstring (wide string)
    ///
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    /// This operator is defined for convenience, and is equivalent
    /// to calling toWideString().
    ///
    /// \return Converted wide string
    ///
    /// \see toWideString, operator std::string
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    operator std::string() const;

    ////////////////////////////////////////////////////////////
    /// \brief Implicit cast operator to std::string (ANSI string)
    ///
    /// The current global locale is used for conversion. If you
    /// want to explicitely specify a locale, see toAnsiString.
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    /// This operator is defined for convenience, and is equivalent
    /// to calling toAnsiString().
    ///
    /// \return Converted ANSI string
    ///
    /// \see toAnsiString, operator std::wstring
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const String& copy);

    ////////////////////////////////////////////////////////////
    /// \brief Copy constructor
    ///
    /// \param copy Instance to copy
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::basic_string<Uint32>& utf32String);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from an UTF-32 string
    ///
    /// \param utf32String UTF-32 string to assign
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const Uint32* utf32String);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a null-terminated C-style UTF-32 string
    ///
    /// \param utf32String UTF-32 string to assign
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::wstring& wideString);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a wide string
    ///
    /// \param wideString Wide string to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const wchar_t* wideString);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from null-terminated C-style wide string
    ///
    /// \param wideString Wide string to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::string& ansiString, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from an ANSI string and a locale
    ///
    /// The source string is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiString ANSI string to convert
    /// \param locale     Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const char* ansiString, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a null-terminated C-style ANSI string and a locale
    ///
    /// The source string is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiString ANSI string to convert
    /// \param locale     Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(Uint32 utf32Char);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from single UTF-32 character
    ///
    /// \param utf32Char UTF-32 character to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(wchar_t wideChar);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from single wide character
    ///
    /// \param wideChar Wide character to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(char ansiChar, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a single ANSI character and a locale
    ///
    /// The source character is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiChar ANSI character to convert
    /// \param locale   Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String();

    /// \brief Default constructor
    ///
    /// This constructor creates an empty string.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    static const std::size_t InvalidPos; ///< Represents an invalid position in the string
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    typedef std::basic_string<Uint32>::iterator       Iterator;      ///< Iterator type
    typedef std::basic_string<Uint32>::const_iterator ConstIterator; ///< Constant iterator type
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    // Types

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
class SFML_SYSTEM_API String

////////////////////////////////////////////////////////////
/// \brief Utility string class that automatically handles
///        conversions between types and encodings
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
#ifndef SFML_STRING_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp

////////////////////////////////////////////////////////////
/// \class sf::String
/// \ingroup system
///
/// sf::String is a utility string class defined mainly for
/// convenience. It is a Unicode string (implemented using
/// UTF-32), thus it can store any character in the world
/// (european, chinese, arabic, hebrew, etc.).
///
/// It automatically handles conversions from/to ANSI and
/// wide strings, so that you can work with standard string
/// classes and still be compatible with functions taking a
/// sf::String.
///
/// \code
/// sf::String s;
///
/// std::string s1 = s;  // automatically converted to ANSI string
/// std::wstring s2 = s; // automatically converted to wide string
/// s = "hello";         // automatically converted from ANSI string
/// s = L"hello";        // automatically converted from wide string
/// s += 'a';            // automatically converted from ANSI string
/// s += L'a';           // automatically converted from wide string
/// \endcode
///
/// Conversions involving ANSI strings use the default user locale. However
/// it is possible to use a custom locale if necessary:
/// \code
/// std::locale locale;
/// sf::String s;
/// ...
/// std::string s1 = s.toAnsiString(locale);
/// s = sf::String("hello", locale);
/// \endcode
///
/// sf::String defines the most important functions of the
/// standard std::string class: removing, random access, iterating,
/// appending, comparing, etc. However it is a simple class
/// provided for convenience, and you may have to consider using
/// a more optimized class if your program requires complex string
/// handling. The automatic conversion functions will then take
/// care of converting your string to sf::String whenever SFML
/// requires it.
///
/// Please note that SFML also defines a low-level, generic
/// interface for Unicode handling, see the sf::Utf classes.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API String operator +(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of binary + operator to concatenate two strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return Concatenated string
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator >=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of >= operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically greater or equal than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator <=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of <= operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically lesser or equal than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator >(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of > operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically greater than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator <(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of < operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically lesser than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator !=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of != operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if both strings are different
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator ==(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of == operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if both strings are equal
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
};

    ////////////////////////////////////////////////////////////
    std::basic_string<Uint32> m_string; ///< Internal string of UTF-32 characters
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ConstIterator end() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// The end iterator refers to 1 position past the last character;
    /// thus it represents an invalid character and should never be
    /// accessed.
    ///
    /// \return Read-only iterator to the end of the string characters
    ///
    /// \see begin
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Iterator end();

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// The end iterator refers to 1 position past the last character;
    /// thus it represents an invalid character and should never be
    /// accessed.
    ///
    /// \return Read-write iterator to the end of the string characters
    ///
    /// \see begin
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ConstIterator begin() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// \return Read-only iterator to the beginning of the string characters
    ///
    /// \see end
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Iterator begin();

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// \return Read-write iterator to the beginning of the string characters
    ///
    /// \see end
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    const Uint32* getData() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get a pointer to the C-style array of characters
    ///
    /// This functions provides a read-only access to a
    /// null-terminated C-style representation of the string.
    /// The returned pointer is temporary and is meant only for
    /// immediate use, thus it is not recommended to store it.
    ///
    /// \return Read-only pointer to the array of characters
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::size_t find(const String& str, std::size_t start = 0) const;

    ////////////////////////////////////////////////////////////
    /// \brief Find a sequence of one or more characters in the string
    ///
    /// This function searches for the characters of \a str
    /// into the string, starting from \a start.
    ///
    /// \param str   Characters to find
    /// \param start Where to begin searching
    ///
    /// \return Position of \a str in the string, or String::InvalidPos if not found
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void insert(std::size_t position, const String& str);

    ////////////////////////////////////////////////////////////
    /// \brief Insert one or more characters into the string
    ///
    /// This function inserts the characters of \a str
    /// into the string, starting from \a position.
    ///
    /// \param position Position of insertion
    /// \param str      Characters to insert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void erase(std::size_t position, std::size_t count = 1);

    ////////////////////////////////////////////////////////////
    /// \brief Erase one or more characters from the string
    ///
    /// This function removes a sequence of \a count characters
    /// starting from \a position.
    ///
    /// \param position Position of the first character to erase
    /// \param count    Number of characters to erase
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    bool isEmpty() const;

    ////////////////////////////////////////////////////////////
    /// \brief Check whether the string is empty or not
    ///
    /// \return True if the string is empty (i.e. contains no character)
    ///
    /// \see clear, getSize
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::size_t getSize() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the size of the string
    ///
    /// \return Number of characters in the string
    ///
    /// \see isEmpty
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void clear();

    ////////////////////////////////////////////////////////////
    /// \brief Clear the string
    ///
    /// This function removes all the characters from the string.
    ///
    /// \see isEmpty, erase
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Uint32& operator [](std::size_t index);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of [] operator to access a character by its position
    ///
    /// This function provides read and write access to characters.
    /// Note: this function doesn't throw if \a index is out of range.
    ///
    /// \param index Index of the character to get
    ///
    /// \return Reference to the character at position \a index
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Uint32 operator [](std::size_t index) const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of [] operator to access a character by its position
    ///
    /// This function provides read-only access to characters.
    /// Note: this function doesn't throw if \a index is out of range.
    ///
    /// \param index Index of the character to get
    ///
    /// \return Character at position \a index
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String& operator +=(const String& right);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of += operator to append an UTF-32 string
    ///
    /// \param right String to append
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String& operator =(const String& right);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of assignment operator
    ///
    /// \param right Instance to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::wstring toWideString() const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert the unicode string to a wide string
    ///
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    ///
    /// \return Converted wide string
    ///
    /// \see toAnsiString, operator std::wstring
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::string toAnsiString(const std::locale& locale = std::locale()) const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert the unicode string to an ANSI string
    ///
    /// The UTF-32 string is converted to an ANSI string in
    /// the encoding defined by \a locale.
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    ///
    /// \param locale Locale to use for conversion
    ///
    /// \return Converted ANSI string
    ///
    /// \see toWideString, operator std::string
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    operator std::wstring() const;

    ////////////////////////////////////////////////////////////
    /// \brief Implicit cast operator to std::wstring (wide string)
    ///
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    /// This operator is defined for convenience, and is equivalent
    /// to calling toWideString().
    ///
    /// \return Converted wide string
    ///
    /// \see toWideString, operator std::string
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    operator std::string() const;

    ////////////////////////////////////////////////////////////
    /// \brief Implicit cast operator to std::string (ANSI string)
    ///
    /// The current global locale is used for conversion. If you
    /// want to explicitely specify a locale, see toAnsiString.
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    /// This operator is defined for convenience, and is equivalent
    /// to calling toAnsiString().
    ///
    /// \return Converted ANSI string
    ///
    /// \see toAnsiString, operator std::wstring
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const String& copy);

    ////////////////////////////////////////////////////////////
    /// \brief Copy constructor
    ///
    /// \param copy Instance to copy
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::basic_string<Uint32>& utf32String);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from an UTF-32 string
    ///
    /// \param utf32String UTF-32 string to assign
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const Uint32* utf32String);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a null-terminated C-style UTF-32 string
    ///
    /// \param utf32String UTF-32 string to assign
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::wstring& wideString);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a wide string
    ///
    /// \param wideString Wide string to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const wchar_t* wideString);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from null-terminated C-style wide string
    ///
    /// \param wideString Wide string to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::string& ansiString, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from an ANSI string and a locale
    ///
    /// The source string is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiString ANSI string to convert
    /// \param locale     Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const char* ansiString, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a null-terminated C-style ANSI string and a locale
    ///
    /// The source string is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiString ANSI string to convert
    /// \param locale     Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(Uint32 utf32Char);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from single UTF-32 character
    ///
    /// \param utf32Char UTF-32 character to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(wchar_t wideChar);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from single wide character
    ///
    /// \param wideChar Wide character to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(char ansiChar, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a single ANSI character and a locale
    ///
    /// The source character is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiChar ANSI character to convert
    /// \param locale   Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String();

    /// \brief Default constructor
    ///
    /// This constructor creates an empty string.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    static const std::size_t InvalidPos; ///< Represents an invalid position in the string
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    typedef std::basic_string<Uint32>::iterator       Iterator;      ///< Iterator type
    typedef std::basic_string<Uint32>::const_iterator ConstIterator; ///< Constant iterator type
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    // Types

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
class SFML_SYSTEM_API String

////////////////////////////////////////////////////////////
/// \brief Utility string class that automatically handles
///        conversions between types and encodings
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
#ifndef SFML_STRING_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp

////////////////////////////////////////////////////////////
/// \class sf::String
/// \ingroup system
///
/// sf::String is a utility string class defined mainly for
/// convenience. It is a Unicode string (implemented using
/// UTF-32), thus it can store any character in the world
/// (european, chinese, arabic, hebrew, etc.).
///
/// It automatically handles conversions from/to ANSI and
/// wide strings, so that you can work with standard string
/// classes and still be compatible with functions taking a
/// sf::String.
///
/// \code
/// sf::String s;
///
/// std::string s1 = s;  // automatically converted to ANSI string
/// std::wstring s2 = s; // automatically converted to wide string
/// s = "hello";         // automatically converted from ANSI string
/// s = L"hello";        // automatically converted from wide string
/// s += 'a';            // automatically converted from ANSI string
/// s += L'a';           // automatically converted from wide string
/// \endcode
///
/// Conversions involving ANSI strings use the default user locale. However
/// it is possible to use a custom locale if necessary:
/// \code
/// std::locale locale;
/// sf::String s;
/// ...
/// std::string s1 = s.toAnsiString(locale);
/// s = sf::String("hello", locale);
/// \endcode
///
/// sf::String defines the most important functions of the
/// standard std::string class: removing, random access, iterating,
/// appending, comparing, etc. However it is a simple class
/// provided for convenience, and you may have to consider using
/// a more optimized class if your program requires complex string
/// handling. The automatic conversion functions will then take
/// care of converting your string to sf::String whenever SFML
/// requires it.
///
/// Please note that SFML also defines a low-level, generic
/// interface for Unicode handling, see the sf::Utf classes.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API String operator +(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of binary + operator to concatenate two strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return Concatenated string
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator >=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of >= operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically greater or equal than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator <=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of <= operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically lesser or equal than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator >(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of > operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically greater than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator <(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of < operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically lesser than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator !=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of != operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if both strings are different
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator ==(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of == operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if both strings are equal
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
};

    ////////////////////////////////////////////////////////////
    std::basic_string<Uint32> m_string; ///< Internal string of UTF-32 characters
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ConstIterator end() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// The end iterator refers to 1 position past the last character;
    /// thus it represents an invalid character and should never be
    /// accessed.
    ///
    /// \return Read-only iterator to the end of the string characters
    ///
    /// \see begin
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Iterator end();

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// The end iterator refers to 1 position past the last character;
    /// thus it represents an invalid character and should never be
    /// accessed.
    ///
    /// \return Read-write iterator to the end of the string characters
    ///
    /// \see begin
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ConstIterator begin() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// \return Read-only iterator to the beginning of the string characters
    ///
    /// \see end
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Iterator begin();

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// \return Read-write iterator to the beginning of the string characters
    ///
    /// \see end
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    const Uint32* getData() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get a pointer to the C-style array of characters
    ///
    /// This functions provides a read-only access to a
    /// null-terminated C-style representation of the string.
    /// The returned pointer is temporary and is meant only for
    /// immediate use, thus it is not recommended to store it.
    ///
    /// \return Read-only pointer to the array of characters
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::size_t find(const String& str, std::size_t start = 0) const;

    ////////////////////////////////////////////////////////////
    /// \brief Find a sequence of one or more characters in the string
    ///
    /// This function searches for the characters of \a str
    /// into the string, starting from \a start.
    ///
    /// \param str   Characters to find
    /// \param start Where to begin searching
    ///
    /// \return Position of \a str in the string, or String::InvalidPos if not found
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void insert(std::size_t position, const String& str);

    ////////////////////////////////////////////////////////////
    /// \brief Insert one or more characters into the string
    ///
    /// This function inserts the characters of \a str
    /// into the string, starting from \a position.
    ///
    /// \param position Position of insertion
    /// \param str      Characters to insert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void erase(std::size_t position, std::size_t count = 1);

    ////////////////////////////////////////////////////////////
    /// \brief Erase one or more characters from the string
    ///
    /// This function removes a sequence of \a count characters
    /// starting from \a position.
    ///
    /// \param position Position of the first character to erase
    /// \param count    Number of characters to erase
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    bool isEmpty() const;

    ////////////////////////////////////////////////////////////
    /// \brief Check whether the string is empty or not
    ///
    /// \return True if the string is empty (i.e. contains no character)
    ///
    /// \see clear, getSize
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::size_t getSize() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the size of the string
    ///
    /// \return Number of characters in the string
    ///
    /// \see isEmpty
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void clear();

    ////////////////////////////////////////////////////////////
    /// \brief Clear the string
    ///
    /// This function removes all the characters from the string.
    ///
    /// \see isEmpty, erase
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Uint32& operator [](std::size_t index);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of [] operator to access a character by its position
    ///
    /// This function provides read and write access to characters.
    /// Note: this function doesn't throw if \a index is out of range.
    ///
    /// \param index Index of the character to get
    ///
    /// \return Reference to the character at position \a index
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Uint32 operator [](std::size_t index) const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of [] operator to access a character by its position
    ///
    /// This function provides read-only access to characters.
    /// Note: this function doesn't throw if \a index is out of range.
    ///
    /// \param index Index of the character to get
    ///
    /// \return Character at position \a index
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String& operator +=(const String& right);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of += operator to append an UTF-32 string
    ///
    /// \param right String to append
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String& operator =(const String& right);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of assignment operator
    ///
    /// \param right Instance to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::wstring toWideString() const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert the unicode string to a wide string
    ///
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    ///
    /// \return Converted wide string
    ///
    /// \see toAnsiString, operator std::wstring
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::string toAnsiString(const std::locale& locale = std::locale()) const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert the unicode string to an ANSI string
    ///
    /// The UTF-32 string is converted to an ANSI string in
    /// the encoding defined by \a locale.
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    ///
    /// \param locale Locale to use for conversion
    ///
    /// \return Converted ANSI string
    ///
    /// \see toWideString, operator std::string
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    operator std::wstring() const;

    ////////////////////////////////////////////////////////////
    /// \brief Implicit cast operator to std::wstring (wide string)
    ///
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    /// This operator is defined for convenience, and is equivalent
    /// to calling toWideString().
    ///
    /// \return Converted wide string
    ///
    /// \see toWideString, operator std::string
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    operator std::string() const;

    ////////////////////////////////////////////////////////////
    /// \brief Implicit cast operator to std::string (ANSI string)
    ///
    /// The current global locale is used for conversion. If you
    /// want to explicitely specify a locale, see toAnsiString.
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    /// This operator is defined for convenience, and is equivalent
    /// to calling toAnsiString().
    ///
    /// \return Converted ANSI string
    ///
    /// \see toAnsiString, operator std::wstring
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const String& copy);

    ////////////////////////////////////////////////////////////
    /// \brief Copy constructor
    ///
    /// \param copy Instance to copy
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::basic_string<Uint32>& utf32String);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from an UTF-32 string
    ///
    /// \param utf32String UTF-32 string to assign
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const Uint32* utf32String);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a null-terminated C-style UTF-32 string
    ///
    /// \param utf32String UTF-32 string to assign
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::wstring& wideString);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a wide string
    ///
    /// \param wideString Wide string to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const wchar_t* wideString);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from null-terminated C-style wide string
    ///
    /// \param wideString Wide string to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::string& ansiString, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from an ANSI string and a locale
    ///
    /// The source string is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiString ANSI string to convert
    /// \param locale     Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const char* ansiString, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a null-terminated C-style ANSI string and a locale
    ///
    /// The source string is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiString ANSI string to convert
    /// \param locale     Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(Uint32 utf32Char);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from single UTF-32 character
    ///
    /// \param utf32Char UTF-32 character to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(wchar_t wideChar);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from single wide character
    ///
    /// \param wideChar Wide character to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(char ansiChar, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a single ANSI character and a locale
    ///
    /// The source character is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiChar ANSI character to convert
    /// \param locale   Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String();

    /// \brief Default constructor
    ///
    /// This constructor creates an empty string.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    static const std::size_t InvalidPos; ///< Represents an invalid position in the string
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    typedef std::basic_string<Uint32>::iterator       Iterator;      ///< Iterator type
    typedef std::basic_string<Uint32>::const_iterator ConstIterator; ///< Constant iterator type
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    // Types

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
class SFML_SYSTEM_API String

////////////////////////////////////////////////////////////
/// \brief Utility string class that automatically handles
///        conversions between types and encodings
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
#ifndef SFML_STRING_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp

////////////////////////////////////////////////////////////
/// \class sf::String
/// \ingroup system
///
/// sf::String is a utility string class defined mainly for
/// convenience. It is a Unicode string (implemented using
/// UTF-32), thus it can store any character in the world
/// (european, chinese, arabic, hebrew, etc.).
///
/// It automatically handles conversions from/to ANSI and
/// wide strings, so that you can work with standard string
/// classes and still be compatible with functions taking a
/// sf::String.
///
/// \code
/// sf::String s;
///
/// std::string s1 = s;  // automatically converted to ANSI string
/// std::wstring s2 = s; // automatically converted to wide string
/// s = "hello";         // automatically converted from ANSI string
/// s = L"hello";        // automatically converted from wide string
/// s += 'a';            // automatically converted from ANSI string
/// s += L'a';           // automatically converted from wide string
/// \endcode
///
/// Conversions involving ANSI strings use the default user locale. However
/// it is possible to use a custom locale if necessary:
/// \code
/// std::locale locale;
/// sf::String s;
/// ...
/// std::string s1 = s.toAnsiString(locale);
/// s = sf::String("hello", locale);
/// \endcode
///
/// sf::String defines the most important functions of the
/// standard std::string class: removing, random access, iterating,
/// appending, comparing, etc. However it is a simple class
/// provided for convenience, and you may have to consider using
/// a more optimized class if your program requires complex string
/// handling. The automatic conversion functions will then take
/// care of converting your string to sf::String whenever SFML
/// requires it.
///
/// Please note that SFML also defines a low-level, generic
/// interface for Unicode handling, see the sf::Utf classes.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API String operator +(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of binary + operator to concatenate two strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return Concatenated string
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator >=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of >= operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically greater or equal than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator <=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of <= operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically lesser or equal than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator >(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of > operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically greater than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator <(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of < operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically lesser than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator !=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of != operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if both strings are different
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator ==(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of == operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if both strings are equal
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
};

    ////////////////////////////////////////////////////////////
    std::basic_string<Uint32> m_string; ///< Internal string of UTF-32 characters
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ConstIterator end() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// The end iterator refers to 1 position past the last character;
    /// thus it represents an invalid character and should never be
    /// accessed.
    ///
    /// \return Read-only iterator to the end of the string characters
    ///
    /// \see begin
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Iterator end();

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// The end iterator refers to 1 position past the last character;
    /// thus it represents an invalid character and should never be
    /// accessed.
    ///
    /// \return Read-write iterator to the end of the string characters
    ///
    /// \see begin
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ConstIterator begin() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// \return Read-only iterator to the beginning of the string characters
    ///
    /// \see end
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Iterator begin();

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// \return Read-write iterator to the beginning of the string characters
    ///
    /// \see end
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    const Uint32* getData() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get a pointer to the C-style array of characters
    ///
    /// This functions provides a read-only access to a
    /// null-terminated C-style representation of the string.
    /// The returned pointer is temporary and is meant only for
    /// immediate use, thus it is not recommended to store it.
    ///
    /// \return Read-only pointer to the array of characters
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::size_t find(const String& str, std::size_t start = 0) const;

    ////////////////////////////////////////////////////////////
    /// \brief Find a sequence of one or more characters in the string
    ///
    /// This function searches for the characters of \a str
    /// into the string, starting from \a start.
    ///
    /// \param str   Characters to find
    /// \param start Where to begin searching
    ///
    /// \return Position of \a str in the string, or String::InvalidPos if not found
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void insert(std::size_t position, const String& str);

    ////////////////////////////////////////////////////////////
    /// \brief Insert one or more characters into the string
    ///
    /// This function inserts the characters of \a str
    /// into the string, starting from \a position.
    ///
    /// \param position Position of insertion
    /// \param str      Characters to insert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void erase(std::size_t position, std::size_t count = 1);

    ////////////////////////////////////////////////////////////
    /// \brief Erase one or more characters from the string
    ///
    /// This function removes a sequence of \a count characters
    /// starting from \a position.
    ///
    /// \param position Position of the first character to erase
    /// \param count    Number of characters to erase
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    bool isEmpty() const;

    ////////////////////////////////////////////////////////////
    /// \brief Check whether the string is empty or not
    ///
    /// \return True if the string is empty (i.e. contains no character)
    ///
    /// \see clear, getSize
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::size_t getSize() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the size of the string
    ///
    /// \return Number of characters in the string
    ///
    /// \see isEmpty
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void clear();

    ////////////////////////////////////////////////////////////
    /// \brief Clear the string
    ///
    /// This function removes all the characters from the string.
    ///
    /// \see isEmpty, erase
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Uint32& operator [](std::size_t index);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of [] operator to access a character by its position
    ///
    /// This function provides read and write access to characters.
    /// Note: this function doesn't throw if \a index is out of range.
    ///
    /// \param index Index of the character to get
    ///
    /// \return Reference to the character at position \a index
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Uint32 operator [](std::size_t index) const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of [] operator to access a character by its position
    ///
    /// This function provides read-only access to characters.
    /// Note: this function doesn't throw if \a index is out of range.
    ///
    /// \param index Index of the character to get
    ///
    /// \return Character at position \a index
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String& operator +=(const String& right);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of += operator to append an UTF-32 string
    ///
    /// \param right String to append
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String& operator =(const String& right);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of assignment operator
    ///
    /// \param right Instance to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::wstring toWideString() const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert the unicode string to a wide string
    ///
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    ///
    /// \return Converted wide string
    ///
    /// \see toAnsiString, operator std::wstring
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::string toAnsiString(const std::locale& locale = std::locale()) const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert the unicode string to an ANSI string
    ///
    /// The UTF-32 string is converted to an ANSI string in
    /// the encoding defined by \a locale.
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    ///
    /// \param locale Locale to use for conversion
    ///
    /// \return Converted ANSI string
    ///
    /// \see toWideString, operator std::string
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    operator std::wstring() const;

    ////////////////////////////////////////////////////////////
    /// \brief Implicit cast operator to std::wstring (wide string)
    ///
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    /// This operator is defined for convenience, and is equivalent
    /// to calling toWideString().
    ///
    /// \return Converted wide string
    ///
    /// \see toWideString, operator std::string
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    operator std::string() const;

    ////////////////////////////////////////////////////////////
    /// \brief Implicit cast operator to std::string (ANSI string)
    ///
    /// The current global locale is used for conversion. If you
    /// want to explicitely specify a locale, see toAnsiString.
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    /// This operator is defined for convenience, and is equivalent
    /// to calling toAnsiString().
    ///
    /// \return Converted ANSI string
    ///
    /// \see toAnsiString, operator std::wstring
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const String& copy);

    ////////////////////////////////////////////////////////////
    /// \brief Copy constructor
    ///
    /// \param copy Instance to copy
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::basic_string<Uint32>& utf32String);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from an UTF-32 string
    ///
    /// \param utf32String UTF-32 string to assign
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const Uint32* utf32String);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a null-terminated C-style UTF-32 string
    ///
    /// \param utf32String UTF-32 string to assign
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::wstring& wideString);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a wide string
    ///
    /// \param wideString Wide string to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const wchar_t* wideString);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from null-terminated C-style wide string
    ///
    /// \param wideString Wide string to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::string& ansiString, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from an ANSI string and a locale
    ///
    /// The source string is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiString ANSI string to convert
    /// \param locale     Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const char* ansiString, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a null-terminated C-style ANSI string and a locale
    ///
    /// The source string is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiString ANSI string to convert
    /// \param locale     Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(Uint32 utf32Char);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from single UTF-32 character
    ///
    /// \param utf32Char UTF-32 character to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(wchar_t wideChar);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from single wide character
    ///
    /// \param wideChar Wide character to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(char ansiChar, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a single ANSI character and a locale
    ///
    /// The source character is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiChar ANSI character to convert
    /// \param locale   Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String();

    /// \brief Default constructor
    ///
    /// This constructor creates an empty string.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    static const std::size_t InvalidPos; ///< Represents an invalid position in the string
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    typedef std::basic_string<Uint32>::iterator       Iterator;      ///< Iterator type
    typedef std::basic_string<Uint32>::const_iterator ConstIterator; ///< Constant iterator type
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    // Types

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
class SFML_SYSTEM_API String

////////////////////////////////////////////////////////////
/// \brief Utility string class that automatically handles
///        conversions between types and encodings
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
#ifndef SFML_STRING_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp

////////////////////////////////////////////////////////////
/// \class sf::String
/// \ingroup system
///
/// sf::String is a utility string class defined mainly for
/// convenience. It is a Unicode string (implemented using
/// UTF-32), thus it can store any character in the world
/// (european, chinese, arabic, hebrew, etc.).
///
/// It automatically handles conversions from/to ANSI and
/// wide strings, so that you can work with standard string
/// classes and still be compatible with functions taking a
/// sf::String.
///
/// \code
/// sf::String s;
///
/// std::string s1 = s;  // automatically converted to ANSI string
/// std::wstring s2 = s; // automatically converted to wide string
/// s = "hello";         // automatically converted from ANSI string
/// s = L"hello";        // automatically converted from wide string
/// s += 'a';            // automatically converted from ANSI string
/// s += L'a';           // automatically converted from wide string
/// \endcode
///
/// Conversions involving ANSI strings use the default user locale. However
/// it is possible to use a custom locale if necessary:
/// \code
/// std::locale locale;
/// sf::String s;
/// ...
/// std::string s1 = s.toAnsiString(locale);
/// s = sf::String("hello", locale);
/// \endcode
///
/// sf::String defines the most important functions of the
/// standard std::string class: removing, random access, iterating,
/// appending, comparing, etc. However it is a simple class
/// provided for convenience, and you may have to consider using
/// a more optimized class if your program requires complex string
/// handling. The automatic conversion functions will then take
/// care of converting your string to sf::String whenever SFML
/// requires it.
///
/// Please note that SFML also defines a low-level, generic
/// interface for Unicode handling, see the sf::Utf classes.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API String operator +(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of binary + operator to concatenate two strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return Concatenated string
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator >=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of >= operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically greater or equal than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator <=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of <= operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically lesser or equal than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator >(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of > operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically greater than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator <(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of < operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically lesser than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator !=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of != operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if both strings are different
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator ==(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of == operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if both strings are equal
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
};

    ////////////////////////////////////////////////////////////
    std::basic_string<Uint32> m_string; ///< Internal string of UTF-32 characters
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ConstIterator end() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// The end iterator refers to 1 position past the last character;
    /// thus it represents an invalid character and should never be
    /// accessed.
    ///
    /// \return Read-only iterator to the end of the string characters
    ///
    /// \see begin
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Iterator end();

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// The end iterator refers to 1 position past the last character;
    /// thus it represents an invalid character and should never be
    /// accessed.
    ///
    /// \return Read-write iterator to the end of the string characters
    ///
    /// \see begin
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ConstIterator begin() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// \return Read-only iterator to the beginning of the string characters
    ///
    /// \see end
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Iterator begin();

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// \return Read-write iterator to the beginning of the string characters
    ///
    /// \see end
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    const Uint32* getData() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get a pointer to the C-style array of characters
    ///
    /// This functions provides a read-only access to a
    /// null-terminated C-style representation of the string.
    /// The returned pointer is temporary and is meant only for
    /// immediate use, thus it is not recommended to store it.
    ///
    /// \return Read-only pointer to the array of characters
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::size_t find(const String& str, std::size_t start = 0) const;

    ////////////////////////////////////////////////////////////
    /// \brief Find a sequence of one or more characters in the string
    ///
    /// This function searches for the characters of \a str
    /// into the string, starting from \a start.
    ///
    /// \param str   Characters to find
    /// \param start Where to begin searching
    ///
    /// \return Position of \a str in the string, or String::InvalidPos if not found
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void insert(std::size_t position, const String& str);

    ////////////////////////////////////////////////////////////
    /// \brief Insert one or more characters into the string
    ///
    /// This function inserts the characters of \a str
    /// into the string, starting from \a position.
    ///
    /// \param position Position of insertion
    /// \param str      Characters to insert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void erase(std::size_t position, std::size_t count = 1);

    ////////////////////////////////////////////////////////////
    /// \brief Erase one or more characters from the string
    ///
    /// This function removes a sequence of \a count characters
    /// starting from \a position.
    ///
    /// \param position Position of the first character to erase
    /// \param count    Number of characters to erase
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    bool isEmpty() const;

    ////////////////////////////////////////////////////////////
    /// \brief Check whether the string is empty or not
    ///
    /// \return True if the string is empty (i.e. contains no character)
    ///
    /// \see clear, getSize
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::size_t getSize() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the size of the string
    ///
    /// \return Number of characters in the string
    ///
    /// \see isEmpty
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void clear();

    ////////////////////////////////////////////////////////////
    /// \brief Clear the string
    ///
    /// This function removes all the characters from the string.
    ///
    /// \see isEmpty, erase
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Uint32& operator [](std::size_t index);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of [] operator to access a character by its position
    ///
    /// This function provides read and write access to characters.
    /// Note: this function doesn't throw if \a index is out of range.
    ///
    /// \param index Index of the character to get
    ///
    /// \return Reference to the character at position \a index
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Uint32 operator [](std::size_t index) const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of [] operator to access a character by its position
    ///
    /// This function provides read-only access to characters.
    /// Note: this function doesn't throw if \a index is out of range.
    ///
    /// \param index Index of the character to get
    ///
    /// \return Character at position \a index
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String& operator +=(const String& right);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of += operator to append an UTF-32 string
    ///
    /// \param right String to append
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String& operator =(const String& right);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of assignment operator
    ///
    /// \param right Instance to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::wstring toWideString() const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert the unicode string to a wide string
    ///
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    ///
    /// \return Converted wide string
    ///
    /// \see toAnsiString, operator std::wstring
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::string toAnsiString(const std::locale& locale = std::locale()) const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert the unicode string to an ANSI string
    ///
    /// The UTF-32 string is converted to an ANSI string in
    /// the encoding defined by \a locale.
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    ///
    /// \param locale Locale to use for conversion
    ///
    /// \return Converted ANSI string
    ///
    /// \see toWideString, operator std::string
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    operator std::wstring() const;

    ////////////////////////////////////////////////////////////
    /// \brief Implicit cast operator to std::wstring (wide string)
    ///
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    /// This operator is defined for convenience, and is equivalent
    /// to calling toWideString().
    ///
    /// \return Converted wide string
    ///
    /// \see toWideString, operator std::string
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    operator std::string() const;

    ////////////////////////////////////////////////////////////
    /// \brief Implicit cast operator to std::string (ANSI string)
    ///
    /// The current global locale is used for conversion. If you
    /// want to explicitely specify a locale, see toAnsiString.
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    /// This operator is defined for convenience, and is equivalent
    /// to calling toAnsiString().
    ///
    /// \return Converted ANSI string
    ///
    /// \see toAnsiString, operator std::wstring
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const String& copy);

    ////////////////////////////////////////////////////////////
    /// \brief Copy constructor
    ///
    /// \param copy Instance to copy
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::basic_string<Uint32>& utf32String);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from an UTF-32 string
    ///
    /// \param utf32String UTF-32 string to assign
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const Uint32* utf32String);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a null-terminated C-style UTF-32 string
    ///
    /// \param utf32String UTF-32 string to assign
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::wstring& wideString);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a wide string
    ///
    /// \param wideString Wide string to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const wchar_t* wideString);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from null-terminated C-style wide string
    ///
    /// \param wideString Wide string to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::string& ansiString, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from an ANSI string and a locale
    ///
    /// The source string is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiString ANSI string to convert
    /// \param locale     Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const char* ansiString, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a null-terminated C-style ANSI string and a locale
    ///
    /// The source string is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiString ANSI string to convert
    /// \param locale     Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(Uint32 utf32Char);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from single UTF-32 character
    ///
    /// \param utf32Char UTF-32 character to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(wchar_t wideChar);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from single wide character
    ///
    /// \param wideChar Wide character to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(char ansiChar, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a single ANSI character and a locale
    ///
    /// The source character is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiChar ANSI character to convert
    /// \param locale   Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String();

    /// \brief Default constructor
    ///
    /// This constructor creates an empty string.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    static const std::size_t InvalidPos; ///< Represents an invalid position in the string
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    typedef std::basic_string<Uint32>::iterator       Iterator;      ///< Iterator type
    typedef std::basic_string<Uint32>::const_iterator ConstIterator; ///< Constant iterator type
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    // Types

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
class SFML_SYSTEM_API String

////////////////////////////////////////////////////////////
/// \brief Utility string class that automatically handles
///        conversions between types and encodings
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
#ifndef SFML_STRING_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp

////////////////////////////////////////////////////////////
/// \class sf::String
/// \ingroup system
///
/// sf::String is a utility string class defined mainly for
/// convenience. It is a Unicode string (implemented using
/// UTF-32), thus it can store any character in the world
/// (european, chinese, arabic, hebrew, etc.).
///
/// It automatically handles conversions from/to ANSI and
/// wide strings, so that you can work with standard string
/// classes and still be compatible with functions taking a
/// sf::String.
///
/// \code
/// sf::String s;
///
/// std::string s1 = s;  // automatically converted to ANSI string
/// std::wstring s2 = s; // automatically converted to wide string
/// s = "hello";         // automatically converted from ANSI string
/// s = L"hello";        // automatically converted from wide string
/// s += 'a';            // automatically converted from ANSI string
/// s += L'a';           // automatically converted from wide string
/// \endcode
///
/// Conversions involving ANSI strings use the default user locale. However
/// it is possible to use a custom locale if necessary:
/// \code
/// std::locale locale;
/// sf::String s;
/// ...
/// std::string s1 = s.toAnsiString(locale);
/// s = sf::String("hello", locale);
/// \endcode
///
/// sf::String defines the most important functions of the
/// standard std::string class: removing, random access, iterating,
/// appending, comparing, etc. However it is a simple class
/// provided for convenience, and you may have to consider using
/// a more optimized class if your program requires complex string
/// handling. The automatic conversion functions will then take
/// care of converting your string to sf::String whenever SFML
/// requires it.
///
/// Please note that SFML also defines a low-level, generic
/// interface for Unicode handling, see the sf::Utf classes.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API String operator +(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of binary + operator to concatenate two strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return Concatenated string
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator >=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of >= operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically greater or equal than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator <=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of <= operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically lesser or equal than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator >(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of > operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically greater than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator <(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of < operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically lesser than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator !=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of != operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if both strings are different
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator ==(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of == operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if both strings are equal
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
};

    ////////////////////////////////////////////////////////////
    std::basic_string<Uint32> m_string; ///< Internal string of UTF-32 characters
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ConstIterator end() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// The end iterator refers to 1 position past the last character;
    /// thus it represents an invalid character and should never be
    /// accessed.
    ///
    /// \return Read-only iterator to the end of the string characters
    ///
    /// \see begin
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Iterator end();

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// The end iterator refers to 1 position past the last character;
    /// thus it represents an invalid character and should never be
    /// accessed.
    ///
    /// \return Read-write iterator to the end of the string characters
    ///
    /// \see begin
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ConstIterator begin() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// \return Read-only iterator to the beginning of the string characters
    ///
    /// \see end
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Iterator begin();

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// \return Read-write iterator to the beginning of the string characters
    ///
    /// \see end
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    const Uint32* getData() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get a pointer to the C-style array of characters
    ///
    /// This functions provides a read-only access to a
    /// null-terminated C-style representation of the string.
    /// The returned pointer is temporary and is meant only for
    /// immediate use, thus it is not recommended to store it.
    ///
    /// \return Read-only pointer to the array of characters
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::size_t find(const String& str, std::size_t start = 0) const;

    ////////////////////////////////////////////////////////////
    /// \brief Find a sequence of one or more characters in the string
    ///
    /// This function searches for the characters of \a str
    /// into the string, starting from \a start.
    ///
    /// \param str   Characters to find
    /// \param start Where to begin searching
    ///
    /// \return Position of \a str in the string, or String::InvalidPos if not found
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void insert(std::size_t position, const String& str);

    ////////////////////////////////////////////////////////////
    /// \brief Insert one or more characters into the string
    ///
    /// This function inserts the characters of \a str
    /// into the string, starting from \a position.
    ///
    /// \param position Position of insertion
    /// \param str      Characters to insert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void erase(std::size_t position, std::size_t count = 1);

    ////////////////////////////////////////////////////////////
    /// \brief Erase one or more characters from the string
    ///
    /// This function removes a sequence of \a count characters
    /// starting from \a position.
    ///
    /// \param position Position of the first character to erase
    /// \param count    Number of characters to erase
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    bool isEmpty() const;

    ////////////////////////////////////////////////////////////
    /// \brief Check whether the string is empty or not
    ///
    /// \return True if the string is empty (i.e. contains no character)
    ///
    /// \see clear, getSize
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::size_t getSize() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the size of the string
    ///
    /// \return Number of characters in the string
    ///
    /// \see isEmpty
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void clear();

    ////////////////////////////////////////////////////////////
    /// \brief Clear the string
    ///
    /// This function removes all the characters from the string.
    ///
    /// \see isEmpty, erase
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Uint32& operator [](std::size_t index);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of [] operator to access a character by its position
    ///
    /// This function provides read and write access to characters.
    /// Note: this function doesn't throw if \a index is out of range.
    ///
    /// \param index Index of the character to get
    ///
    /// \return Reference to the character at position \a index
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Uint32 operator [](std::size_t index) const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of [] operator to access a character by its position
    ///
    /// This function provides read-only access to characters.
    /// Note: this function doesn't throw if \a index is out of range.
    ///
    /// \param index Index of the character to get
    ///
    /// \return Character at position \a index
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String& operator +=(const String& right);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of += operator to append an UTF-32 string
    ///
    /// \param right String to append
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String& operator =(const String& right);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of assignment operator
    ///
    /// \param right Instance to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::wstring toWideString() const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert the unicode string to a wide string
    ///
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    ///
    /// \return Converted wide string
    ///
    /// \see toAnsiString, operator std::wstring
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::string toAnsiString(const std::locale& locale = std::locale()) const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert the unicode string to an ANSI string
    ///
    /// The UTF-32 string is converted to an ANSI string in
    /// the encoding defined by \a locale.
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    ///
    /// \param locale Locale to use for conversion
    ///
    /// \return Converted ANSI string
    ///
    /// \see toWideString, operator std::string
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    operator std::wstring() const;

    ////////////////////////////////////////////////////////////
    /// \brief Implicit cast operator to std::wstring (wide string)
    ///
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    /// This operator is defined for convenience, and is equivalent
    /// to calling toWideString().
    ///
    /// \return Converted wide string
    ///
    /// \see toWideString, operator std::string
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    operator std::string() const;

    ////////////////////////////////////////////////////////////
    /// \brief Implicit cast operator to std::string (ANSI string)
    ///
    /// The current global locale is used for conversion. If you
    /// want to explicitely specify a locale, see toAnsiString.
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    /// This operator is defined for convenience, and is equivalent
    /// to calling toAnsiString().
    ///
    /// \return Converted ANSI string
    ///
    /// \see toAnsiString, operator std::wstring
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const String& copy);

    ////////////////////////////////////////////////////////////
    /// \brief Copy constructor
    ///
    /// \param copy Instance to copy
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::basic_string<Uint32>& utf32String);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from an UTF-32 string
    ///
    /// \param utf32String UTF-32 string to assign
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const Uint32* utf32String);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a null-terminated C-style UTF-32 string
    ///
    /// \param utf32String UTF-32 string to assign
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::wstring& wideString);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a wide string
    ///
    /// \param wideString Wide string to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const wchar_t* wideString);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from null-terminated C-style wide string
    ///
    /// \param wideString Wide string to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::string& ansiString, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from an ANSI string and a locale
    ///
    /// The source string is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiString ANSI string to convert
    /// \param locale     Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const char* ansiString, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a null-terminated C-style ANSI string and a locale
    ///
    /// The source string is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiString ANSI string to convert
    /// \param locale     Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(Uint32 utf32Char);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from single UTF-32 character
    ///
    /// \param utf32Char UTF-32 character to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(wchar_t wideChar);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from single wide character
    ///
    /// \param wideChar Wide character to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(char ansiChar, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a single ANSI character and a locale
    ///
    /// The source character is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiChar ANSI character to convert
    /// \param locale   Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String();

    /// \brief Default constructor
    ///
    /// This constructor creates an empty string.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    static const std::size_t InvalidPos; ///< Represents an invalid position in the string
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    typedef std::basic_string<Uint32>::iterator       Iterator;      ///< Iterator type
    typedef std::basic_string<Uint32>::const_iterator ConstIterator; ///< Constant iterator type
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    // Types

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
class SFML_SYSTEM_API String

////////////////////////////////////////////////////////////
/// \brief Utility string class that automatically handles
///        conversions between types and encodings
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
#ifndef SFML_STRING_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp

////////////////////////////////////////////////////////////
/// \class sf::String
/// \ingroup system
///
/// sf::String is a utility string class defined mainly for
/// convenience. It is a Unicode string (implemented using
/// UTF-32), thus it can store any character in the world
/// (european, chinese, arabic, hebrew, etc.).
///
/// It automatically handles conversions from/to ANSI and
/// wide strings, so that you can work with standard string
/// classes and still be compatible with functions taking a
/// sf::String.
///
/// \code
/// sf::String s;
///
/// std::string s1 = s;  // automatically converted to ANSI string
/// std::wstring s2 = s; // automatically converted to wide string
/// s = "hello";         // automatically converted from ANSI string
/// s = L"hello";        // automatically converted from wide string
/// s += 'a';            // automatically converted from ANSI string
/// s += L'a';           // automatically converted from wide string
/// \endcode
///
/// Conversions involving ANSI strings use the default user locale. However
/// it is possible to use a custom locale if necessary:
/// \code
/// std::locale locale;
/// sf::String s;
/// ...
/// std::string s1 = s.toAnsiString(locale);
/// s = sf::String("hello", locale);
/// \endcode
///
/// sf::String defines the most important functions of the
/// standard std::string class: removing, random access, iterating,
/// appending, comparing, etc. However it is a simple class
/// provided for convenience, and you may have to consider using
/// a more optimized class if your program requires complex string
/// handling. The automatic conversion functions will then take
/// care of converting your string to sf::String whenever SFML
/// requires it.
///
/// Please note that SFML also defines a low-level, generic
/// interface for Unicode handling, see the sf::Utf classes.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API String operator +(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of binary + operator to concatenate two strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return Concatenated string
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator >=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of >= operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically greater or equal than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator <=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of <= operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically lesser or equal than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator >(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of > operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically greater than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator <(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of < operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically lesser than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator !=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of != operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if both strings are different
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator ==(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of == operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if both strings are equal
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
};

    ////////////////////////////////////////////////////////////
    std::basic_string<Uint32> m_string; ///< Internal string of UTF-32 characters
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ConstIterator end() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// The end iterator refers to 1 position past the last character;
    /// thus it represents an invalid character and should never be
    /// accessed.
    ///
    /// \return Read-only iterator to the end of the string characters
    ///
    /// \see begin
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Iterator end();

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// The end iterator refers to 1 position past the last character;
    /// thus it represents an invalid character and should never be
    /// accessed.
    ///
    /// \return Read-write iterator to the end of the string characters
    ///
    /// \see begin
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ConstIterator begin() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// \return Read-only iterator to the beginning of the string characters
    ///
    /// \see end
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Iterator begin();

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// \return Read-write iterator to the beginning of the string characters
    ///
    /// \see end
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    const Uint32* getData() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get a pointer to the C-style array of characters
    ///
    /// This functions provides a read-only access to a
    /// null-terminated C-style representation of the string.
    /// The returned pointer is temporary and is meant only for
    /// immediate use, thus it is not recommended to store it.
    ///
    /// \return Read-only pointer to the array of characters
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::size_t find(const String& str, std::size_t start = 0) const;

    ////////////////////////////////////////////////////////////
    /// \brief Find a sequence of one or more characters in the string
    ///
    /// This function searches for the characters of \a str
    /// into the string, starting from \a start.
    ///
    /// \param str   Characters to find
    /// \param start Where to begin searching
    ///
    /// \return Position of \a str in the string, or String::InvalidPos if not found
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void insert(std::size_t position, const String& str);

    ////////////////////////////////////////////////////////////
    /// \brief Insert one or more characters into the string
    ///
    /// This function inserts the characters of \a str
    /// into the string, starting from \a position.
    ///
    /// \param position Position of insertion
    /// \param str      Characters to insert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void erase(std::size_t position, std::size_t count = 1);

    ////////////////////////////////////////////////////////////
    /// \brief Erase one or more characters from the string
    ///
    /// This function removes a sequence of \a count characters
    /// starting from \a position.
    ///
    /// \param position Position of the first character to erase
    /// \param count    Number of characters to erase
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    bool isEmpty() const;

    ////////////////////////////////////////////////////////////
    /// \brief Check whether the string is empty or not
    ///
    /// \return True if the string is empty (i.e. contains no character)
    ///
    /// \see clear, getSize
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::size_t getSize() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the size of the string
    ///
    /// \return Number of characters in the string
    ///
    /// \see isEmpty
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void clear();

    ////////////////////////////////////////////////////////////
    /// \brief Clear the string
    ///
    /// This function removes all the characters from the string.
    ///
    /// \see isEmpty, erase
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Uint32& operator [](std::size_t index);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of [] operator to access a character by its position
    ///
    /// This function provides read and write access to characters.
    /// Note: this function doesn't throw if \a index is out of range.
    ///
    /// \param index Index of the character to get
    ///
    /// \return Reference to the character at position \a index
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Uint32 operator [](std::size_t index) const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of [] operator to access a character by its position
    ///
    /// This function provides read-only access to characters.
    /// Note: this function doesn't throw if \a index is out of range.
    ///
    /// \param index Index of the character to get
    ///
    /// \return Character at position \a index
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String& operator +=(const String& right);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of += operator to append an UTF-32 string
    ///
    /// \param right String to append
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String& operator =(const String& right);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of assignment operator
    ///
    /// \param right Instance to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::wstring toWideString() const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert the unicode string to a wide string
    ///
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    ///
    /// \return Converted wide string
    ///
    /// \see toAnsiString, operator std::wstring
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::string toAnsiString(const std::locale& locale = std::locale()) const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert the unicode string to an ANSI string
    ///
    /// The UTF-32 string is converted to an ANSI string in
    /// the encoding defined by \a locale.
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    ///
    /// \param locale Locale to use for conversion
    ///
    /// \return Converted ANSI string
    ///
    /// \see toWideString, operator std::string
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    operator std::wstring() const;

    ////////////////////////////////////////////////////////////
    /// \brief Implicit cast operator to std::wstring (wide string)
    ///
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    /// This operator is defined for convenience, and is equivalent
    /// to calling toWideString().
    ///
    /// \return Converted wide string
    ///
    /// \see toWideString, operator std::string
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    operator std::string() const;

    ////////////////////////////////////////////////////////////
    /// \brief Implicit cast operator to std::string (ANSI string)
    ///
    /// The current global locale is used for conversion. If you
    /// want to explicitely specify a locale, see toAnsiString.
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    /// This operator is defined for convenience, and is equivalent
    /// to calling toAnsiString().
    ///
    /// \return Converted ANSI string
    ///
    /// \see toAnsiString, operator std::wstring
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const String& copy);

    ////////////////////////////////////////////////////////////
    /// \brief Copy constructor
    ///
    /// \param copy Instance to copy
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::basic_string<Uint32>& utf32String);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from an UTF-32 string
    ///
    /// \param utf32String UTF-32 string to assign
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const Uint32* utf32String);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a null-terminated C-style UTF-32 string
    ///
    /// \param utf32String UTF-32 string to assign
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::wstring& wideString);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a wide string
    ///
    /// \param wideString Wide string to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const wchar_t* wideString);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from null-terminated C-style wide string
    ///
    /// \param wideString Wide string to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::string& ansiString, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from an ANSI string and a locale
    ///
    /// The source string is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiString ANSI string to convert
    /// \param locale     Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const char* ansiString, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a null-terminated C-style ANSI string and a locale
    ///
    /// The source string is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiString ANSI string to convert
    /// \param locale     Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(Uint32 utf32Char);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from single UTF-32 character
    ///
    /// \param utf32Char UTF-32 character to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(wchar_t wideChar);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from single wide character
    ///
    /// \param wideChar Wide character to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(char ansiChar, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a single ANSI character and a locale
    ///
    /// The source character is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiChar ANSI character to convert
    /// \param locale   Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String();

    /// \brief Default constructor
    ///
    /// This constructor creates an empty string.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    static const std::size_t InvalidPos; ///< Represents an invalid position in the string
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    typedef std::basic_string<Uint32>::iterator       Iterator;      ///< Iterator type
    typedef std::basic_string<Uint32>::const_iterator ConstIterator; ///< Constant iterator type
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    // Types

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
class SFML_SYSTEM_API String

////////////////////////////////////////////////////////////
/// \brief Utility string class that automatically handles
///        conversions between types and encodings
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
#ifndef SFML_STRING_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp

////////////////////////////////////////////////////////////
/// \class sf::String
/// \ingroup system
///
/// sf::String is a utility string class defined mainly for
/// convenience. It is a Unicode string (implemented using
/// UTF-32), thus it can store any character in the world
/// (european, chinese, arabic, hebrew, etc.).
///
/// It automatically handles conversions from/to ANSI and
/// wide strings, so that you can work with standard string
/// classes and still be compatible with functions taking a
/// sf::String.
///
/// \code
/// sf::String s;
///
/// std::string s1 = s;  // automatically converted to ANSI string
/// std::wstring s2 = s; // automatically converted to wide string
/// s = "hello";         // automatically converted from ANSI string
/// s = L"hello";        // automatically converted from wide string
/// s += 'a';            // automatically converted from ANSI string
/// s += L'a';           // automatically converted from wide string
/// \endcode
///
/// Conversions involving ANSI strings use the default user locale. However
/// it is possible to use a custom locale if necessary:
/// \code
/// std::locale locale;
/// sf::String s;
/// ...
/// std::string s1 = s.toAnsiString(locale);
/// s = sf::String("hello", locale);
/// \endcode
///
/// sf::String defines the most important functions of the
/// standard std::string class: removing, random access, iterating,
/// appending, comparing, etc. However it is a simple class
/// provided for convenience, and you may have to consider using
/// a more optimized class if your program requires complex string
/// handling. The automatic conversion functions will then take
/// care of converting your string to sf::String whenever SFML
/// requires it.
///
/// Please note that SFML also defines a low-level, generic
/// interface for Unicode handling, see the sf::Utf classes.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API String operator +(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of binary + operator to concatenate two strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return Concatenated string
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator >=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of >= operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically greater or equal than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator <=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of <= operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically lesser or equal than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator >(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of > operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically greater than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator <(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of < operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically lesser than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator !=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of != operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if both strings are different
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator ==(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of == operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if both strings are equal
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
};

    ////////////////////////////////////////////////////////////
    std::basic_string<Uint32> m_string; ///< Internal string of UTF-32 characters
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ConstIterator end() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// The end iterator refers to 1 position past the last character;
    /// thus it represents an invalid character and should never be
    /// accessed.
    ///
    /// \return Read-only iterator to the end of the string characters
    ///
    /// \see begin
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Iterator end();

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// The end iterator refers to 1 position past the last character;
    /// thus it represents an invalid character and should never be
    /// accessed.
    ///
    /// \return Read-write iterator to the end of the string characters
    ///
    /// \see begin
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ConstIterator begin() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// \return Read-only iterator to the beginning of the string characters
    ///
    /// \see end
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Iterator begin();

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// \return Read-write iterator to the beginning of the string characters
    ///
    /// \see end
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    const Uint32* getData() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get a pointer to the C-style array of characters
    ///
    /// This functions provides a read-only access to a
    /// null-terminated C-style representation of the string.
    /// The returned pointer is temporary and is meant only for
    /// immediate use, thus it is not recommended to store it.
    ///
    /// \return Read-only pointer to the array of characters
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::size_t find(const String& str, std::size_t start = 0) const;

    ////////////////////////////////////////////////////////////
    /// \brief Find a sequence of one or more characters in the string
    ///
    /// This function searches for the characters of \a str
    /// into the string, starting from \a start.
    ///
    /// \param str   Characters to find
    /// \param start Where to begin searching
    ///
    /// \return Position of \a str in the string, or String::InvalidPos if not found
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void insert(std::size_t position, const String& str);

    ////////////////////////////////////////////////////////////
    /// \brief Insert one or more characters into the string
    ///
    /// This function inserts the characters of \a str
    /// into the string, starting from \a position.
    ///
    /// \param position Position of insertion
    /// \param str      Characters to insert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void erase(std::size_t position, std::size_t count = 1);

    ////////////////////////////////////////////////////////////
    /// \brief Erase one or more characters from the string
    ///
    /// This function removes a sequence of \a count characters
    /// starting from \a position.
    ///
    /// \param position Position of the first character to erase
    /// \param count    Number of characters to erase
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    bool isEmpty() const;

    ////////////////////////////////////////////////////////////
    /// \brief Check whether the string is empty or not
    ///
    /// \return True if the string is empty (i.e. contains no character)
    ///
    /// \see clear, getSize
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::size_t getSize() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the size of the string
    ///
    /// \return Number of characters in the string
    ///
    /// \see isEmpty
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void clear();

    ////////////////////////////////////////////////////////////
    /// \brief Clear the string
    ///
    /// This function removes all the characters from the string.
    ///
    /// \see isEmpty, erase
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Uint32& operator [](std::size_t index);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of [] operator to access a character by its position
    ///
    /// This function provides read and write access to characters.
    /// Note: this function doesn't throw if \a index is out of range.
    ///
    /// \param index Index of the character to get
    ///
    /// \return Reference to the character at position \a index
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Uint32 operator [](std::size_t index) const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of [] operator to access a character by its position
    ///
    /// This function provides read-only access to characters.
    /// Note: this function doesn't throw if \a index is out of range.
    ///
    /// \param index Index of the character to get
    ///
    /// \return Character at position \a index
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String& operator +=(const String& right);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of += operator to append an UTF-32 string
    ///
    /// \param right String to append
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String& operator =(const String& right);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of assignment operator
    ///
    /// \param right Instance to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::wstring toWideString() const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert the unicode string to a wide string
    ///
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    ///
    /// \return Converted wide string
    ///
    /// \see toAnsiString, operator std::wstring
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::string toAnsiString(const std::locale& locale = std::locale()) const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert the unicode string to an ANSI string
    ///
    /// The UTF-32 string is converted to an ANSI string in
    /// the encoding defined by \a locale.
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    ///
    /// \param locale Locale to use for conversion
    ///
    /// \return Converted ANSI string
    ///
    /// \see toWideString, operator std::string
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    operator std::wstring() const;

    ////////////////////////////////////////////////////////////
    /// \brief Implicit cast operator to std::wstring (wide string)
    ///
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    /// This operator is defined for convenience, and is equivalent
    /// to calling toWideString().
    ///
    /// \return Converted wide string
    ///
    /// \see toWideString, operator std::string
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    operator std::string() const;

    ////////////////////////////////////////////////////////////
    /// \brief Implicit cast operator to std::string (ANSI string)
    ///
    /// The current global locale is used for conversion. If you
    /// want to explicitely specify a locale, see toAnsiString.
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    /// This operator is defined for convenience, and is equivalent
    /// to calling toAnsiString().
    ///
    /// \return Converted ANSI string
    ///
    /// \see toAnsiString, operator std::wstring
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const String& copy);

    ////////////////////////////////////////////////////////////
    /// \brief Copy constructor
    ///
    /// \param copy Instance to copy
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::basic_string<Uint32>& utf32String);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from an UTF-32 string
    ///
    /// \param utf32String UTF-32 string to assign
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const Uint32* utf32String);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a null-terminated C-style UTF-32 string
    ///
    /// \param utf32String UTF-32 string to assign
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::wstring& wideString);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a wide string
    ///
    /// \param wideString Wide string to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const wchar_t* wideString);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from null-terminated C-style wide string
    ///
    /// \param wideString Wide string to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::string& ansiString, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from an ANSI string and a locale
    ///
    /// The source string is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiString ANSI string to convert
    /// \param locale     Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const char* ansiString, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a null-terminated C-style ANSI string and a locale
    ///
    /// The source string is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiString ANSI string to convert
    /// \param locale     Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(Uint32 utf32Char);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from single UTF-32 character
    ///
    /// \param utf32Char UTF-32 character to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(wchar_t wideChar);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from single wide character
    ///
    /// \param wideChar Wide character to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(char ansiChar, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a single ANSI character and a locale
    ///
    /// The source character is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiChar ANSI character to convert
    /// \param locale   Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String();

    /// \brief Default constructor
    ///
    /// This constructor creates an empty string.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    static const std::size_t InvalidPos; ///< Represents an invalid position in the string
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    typedef std::basic_string<Uint32>::iterator       Iterator;      ///< Iterator type
    typedef std::basic_string<Uint32>::const_iterator ConstIterator; ///< Constant iterator type
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    // Types

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
class SFML_SYSTEM_API String

////////////////////////////////////////////////////////////
/// \brief Utility string class that automatically handles
///        conversions between types and encodings
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
#ifndef SFML_STRING_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp

////////////////////////////////////////////////////////////
/// \class sf::String
/// \ingroup system
///
/// sf::String is a utility string class defined mainly for
/// convenience. It is a Unicode string (implemented using
/// UTF-32), thus it can store any character in the world
/// (european, chinese, arabic, hebrew, etc.).
///
/// It automatically handles conversions from/to ANSI and
/// wide strings, so that you can work with standard string
/// classes and still be compatible with functions taking a
/// sf::String.
///
/// \code
/// sf::String s;
///
/// std::string s1 = s;  // automatically converted to ANSI string
/// std::wstring s2 = s; // automatically converted to wide string
/// s = "hello";         // automatically converted from ANSI string
/// s = L"hello";        // automatically converted from wide string
/// s += 'a';            // automatically converted from ANSI string
/// s += L'a';           // automatically converted from wide string
/// \endcode
///
/// Conversions involving ANSI strings use the default user locale. However
/// it is possible to use a custom locale if necessary:
/// \code
/// std::locale locale;
/// sf::String s;
/// ...
/// std::string s1 = s.toAnsiString(locale);
/// s = sf::String("hello", locale);
/// \endcode
///
/// sf::String defines the most important functions of the
/// standard std::string class: removing, random access, iterating,
/// appending, comparing, etc. However it is a simple class
/// provided for convenience, and you may have to consider using
/// a more optimized class if your program requires complex string
/// handling. The automatic conversion functions will then take
/// care of converting your string to sf::String whenever SFML
/// requires it.
///
/// Please note that SFML also defines a low-level, generic
/// interface for Unicode handling, see the sf::Utf classes.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API String operator +(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of binary + operator to concatenate two strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return Concatenated string
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator >=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of >= operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically greater or equal than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator <=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of <= operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically lesser or equal than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator >(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of > operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically greater than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator <(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of < operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if \a left is alphabetically lesser than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator !=(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of != operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if both strings are different
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
SFML_SYSTEM_API bool operator ==(const String& left, const String& right);

////////////////////////////////////////////////////////////
/// \relates String
/// \brief Overload of == operator to compare two UTF-32 strings
///
/// \param left  Left operand (a string)
/// \param right Right operand (a string)
///
/// \return True if both strings are equal
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
};

    ////////////////////////////////////////////////////////////
    std::basic_string<Uint32> m_string; ///< Internal string of UTF-32 characters
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ConstIterator end() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// The end iterator refers to 1 position past the last character;
    /// thus it represents an invalid character and should never be
    /// accessed.
    ///
    /// \return Read-only iterator to the end of the string characters
    ///
    /// \see begin
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Iterator end();

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// The end iterator refers to 1 position past the last character;
    /// thus it represents an invalid character and should never be
    /// accessed.
    ///
    /// \return Read-write iterator to the end of the string characters
    ///
    /// \see begin
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ConstIterator begin() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// \return Read-only iterator to the beginning of the string characters
    ///
    /// \see end
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Iterator begin();

    ////////////////////////////////////////////////////////////
    /// \brief Return an iterator to the beginning of the string
    ///
    /// \return Read-write iterator to the beginning of the string characters
    ///
    /// \see end
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    const Uint32* getData() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get a pointer to the C-style array of characters
    ///
    /// This functions provides a read-only access to a
    /// null-terminated C-style representation of the string.
    /// The returned pointer is temporary and is meant only for
    /// immediate use, thus it is not recommended to store it.
    ///
    /// \return Read-only pointer to the array of characters
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::size_t find(const String& str, std::size_t start = 0) const;

    ////////////////////////////////////////////////////////////
    /// \brief Find a sequence of one or more characters in the string
    ///
    /// This function searches for the characters of \a str
    /// into the string, starting from \a start.
    ///
    /// \param str   Characters to find
    /// \param start Where to begin searching
    ///
    /// \return Position of \a str in the string, or String::InvalidPos if not found
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void insert(std::size_t position, const String& str);

    ////////////////////////////////////////////////////////////
    /// \brief Insert one or more characters into the string
    ///
    /// This function inserts the characters of \a str
    /// into the string, starting from \a position.
    ///
    /// \param position Position of insertion
    /// \param str      Characters to insert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void erase(std::size_t position, std::size_t count = 1);

    ////////////////////////////////////////////////////////////
    /// \brief Erase one or more characters from the string
    ///
    /// This function removes a sequence of \a count characters
    /// starting from \a position.
    ///
    /// \param position Position of the first character to erase
    /// \param count    Number of characters to erase
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    bool isEmpty() const;

    ////////////////////////////////////////////////////////////
    /// \brief Check whether the string is empty or not
    ///
    /// \return True if the string is empty (i.e. contains no character)
    ///
    /// \see clear, getSize
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::size_t getSize() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the size of the string
    ///
    /// \return Number of characters in the string
    ///
    /// \see isEmpty
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    void clear();

    ////////////////////////////////////////////////////////////
    /// \brief Clear the string
    ///
    /// This function removes all the characters from the string.
    ///
    /// \see isEmpty, erase
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Uint32& operator [](std::size_t index);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of [] operator to access a character by its position
    ///
    /// This function provides read and write access to characters.
    /// Note: this function doesn't throw if \a index is out of range.
    ///
    /// \param index Index of the character to get
    ///
    /// \return Reference to the character at position \a index
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    Uint32 operator [](std::size_t index) const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of [] operator to access a character by its position
    ///
    /// This function provides read-only access to characters.
    /// Note: this function doesn't throw if \a index is out of range.
    ///
    /// \param index Index of the character to get
    ///
    /// \return Character at position \a index
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String& operator +=(const String& right);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of += operator to append an UTF-32 string
    ///
    /// \param right String to append
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String& operator =(const String& right);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of assignment operator
    ///
    /// \param right Instance to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::wstring toWideString() const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert the unicode string to a wide string
    ///
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    ///
    /// \return Converted wide string
    ///
    /// \see toAnsiString, operator std::wstring
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    std::string toAnsiString(const std::locale& locale = std::locale()) const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert the unicode string to an ANSI string
    ///
    /// The UTF-32 string is converted to an ANSI string in
    /// the encoding defined by \a locale.
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    ///
    /// \param locale Locale to use for conversion
    ///
    /// \return Converted ANSI string
    ///
    /// \see toWideString, operator std::string
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    operator std::wstring() const;

    ////////////////////////////////////////////////////////////
    /// \brief Implicit cast operator to std::wstring (wide string)
    ///
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    /// This operator is defined for convenience, and is equivalent
    /// to calling toWideString().
    ///
    /// \return Converted wide string
    ///
    /// \see toWideString, operator std::string
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    operator std::string() const;

    ////////////////////////////////////////////////////////////
    /// \brief Implicit cast operator to std::string (ANSI string)
    ///
    /// The current global locale is used for conversion. If you
    /// want to explicitely specify a locale, see toAnsiString.
    /// Characters that do not fit in the target encoding are
    /// discarded from the returned string.
    /// This operator is defined for convenience, and is equivalent
    /// to calling toAnsiString().
    ///
    /// \return Converted ANSI string
    ///
    /// \see toAnsiString, operator std::wstring
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const String& copy);

    ////////////////////////////////////////////////////////////
    /// \brief Copy constructor
    ///
    /// \param copy Instance to copy
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::basic_string<Uint32>& utf32String);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from an UTF-32 string
    ///
    /// \param utf32String UTF-32 string to assign
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const Uint32* utf32String);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a null-terminated C-style UTF-32 string
    ///
    /// \param utf32String UTF-32 string to assign
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::wstring& wideString);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a wide string
    ///
    /// \param wideString Wide string to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const wchar_t* wideString);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from null-terminated C-style wide string
    ///
    /// \param wideString Wide string to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const std::string& ansiString, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from an ANSI string and a locale
    ///
    /// The source string is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiString ANSI string to convert
    /// \param locale     Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(const char* ansiString, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a null-terminated C-style ANSI string and a locale
    ///
    /// The source string is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiString ANSI string to convert
    /// \param locale     Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(Uint32 utf32Char);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from single UTF-32 character
    ///
    /// \param utf32Char UTF-32 character to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(wchar_t wideChar);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from single wide character
    ///
    /// \param wideChar Wide character to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String(char ansiChar, const std::locale& locale = std::locale());

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a single ANSI character and a locale
    ///
    /// The source character is converted to UTF-32 according
    /// to the given locale.
    ///
    /// \param ansiChar ANSI character to convert
    /// \param locale   Locale to use for conversion
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    String();

    /// \brief Default constructor
    ///
    /// This constructor creates an empty string.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    static const std::size_t InvalidPos; ///< Represents an invalid position in the string
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    typedef std::basic_string<Uint32>::iterator       Iterator;      ///< Iterator type
    typedef std::basic_string<Uint32>::const_iterator ConstIterator; ///< Constant iterator type
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
    // Types

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
class SFML_SYSTEM_API String

////////////////////////////////////////////////////////////
/// \brief Utility string class that automatically handles
///        conversions between types and encodings
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
#ifndef SFML_STRING_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/String.hpp
//

////////////////////////////////////////////////////////////
