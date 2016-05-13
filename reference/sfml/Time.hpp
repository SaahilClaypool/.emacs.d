_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp

////////////////////////////////////////////////////////////
/// \class sf::Time
/// \ingroup system
///
/// sf::Time encapsulates a time value in a flexible way.
/// It allows to define a time value either as a number of
/// seconds, milliseconds or microseconds. It also works the
/// other way round: you can read a time value as either
/// a number of seconds, milliseconds or microseconds.
///
/// By using such a flexible interface, the API doesn't
/// impose any fixed type or resolution for time values,
/// and let the user choose its own favorite representation.
///
/// Time values support the usual mathematical operations:
/// you can add or subtract two times, multiply or divide
/// a time by a number, compare two times, etc.
///
/// Since they represent a time span and not an absolute time
/// value, times can also be negative.
///
/// Usage example:
/// \code
/// sf::Time t1 = sf::seconds(0.1f);
/// Int32 milli = t1.asMilliseconds(); // 100
///
/// sf::Time t2 = sf::milliseconds(30);
/// Int64 micro = t2.asMicroseconds(); // 30000
///
/// sf::Time t3 = sf::microseconds(-800000);
/// float sec = t3.asSeconds(); // -0.8
/// \endcode
///
/// \code
/// void update(sf::Time elapsed)
/// {
///    position += speed * elapsed.asSeconds();
/// }
///
/// update(sf::milliseconds(100));
/// \endcode
///
/// \see sf::Clock
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
SFML_SYSTEM_API Time& operator /=(Time& left, Int64 right);

////////////////////////////////////////////////////////////
/// \relates Time
/// \brief Overload of binary /= operator to scale/assign a time value
///
/// \param left  Left operand (a time)
/// \param right Right operand (a number)
///
/// \return \a left divided by \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
SFML_SYSTEM_API Time& operator /=(Time& left, float right);

////////////////////////////////////////////////////////////
/// \relates Time
/// \brief Overload of binary /= operator to scale/assign a time value
///
/// \param left  Left operand (a time)
/// \param right Right operand (a number)
///
/// \return \a left divided by \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
SFML_SYSTEM_API Time operator /(Time left, Int64 right);

////////////////////////////////////////////////////////////
/// \relates Time
/// \brief Overload of binary / operator to scale a time value
///
/// \param left  Left operand (a time)
/// \param right Right operand (a number)
///
/// \return \a left divided by \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
SFML_SYSTEM_API Time operator /(Time left, float right);

////////////////////////////////////////////////////////////
/// \relates Time
/// \brief Overload of binary / operator to scale a time value
///
/// \param left  Left operand (a time)
/// \param right Right operand (a number)
///
/// \return \a left divided by \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
SFML_SYSTEM_API Time& operator *=(Time& left, Int64 right);

////////////////////////////////////////////////////////////
/// \relates Time
/// \brief Overload of binary *= operator to scale/assign a time value
///
/// \param left  Left operand (a time)
/// \param right Right operand (a number)
///
/// \return \a left multiplied by \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
SFML_SYSTEM_API Time& operator *=(Time& left, float right);

////////////////////////////////////////////////////////////
/// \relates Time
/// \brief Overload of binary *= operator to scale/assign a time value
///
/// \param left  Left operand (a time)
/// \param right Right operand (a number)
///
/// \return \a left multiplied by \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
SFML_SYSTEM_API Time operator *(Int64 left, Time right);

////////////////////////////////////////////////////////////
/// \relates Time
/// \brief Overload of binary * operator to scale a time value
///
/// \param left  Left operand (a number)
/// \param right Right operand (a time)
///
/// \return \a left multiplied by \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
SFML_SYSTEM_API Time operator *(float left, Time right);

////////////////////////////////////////////////////////////
/// \relates Time
/// \brief Overload of binary * operator to scale a time value
///
/// \param left  Left operand (a number)
/// \param right Right operand (a time)
///
/// \return \a left multiplied by \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
SFML_SYSTEM_API Time operator *(Time left, Int64 right);

////////////////////////////////////////////////////////////
/// \relates Time
/// \brief Overload of binary * operator to scale a time value
///
/// \param left  Left operand (a time)
/// \param right Right operand (a number)
///
/// \return \a left multiplied by \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
SFML_SYSTEM_API Time operator *(Time left, float right);

////////////////////////////////////////////////////////////
/// \relates Time
/// \brief Overload of binary * operator to scale a time value
///
/// \param left  Left operand (a time)
/// \param right Right operand (a number)
///
/// \return \a left multiplied by \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
SFML_SYSTEM_API Time& operator -=(Time& left, Time right);

////////////////////////////////////////////////////////////
/// \relates Time
/// \brief Overload of binary -= operator to subtract/assign two time values
///
/// \param left  Left operand (a time)
/// \param right Right operand (a time)
///
/// \return Difference of the two times values
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
SFML_SYSTEM_API Time operator -(Time left, Time right);

