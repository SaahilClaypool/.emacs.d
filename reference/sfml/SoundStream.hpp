_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp

////////////////////////////////////////////////////////////
/// \class sf::SoundStream
/// \ingroup audio
///
/// Unlike audio buffers (see sf::SoundBuffer), audio streams
/// are never completely loaded in memory. Instead, the audio
/// data is acquired continuously while the stream is playing.
/// This behaviour allows to play a sound with no loading delay,
/// and keeps the memory consumption very low.
///
/// Sound sources that need to be streamed are usually big files
/// (compressed audio musics that would eat hundreds of MB in memory)
/// or files that would take a lot of time to be received
/// (sounds played over the network).
///
/// sf::SoundStream is a base class that doesn't care about the
/// stream source, which is left to the derived class. SFML provides
/// a built-in specialization for big files (see sf::Music).
/// No network stream source is provided, but you can write your own
/// by combining this class with the network module.
///
/// A derived class has to override two virtual functions:
/// \li onGetData fills a new chunk of audio data to be played
/// \li onSeek changes the current playing position in the source
///
/// It is important to note that each SoundStream is played in its
/// own separate thread, so that the streaming loop doesn't block the
/// rest of the program. In particular, the OnGetData and OnSeek
/// virtual functions may sometimes be called from this separate thread.
/// It is important to keep this in mind, because you may have to take
/// care of synchronization issues if you share data between threads. 
///
/// Usage example:
/// \code
/// class CustomStream : public sf::SoundStream
/// {
/// public :
///
///     bool open(const std::string& location)
///     {
///         // Open the source and get audio settings
///         ...
///         unsigned int channelCount = ...;
///         unsigned int sampleRate = ...;
///
///         // Initialize the stream -- important!
///         initialize(channelCount, sampleRate);
///     }
///
/// private :
///
///     virtual bool onGetData(Chunk& data)
///     {
///         // Fill the chunk with audio data from the stream source
///         data.samples = ...;
///         data.sampleCount = ...;
///
///         // Return true to continue playing
///         return true;
///     }
///
///     virtual void onSeek(Uint32 timeOffset)
///     {
///         // Change the current position in the stream source
///         ...
///     }
/// }
///
/// // Usage
/// CustomStream stream;
/// stream.open("path/to/stream");
/// stream.play();
/// \endcode
///
/// \see sf::Music
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
};

    ////////////////////////////////////////////////////////////
    Thread        m_thread;                  ///< Thread running the background tasks
    bool          m_isStreaming;             ///< Streaming state (true = playing, false = stopped)
    unsigned int  m_buffers[BufferCount];    ///< Sound buffers used to store temporary audio data
    unsigned int  m_channelCount;            ///< Number of channels (1 = mono, 2 = stereo, ...)
    unsigned int  m_sampleRate;              ///< Frequency (samples / second)
    Uint32        m_format;                  ///< Format of the internal sound buffers
    bool          m_loop;                    ///< Loop flag (true to loop, false to play once)
    Uint64        m_samplesProcessed;        ///< Number of buffers processed since beginning of the stream
    bool          m_endBuffers[BufferCount]; ///< Each buffer is marked as "end buffer" or not, for proper duration calculation
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    };

        BufferCount = 3 ///< Number of audio buffers used by the streaming loop
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void clearQueue();

    ////////////////////////////////////////////////////////////
    /// \brief Clear all the audio buffers and empty the playing queue
    ///
    /// This function is called when the stream is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool fillQueue();

    ////////////////////////////////////////////////////////////
    /// \brief Fill the audio buffers and put them all into the playing queue
    ///
    /// This function is called when playing starts and the
    /// playing queue is empty.
    ///
    /// \return True if the derived class has requested to stop, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool fillAndPushBuffer(unsigned int bufferNum);

    ////////////////////////////////////////////////////////////
    /// \brief Fill a new buffer with audio samples, and append
    ///        it to the playing queue
    ///
    /// This function is called as soon as a buffer has been fully
    /// consumed; it fills it again and inserts it back into the
    /// playing queue.
    ///
    /// \param buffer Number of the buffer to fill (in [0, BufferCount])
    ///
    /// \return True if the stream source has requested to stop, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void streamData();

    ////////////////////////////////////////////////////////////
    /// \brief Function called as the entry point of the thread
    ///
    /// This function starts the streaming loop, and returns
    /// only when the sound is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual void onSeek(Time timeOffset) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Change the current playing position in the stream source
    ///
    /// This function must be overriden by derived classes to
    /// allow random seeking into the stream source.
    ///
    /// \param timeOffset New playing position, relative to the beginning of the stream
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual bool onGetData(Chunk& data) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Request a new chunk of audio samples from the stream source
    ///
    /// This function must be overriden by derived classes to provide
    /// the audio samples to play. It is called continuously by the
    /// streaming loop, in a separate thread.
    /// The source can choose to stop the streaming loop at any time, by
    /// returning false to the caller.
    ///
    /// \param data Chunk of data to fill
    ///
    /// \return True to continue playback, false to stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void initialize(unsigned int channelCount, unsigned int sampleRate);

    ////////////////////////////////////////////////////////////
    /// \brief Define the audio stream parameters
    ///
    /// This function must be called by derived classes as soon
    /// as they know the audio settings of the stream to play.
    /// Any attempt to manipulate the stream (play(), ...) before
    /// calling this function will fail.
    /// It can be called multiple times if the settings of the
    /// audio stream change, but only when the stream is stopped.
    ///
    /// \param channelCount Number of channels of the stream
    /// \param sampleRate   Sample rate, in samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    SoundStream();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// This constructor is only meant to be called by derived classes.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool getLoop() const;

    ////////////////////////////////////////////////////////////
    /// \brief Tell whether or not the stream is in loop mode
    ///
    /// \return True if the stream is looping, false otherwise
    ///
    /// \see setLoop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void setLoop(bool loop);

    ////////////////////////////////////////////////////////////
    /// \brief Set whether or not the stream should loop after reaching the end
    ///
    /// If set, the stream will restart from beginning after
    /// reaching the end and so on, until it is stopped or
    /// setLoop(false) is called.
    /// The default looping state for streams is false.
    ///
    /// \param loop True to play in loop, false to play once
    ///
    /// \see getLoop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    Time getPlayingOffset() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the current playing position of the stream
    ///
    /// \return Current playing position, from the beginning of the stream
    ///
    /// \see setPlayingOffset
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void setPlayingOffset(Time timeOffset);

    ////////////////////////////////////////////////////////////
    /// \brief Change the current playing position of the stream
    ///
    /// The playing position can be changed when the stream is
    /// either paused or playing.
    ///
    /// \param timeOffset New playing position, from the beginning of the stream
    ///
    /// \see getPlayingOffset
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    Status getStatus() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the current status of the stream (stopped, paused, playing)
    ///
    /// \return Current status
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    unsigned int getSampleRate() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the stream sample rate of the stream
    ///
    /// The sample rate is the number of audio samples played per
    /// second. The higher, the better the quality.
    ///
    /// \return Sample rate, in number of samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    unsigned int getChannelCount() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return the number of channels of the stream
    ///
    /// 1 channel means a mono sound, 2 means stereo, etc.
    ///
    /// \return Number of channels
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void stop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop playing the audio stream
    ///
    /// This function stops the stream if it was playing or paused,
    /// and does nothing if it was already stopped.
    /// It also resets the playing position (unlike pause()).
    ///
    /// \see play, pause
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void pause();

    ////////////////////////////////////////////////////////////
    /// \brief Pause the audio stream
    ///
    /// This function pauses the stream if it was playing,
    /// otherwise (stream already paused or stopped) it has no effect.
    ///
    /// \see play, stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void play();

    ////////////////////////////////////////////////////////////
    /// \brief Start or resume playing the audio stream
    ///
    /// This function starts the stream if it was stopped, resumes
    /// it if it was paused, and restarts it from beginning if it
    /// was it already playing.
    /// This function uses its own thread so that it doesn't block
    /// the rest of the program while the stream is played.
    ///
    /// \see pause, stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual ~SoundStream();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    };

        const Int16* samples;     ///< Pointer to the audio samples
        std::size_t  sampleCount; ///< Number of samples pointed by Samples
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    struct Chunk

    ////////////////////////////////////////////////////////////
    /// \brief Structure defining a chunk of audio data to stream
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
class SFML_AUDIO_API SoundStream : public SoundSource

////////////////////////////////////////////////////////////
/// \brief Abstract base class for streamed audio sources
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
#include <SFML/Audio/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
#ifndef SFML_SOUNDSTREAM_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp

