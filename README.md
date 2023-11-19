# java_cook_book
Learning New Features through code

The new API is in five packages, as shown in Table 6-2; as usual, the top-level one contains the most commonly used pieces.

New date/time API: packages
| Name                |	Description                                                 |
|---------------------|:-----------------------------------------------------------:|
| java.time           | Common classes for dates, times, instants, and durations    |
| java.time.chrono    | API for non-ISO calendar systems                            |
| java.time.format    | Formatting classes                                          |
| java.time.temporal  | Date and time access using fields, units, and adjusters     |
| java.time.zone      | Support for time zones and their rules                      |

New date/time API: basics

| Class               | 	Description                                                 |
|---------------------|:---------------------------------------------------------------:|
| Clock               | Replaceable factory for getting current time                    |
| Instant             | A point in time since January 1, 1970, expressed in nanoseconds |
| Duration            | A length of time, also expressed in nanoseconds                 |

Human time represents times and dates as we use them in our everyday life. These classes are listed in Table 6-4.

New date/time API: human time
| Class	              | Description                                                                |
|---------------------|:--------------------------------------------------------------------------:|
| Calendrical         | Connects to the low-level API                                              |
| DateTimeFields      | Stores a map of field-value pairs, which are not required to be consistent |
| DayOfWeek           | A day of the week (e.g., Tuesday)                                          |
| LocalDate           | A bare date (day, month, and year) with no adjustments                     |
| LocalTime           | A bare time (hour, minute, seconds) with no adjustments                    |
| LocalDateTime       | The combination of the above                                               |
| MonthDay            | Month and day                                                              |
| OffsetTime          | A time of day with a time zone offset like –04:00, with no date or zone    |
| OffsetDateTime      | A date and time with a time zone offset like –04:00, with no time zone     |
| Period              | A descriptive amount of time, such as “2 months and 3 days”                |
| ZonedDateTime       | The date and time with a time zone and an offset                           |
| Year                | A year by itself                                                           |
| YearMonth           | A year and month                                                           |