////////////////////////////////////////////////////////////
/// \relates Time
/// \brief Overload of binary - operator to subtract two time values
///
/// \param left  Left operand (a time)
/// \param right Right operand (a time)
///
/// \return Difference of the two times values
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
SFML_SYSTEM_API Time& operator +=(Time& left, Time right);

////////////////////////////////////////////////////////////
/// \relates Time
/// \brief Overload of binary += operator to add/assign two time values
///
/// \param left  Left operand (a time)
/// \param right Right operand (a time)
///
/// \return Sum of the two times values
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
SFML_SYSTEM_API Time operator +(Time left, Time right);

////////////////////////////////////////////////////////////
/// \relates Time
/// \brief Overload of binary + operator to add two time values
///
/// \param left  Left operand (a time)
/// \param right Right operand (a time)
///
/// \return Sum of the two times values
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
SFML_SYSTEM_API Time operator -(Time right);

////////////////////////////////////////////////////////////
/// \relates Time
/// \brief Overload of unary - operator to negate a time value
///
/// \param right Right operand (a time)
///
/// \return Opposite of the time value
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
SFML_SYSTEM_API bool operator >=(Time left, Time right);

////////////////////////////////////////////////////////////
/// \relates Time
/// \brief Overload of >= operator to compare two time values
///
/// \param left  Left operand (a time)
/// \param right Right operand (a time)
///
/// \return True if \a left is greater or equal than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
SFML_SYSTEM_API bool operator <=(Time left, Time right);

////////////////////////////////////////////////////////////
/// \relates Time
/// \brief Overload of <= operator to compare two time values
///
/// \param left  Left operand (a time)
/// \param right Right operand (a time)
///
/// \return True if \a left is lesser or equal than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
SFML_SYSTEM_API bool operator >(Time left, Time right);

////////////////////////////////////////////////////////////
/// \relates Time
/// \brief Overload of > operator to compare two time values
///
/// \param left  Left operand (a time)
/// \param right Right operand (a time)
///
/// \return True if \a left is greater than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
SFML_SYSTEM_API bool operator <(Time left, Time right);

////////////////////////////////////////////////////////////
/// \relates Time
/// \brief Overload of < operator to compare two time values
///
/// \param left  Left operand (a time)
/// \param right Right operand (a time)
///
/// \return True if \a left is lesser than \a right
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
SFML_SYSTEM_API bool operator !=(Time left, Time right);

////////////////////////////////////////////////////////////
/// \relates Time
/// \brief Overload of != operator to compare two time values
///
/// \param left  Left operand (a time)
/// \param right Right operand (a time)
///
/// \return True if both time values are different
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
SFML_SYSTEM_API bool operator ==(Time left, Time right);

////////////////////////////////////////////////////////////
/// \relates Time
/// \brief Overload of == operator to compare two time values
///
/// \param left  Left operand (a time)
/// \param right Right operand (a time)
///
/// \return True if both time values are equal
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
SFML_SYSTEM_API Time microseconds(Int64 amount);

////////////////////////////////////////////////////////////
/// \relates Time
/// \brief Construct a time value from a number of microseconds
///
/// \param amount Number of microseconds
///
/// \return Time value constructed from the amount of microseconds
///
/// \see seconds, milliseconds
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
SFML_SYSTEM_API Time milliseconds(Int32 amount);

////////////////////////////////////////////////////////////
/// \relates Time
/// \brief Construct a time value from a number of milliseconds
///
/// \param amount Number of milliseconds
///
/// \return Time value constructed from the amount of milliseconds
///
/// \see seconds, microseconds
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
SFML_SYSTEM_API Time seconds(float amount);

////////////////////////////////////////////////////////////
/// \relates Time
/// \brief Construct a time value from a number of seconds
///
/// \param amount Number of seconds
///
/// \return Time value constructed from the amount of seconds
///
/// \see milliseconds, microseconds
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
};

    Int64 m_microseconds; ///< Time value stored as microseconds
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
    explicit Time(Int64 microseconds);

    ////////////////////////////////////////////////////////////
    /// \brief Construct from a number of microseconds
    ///
    /// This function is internal. To construct time values,
    /// use sf::seconds, sf::milliseconds or sf::microseconds instead.
    ///
    /// \param microseconds Number of microseconds
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
private :

    static const Time Zero; ///< Predefined "zero" time value 
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
    // Static member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
    Int64 asMicroseconds() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return the time value as a number of microseconds
    ///
    /// \return Time in microseconds
    ///
    /// \see asSeconds, asMilliseconds
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
    Int32 asMilliseconds() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return the time value as a number of milliseconds
    ///
    /// \return Time in milliseconds
    ///
    /// \see asSeconds, asMicroseconds
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
    float asSeconds() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return the time value as a number of seconds
    ///
    /// \return Time in seconds
    ///
    /// \see asMilliseconds, asMicroseconds
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
    Time();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Sets the time value to zero.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
class SFML_SYSTEM_API Time

////////////////////////////////////////////////////////////
/// \brief Represents a time value
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
#ifndef SFML_TIME_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Time.hpp
//

////////////////////////////////////////////////////////////