////////////////////////////////////////////////////////////
/// \class sf::SoundStream
/// \ingroup audio
///
/// Unlike audio buffers (see sf::SoundBuffer), audio streams
/// are never completely loaded in memory. Instead, the audio
/// data is acquired continuously while the stream is playing.
/// This behaviour allows to play a sound with no loading delay,
/// and keeps the memory consumption very low.
///
/// Sound sources that need to be streamed are usually big files
/// (compressed audio musics that would eat hundreds of MB in memory)
/// or files that would take a lot of time to be received
/// (sounds played over the network).
///
/// sf::SoundStream is a base class that doesn't care about the
/// stream source, which is left to the derived class. SFML provides
/// a built-in specialization for big files (see sf::Music).
/// No network stream source is provided, but you can write your own
/// by combining this class with the network module.
///
/// A derived class has to override two virtual functions:
/// \li onGetData fills a new chunk of audio data to be played
/// \li onSeek changes the current playing position in the source
///
/// It is important to note that each SoundStream is played in its
/// own separate thread, so that the streaming loop doesn't block the
/// rest of the program. In particular, the OnGetData and OnSeek
/// virtual functions may sometimes be called from this separate thread.
/// It is important to keep this in mind, because you may have to take
/// care of synchronization issues if you share data between threads. 
///
/// Usage example:
/// \code
/// class CustomStream : public sf::SoundStream
/// {
/// public :
///
///     bool open(const std::string& location)
///     {
///         // Open the source and get audio settings
///         ...
///         unsigned int channelCount = ...;
///         unsigned int sampleRate = ...;
///
///         // Initialize the stream -- important!
///         initialize(channelCount, sampleRate);
///     }
///
/// private :
///
///     virtual bool onGetData(Chunk& data)
///     {
///         // Fill the chunk with audio data from the stream source
///         data.samples = ...;
///         data.sampleCount = ...;
///
///         // Return true to continue playing
///         return true;
///     }
///
///     virtual void onSeek(Uint32 timeOffset)
///     {
///         // Change the current position in the stream source
///         ...
///     }
/// }
///
/// // Usage
/// CustomStream stream;
/// stream.open("path/to/stream");
/// stream.play();
/// \endcode
///
/// \see sf::Music
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
};

    ////////////////////////////////////////////////////////////
    Thread        m_thread;                  ///< Thread running the background tasks
    bool          m_isStreaming;             ///< Streaming state (true = playing, false = stopped)
    unsigned int  m_buffers[BufferCount];    ///< Sound buffers used to store temporary audio data
    unsigned int  m_channelCount;            ///< Number of channels (1 = mono, 2 = stereo, ...)
    unsigned int  m_sampleRate;              ///< Frequency (samples / second)
    Uint32        m_format;                  ///< Format of the internal sound buffers
    bool          m_loop;                    ///< Loop flag (true to loop, false to play once)
    Uint64        m_samplesProcessed;        ///< Number of buffers processed since beginning of the stream
    bool          m_endBuffers[BufferCount]; ///< Each buffer is marked as "end buffer" or not, for proper duration calculation
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    };

        BufferCount = 3 ///< Number of audio buffers used by the streaming loop
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void clearQueue();

    ////////////////////////////////////////////////////////////
    /// \brief Clear all the audio buffers and empty the playing queue
    ///
    /// This function is called when the stream is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool fillQueue();

    ////////////////////////////////////////////////////////////
    /// \brief Fill the audio buffers and put them all into the playing queue
    ///
    /// This function is called when playing starts and the
    /// playing queue is empty.
    ///
    /// \return True if the derived class has requested to stop, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool fillAndPushBuffer(unsigned int bufferNum);

    ////////////////////////////////////////////////////////////
    /// \brief Fill a new buffer with audio samples, and append
    ///        it to the playing queue
    ///
    /// This function is called as soon as a buffer has been fully
    /// consumed; it fills it again and inserts it back into the
    /// playing queue.
    ///
    /// \param buffer Number of the buffer to fill (in [0, BufferCount])
    ///
    /// \return True if the stream source has requested to stop, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void streamData();

    ////////////////////////////////////////////////////////////
    /// \brief Function called as the entry point of the thread
    ///
    /// This function starts the streaming loop, and returns
    /// only when the sound is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual void onSeek(Time timeOffset) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Change the current playing position in the stream source
    ///
    /// This function must be overriden by derived classes to
    /// allow random seeking into the stream source.
    ///
    /// \param timeOffset New playing position, relative to the beginning of the stream
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual bool onGetData(Chunk& data) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Request a new chunk of audio samples from the stream source
    ///
    /// This function must be overriden by derived classes to provide
    /// the audio samples to play. It is called continuously by the
    /// streaming loop, in a separate thread.
    /// The source can choose to stop the streaming loop at any time, by
    /// returning false to the caller.
    ///
    /// \param data Chunk of data to fill
    ///
    /// \return True to continue playback, false to stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void initialize(unsigned int channelCount, unsigned int sampleRate);

    ////////////////////////////////////////////////////////////
    /// \brief Define the audio stream parameters
    ///
    /// This function must be called by derived classes as soon
    /// as they know the audio settings of the stream to play.
    /// Any attempt to manipulate the stream (play(), ...) before
    /// calling this function will fail.
    /// It can be called multiple times if the settings of the
    /// audio stream change, but only when the stream is stopped.
    ///
    /// \param channelCount Number of channels of the stream
    /// \param sampleRate   Sample rate, in samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    SoundStream();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// This constructor is only meant to be called by derived classes.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool getLoop() const;

    ////////////////////////////////////////////////////////////
    /// \brief Tell whether or not the stream is in loop mode
    ///
    /// \return True if the stream is looping, false otherwise
    ///
    /// \see setLoop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void setLoop(bool loop);

    ////////////////////////////////////////////////////////////
    /// \brief Set whether or not the stream should loop after reaching the end
    ///
    /// If set, the stream will restart from beginning after
    /// reaching the end and so on, until it is stopped or
    /// setLoop(false) is called.
    /// The default looping state for streams is false.
    ///
    /// \param loop True to play in loop, false to play once
    ///
    /// \see getLoop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    Time getPlayingOffset() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the current playing position of the stream
    ///
    /// \return Current playing position, from the beginning of the stream
    ///
    /// \see setPlayingOffset
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void setPlayingOffset(Time timeOffset);

    ////////////////////////////////////////////////////////////
    /// \brief Change the current playing position of the stream
    ///
    /// The playing position can be changed when the stream is
    /// either paused or playing.
    ///
    /// \param timeOffset New playing position, from the beginning of the stream
    ///
    /// \see getPlayingOffset
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    Status getStatus() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the current status of the stream (stopped, paused, playing)
    ///
    /// \return Current status
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    unsigned int getSampleRate() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the stream sample rate of the stream
    ///
    /// The sample rate is the number of audio samples played per
    /// second. The higher, the better the quality.
    ///
    /// \return Sample rate, in number of samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    unsigned int getChannelCount() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return the number of channels of the stream
    ///
    /// 1 channel means a mono sound, 2 means stereo, etc.
    ///
    /// \return Number of channels
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void stop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop playing the audio stream
    ///
    /// This function stops the stream if it was playing or paused,
    /// and does nothing if it was already stopped.
    /// It also resets the playing position (unlike pause()).
    ///
    /// \see play, pause
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void pause();

    ////////////////////////////////////////////////////////////
    /// \brief Pause the audio stream
    ///
    /// This function pauses the stream if it was playing,
    /// otherwise (stream already paused or stopped) it has no effect.
    ///
    /// \see play, stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void play();

    ////////////////////////////////////////////////////////////
    /// \brief Start or resume playing the audio stream
    ///
    /// This function starts the stream if it was stopped, resumes
    /// it if it was paused, and restarts it from beginning if it
    /// was it already playing.
    /// This function uses its own thread so that it doesn't block
    /// the rest of the program while the stream is played.
    ///
    /// \see pause, stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual ~SoundStream();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    };

        const Int16* samples;     ///< Pointer to the audio samples
        std::size_t  sampleCount; ///< Number of samples pointed by Samples
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    struct Chunk

    ////////////////////////////////////////////////////////////
    /// \brief Structure defining a chunk of audio data to stream
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
class SFML_AUDIO_API SoundStream : public SoundSource

////////////////////////////////////////////////////////////
/// \brief Abstract base class for streamed audio sources
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
#include <SFML/Audio/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
#ifndef SFML_SOUNDSTREAM_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp

////////////////////////////////////////////////////////////
/// \class sf::SoundStream
/// \ingroup audio
///
/// Unlike audio buffers (see sf::SoundBuffer), audio streams
/// are never completely loaded in memory. Instead, the audio
/// data is acquired continuously while the stream is playing.
/// This behaviour allows to play a sound with no loading delay,
/// and keeps the memory consumption very low.
///
/// Sound sources that need to be streamed are usually big files
/// (compressed audio musics that would eat hundreds of MB in memory)
/// or files that would take a lot of time to be received
/// (sounds played over the network).
///
/// sf::SoundStream is a base class that doesn't care about the
/// stream source, which is left to the derived class. SFML provides
/// a built-in specialization for big files (see sf::Music).
/// No network stream source is provided, but you can write your own
/// by combining this class with the network module.
///
/// A derived class has to override two virtual functions:
/// \li onGetData fills a new chunk of audio data to be played
/// \li onSeek changes the current playing position in the source
///
/// It is important to note that each SoundStream is played in its
/// own separate thread, so that the streaming loop doesn't block the
/// rest of the program. In particular, the OnGetData and OnSeek
/// virtual functions may sometimes be called from this separate thread.
/// It is important to keep this in mind, because you may have to take
/// care of synchronization issues if you share data between threads. 
///
/// Usage example:
/// \code
/// class CustomStream : public sf::SoundStream
/// {
/// public :
///
///     bool open(const std::string& location)
///     {
///         // Open the source and get audio settings
///         ...
///         unsigned int channelCount = ...;
///         unsigned int sampleRate = ...;
///
///         // Initialize the stream -- important!
///         initialize(channelCount, sampleRate);
///     }
///
/// private :
///
///     virtual bool onGetData(Chunk& data)
///     {
///         // Fill the chunk with audio data from the stream source
///         data.samples = ...;
///         data.sampleCount = ...;
///
///         // Return true to continue playing
///         return true;
///     }
///
///     virtual void onSeek(Uint32 timeOffset)
///     {
///         // Change the current position in the stream source
///         ...
///     }
/// }
///
/// // Usage
/// CustomStream stream;
/// stream.open("path/to/stream");
/// stream.play();
/// \endcode
///
/// \see sf::Music
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
};

    ////////////////////////////////////////////////////////////
    Thread        m_thread;                  ///< Thread running the background tasks
    bool          m_isStreaming;             ///< Streaming state (true = playing, false = stopped)
    unsigned int  m_buffers[BufferCount];    ///< Sound buffers used to store temporary audio data
    unsigned int  m_channelCount;            ///< Number of channels (1 = mono, 2 = stereo, ...)
    unsigned int  m_sampleRate;              ///< Frequency (samples / second)
    Uint32        m_format;                  ///< Format of the internal sound buffers
    bool          m_loop;                    ///< Loop flag (true to loop, false to play once)
    Uint64        m_samplesProcessed;        ///< Number of buffers processed since beginning of the stream
    bool          m_endBuffers[BufferCount]; ///< Each buffer is marked as "end buffer" or not, for proper duration calculation
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    };

        BufferCount = 3 ///< Number of audio buffers used by the streaming loop
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void clearQueue();

    ////////////////////////////////////////////////////////////
    /// \brief Clear all the audio buffers and empty the playing queue
    ///
    /// This function is called when the stream is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool fillQueue();

    ////////////////////////////////////////////////////////////
    /// \brief Fill the audio buffers and put them all into the playing queue
    ///
    /// This function is called when playing starts and the
    /// playing queue is empty.
    ///
    /// \return True if the derived class has requested to stop, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool fillAndPushBuffer(unsigned int bufferNum);

    ////////////////////////////////////////////////////////////
    /// \brief Fill a new buffer with audio samples, and append
    ///        it to the playing queue
    ///
    /// This function is called as soon as a buffer has been fully
    /// consumed; it fills it again and inserts it back into the
    /// playing queue.
    ///
    /// \param buffer Number of the buffer to fill (in [0, BufferCount])
    ///
    /// \return True if the stream source has requested to stop, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void streamData();

    ////////////////////////////////////////////////////////////
    /// \brief Function called as the entry point of the thread
    ///
    /// This function starts the streaming loop, and returns
    /// only when the sound is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual void onSeek(Time timeOffset) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Change the current playing position in the stream source
    ///
    /// This function must be overriden by derived classes to
    /// allow random seeking into the stream source.
    ///
    /// \param timeOffset New playing position, relative to the beginning of the stream
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual bool onGetData(Chunk& data) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Request a new chunk of audio samples from the stream source
    ///
    /// This function must be overriden by derived classes to provide
    /// the audio samples to play. It is called continuously by the
    /// streaming loop, in a separate thread.
    /// The source can choose to stop the streaming loop at any time, by
    /// returning false to the caller.
    ///
    /// \param data Chunk of data to fill
    ///
    /// \return True to continue playback, false to stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void initialize(unsigned int channelCount, unsigned int sampleRate);

    ////////////////////////////////////////////////////////////
    /// \brief Define the audio stream parameters
    ///
    /// This function must be called by derived classes as soon
    /// as they know the audio settings of the stream to play.
    /// Any attempt to manipulate the stream (play(), ...) before
    /// calling this function will fail.
    /// It can be called multiple times if the settings of the
    /// audio stream change, but only when the stream is stopped.
    ///
    /// \param channelCount Number of channels of the stream
    /// \param sampleRate   Sample rate, in samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    SoundStream();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// This constructor is only meant to be called by derived classes.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool getLoop() const;

    ////////////////////////////////////////////////////////////
    /// \brief Tell whether or not the stream is in loop mode
    ///
    /// \return True if the stream is looping, false otherwise
    ///
    /// \see setLoop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void setLoop(bool loop);

    ////////////////////////////////////////////////////////////
    /// \brief Set whether or not the stream should loop after reaching the end
    ///
    /// If set, the stream will restart from beginning after
    /// reaching the end and so on, until it is stopped or
    /// setLoop(false) is called.
    /// The default looping state for streams is false.
    ///
    /// \param loop True to play in loop, false to play once
    ///
    /// \see getLoop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    Time getPlayingOffset() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the current playing position of the stream
    ///
    /// \return Current playing position, from the beginning of the stream
    ///
    /// \see setPlayingOffset
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void setPlayingOffset(Time timeOffset);

    ////////////////////////////////////////////////////////////
    /// \brief Change the current playing position of the stream
    ///
    /// The playing position can be changed when the stream is
    /// either paused or playing.
    ///
    /// \param timeOffset New playing position, from the beginning of the stream
    ///
    /// \see getPlayingOffset
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    Status getStatus() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the current status of the stream (stopped, paused, playing)
    ///
    /// \return Current status
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    unsigned int getSampleRate() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the stream sample rate of the stream
    ///
    /// The sample rate is the number of audio samples played per
    /// second. The higher, the better the quality.
    ///
    /// \return Sample rate, in number of samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    unsigned int getChannelCount() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return the number of channels of the stream
    ///
    /// 1 channel means a mono sound, 2 means stereo, etc.
    ///
    /// \return Number of channels
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void stop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop playing the audio stream
    ///
    /// This function stops the stream if it was playing or paused,
    /// and does nothing if it was already stopped.
    /// It also resets the playing position (unlike pause()).
    ///
    /// \see play, pause
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void pause();

    ////////////////////////////////////////////////////////////
    /// \brief Pause the audio stream
    ///
    /// This function pauses the stream if it was playing,
    /// otherwise (stream already paused or stopped) it has no effect.
    ///
    /// \see play, stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void play();

    ////////////////////////////////////////////////////////////
    /// \brief Start or resume playing the audio stream
    ///
    /// This function starts the stream if it was stopped, resumes
    /// it if it was paused, and restarts it from beginning if it
    /// was it already playing.
    /// This function uses its own thread so that it doesn't block
    /// the rest of the program while the stream is played.
    ///
    /// \see pause, stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual ~SoundStream();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    };

        const Int16* samples;     ///< Pointer to the audio samples
        std::size_t  sampleCount; ///< Number of samples pointed by Samples
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    struct Chunk

    ////////////////////////////////////////////////////////////
    /// \brief Structure defining a chunk of audio data to stream
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
class SFML_AUDIO_API SoundStream : public SoundSource

////////////////////////////////////////////////////////////
/// \brief Abstract base class for streamed audio sources
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
#include <SFML/Audio/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
#ifndef SFML_SOUNDSTREAM_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp

////////////////////////////////////////////////////////////
/// \class sf::SoundStream
/// \ingroup audio
///
/// Unlike audio buffers (see sf::SoundBuffer), audio streams
/// are never completely loaded in memory. Instead, the audio
/// data is acquired continuously while the stream is playing.
/// This behaviour allows to play a sound with no loading delay,
/// and keeps the memory consumption very low.
///
/// Sound sources that need to be streamed are usually big files
/// (compressed audio musics that would eat hundreds of MB in memory)
/// or files that would take a lot of time to be received
/// (sounds played over the network).
///
/// sf::SoundStream is a base class that doesn't care about the
/// stream source, which is left to the derived class. SFML provides
/// a built-in specialization for big files (see sf::Music).
/// No network stream source is provided, but you can write your own
/// by combining this class with the network module.
///
/// A derived class has to override two virtual functions:
/// \li onGetData fills a new chunk of audio data to be played
/// \li onSeek changes the current playing position in the source
///
/// It is important to note that each SoundStream is played in its
/// own separate thread, so that the streaming loop doesn't block the
/// rest of the program. In particular, the OnGetData and OnSeek
/// virtual functions may sometimes be called from this separate thread.
/// It is important to keep this in mind, because you may have to take
/// care of synchronization issues if you share data between threads. 
///
/// Usage example:
/// \code
/// class CustomStream : public sf::SoundStream
/// {
/// public :
///
///     bool open(const std::string& location)
///     {
///         // Open the source and get audio settings
///         ...
///         unsigned int channelCount = ...;
///         unsigned int sampleRate = ...;
///
///         // Initialize the stream -- important!
///         initialize(channelCount, sampleRate);
///     }
///
/// private :
///
///     virtual bool onGetData(Chunk& data)
///     {
///         // Fill the chunk with audio data from the stream source
///         data.samples = ...;
///         data.sampleCount = ...;
///
///         // Return true to continue playing
///         return true;
///     }
///
///     virtual void onSeek(Uint32 timeOffset)
///     {
///         // Change the current position in the stream source
///         ...
///     }
/// }
///
/// // Usage
/// CustomStream stream;
/// stream.open("path/to/stream");
/// stream.play();
/// \endcode
///
/// \see sf::Music
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
};

    ////////////////////////////////////////////////////////////
    Thread        m_thread;                  ///< Thread running the background tasks
    bool          m_isStreaming;             ///< Streaming state (true = playing, false = stopped)
    unsigned int  m_buffers[BufferCount];    ///< Sound buffers used to store temporary audio data
    unsigned int  m_channelCount;            ///< Number of channels (1 = mono, 2 = stereo, ...)
    unsigned int  m_sampleRate;              ///< Frequency (samples / second)
    Uint32        m_format;                  ///< Format of the internal sound buffers
    bool          m_loop;                    ///< Loop flag (true to loop, false to play once)
    Uint64        m_samplesProcessed;        ///< Number of buffers processed since beginning of the stream
    bool          m_endBuffers[BufferCount]; ///< Each buffer is marked as "end buffer" or not, for proper duration calculation
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    };

        BufferCount = 3 ///< Number of audio buffers used by the streaming loop
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void clearQueue();

    ////////////////////////////////////////////////////////////
    /// \brief Clear all the audio buffers and empty the playing queue
    ///
    /// This function is called when the stream is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool fillQueue();

    ////////////////////////////////////////////////////////////
    /// \brief Fill the audio buffers and put them all into the playing queue
    ///
    /// This function is called when playing starts and the
    /// playing queue is empty.
    ///
    /// \return True if the derived class has requested to stop, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool fillAndPushBuffer(unsigned int bufferNum);

    ////////////////////////////////////////////////////////////
    /// \brief Fill a new buffer with audio samples, and append
    ///        it to the playing queue
    ///
    /// This function is called as soon as a buffer has been fully
    /// consumed; it fills it again and inserts it back into the
    /// playing queue.
    ///
    /// \param buffer Number of the buffer to fill (in [0, BufferCount])
    ///
    /// \return True if the stream source has requested to stop, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void streamData();

    ////////////////////////////////////////////////////////////
    /// \brief Function called as the entry point of the thread
    ///
    /// This function starts the streaming loop, and returns
    /// only when the sound is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual void onSeek(Time timeOffset) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Change the current playing position in the stream source
    ///
    /// This function must be overriden by derived classes to
    /// allow random seeking into the stream source.
    ///
    /// \param timeOffset New playing position, relative to the beginning of the stream
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual bool onGetData(Chunk& data) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Request a new chunk of audio samples from the stream source
    ///
    /// This function must be overriden by derived classes to provide
    /// the audio samples to play. It is called continuously by the
    /// streaming loop, in a separate thread.
    /// The source can choose to stop the streaming loop at any time, by
    /// returning false to the caller.
    ///
    /// \param data Chunk of data to fill
    ///
    /// \return True to continue playback, false to stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void initialize(unsigned int channelCount, unsigned int sampleRate);

    ////////////////////////////////////////////////////////////
    /// \brief Define the audio stream parameters
    ///
    /// This function must be called by derived classes as soon
    /// as they know the audio settings of the stream to play.
    /// Any attempt to manipulate the stream (play(), ...) before
    /// calling this function will fail.
    /// It can be called multiple times if the settings of the
    /// audio stream change, but only when the stream is stopped.
    ///
    /// \param channelCount Number of channels of the stream
    /// \param sampleRate   Sample rate, in samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    SoundStream();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// This constructor is only meant to be called by derived classes.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool getLoop() const;

    ////////////////////////////////////////////////////////////
    /// \brief Tell whether or not the stream is in loop mode
    ///
    /// \return True if the stream is looping, false otherwise
    ///
    /// \see setLoop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void setLoop(bool loop);

    ////////////////////////////////////////////////////////////
    /// \brief Set whether or not the stream should loop after reaching the end
    ///
    /// If set, the stream will restart from beginning after
    /// reaching the end and so on, until it is stopped or
    /// setLoop(false) is called.
    /// The default looping state for streams is false.
    ///
    /// \param loop True to play in loop, false to play once
    ///
    /// \see getLoop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    Time getPlayingOffset() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the current playing position of the stream
    ///
    /// \return Current playing position, from the beginning of the stream
    ///
    /// \see setPlayingOffset
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void setPlayingOffset(Time timeOffset);

    ////////////////////////////////////////////////////////////
    /// \brief Change the current playing position of the stream
    ///
    /// The playing position can be changed when the stream is
    /// either paused or playing.
    ///
    /// \param timeOffset New playing position, from the beginning of the stream
    ///
    /// \see getPlayingOffset
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    Status getStatus() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the current status of the stream (stopped, paused, playing)
    ///
    /// \return Current status
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    unsigned int getSampleRate() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the stream sample rate of the stream
    ///
    /// The sample rate is the number of audio samples played per
    /// second. The higher, the better the quality.
    ///
    /// \return Sample rate, in number of samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    unsigned int getChannelCount() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return the number of channels of the stream
    ///
    /// 1 channel means a mono sound, 2 means stereo, etc.
    ///
    /// \return Number of channels
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void stop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop playing the audio stream
    ///
    /// This function stops the stream if it was playing or paused,
    /// and does nothing if it was already stopped.
    /// It also resets the playing position (unlike pause()).
    ///
    /// \see play, pause
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void pause();

    ////////////////////////////////////////////////////////////
    /// \brief Pause the audio stream
    ///
    /// This function pauses the stream if it was playing,
    /// otherwise (stream already paused or stopped) it has no effect.
    ///
    /// \see play, stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void play();

    ////////////////////////////////////////////////////////////
    /// \brief Start or resume playing the audio stream
    ///
    /// This function starts the stream if it was stopped, resumes
    /// it if it was paused, and restarts it from beginning if it
    /// was it already playing.
    /// This function uses its own thread so that it doesn't block
    /// the rest of the program while the stream is played.
    ///
    /// \see pause, stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual ~SoundStream();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    };

        const Int16* samples;     ///< Pointer to the audio samples
        std::size_t  sampleCount; ///< Number of samples pointed by Samples
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    struct Chunk

    ////////////////////////////////////////////////////////////
    /// \brief Structure defining a chunk of audio data to stream
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
class SFML_AUDIO_API SoundStream : public SoundSource

////////////////////////////////////////////////////////////
/// \brief Abstract base class for streamed audio sources
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
#include <SFML/Audio/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
#ifndef SFML_SOUNDSTREAM_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp

////////////////////////////////////////////////////////////
/// \class sf::SoundStream
/// \ingroup audio
///
/// Unlike audio buffers (see sf::SoundBuffer), audio streams
/// are never completely loaded in memory. Instead, the audio
/// data is acquired continuously while the stream is playing.
/// This behaviour allows to play a sound with no loading delay,
/// and keeps the memory consumption very low.
///
/// Sound sources that need to be streamed are usually big files
/// (compressed audio musics that would eat hundreds of MB in memory)
/// or files that would take a lot of time to be received
/// (sounds played over the network).
///
/// sf::SoundStream is a base class that doesn't care about the
/// stream source, which is left to the derived class. SFML provides
/// a built-in specialization for big files (see sf::Music).
/// No network stream source is provided, but you can write your own
/// by combining this class with the network module.
///
/// A derived class has to override two virtual functions:
/// \li onGetData fills a new chunk of audio data to be played
/// \li onSeek changes the current playing position in the source
///
/// It is important to note that each SoundStream is played in its
/// own separate thread, so that the streaming loop doesn't block the
/// rest of the program. In particular, the OnGetData and OnSeek
/// virtual functions may sometimes be called from this separate thread.
/// It is important to keep this in mind, because you may have to take
/// care of synchronization issues if you share data between threads. 
///
/// Usage example:
/// \code
/// class CustomStream : public sf::SoundStream
/// {
/// public :
///
///     bool open(const std::string& location)
///     {
///         // Open the source and get audio settings
///         ...
///         unsigned int channelCount = ...;
///         unsigned int sampleRate = ...;
///
///         // Initialize the stream -- important!
///         initialize(channelCount, sampleRate);
///     }
///
/// private :
///
///     virtual bool onGetData(Chunk& data)
///     {
///         // Fill the chunk with audio data from the stream source
///         data.samples = ...;
///         data.sampleCount = ...;
///
///         // Return true to continue playing
///         return true;
///     }
///
///     virtual void onSeek(Uint32 timeOffset)
///     {
///         // Change the current position in the stream source
///         ...
///     }
/// }
///
/// // Usage
/// CustomStream stream;
/// stream.open("path/to/stream");
/// stream.play();
/// \endcode
///
/// \see sf::Music
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
};

    ////////////////////////////////////////////////////////////
    Thread        m_thread;                  ///< Thread running the background tasks
    bool          m_isStreaming;             ///< Streaming state (true = playing, false = stopped)
    unsigned int  m_buffers[BufferCount];    ///< Sound buffers used to store temporary audio data
    unsigned int  m_channelCount;            ///< Number of channels (1 = mono, 2 = stereo, ...)
    unsigned int  m_sampleRate;              ///< Frequency (samples / second)
    Uint32        m_format;                  ///< Format of the internal sound buffers
    bool          m_loop;                    ///< Loop flag (true to loop, false to play once)
    Uint64        m_samplesProcessed;        ///< Number of buffers processed since beginning of the stream
    bool          m_endBuffers[BufferCount]; ///< Each buffer is marked as "end buffer" or not, for proper duration calculation
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    };

        BufferCount = 3 ///< Number of audio buffers used by the streaming loop
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void clearQueue();

    ////////////////////////////////////////////////////////////
    /// \brief Clear all the audio buffers and empty the playing queue
    ///
    /// This function is called when the stream is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool fillQueue();

    ////////////////////////////////////////////////////////////
    /// \brief Fill the audio buffers and put them all into the playing queue
    ///
    /// This function is called when playing starts and the
    /// playing queue is empty.
    ///
    /// \return True if the derived class has requested to stop, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool fillAndPushBuffer(unsigned int bufferNum);

    ////////////////////////////////////////////////////////////
    /// \brief Fill a new buffer with audio samples, and append
    ///        it to the playing queue
    ///
    /// This function is called as soon as a buffer has been fully
    /// consumed; it fills it again and inserts it back into the
    /// playing queue.
    ///
    /// \param buffer Number of the buffer to fill (in [0, BufferCount])
    ///
    /// \return True if the stream source has requested to stop, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void streamData();

    ////////////////////////////////////////////////////////////
    /// \brief Function called as the entry point of the thread
    ///
    /// This function starts the streaming loop, and returns
    /// only when the sound is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual void onSeek(Time timeOffset) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Change the current playing position in the stream source
    ///
    /// This function must be overriden by derived classes to
    /// allow random seeking into the stream source.
    ///
    /// \param timeOffset New playing position, relative to the beginning of the stream
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual bool onGetData(Chunk& data) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Request a new chunk of audio samples from the stream source
    ///
    /// This function must be overriden by derived classes to provide
    /// the audio samples to play. It is called continuously by the
    /// streaming loop, in a separate thread.
    /// The source can choose to stop the streaming loop at any time, by
    /// returning false to the caller.
    ///
    /// \param data Chunk of data to fill
    ///
    /// \return True to continue playback, false to stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void initialize(unsigned int channelCount, unsigned int sampleRate);

    ////////////////////////////////////////////////////////////
    /// \brief Define the audio stream parameters
    ///
    /// This function must be called by derived classes as soon
    /// as they know the audio settings of the stream to play.
    /// Any attempt to manipulate the stream (play(), ...) before
    /// calling this function will fail.
    /// It can be called multiple times if the settings of the
    /// audio stream change, but only when the stream is stopped.
    ///
    /// \param channelCount Number of channels of the stream
    /// \param sampleRate   Sample rate, in samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    SoundStream();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// This constructor is only meant to be called by derived classes.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool getLoop() const;

    ////////////////////////////////////////////////////////////
    /// \brief Tell whether or not the stream is in loop mode
    ///
    /// \return True if the stream is looping, false otherwise
    ///
    /// \see setLoop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void setLoop(bool loop);

    ////////////////////////////////////////////////////////////
    /// \brief Set whether or not the stream should loop after reaching the end
    ///
    /// If set, the stream will restart from beginning after
    /// reaching the end and so on, until it is stopped or
    /// setLoop(false) is called.
    /// The default looping state for streams is false.
    ///
    /// \param loop True to play in loop, false to play once
    ///
    /// \see getLoop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    Time getPlayingOffset() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the current playing position of the stream
    ///
    /// \return Current playing position, from the beginning of the stream
    ///
    /// \see setPlayingOffset
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void setPlayingOffset(Time timeOffset);

    ////////////////////////////////////////////////////////////
    /// \brief Change the current playing position of the stream
    ///
    /// The playing position can be changed when the stream is
    /// either paused or playing.
    ///
    /// \param timeOffset New playing position, from the beginning of the stream
    ///
    /// \see getPlayingOffset
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    Status getStatus() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the current status of the stream (stopped, paused, playing)
    ///
    /// \return Current status
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    unsigned int getSampleRate() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the stream sample rate of the stream
    ///
    /// The sample rate is the number of audio samples played per
    /// second. The higher, the better the quality.
    ///
    /// \return Sample rate, in number of samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    unsigned int getChannelCount() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return the number of channels of the stream
    ///
    /// 1 channel means a mono sound, 2 means stereo, etc.
    ///
    /// \return Number of channels
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void stop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop playing the audio stream
    ///
    /// This function stops the stream if it was playing or paused,
    /// and does nothing if it was already stopped.
    /// It also resets the playing position (unlike pause()).
    ///
    /// \see play, pause
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void pause();

    ////////////////////////////////////////////////////////////
    /// \brief Pause the audio stream
    ///
    /// This function pauses the stream if it was playing,
    /// otherwise (stream already paused or stopped) it has no effect.
    ///
    /// \see play, stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void play();

    ////////////////////////////////////////////////////////////
    /// \brief Start or resume playing the audio stream
    ///
    /// This function starts the stream if it was stopped, resumes
    /// it if it was paused, and restarts it from beginning if it
    /// was it already playing.
    /// This function uses its own thread so that it doesn't block
    /// the rest of the program while the stream is played.
    ///
    /// \see pause, stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual ~SoundStream();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    };

        const Int16* samples;     ///< Pointer to the audio samples
        std::size_t  sampleCount; ///< Number of samples pointed by Samples
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    struct Chunk

    ////////////////////////////////////////////////////////////
    /// \brief Structure defining a chunk of audio data to stream
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
class SFML_AUDIO_API SoundStream : public SoundSource

