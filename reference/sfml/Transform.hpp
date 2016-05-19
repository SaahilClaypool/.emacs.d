_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp

////////////////////////////////////////////////////////////
/// \class sf::Transform
/// \ingroup graphics
///
/// A sf::Transform specifies how to translate, rotate, scale,
/// shear, project, whatever things. In mathematical terms, it defines
/// how to transform a coordinate system into another.
///
/// For example, if you apply a rotation transform to a sprite, the
/// result will be a rotated sprite. And anything that is transformed
/// by this rotation transform will be rotated the same way, according
/// to its initial position.
///
/// Transforms are typically used for drawing. But they can also be
/// used for any computation that requires to transform points between
/// the local and global coordinate systems of an entity (like collision
/// detection).
///
/// Example:
/// \code
/// // define a translation transform
/// sf::Transform translation;
/// translation.translate(20, 50);
///
/// // define a rotation transform
/// sf::Transform rotation;
/// rotation.rotate(45);
///
/// // combine them
/// sf::Transform transform = translation * rotation;
///
/// // use the result to transform stuff...
/// sf::Vector2f point = transform.transformPoint(10, 20);
/// sf::FloatRect rect = transform.transformRect(sf::FloatRect(0, 0, 10, 100));
/// \endcode
///
/// \see sf::Transformable, sf::RenderStates
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
SFML_GRAPHICS_API Vector2f operator *(const Transform& left, const Vector2f& right);

////////////////////////////////////////////////////////////
/// \relates sf::Transform
/// \brief Overload of binary operator * to transform a point
///
/// This call is equivalent to calling left.transformPoint(right).
///
/// \param left Left operand (the transform)
/// \param right Right operand (the point to transform)
///
/// \return New transformed point
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
SFML_GRAPHICS_API Transform& operator *=(Transform& left, const Transform& right);

////////////////////////////////////////////////////////////
/// \relates sf::Transform
/// \brief Overload of binary operator *= to combine two transforms
///
/// This call is equivalent to calling left.combine(right).
///
/// \param left Left operand (the first transform)
/// \param right Right operand (the second transform)
///
/// \return The combined transform
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
SFML_GRAPHICS_API Transform operator *(const Transform& left, const Transform& right);

