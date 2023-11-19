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