////////////////////////////////////////////////////////////
/// \brief Abstract base class for streamed audio sources
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
#include <SFML/Audio/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
#ifndef SFML_SOUNDSTREAM_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp

////////////////////////////////////////////////////////////
/// \class sf::SoundStream
/// \ingroup audio
///
/// Unlike audio buffers (see sf::SoundBuffer), audio streams
/// are never completely loaded in memory. Instead, the audio
/// data is acquired continuously while the stream is playing.
/// This behaviour allows to play a sound with no loading delay,
/// and keeps the memory consumption very low.
///
/// Sound sources that need to be streamed are usually big files
/// (compressed audio musics that would eat hundreds of MB in memory)
/// or files that would take a lot of time to be received
/// (sounds played over the network).
///
/// sf::SoundStream is a base class that doesn't care about the
/// stream source, which is left to the derived class. SFML provides
/// a built-in specialization for big files (see sf::Music).
/// No network stream source is provided, but you can write your own
/// by combining this class with the network module.
///
/// A derived class has to override two virtual functions:
/// \li onGetData fills a new chunk of audio data to be played
/// \li onSeek changes the current playing position in the source
///
/// It is important to note that each SoundStream is played in its
/// own separate thread, so that the streaming loop doesn't block the
/// rest of the program. In particular, the OnGetData and OnSeek
/// virtual functions may sometimes be called from this separate thread.
/// It is important to keep this in mind, because you may have to take
/// care of synchronization issues if you share data between threads. 
///
/// Usage example:
/// \code
/// class CustomStream : public sf::SoundStream
/// {
/// public :
///
///     bool open(const std::string& location)
///     {
///         // Open the source and get audio settings
///         ...
///         unsigned int channelCount = ...;
///         unsigned int sampleRate = ...;
///
///         // Initialize the stream -- important!
///         initialize(channelCount, sampleRate);
///     }
///
/// private :
///
///     virtual bool onGetData(Chunk& data)
///     {
///         // Fill the chunk with audio data from the stream source
///         data.samples = ...;
///         data.sampleCount = ...;
///
///         // Return true to continue playing
///         return true;
///     }
///
///     virtual void onSeek(Uint32 timeOffset)
///     {
///         // Change the current position in the stream source
///         ...
///     }
/// }
///
/// // Usage
/// CustomStream stream;
/// stream.open("path/to/stream");
/// stream.play();
/// \endcode
///
/// \see sf::Music
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
};

    ////////////////////////////////////////////////////////////
    Thread        m_thread;                  ///< Thread running the background tasks
    bool          m_isStreaming;             ///< Streaming state (true = playing, false = stopped)
    unsigned int  m_buffers[BufferCount];    ///< Sound buffers used to store temporary audio data
    unsigned int  m_channelCount;            ///< Number of channels (1 = mono, 2 = stereo, ...)
    unsigned int  m_sampleRate;              ///< Frequency (samples / second)
    Uint32        m_format;                  ///< Format of the internal sound buffers
    bool          m_loop;                    ///< Loop flag (true to loop, false to play once)
    Uint64        m_samplesProcessed;        ///< Number of buffers processed since beginning of the stream
    bool          m_endBuffers[BufferCount]; ///< Each buffer is marked as "end buffer" or not, for proper duration calculation
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    };

        BufferCount = 3 ///< Number of audio buffers used by the streaming loop
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void clearQueue();

    ////////////////////////////////////////////////////////////
    /// \brief Clear all the audio buffers and empty the playing queue
    ///
    /// This function is called when the stream is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool fillQueue();

    ////////////////////////////////////////////////////////////
    /// \brief Fill the audio buffers and put them all into the playing queue
    ///
    /// This function is called when playing starts and the
    /// playing queue is empty.
    ///
    /// \return True if the derived class has requested to stop, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool fillAndPushBuffer(unsigned int bufferNum);

    ////////////////////////////////////////////////////////////
    /// \brief Fill a new buffer with audio samples, and append
    ///        it to the playing queue
    ///
    /// This function is called as soon as a buffer has been fully
    /// consumed; it fills it again and inserts it back into the
    /// playing queue.
    ///
    /// \param buffer Number of the buffer to fill (in [0, BufferCount])
    ///
    /// \return True if the stream source has requested to stop, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void streamData();

    ////////////////////////////////////////////////////////////
    /// \brief Function called as the entry point of the thread
    ///
    /// This function starts the streaming loop, and returns
    /// only when the sound is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual void onSeek(Time timeOffset) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Change the current playing position in the stream source
    ///
    /// This function must be overriden by derived classes to
    /// allow random seeking into the stream source.
    ///
    /// \param timeOffset New playing position, relative to the beginning of the stream
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual bool onGetData(Chunk& data) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Request a new chunk of audio samples from the stream source
    ///
    /// This function must be overriden by derived classes to provide
    /// the audio samples to play. It is called continuously by the
    /// streaming loop, in a separate thread.
    /// The source can choose to stop the streaming loop at any time, by
    /// returning false to the caller.
    ///
    /// \param data Chunk of data to fill
    ///
    /// \return True to continue playback, false to stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void initialize(unsigned int channelCount, unsigned int sampleRate);

    ////////////////////////////////////////////////////////////
    /// \brief Define the audio stream parameters
    ///
    /// This function must be called by derived classes as soon
    /// as they know the audio settings of the stream to play.
    /// Any attempt to manipulate the stream (play(), ...) before
    /// calling this function will fail.
    /// It can be called multiple times if the settings of the
    /// audio stream change, but only when the stream is stopped.
    ///
    /// \param channelCount Number of channels of the stream
    /// \param sampleRate   Sample rate, in samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    SoundStream();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// This constructor is only meant to be called by derived classes.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool getLoop() const;

    ////////////////////////////////////////////////////////////
    /// \brief Tell whether or not the stream is in loop mode
    ///
    /// \return True if the stream is looping, false otherwise
    ///
    /// \see setLoop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void setLoop(bool loop);

    ////////////////////////////////////////////////////////////
    /// \brief Set whether or not the stream should loop after reaching the end
    ///
    /// If set, the stream will restart from beginning after
    /// reaching the end and so on, until it is stopped or
    /// setLoop(false) is called.
    /// The default looping state for streams is false.
    ///
    /// \param loop True to play in loop, false to play once
    ///
    /// \see getLoop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    Time getPlayingOffset() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the current playing position of the stream
    ///
    /// \return Current playing position, from the beginning of the stream
    ///
    /// \see setPlayingOffset
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void setPlayingOffset(Time timeOffset);

    ////////////////////////////////////////////////////////////
    /// \brief Change the current playing position of the stream
    ///
    /// The playing position can be changed when the stream is
    /// either paused or playing.
    ///
    /// \param timeOffset New playing position, from the beginning of the stream
    ///
    /// \see getPlayingOffset
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    Status getStatus() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the current status of the stream (stopped, paused, playing)
    ///
    /// \return Current status
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    unsigned int getSampleRate() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the stream sample rate of the stream
    ///
    /// The sample rate is the number of audio samples played per
    /// second. The higher, the better the quality.
    ///
    /// \return Sample rate, in number of samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    unsigned int getChannelCount() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return the number of channels of the stream
    ///
    /// 1 channel means a mono sound, 2 means stereo, etc.
    ///
    /// \return Number of channels
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void stop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop playing the audio stream
    ///
    /// This function stops the stream if it was playing or paused,
    /// and does nothing if it was already stopped.
    /// It also resets the playing position (unlike pause()).
    ///
    /// \see play, pause
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void pause();

    ////////////////////////////////////////////////////////////
    /// \brief Pause the audio stream
    ///
    /// This function pauses the stream if it was playing,
    /// otherwise (stream already paused or stopped) it has no effect.
    ///
    /// \see play, stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void play();

    ////////////////////////////////////////////////////////////
    /// \brief Start or resume playing the audio stream
    ///
    /// This function starts the stream if it was stopped, resumes
    /// it if it was paused, and restarts it from beginning if it
    /// was it already playing.
    /// This function uses its own thread so that it doesn't block
    /// the rest of the program while the stream is played.
    ///
    /// \see pause, stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual ~SoundStream();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    };

        const Int16* samples;     ///< Pointer to the audio samples
        std::size_t  sampleCount; ///< Number of samples pointed by Samples
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    struct Chunk

    ////////////////////////////////////////////////////////////
    /// \brief Structure defining a chunk of audio data to stream
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
class SFML_AUDIO_API SoundStream : public SoundSource