////////////////////////////////////////////////////////////
/// \relates sf::Transform
/// \brief Overload of binary operator * to combine two transforms
///
/// This call is equivalent to calling Transform(left).combine(right).
///
/// \param left Left operand (the first transform)
/// \param right Right operand (the second transform)
///
/// \return New combined transform
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
};

    ////////////////////////////////////////////////////////////
    float m_matrix[16]; ///< 4x4 matrix defining the transformation
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
private:

    ////////////////////////////////////////////////////////////
    static const Transform Identity; ///< The identity transform (does nothing)
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    // Static member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform& scale(const Vector2f& factors, const Vector2f& center);

    ////////////////////////////////////////////////////////////
    /// \brief Combine the current transform with a scaling
    ///
    /// The center of scaling is provided for convenience as a second
    /// argument, so that you can build scaling around arbitrary points
    /// more easily (and efficiently) than the usual
    /// translate(-center).scale(factors).translate(center).
    ///
    /// This function returns a reference to *this, so that calls
    /// can be chained.
    /// \code
    /// sf::Transform transform;
    /// transform.scale(sf::Vector2f(2, 1), sf::Vector2f(8, 3)).rotate(45);
    /// \endcode
    ///
    /// \param factors Scaling factors
    /// \param center Center of scaling
    ///
    /// \return Reference to *this
    ///
    /// \see translate, rotate
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform& scale(const Vector2f& factors);

    ////////////////////////////////////////////////////////////
    /// \brief Combine the current transform with a scaling
    ///
    /// This function returns a reference to *this, so that calls
    /// can be chained.
    /// \code
    /// sf::Transform transform;
    /// transform.scale(sf::Vector2f(2, 1)).rotate(45);
    /// \endcode
    ///
    /// \param factors Scaling factors
    ///
    /// \return Reference to *this
    ///
    /// \see translate, rotate
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform& scale(float scaleX, float scaleY, float centerX, float centerY);

    ////////////////////////////////////////////////////////////
    /// \brief Combine the current transform with a scaling
    ///
    /// The center of scaling is provided for convenience as a second
    /// argument, so that you can build scaling around arbitrary points
    /// more easily (and efficiently) than the usual
    /// translate(-center).scale(factors).translate(center).
    ///
    /// This function returns a reference to *this, so that calls
    /// can be chained.
    /// \code
    /// sf::Transform transform;
    /// transform.scale(2, 1, 8, 3).rotate(45);
    /// \endcode
    ///
    /// \param scaleX Scaling factor on X axis
    /// \param scaleY Scaling factor on Y axis
    /// \param centerX X coordinate of the center of scaling
    /// \param centerY Y coordinate of the center of scaling
    ///
    /// \return Reference to *this
    ///
    /// \see translate, rotate
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform& scale(float scaleX, float scaleY);

    ////////////////////////////////////////////////////////////
    /// \brief Combine the current transform with a scaling
    ///
    /// This function returns a reference to *this, so that calls
    /// can be chained.
    /// \code
    /// sf::Transform transform;
    /// transform.scale(2, 1).rotate(45);
    /// \endcode
    ///
    /// \param scaleX Scaling factor on the X axis
    /// \param scaleY Scaling factor on the Y axis
    ///
    /// \return Reference to *this
    ///
    /// \see translate, rotate
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform& rotate(float angle, const Vector2f& center);

    ////////////////////////////////////////////////////////////
    /// \brief Combine the current transform with a rotation
    ///
    /// The center of rotation is provided for convenience as a second
    /// argument, so that you can build rotations around arbitrary points
    /// more easily (and efficiently) than the usual
    /// translate(-center).rotate(angle).translate(center).
    ///
    /// This function returns a reference to *this, so that calls
    /// can be chained.
    /// \code
    /// sf::Transform transform;
    /// transform.rotate(90, sf::Vector2f(8, 3)).translate(sf::Vector2f(50, 20));
    /// \endcode
    ///
    /// \param angle Rotation angle, in degrees
    /// \param center Center of rotation
    ///
    /// \return Reference to *this
    ///
    /// \see translate, scale
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform& rotate(float angle, float centerX, float centerY);

    ////////////////////////////////////////////////////////////
    /// \brief Combine the current transform with a rotation
    ///
    /// The center of rotation is provided for convenience as a second
    /// argument, so that you can build rotations around arbitrary points
    /// more easily (and efficiently) than the usual
    /// translate(-center).rotate(angle).translate(center).
    ///
    /// This function returns a reference to *this, so that calls
    /// can be chained.
    /// \code
    /// sf::Transform transform;
    /// transform.rotate(90, 8, 3).translate(50, 20);
    /// \endcode
    ///
    /// \param angle Rotation angle, in degrees
    /// \param centerX X coordinate of the center of rotation
    /// \param centerY Y coordinate of the center of rotation
    ///
    /// \return Reference to *this
    ///
    /// \see translate, scale
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform& rotate(float angle);

    ////////////////////////////////////////////////////////////
    /// \brief Combine the current transform with a rotation
    ///
    /// This function returns a reference to *this, so that calls
    /// can be chained.
    /// \code
    /// sf::Transform transform;
    /// transform.rotate(90).translate(50, 20);
    /// \endcode
    ///
    /// \param angle Rotation angle, in degrees
    ///
    /// \return Reference to *this
    ///
    /// \see translate, scale
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform& translate(const Vector2f& offset);

    ////////////////////////////////////////////////////////////
    /// \brief Combine the current transform with a translation
    ///
    /// This function returns a reference to *this, so that calls
    /// can be chained.
    /// \code
    /// sf::Transform transform;
    /// transform.translate(sf::Vector2f(100, 200)).rotate(45);
    /// \endcode
    ///
    /// \param offset Translation offset to apply
    ///
    /// \return Reference to *this
    ///
    /// \see rotate, scale
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform& translate(float x, float y);

    ////////////////////////////////////////////////////////////
    /// \brief Combine the current transform with a translation
    ///
    /// This function returns a reference to *this, so that calls
    /// can be chained.
    /// \code
    /// sf::Transform transform;
    /// transform.translate(100, 200).rotate(45);
    /// \endcode
    ///
    /// \param x Offset to apply on X axis
    /// \param y Offset to apply on Y axis
    ///
    /// \return Reference to *this
    ///
    /// \see rotate, scale
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform& combine(const Transform& transform);

    ////////////////////////////////////////////////////////////
    /// \brief Combine the current transform with another one
    ///
    /// The result is a transform that is equivalent to applying
    /// *this followed by \a transform. Mathematically, it is
    /// equivalent to a matrix multiplication.
    ///
    /// \param transform Transform to combine with this transform
    ///
    /// \return Reference to *this
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    FloatRect transformRect(const FloatRect& rectangle) const;

    ////////////////////////////////////////////////////////////
    /// \brief Transform a rectangle
    ///
    /// Since SFML doesn't provide support for oriented rectangles,
    /// the result of this function is always an axis-aligned
    /// rectangle. Which means that if the transform contains a
    /// rotation, the bounding rectangle of the transformed rectangle
    /// is returned.
    ///
    /// \param rectangle Rectangle to transform
    ///
    /// \return Transformed rectangle
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Vector2f transformPoint(const Vector2f& point) const;

    ////////////////////////////////////////////////////////////
    /// \brief Transform a 2D point
    ///
    /// \param point Point to transform
    ///
    /// \return Transformed point
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Vector2f transformPoint(float x, float y) const;

    ////////////////////////////////////////////////////////////
    /// \brief Transform a 2D point
    ///
    /// \param x X coordinate of the point to transform
    /// \param y Y coordinate of the point to transform
    ///
    /// \return Transformed point
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform getInverse() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return the inverse of the transform
    ///
    /// If the inverse cannot be computed, an identity transform
    /// is returned.
    ///
    /// \return A new transform which is the inverse of self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    const float* getMatrix() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return the transform as a 4x4 matrix
    ///
    /// This function returns a pointer to an array of 16 floats
    /// containing the transform elements as a 4x4 matrix, which
    /// is directly compatible with OpenGL functions.
    ///
    /// \code
    /// sf::Transform transform = ...;
    /// glLoadMatrixf(transform.getMatrix());
    /// \endcode
    ///
    /// \return Pointer to a 4x4 matrix
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform(float a00, float a01, float a02,
              float a10, float a11, float a12,
              float a20, float a21, float a22);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a transform from a 3x3 matrix
    ///
    /// \param a00 Element (0, 0) of the matrix
    /// \param a01 Element (0, 1) of the matrix
    /// \param a02 Element (0, 2) of the matrix
    /// \param a10 Element (1, 0) of the matrix
    /// \param a11 Element (1, 1) of the matrix
    /// \param a12 Element (1, 2) of the matrix
    /// \param a20 Element (2, 0) of the matrix
    /// \param a21 Element (2, 1) of the matrix
    /// \param a22 Element (2, 2) of the matrix
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Creates an identity transform (a transform that does nothing).
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
class SFML_GRAPHICS_API Transform

