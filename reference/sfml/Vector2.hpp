_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp

////////////////////////////////////////////////////////////
/// \class sf::Vector2
/// \ingroup system
///
/// sf::Vector2 is a simple class that defines a mathematical
/// vector with two coordinates (x and y). It can be used to
/// represent anything that has two dimensions: a size, a point,
/// a velocity, etc.
///
/// The template parameter T is the type of the coordinates. It
/// can be any type that supports arithmetic operations (+, -, /, *)
/// and comparisons (==, !=), for example int or float.
///
/// You generally don't have to care about the templated form (sf::Vector2<T>),
/// the most common specializations have special typedefs:
/// \li sf::Vector2<float> is sf::Vector2f
/// \li sf::Vector2<int> is sf::Vector2i
/// \li sf::Vector2<unsigned int> is sf::Vector2u
///
/// The sf::Vector2 class has a small and simple interface, its x and y members
/// can be accessed directly (there's no accessor like setX(), getX()) and it
/// contains no mathematical function like dot product, cross product, length, etc.
///
/// Usage example:
/// \code
/// sf::Vector2f v1(16.5f, 24.f);
/// v1.x = 18.2f;
/// float y = v1.y;
///
/// sf::Vector2f v2 = v1 * 5.f;
/// sf::Vector2f v3;
/// v3 = v1 + v2;
///
/// bool different = (v2 != v3);
/// \endcode
///
/// Note: for 3-dimensional vectors, see sf::Vector3.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \relates Vector2
/// \brief Overload of binary operator !=
///
/// This operator compares strict difference between two vectors.
///
/// \param left  Left operand (a vector)
/// \param right Right operand (a vector)
///
/// \return True if \a left is not equal to \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \relates Vector2
/// \brief Overload of binary operator ==
///
/// This operator compares strict equality between two vectors.
///
/// \param left  Left operand (a vector)
/// \param right Right operand (a vector)
///
/// \return True if \a left is equal to \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \relates Vector2
/// \brief Overload of binary operator /=
///
/// This operator performs a memberwise division by \a right,
/// and assigns the result to \a left.
///
/// \param left  Left operand (a vector)
/// \param right Right operand (a scalar value)
///
/// \return Reference to \a left
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \relates Vector2
/// \brief Overload of binary operator /
///
/// \param left  Left operand (a vector)
/// \param right Right operand (a scalar value)
///
/// \return Memberwise division by \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \relates Vector2
/// \brief Overload of binary operator *=
///
/// This operator performs a memberwise multiplication by \a right,
/// and assigns the result to \a left.
///
/// \param left  Left operand (a vector)
/// \param right Right operand (a scalar value)
///
/// \return Reference to \a left
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \relates Vector2
/// \brief Overload of binary operator *
///
/// \param left  Left operand (a scalar value)
/// \param right Right operand (a vector)
///
/// \return Memberwise multiplication by \a left
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \relates Vector2
/// \brief Overload of binary operator *
///
/// \param left  Left operand (a vector)
/// \param right Right operand (a scalar value)
///
/// \return Memberwise multiplication by \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \relates Vector2
/// \brief Overload of binary operator -
///
/// \param left  Left operand (a vector)
/// \param right Right operand (a vector)
///
/// \return Memberwise subtraction of both vectors
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \relates Vector2
/// \brief Overload of binary operator +
///
/// \param left  Left operand (a vector)
/// \param right Right operand (a vector)
///
/// \return Memberwise addition of both vectors
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \relates Vector2
/// \brief Overload of binary operator -=
///
/// This operator performs a memberwise subtraction of both vectors,
/// and assigns the result to \a left.
///
/// \param left  Left operand (a vector)
/// \param right Right operand (a vector)
///
/// \return Reference to \a left
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \relates Vector2
/// \brief Overload of binary operator +=
///
/// This operator performs a memberwise addition of both vectors,
/// and assigns the result to \a left.
///
/// \param left  Left operand (a vector)
/// \param right Right operand (a vector)
///
/// \return Reference to \a left
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \relates Vector2
/// \brief Overload of unary operator -
///
/// \param right Vector to negate
///
/// \return Memberwise opposite of the vector
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
};

    ////////////////////////////////////////////////////////////
    T x; ///< X coordinate of the vector
    T y; ///< Y coordinate of the vector
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
    template <typename U>

    ////////////////////////////////////////////////////////////
    /// \brief Construct the vector from another type of vector
    ///
    /// This constructor doesn't replace the copy constructor,
    /// it's called only when U != T.
    /// A call to this constructor will fail to compile if U
    /// is not convertible to T.
    ///
    /// \param vector Vector to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
    Vector2(T X, T Y);

    ////////////////////////////////////////////////////////////
    /// \brief Construct the vector from its coordinates
    ///
    /// \param X X coordinate
    /// \param Y Y coordinate
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
    Vector2();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Creates a Vector2(0, 0).
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \brief Utility template class for manipulating
///        2-dimensional vectors
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
#ifndef SFML_VECTOR2_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp

////////////////////////////////////////////////////////////
/// \class sf::Vector2
/// \ingroup system
///
/// sf::Vector2 is a simple class that defines a mathematical
/// vector with two coordinates (x and y). It can be used to
/// represent anything that has two dimensions: a size, a point,
/// a velocity, etc.
///
/// The template parameter T is the type of the coordinates. It
/// can be any type that supports arithmetic operations (+, -, /, *)
/// and comparisons (==, !=), for example int or float.
///
/// You generally don't have to care about the templated form (sf::Vector2<T>),
/// the most common specializations have special typedefs:
/// \li sf::Vector2<float> is sf::Vector2f
/// \li sf::Vector2<int> is sf::Vector2i
/// \li sf::Vector2<unsigned int> is sf::Vector2u
///
/// The sf::Vector2 class has a small and simple interface, its x and y members
/// can be accessed directly (there's no accessor like setX(), getX()) and it
/// contains no mathematical function like dot product, cross product, length, etc.
///
/// Usage example:
/// \code
/// sf::Vector2f v1(16.5f, 24.f);
/// v1.x = 18.2f;
/// float y = v1.y;
///
/// sf::Vector2f v2 = v1 * 5.f;
/// sf::Vector2f v3;
/// v3 = v1 + v2;
///
/// bool different = (v2 != v3);
/// \endcode
///
/// Note: for 3-dimensional vectors, see sf::Vector3.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \relates Vector2
/// \brief Overload of binary operator !=
///
/// This operator compares strict difference between two vectors.
///
/// \param left  Left operand (a vector)
/// \param right Right operand (a vector)
///
/// \return True if \a left is not equal to \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \relates Vector2
/// \brief Overload of binary operator ==
///
/// This operator compares strict equality between two vectors.
///
/// \param left  Left operand (a vector)
/// \param right Right operand (a vector)
///
/// \return True if \a left is equal to \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \relates Vector2
/// \brief Overload of binary operator /=
///
/// This operator performs a memberwise division by \a right,
/// and assigns the result to \a left.
///
/// \param left  Left operand (a vector)
/// \param right Right operand (a scalar value)
///
/// \return Reference to \a left
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \relates Vector2
/// \brief Overload of binary operator /
///
/// \param left  Left operand (a vector)
/// \param right Right operand (a scalar value)
///
/// \return Memberwise division by \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \relates Vector2
/// \brief Overload of binary operator *=
///
/// This operator performs a memberwise multiplication by \a right,
/// and assigns the result to \a left.
///
/// \param left  Left operand (a vector)
/// \param right Right operand (a scalar value)
///
/// \return Reference to \a left
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \relates Vector2
/// \brief Overload of binary operator *
///
/// \param left  Left operand (a scalar value)
/// \param right Right operand (a vector)
///
/// \return Memberwise multiplication by \a left
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \relates Vector2
/// \brief Overload of binary operator *
///
/// \param left  Left operand (a vector)
/// \param right Right operand (a scalar value)
///
/// \return Memberwise multiplication by \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \relates Vector2
/// \brief Overload of binary operator -
///
/// \param left  Left operand (a vector)
/// \param right Right operand (a vector)
///
/// \return Memberwise subtraction of both vectors
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \relates Vector2
/// \brief Overload of binary operator +
///
/// \param left  Left operand (a vector)
/// \param right Right operand (a vector)
///
/// \return Memberwise addition of both vectors
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \relates Vector2
/// \brief Overload of binary operator -=
///
/// This operator performs a memberwise subtraction of both vectors,
/// and assigns the result to \a left.
///
/// \param left  Left operand (a vector)
/// \param right Right operand (a vector)
///
/// \return Reference to \a left
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \relates Vector2
/// \brief Overload of binary operator +=
///
/// This operator performs a memberwise addition of both vectors,
/// and assigns the result to \a left.
///
/// \param left  Left operand (a vector)
/// \param right Right operand (a vector)
///
/// \return Reference to \a left
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \relates Vector2
/// \brief Overload of unary operator -
///
/// \param right Vector to negate
///
/// \return Memberwise opposite of the vector
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
};

    ////////////////////////////////////////////////////////////
    T x; ///< X coordinate of the vector
    T y; ///< Y coordinate of the vector
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
    template <typename U>

    ////////////////////////////////////////////////////////////
    /// \brief Construct the vector from another type of vector
    ///
    /// This constructor doesn't replace the copy constructor,
    /// it's called only when U != T.
    /// A call to this constructor will fail to compile if U
    /// is not convertible to T.
    ///
    /// \param vector Vector to convert
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
    Vector2(T X, T Y);

    ////////////////////////////////////////////////////////////
    /// \brief Construct the vector from its coordinates
    ///
    /// \param X X coordinate
    /// \param Y Y coordinate
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
    Vector2();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Creates a Vector2(0, 0).
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \brief Utility template class for manipulating
///        2-dimensional vectors
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
#ifndef SFML_VECTOR2_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Vector2.hpp
//

////////////////////////////////////////////////////////////