////////////////////////////////////////////////////////////
/// \brief Abstract base class for streamed audio sources
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
#include <SFML/Audio/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
#ifndef SFML_SOUNDSTREAM_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp

////////////////////////////////////////////////////////////
/// \class sf::SoundStream
/// \ingroup audio
///
/// Unlike audio buffers (see sf::SoundBuffer), audio streams
/// are never completely loaded in memory. Instead, the audio
/// data is acquired continuously while the stream is playing.
/// This behaviour allows to play a sound with no loading delay,
/// and keeps the memory consumption very low.
///
/// Sound sources that need to be streamed are usually big files
/// (compressed audio musics that would eat hundreds of MB in memory)
/// or files that would take a lot of time to be received
/// (sounds played over the network).
///
/// sf::SoundStream is a base class that doesn't care about the
/// stream source, which is left to the derived class. SFML provides
/// a built-in specialization for big files (see sf::Music).
/// No network stream source is provided, but you can write your own
/// by combining this class with the network module.
///
/// A derived class has to override two virtual functions:
/// \li onGetData fills a new chunk of audio data to be played
/// \li onSeek changes the current playing position in the source
///
/// It is important to note that each SoundStream is played in its
/// own separate thread, so that the streaming loop doesn't block the
/// rest of the program. In particular, the OnGetData and OnSeek
/// virtual functions may sometimes be called from this separate thread.
/// It is important to keep this in mind, because you may have to take
/// care of synchronization issues if you share data between threads. 
///
/// Usage example:
/// \code
/// class CustomStream : public sf::SoundStream
/// {
/// public :
///
///     bool open(const std::string& location)
///     {
///         // Open the source and get audio settings
///         ...
///         unsigned int channelCount = ...;
///         unsigned int sampleRate = ...;
///
///         // Initialize the stream -- important!
///         initialize(channelCount, sampleRate);
///     }
///
/// private :
///
///     virtual bool onGetData(Chunk& data)
///     {
///         // Fill the chunk with audio data from the stream source
///         data.samples = ...;
///         data.sampleCount = ...;
///
///         // Return true to continue playing
///         return true;
///     }
///
///     virtual void onSeek(Uint32 timeOffset)
///     {
///         // Change the current position in the stream source
///         ...
///     }
/// }
///
/// // Usage
/// CustomStream stream;
/// stream.open("path/to/stream");
/// stream.play();
/// \endcode
///
/// \see sf::Music
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
};

    ////////////////////////////////////////////////////////////
    Thread        m_thread;                  ///< Thread running the background tasks
    bool          m_isStreaming;             ///< Streaming state (true = playing, false = stopped)
    unsigned int  m_buffers[BufferCount];    ///< Sound buffers used to store temporary audio data
    unsigned int  m_channelCount;            ///< Number of channels (1 = mono, 2 = stereo, ...)
    unsigned int  m_sampleRate;              ///< Frequency (samples / second)
    Uint32        m_format;                  ///< Format of the internal sound buffers
    bool          m_loop;                    ///< Loop flag (true to loop, false to play once)
    Uint64        m_samplesProcessed;        ///< Number of buffers processed since beginning of the stream
    bool          m_endBuffers[BufferCount]; ///< Each buffer is marked as "end buffer" or not, for proper duration calculation
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    };

        BufferCount = 3 ///< Number of audio buffers used by the streaming loop
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void clearQueue();

    ////////////////////////////////////////////////////////////
    /// \brief Clear all the audio buffers and empty the playing queue
    ///
    /// This function is called when the stream is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool fillQueue();

    ////////////////////////////////////////////////////////////
    /// \brief Fill the audio buffers and put them all into the playing queue
    ///
    /// This function is called when playing starts and the
    /// playing queue is empty.
    ///
    /// \return True if the derived class has requested to stop, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool fillAndPushBuffer(unsigned int bufferNum);

    ////////////////////////////////////////////////////////////
    /// \brief Fill a new buffer with audio samples, and append
    ///        it to the playing queue
    ///
    /// This function is called as soon as a buffer has been fully
    /// consumed; it fills it again and inserts it back into the
    /// playing queue.
    ///
    /// \param buffer Number of the buffer to fill (in [0, BufferCount])
    ///
    /// \return True if the stream source has requested to stop, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void streamData();

    ////////////////////////////////////////////////////////////
    /// \brief Function called as the entry point of the thread
    ///
    /// This function starts the streaming loop, and returns
    /// only when the sound is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual void onSeek(Time timeOffset) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Change the current playing position in the stream source
    ///
    /// This function must be overriden by derived classes to
    /// allow random seeking into the stream source.
    ///
    /// \param timeOffset New playing position, relative to the beginning of the stream
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual bool onGetData(Chunk& data) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Request a new chunk of audio samples from the stream source
    ///
    /// This function must be overriden by derived classes to provide
    /// the audio samples to play. It is called continuously by the
    /// streaming loop, in a separate thread.
    /// The source can choose to stop the streaming loop at any time, by
    /// returning false to the caller.
    ///
    /// \param data Chunk of data to fill
    ///
    /// \return True to continue playback, false to stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void initialize(unsigned int channelCount, unsigned int sampleRate);

    ////////////////////////////////////////////////////////////
    /// \brief Define the audio stream parameters
    ///
    /// This function must be called by derived classes as soon
    /// as they know the audio settings of the stream to play.
    /// Any attempt to manipulate the stream (play(), ...) before
    /// calling this function will fail.
    /// It can be called multiple times if the settings of the
    /// audio stream change, but only when the stream is stopped.
    ///
    /// \param channelCount Number of channels of the stream
    /// \param sampleRate   Sample rate, in samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    SoundStream();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// This constructor is only meant to be called by derived classes.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool getLoop() const;

    ////////////////////////////////////////////////////////////
    /// \brief Tell whether or not the stream is in loop mode
    ///
    /// \return True if the stream is looping, false otherwise
    ///
    /// \see setLoop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void setLoop(bool loop);

    ////////////////////////////////////////////////////////////
    /// \brief Set whether or not the stream should loop after reaching the end
    ///
    /// If set, the stream will restart from beginning after
    /// reaching the end and so on, until it is stopped or
    /// setLoop(false) is called.
    /// The default looping state for streams is false.
    ///
    /// \param loop True to play in loop, false to play once
    ///
    /// \see getLoop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    Time getPlayingOffset() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the current playing position of the stream
    ///
    /// \return Current playing position, from the beginning of the stream
    ///
    /// \see setPlayingOffset
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void setPlayingOffset(Time timeOffset);

    ////////////////////////////////////////////////////////////
    /// \brief Change the current playing position of the stream
    ///
    /// The playing position can be changed when the stream is
    /// either paused or playing.
    ///
    /// \param timeOffset New playing position, from the beginning of the stream
    ///
    /// \see getPlayingOffset
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    Status getStatus() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the current status of the stream (stopped, paused, playing)
    ///
    /// \return Current status
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    unsigned int getSampleRate() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the stream sample rate of the stream
    ///
    /// The sample rate is the number of audio samples played per
    /// second. The higher, the better the quality.
    ///
    /// \return Sample rate, in number of samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    unsigned int getChannelCount() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return the number of channels of the stream
    ///
    /// 1 channel means a mono sound, 2 means stereo, etc.
    ///
    /// \return Number of channels
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void stop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop playing the audio stream
    ///
    /// This function stops the stream if it was playing or paused,
    /// and does nothing if it was already stopped.
    /// It also resets the playing position (unlike pause()).
    ///
    /// \see play, pause
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void pause();

    ////////////////////////////////////////////////////////////
    /// \brief Pause the audio stream
    ///
    /// This function pauses the stream if it was playing,
    /// otherwise (stream already paused or stopped) it has no effect.
    ///
    /// \see play, stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void play();

    ////////////////////////////////////////////////////////////
    /// \brief Start or resume playing the audio stream
    ///
    /// This function starts the stream if it was stopped, resumes
    /// it if it was paused, and restarts it from beginning if it
    /// was it already playing.
    /// This function uses its own thread so that it doesn't block
    /// the rest of the program while the stream is played.
    ///
    /// \see pause, stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual ~SoundStream();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    };

        const Int16* samples;     ///< Pointer to the audio samples
        std::size_t  sampleCount; ///< Number of samples pointed by Samples
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    struct Chunk

    ////////////////////////////////////////////////////////////
    /// \brief Structure defining a chunk of audio data to stream
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
class SFML_AUDIO_API SoundStream : public SoundSource