////////////////////////////////////////////////////////////
/// \brief Define a 3x3 transform matrix
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
#include <SFML/Graphics/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
#ifndef SFML_TRANSFORM_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp

////////////////////////////////////////////////////////////
/// \class sf::Transform
/// \ingroup graphics
///
/// A sf::Transform specifies how to translate, rotate, scale,
/// shear, project, whatever things. In mathematical terms, it defines
/// how to transform a coordinate system into another.
///
/// For example, if you apply a rotation transform to a sprite, the
/// result will be a rotated sprite. And anything that is transformed
/// by this rotation transform will be rotated the same way, according
/// to its initial position.
///
/// Transforms are typically used for drawing. But they can also be
/// used for any computation that requires to transform points between
/// the local and global coordinate systems of an entity (like collision
/// detection).
///
/// Example:
/// \code
/// // define a translation transform
/// sf::Transform translation;
/// translation.translate(20, 50);
///
/// // define a rotation transform
/// sf::Transform rotation;
/// rotation.rotate(45);
///
/// // combine them
/// sf::Transform transform = translation * rotation;
///
/// // use the result to transform stuff...
/// sf::Vector2f point = transform.transformPoint(10, 20);
/// sf::FloatRect rect = transform.transformRect(sf::FloatRect(0, 0, 10, 100));
/// \endcode
///
/// \see sf::Transformable, sf::RenderStates
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
SFML_GRAPHICS_API Vector2f operator *(const Transform& left, const Vector2f& right);

////////////////////////////////////////////////////////////
/// \relates sf::Transform
/// \brief Overload of binary operator * to transform a point
///
/// This call is equivalent to calling left.transformPoint(right).
///
/// \param left Left operand (the transform)
/// \param right Right operand (the point to transform)
///
/// \return New transformed point
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
SFML_GRAPHICS_API Transform& operator *=(Transform& left, const Transform& right);

////////////////////////////////////////////////////////////
/// \relates sf::Transform
/// \brief Overload of binary operator *= to combine two transforms
///
/// This call is equivalent to calling left.combine(right).
///
/// \param left Left operand (the first transform)
/// \param right Right operand (the second transform)
///
/// \return The combined transform
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
SFML_GRAPHICS_API Transform operator *(const Transform& left, const Transform& right);

////////////////////////////////////////////////////////////
/// \relates sf::Transform
/// \brief Overload of binary operator * to combine two transforms
///
/// This call is equivalent to calling Transform(left).combine(right).
///
/// \param left Left operand (the first transform)
/// \param right Right operand (the second transform)
///
/// \return New combined transform
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
};

    ////////////////////////////////////////////////////////////
    float m_matrix[16]; ///< 4x4 matrix defining the transformation
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
private:

    ////////////////////////////////////////////////////////////
    static const Transform Identity; ///< The identity transform (does nothing)
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    // Static member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform& scale(const Vector2f& factors, const Vector2f& center);

    ////////////////////////////////////////////////////////////
    /// \brief Combine the current transform with a scaling
    ///
    /// The center of scaling is provided for convenience as a second
    /// argument, so that you can build scaling around arbitrary points
    /// more easily (and efficiently) than the usual
    /// translate(-center).scale(factors).translate(center).
    ///
    /// This function returns a reference to *this, so that calls
    /// can be chained.
    /// \code
    /// sf::Transform transform;
    /// transform.scale(sf::Vector2f(2, 1), sf::Vector2f(8, 3)).rotate(45);
    /// \endcode
    ///
    /// \param factors Scaling factors
    /// \param center Center of scaling
    ///
    /// \return Reference to *this
    ///
    /// \see translate, rotate
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform& scale(const Vector2f& factors);

    ////////////////////////////////////////////////////////////
    /// \brief Combine the current transform with a scaling
    ///
    /// This function returns a reference to *this, so that calls
    /// can be chained.
    /// \code
    /// sf::Transform transform;
    /// transform.scale(sf::Vector2f(2, 1)).rotate(45);
    /// \endcode
    ///
    /// \param factors Scaling factors
    ///
    /// \return Reference to *this
    ///
    /// \see translate, rotate
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform& scale(float scaleX, float scaleY, float centerX, float centerY);

    ////////////////////////////////////////////////////////////
    /// \brief Combine the current transform with a scaling
    ///
    /// The center of scaling is provided for convenience as a second
    /// argument, so that you can build scaling around arbitrary points
    /// more easily (and efficiently) than the usual
    /// translate(-center).scale(factors).translate(center).
    ///
    /// This function returns a reference to *this, so that calls
    /// can be chained.
    /// \code
    /// sf::Transform transform;
    /// transform.scale(2, 1, 8, 3).rotate(45);
    /// \endcode
    ///
    /// \param scaleX Scaling factor on X axis
    /// \param scaleY Scaling factor on Y axis
    /// \param centerX X coordinate of the center of scaling
    /// \param centerY Y coordinate of the center of scaling
    ///
    /// \return Reference to *this
    ///
    /// \see translate, rotate
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform& scale(float scaleX, float scaleY);

    ////////////////////////////////////////////////////////////
    /// \brief Combine the current transform with a scaling
    ///
    /// This function returns a reference to *this, so that calls
    /// can be chained.
    /// \code
    /// sf::Transform transform;
    /// transform.scale(2, 1).rotate(45);
    /// \endcode
    ///
    /// \param scaleX Scaling factor on the X axis
    /// \param scaleY Scaling factor on the Y axis
    ///
    /// \return Reference to *this
    ///
    /// \see translate, rotate
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform& rotate(float angle, const Vector2f& center);

    ////////////////////////////////////////////////////////////
    /// \brief Combine the current transform with a rotation
    ///
    /// The center of rotation is provided for convenience as a second
    /// argument, so that you can build rotations around arbitrary points
    /// more easily (and efficiently) than the usual
    /// translate(-center).rotate(angle).translate(center).
    ///
    /// This function returns a reference to *this, so that calls
    /// can be chained.
    /// \code
    /// sf::Transform transform;
    /// transform.rotate(90, sf::Vector2f(8, 3)).translate(sf::Vector2f(50, 20));
    /// \endcode
    ///
    /// \param angle Rotation angle, in degrees
    /// \param center Center of rotation
    ///
    /// \return Reference to *this
    ///
    /// \see translate, scale
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform& rotate(float angle, float centerX, float centerY);

    ////////////////////////////////////////////////////////////
    /// \brief Combine the current transform with a rotation
    ///
    /// The center of rotation is provided for convenience as a second
    /// argument, so that you can build rotations around arbitrary points
    /// more easily (and efficiently) than the usual
    /// translate(-center).rotate(angle).translate(center).
    ///
    /// This function returns a reference to *this, so that calls
    /// can be chained.
    /// \code
    /// sf::Transform transform;
    /// transform.rotate(90, 8, 3).translate(50, 20);
    /// \endcode
    ///
    /// \param angle Rotation angle, in degrees
    /// \param centerX X coordinate of the center of rotation
    /// \param centerY Y coordinate of the center of rotation
    ///
    /// \return Reference to *this
    ///
    /// \see translate, scale
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform& rotate(float angle);

    ////////////////////////////////////////////////////////////
    /// \brief Combine the current transform with a rotation
    ///
    /// This function returns a reference to *this, so that calls
    /// can be chained.
    /// \code
    /// sf::Transform transform;
    /// transform.rotate(90).translate(50, 20);
    /// \endcode
    ///
    /// \param angle Rotation angle, in degrees
    ///
    /// \return Reference to *this
    ///
    /// \see translate, scale
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform& translate(const Vector2f& offset);

    ////////////////////////////////////////////////////////////
    /// \brief Combine the current transform with a translation
    ///
    /// This function returns a reference to *this, so that calls
    /// can be chained.
    /// \code
    /// sf::Transform transform;
    /// transform.translate(sf::Vector2f(100, 200)).rotate(45);
    /// \endcode
    ///
    /// \param offset Translation offset to apply
    ///
    /// \return Reference to *this
    ///
    /// \see rotate, scale
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform& translate(float x, float y);

    ////////////////////////////////////////////////////////////
    /// \brief Combine the current transform with a translation
    ///
    /// This function returns a reference to *this, so that calls
    /// can be chained.
    /// \code
    /// sf::Transform transform;
    /// transform.translate(100, 200).rotate(45);
    /// \endcode
    ///
    /// \param x Offset to apply on X axis
    /// \param y Offset to apply on Y axis
    ///
    /// \return Reference to *this
    ///
    /// \see rotate, scale
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform& combine(const Transform& transform);

    ////////////////////////////////////////////////////////////
    /// \brief Combine the current transform with another one
    ///
    /// The result is a transform that is equivalent to applying
    /// *this followed by \a transform. Mathematically, it is
    /// equivalent to a matrix multiplication.
    ///
    /// \param transform Transform to combine with this transform
    ///
    /// \return Reference to *this
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    FloatRect transformRect(const FloatRect& rectangle) const;

    ////////////////////////////////////////////////////////////
    /// \brief Transform a rectangle
    ///
    /// Since SFML doesn't provide support for oriented rectangles,
    /// the result of this function is always an axis-aligned
    /// rectangle. Which means that if the transform contains a
    /// rotation, the bounding rectangle of the transformed rectangle
    /// is returned.
    ///
    /// \param rectangle Rectangle to transform
    ///
    /// \return Transformed rectangle
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Vector2f transformPoint(const Vector2f& point) const;

    ////////////////////////////////////////////////////////////
    /// \brief Transform a 2D point
    ///
    /// \param point Point to transform
    ///
    /// \return Transformed point
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Vector2f transformPoint(float x, float y) const;

    ////////////////////////////////////////////////////////////
    /// \brief Transform a 2D point
    ///
    /// \param x X coordinate of the point to transform
    /// \param y Y coordinate of the point to transform
    ///
    /// \return Transformed point
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform getInverse() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return the inverse of the transform
    ///
    /// If the inverse cannot be computed, an identity transform
    /// is returned.
    ///
    /// \return A new transform which is the inverse of self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    const float* getMatrix() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return the transform as a 4x4 matrix
    ///
    /// This function returns a pointer to an array of 16 floats
    /// containing the transform elements as a 4x4 matrix, which
    /// is directly compatible with OpenGL functions.
    ///
    /// \code
    /// sf::Transform transform = ...;
    /// glLoadMatrixf(transform.getMatrix());
    /// \endcode
    ///
    /// \return Pointer to a 4x4 matrix
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform(float a00, float a01, float a02,
              float a10, float a11, float a12,
              float a20, float a21, float a22);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a transform from a 3x3 matrix
    ///
    /// \param a00 Element (0, 0) of the matrix
    /// \param a01 Element (0, 1) of the matrix
    /// \param a02 Element (0, 2) of the matrix
    /// \param a10 Element (1, 0) of the matrix
    /// \param a11 Element (1, 1) of the matrix
    /// \param a12 Element (1, 2) of the matrix
    /// \param a20 Element (2, 0) of the matrix
    /// \param a21 Element (2, 1) of the matrix
    /// \param a22 Element (2, 2) of the matrix
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
    Transform();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Creates an identity transform (a transform that does nothing).
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
class SFML_GRAPHICS_API Transform

////////////////////////////////////////////////////////////
/// \brief Define a 3x3 transform matrix
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
#include <SFML/Graphics/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
#ifndef SFML_TRANSFORM_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Transform.hpp
//

////////////////////////////////////////////////////////////