////////////////////////////////////////////////////////////
/// \brief Abstract base class for streamed audio sources
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
#include <SFML/Audio/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
#ifndef SFML_SOUNDSTREAM_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp

////////////////////////////////////////////////////////////
/// \class sf::SoundStream
/// \ingroup audio
///
/// Unlike audio buffers (see sf::SoundBuffer), audio streams
/// are never completely loaded in memory. Instead, the audio
/// data is acquired continuously while the stream is playing.
/// This behaviour allows to play a sound with no loading delay,
/// and keeps the memory consumption very low.
///
/// Sound sources that need to be streamed are usually big files
/// (compressed audio musics that would eat hundreds of MB in memory)
/// or files that would take a lot of time to be received
/// (sounds played over the network).
///
/// sf::SoundStream is a base class that doesn't care about the
/// stream source, which is left to the derived class. SFML provides
/// a built-in specialization for big files (see sf::Music).
/// No network stream source is provided, but you can write your own
/// by combining this class with the network module.
///
/// A derived class has to override two virtual functions:
/// \li onGetData fills a new chunk of audio data to be played
/// \li onSeek changes the current playing position in the source
///
/// It is important to note that each SoundStream is played in its
/// own separate thread, so that the streaming loop doesn't block the
/// rest of the program. In particular, the OnGetData and OnSeek
/// virtual functions may sometimes be called from this separate thread.
/// It is important to keep this in mind, because you may have to take
/// care of synchronization issues if you share data between threads. 
///
/// Usage example:
/// \code
/// class CustomStream : public sf::SoundStream
/// {
/// public :
///
///     bool open(const std::string& location)
///     {
///         // Open the source and get audio settings
///         ...
///         unsigned int channelCount = ...;
///         unsigned int sampleRate = ...;
///
///         // Initialize the stream -- important!
///         initialize(channelCount, sampleRate);
///     }
///
/// private :
///
///     virtual bool onGetData(Chunk& data)
///     {
///         // Fill the chunk with audio data from the stream source
///         data.samples = ...;
///         data.sampleCount = ...;
///
///         // Return true to continue playing
///         return true;
///     }
///
///     virtual void onSeek(Uint32 timeOffset)
///     {
///         // Change the current position in the stream source
///         ...
///     }
/// }
///
/// // Usage
/// CustomStream stream;
/// stream.open("path/to/stream");
/// stream.play();
/// \endcode
///
/// \see sf::Music
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
};

    ////////////////////////////////////////////////////////////
    Thread        m_thread;                  ///< Thread running the background tasks
    bool          m_isStreaming;             ///< Streaming state (true = playing, false = stopped)
    unsigned int  m_buffers[BufferCount];    ///< Sound buffers used to store temporary audio data
    unsigned int  m_channelCount;            ///< Number of channels (1 = mono, 2 = stereo, ...)
    unsigned int  m_sampleRate;              ///< Frequency (samples / second)
    Uint32        m_format;                  ///< Format of the internal sound buffers
    bool          m_loop;                    ///< Loop flag (true to loop, false to play once)
    Uint64        m_samplesProcessed;        ///< Number of buffers processed since beginning of the stream
    bool          m_endBuffers[BufferCount]; ///< Each buffer is marked as "end buffer" or not, for proper duration calculation
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    };

        BufferCount = 3 ///< Number of audio buffers used by the streaming loop
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void clearQueue();

    ////////////////////////////////////////////////////////////
    /// \brief Clear all the audio buffers and empty the playing queue
    ///
    /// This function is called when the stream is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool fillQueue();

    ////////////////////////////////////////////////////////////
    /// \brief Fill the audio buffers and put them all into the playing queue
    ///
    /// This function is called when playing starts and the
    /// playing queue is empty.
    ///
    /// \return True if the derived class has requested to stop, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool fillAndPushBuffer(unsigned int bufferNum);

    ////////////////////////////////////////////////////////////
    /// \brief Fill a new buffer with audio samples, and append
    ///        it to the playing queue
    ///
    /// This function is called as soon as a buffer has been fully
    /// consumed; it fills it again and inserts it back into the
    /// playing queue.
    ///
    /// \param buffer Number of the buffer to fill (in [0, BufferCount])
    ///
    /// \return True if the stream source has requested to stop, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void streamData();

    ////////////////////////////////////////////////////////////
    /// \brief Function called as the entry point of the thread
    ///
    /// This function starts the streaming loop, and returns
    /// only when the sound is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual void onSeek(Time timeOffset) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Change the current playing position in the stream source
    ///
    /// This function must be overriden by derived classes to
    /// allow random seeking into the stream source.
    ///
    /// \param timeOffset New playing position, relative to the beginning of the stream
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual bool onGetData(Chunk& data) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Request a new chunk of audio samples from the stream source
    ///
    /// This function must be overriden by derived classes to provide
    /// the audio samples to play. It is called continuously by the
    /// streaming loop, in a separate thread.
    /// The source can choose to stop the streaming loop at any time, by
    /// returning false to the caller.
    ///
    /// \param data Chunk of data to fill
    ///
    /// \return True to continue playback, false to stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void initialize(unsigned int channelCount, unsigned int sampleRate);

    ////////////////////////////////////////////////////////////
    /// \brief Define the audio stream parameters
    ///
    /// This function must be called by derived classes as soon
    /// as they know the audio settings of the stream to play.
    /// Any attempt to manipulate the stream (play(), ...) before
    /// calling this function will fail.
    /// It can be called multiple times if the settings of the
    /// audio stream change, but only when the stream is stopped.
    ///
    /// \param channelCount Number of channels of the stream
    /// \param sampleRate   Sample rate, in samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    SoundStream();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// This constructor is only meant to be called by derived classes.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool getLoop() const;

    ////////////////////////////////////////////////////////////
    /// \brief Tell whether or not the stream is in loop mode
    ///
    /// \return True if the stream is looping, false otherwise
    ///
    /// \see setLoop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void setLoop(bool loop);

    ////////////////////////////////////////////////////////////
    /// \brief Set whether or not the stream should loop after reaching the end
    ///
    /// If set, the stream will restart from beginning after
    /// reaching the end and so on, until it is stopped or
    /// setLoop(false) is called.
    /// The default looping state for streams is false.
    ///
    /// \param loop True to play in loop, false to play once
    ///
    /// \see getLoop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    Time getPlayingOffset() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the current playing position of the stream
    ///
    /// \return Current playing position, from the beginning of the stream
    ///
    /// \see setPlayingOffset
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void setPlayingOffset(Time timeOffset);

    ////////////////////////////////////////////////////////////
    /// \brief Change the current playing position of the stream
    ///
    /// The playing position can be changed when the stream is
    /// either paused or playing.
    ///
    /// \param timeOffset New playing position, from the beginning of the stream
    ///
    /// \see getPlayingOffset
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    Status getStatus() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the current status of the stream (stopped, paused, playing)
    ///
    /// \return Current status
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    unsigned int getSampleRate() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the stream sample rate of the stream
    ///
    /// The sample rate is the number of audio samples played per
    /// second. The higher, the better the quality.
    ///
    /// \return Sample rate, in number of samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    unsigned int getChannelCount() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return the number of channels of the stream
    ///
    /// 1 channel means a mono sound, 2 means stereo, etc.
    ///
    /// \return Number of channels
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void stop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop playing the audio stream
    ///
    /// This function stops the stream if it was playing or paused,
    /// and does nothing if it was already stopped.
    /// It also resets the playing position (unlike pause()).
    ///
    /// \see play, pause
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void pause();

    ////////////////////////////////////////////////////////////
    /// \brief Pause the audio stream
    ///
    /// This function pauses the stream if it was playing,
    /// otherwise (stream already paused or stopped) it has no effect.
    ///
    /// \see play, stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void play();

    ////////////////////////////////////////////////////////////
    /// \brief Start or resume playing the audio stream
    ///
    /// This function starts the stream if it was stopped, resumes
    /// it if it was paused, and restarts it from beginning if it
    /// was it already playing.
    /// This function uses its own thread so that it doesn't block
    /// the rest of the program while the stream is played.
    ///
    /// \see pause, stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual ~SoundStream();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    };

        const Int16* samples;     ///< Pointer to the audio samples
        std::size_t  sampleCount; ///< Number of samples pointed by Samples
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    struct Chunk

    ////////////////////////////////////////////////////////////
    /// \brief Structure defining a chunk of audio data to stream
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
class SFML_AUDIO_API SoundStream : public SoundSource

////////////////////////////////////////////////////////////
/// \brief Abstract base class for streamed audio sources
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
#include <SFML/Audio/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
#ifndef SFML_SOUNDSTREAM_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp

////////////////////////////////////////////////////////////
/// \class sf::SoundStream
/// \ingroup audio
///
/// Unlike audio buffers (see sf::SoundBuffer), audio streams
/// are never completely loaded in memory. Instead, the audio
/// data is acquired continuously while the stream is playing.
/// This behaviour allows to play a sound with no loading delay,
/// and keeps the memory consumption very low.
///
/// Sound sources that need to be streamed are usually big files
/// (compressed audio musics that would eat hundreds of MB in memory)
/// or files that would take a lot of time to be received
/// (sounds played over the network).
///
/// sf::SoundStream is a base class that doesn't care about the
/// stream source, which is left to the derived class. SFML provides
/// a built-in specialization for big files (see sf::Music).
/// No network stream source is provided, but you can write your own
/// by combining this class with the network module.
///
/// A derived class has to override two virtual functions:
/// \li onGetData fills a new chunk of audio data to be played
/// \li onSeek changes the current playing position in the source
///
/// It is important to note that each SoundStream is played in its
/// own separate thread, so that the streaming loop doesn't block the
/// rest of the program. In particular, the OnGetData and OnSeek
/// virtual functions may sometimes be called from this separate thread.
/// It is important to keep this in mind, because you may have to take
/// care of synchronization issues if you share data between threads. 
///
/// Usage example:
/// \code
/// class CustomStream : public sf::SoundStream
/// {
/// public :
///
///     bool open(const std::string& location)
///     {
///         // Open the source and get audio settings
///         ...
///         unsigned int channelCount = ...;
///         unsigned int sampleRate = ...;
///
///         // Initialize the stream -- important!
///         initialize(channelCount, sampleRate);
///     }
///
/// private :
///
///     virtual bool onGetData(Chunk& data)
///     {
///         // Fill the chunk with audio data from the stream source
///         data.samples = ...;
///         data.sampleCount = ...;
///
///         // Return true to continue playing
///         return true;
///     }
///
///     virtual void onSeek(Uint32 timeOffset)
///     {
///         // Change the current position in the stream source
///         ...
///     }
/// }
///
/// // Usage
/// CustomStream stream;
/// stream.open("path/to/stream");
/// stream.play();
/// \endcode
///
/// \see sf::Music
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
};

    ////////////////////////////////////////////////////////////
    Thread        m_thread;                  ///< Thread running the background tasks
    bool          m_isStreaming;             ///< Streaming state (true = playing, false = stopped)
    unsigned int  m_buffers[BufferCount];    ///< Sound buffers used to store temporary audio data
    unsigned int  m_channelCount;            ///< Number of channels (1 = mono, 2 = stereo, ...)
    unsigned int  m_sampleRate;              ///< Frequency (samples / second)
    Uint32        m_format;                  ///< Format of the internal sound buffers
    bool          m_loop;                    ///< Loop flag (true to loop, false to play once)
    Uint64        m_samplesProcessed;        ///< Number of buffers processed since beginning of the stream
    bool          m_endBuffers[BufferCount]; ///< Each buffer is marked as "end buffer" or not, for proper duration calculation
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    };

        BufferCount = 3 ///< Number of audio buffers used by the streaming loop
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void clearQueue();

    ////////////////////////////////////////////////////////////
    /// \brief Clear all the audio buffers and empty the playing queue
    ///
    /// This function is called when the stream is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool fillQueue();

    ////////////////////////////////////////////////////////////
    /// \brief Fill the audio buffers and put them all into the playing queue
    ///
    /// This function is called when playing starts and the
    /// playing queue is empty.
    ///
    /// \return True if the derived class has requested to stop, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool fillAndPushBuffer(unsigned int bufferNum);

    ////////////////////////////////////////////////////////////
    /// \brief Fill a new buffer with audio samples, and append
    ///        it to the playing queue
    ///
    /// This function is called as soon as a buffer has been fully
    /// consumed; it fills it again and inserts it back into the
    /// playing queue.
    ///
    /// \param buffer Number of the buffer to fill (in [0, BufferCount])
    ///
    /// \return True if the stream source has requested to stop, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void streamData();

    ////////////////////////////////////////////////////////////
    /// \brief Function called as the entry point of the thread
    ///
    /// This function starts the streaming loop, and returns
    /// only when the sound is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual void onSeek(Time timeOffset) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Change the current playing position in the stream source
    ///
    /// This function must be overriden by derived classes to
    /// allow random seeking into the stream source.
    ///
    /// \param timeOffset New playing position, relative to the beginning of the stream
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual bool onGetData(Chunk& data) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Request a new chunk of audio samples from the stream source
    ///
    /// This function must be overriden by derived classes to provide
    /// the audio samples to play. It is called continuously by the
    /// streaming loop, in a separate thread.
    /// The source can choose to stop the streaming loop at any time, by
    /// returning false to the caller.
    ///
    /// \param data Chunk of data to fill
    ///
    /// \return True to continue playback, false to stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void initialize(unsigned int channelCount, unsigned int sampleRate);

    ////////////////////////////////////////////////////////////
    /// \brief Define the audio stream parameters
    ///
    /// This function must be called by derived classes as soon
    /// as they know the audio settings of the stream to play.
    /// Any attempt to manipulate the stream (play(), ...) before
    /// calling this function will fail.
    /// It can be called multiple times if the settings of the
    /// audio stream change, but only when the stream is stopped.
    ///
    /// \param channelCount Number of channels of the stream
    /// \param sampleRate   Sample rate, in samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    SoundStream();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// This constructor is only meant to be called by derived classes.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    bool getLoop() const;

    ////////////////////////////////////////////////////////////
    /// \brief Tell whether or not the stream is in loop mode
    ///
    /// \return True if the stream is looping, false otherwise
    ///
    /// \see setLoop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void setLoop(bool loop);

    ////////////////////////////////////////////////////////////
    /// \brief Set whether or not the stream should loop after reaching the end
    ///
    /// If set, the stream will restart from beginning after
    /// reaching the end and so on, until it is stopped or
    /// setLoop(false) is called.
    /// The default looping state for streams is false.
    ///
    /// \param loop True to play in loop, false to play once
    ///
    /// \see getLoop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    Time getPlayingOffset() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the current playing position of the stream
    ///
    /// \return Current playing position, from the beginning of the stream
    ///
    /// \see setPlayingOffset
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void setPlayingOffset(Time timeOffset);

    ////////////////////////////////////////////////////////////
    /// \brief Change the current playing position of the stream
    ///
    /// The playing position can be changed when the stream is
    /// either paused or playing.
    ///
    /// \param timeOffset New playing position, from the beginning of the stream
    ///
    /// \see getPlayingOffset
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    Status getStatus() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the current status of the stream (stopped, paused, playing)
    ///
    /// \return Current status
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    unsigned int getSampleRate() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the stream sample rate of the stream
    ///
    /// The sample rate is the number of audio samples played per
    /// second. The higher, the better the quality.
    ///
    /// \return Sample rate, in number of samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    unsigned int getChannelCount() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return the number of channels of the stream
    ///
    /// 1 channel means a mono sound, 2 means stereo, etc.
    ///
    /// \return Number of channels
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void stop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop playing the audio stream
    ///
    /// This function stops the stream if it was playing or paused,
    /// and does nothing if it was already stopped.
    /// It also resets the playing position (unlike pause()).
    ///
    /// \see play, pause
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void pause();

    ////////////////////////////////////////////////////////////
    /// \brief Pause the audio stream
    ///
    /// This function pauses the stream if it was playing,
    /// otherwise (stream already paused or stopped) it has no effect.
    ///
    /// \see play, stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    void play();

    ////////////////////////////////////////////////////////////
    /// \brief Start or resume playing the audio stream
    ///
    /// This function starts the stream if it was stopped, resumes
    /// it if it was paused, and restarts it from beginning if it
    /// was it already playing.
    /// This function uses its own thread so that it doesn't block
    /// the rest of the program while the stream is played.
    ///
    /// \see pause, stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    virtual ~SoundStream();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    };

        const Int16* samples;     ///< Pointer to the audio samples
        std::size_t  sampleCount; ///< Number of samples pointed by Samples
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
    struct Chunk

    ////////////////////////////////////////////////////////////
    /// \brief Structure defining a chunk of audio data to stream
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
class SFML_AUDIO_API SoundStream : public SoundSource

////////////////////////////////////////////////////////////
/// \brief Abstract base class for streamed audio sources
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
#include <SFML/Audio/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
#ifndef SFML_SOUNDSTREAM_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundStream.hpp
//

////////////////////////////////////////////////////////////
