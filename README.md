# My Codewars Solutions (Java)

## Codewars profile
[![CodeWars](https://www.codewars.com/users/jeppestaerk/badges/large)](https://www.codewars.com/users/jeppestaerk)

## Code status
[![Build Status](https://travis-ci.org/jeppestaerk/My-CodeWars-Solutions-Java.svg?branch=master)](https://travis-ci.org/jeppestaerk/My-CodeWars-Solutions-Java)
[![CircleCI](https://circleci.com/gh/jeppestaerk/My-CodeWars-Solutions-Java.svg?style=svg)](https://circleci.com/gh/jeppestaerk/My-CodeWars-Solutions-Java)


## My Solutions
### Kata Ranking
Ranks are used to indicate progression and difficulty. Code Warriors complete Kata which are assigned a rank, which in turn earns them a higher rank once they complete enough of them. There are two classes of ranks, Kyu and Dan. You begin with Kyu at level 8 and work your way down to level 1. Then you progress to Dan, where you work your way up from level 1 to level 8.

*source: [Codewars Wiki Honor & Ranks](https://github.com/Codewars/codewars.com/wiki/Honor-&-Ranks#ranks)*

#### 1 Kyu
**1 kyu** a proficient programming level. At this level kata are similar to 2 kyu but more challenging.
* Advanced AI/machine learning algorithms
* Complex interpreters and compilers
* Complex Mini-programs with multiple feature requirements (such as a complete markdown parser)

*source: [Codewars Wiki Kata Ranking](https://github.com/Codewars/codewars.com/wiki/Kata-Ranking#1-kyu)*

#### 2 Kyu
**2 kyu** a proficient programming level. At this level kata require a mature understanding of complex programming concepts.
* Complex AI/machine learning algorithms
* Reverse engineering techniques
* Basic interpreters and compilers
* Basic mini-programs with multiple feature requirements (such as a basic markdown parser)

*source: [Codewars Wiki Kata Ranking](https://github.com/Codewars/codewars.com/wiki/Kata-Ranking#2-kyu)*

#### 3 Kyu
**3 kyu** a competent programming level. At this level the kata are similar to 4 kyu but are more challenging.
* Computer science concepts utilizing advanced algorithms
* Ability to implement advanced requirements in a scalable fashion
* Basic AI/machine learning algorithms
* Detailed usage of advanced concepts such as concurrency, parallelism and cryptography

*source: [Codewars Wiki Kata Ranking](https://github.com/Codewars/codewars.com/wiki/Kata-Ranking#3-kyu)*

#### 4 Kyu
**4 kyu** a competent programming level. At this level the kata begin to take some serious thought to complete.
* Computer science concepts utilizing complex algorithms
* Advanced design patterns
* Understanding intricate business requirements
* Advanced concepts such as concurrency, parallelism, meta programming and cryptography

*source: [Codewars Wiki Kata Ranking](https://github.com/Codewars/codewars.com/wiki/Kata-Ranking#4-kyu)*

#### 5 Kyu
**5 kyu** a novice programming level. At this level the kata are similar to 6 kyu but more challenging
* Complex language features that require mature OOP/Functional concepts
* Advanced OOP/Functional concepts
* Complex Design Patterns
* Advanced regular expression usage

*source: [Codewars Wiki Kata Ranking](https://github.com/Codewars/codewars.com/wiki/Kata-Ranking#5-kyu)*

#### 6 Kyu
**6 kyu** a novice programming level. At this level the kata will start to include more advanced algorithmic challenges and more complex language features.
* Complex language features (closures, scopes, monads, etc)
* Complex OOP/Functional concepts
* Basic Design Patterns
* Complex Regular Expressions

*source: [Codewars Wiki Kata Ranking](https://github.com/Codewars/codewars.com/wiki/Kata-Ranking#6-kyu)*

#### 7 Kyu
**7 kyu** a beginner programming level. At this level the kata will generally challenge users on their core language and API reference knowledge.
* Iterating arrays and returning a subset of values
* Basic data type manipulations
* Basic functional or object-oriented concepts
* Basic Regular Expressions

*source: [Codewars Wiki Kata Ranking](https://github.com/Codewars/codewars.com/wiki/Kata-Ranking#7-kyu)*

##### [Growth of a Population](https://github.com/jeppestaerk/My-CodeWars-Solutions-Java/blob/master/src/main/java/kata/kyu7/GrowthOfAPopulation.java)
In a small town the population is ```p0 = 1000``` at the beginning of a year. The population regularly increases by ```2 percent``` per year and moreover ```50``` new inhabitants per year come to live in the town. How many years does the town need to see its population greater or equal to ```p = 1200``` inhabitants?

```
At the end of the first year there will be:
1000 + 1000 * 0.02 + 50 => 1070 inhabitants

At the end of the 2nd year there will be:
1070 + 1070 * 0.02 + 50 => 1141 inhabitants (number of inhabitants is an integer)

At the end of the 3rd year there will be:
1141 + 1141 * 0.02 + 50 => 1213

It will need 3 entire years.
```

More generally given parameters:

```
p0, percent, aug (inhabitants coming or leaving each year), p (population to surpass)
```

the function ```nb_year``` should return ```n``` number of entire years needed to get a population greater or equal to ```p```.

aug is an integer, percent a positive or null number, p0 and p are positive integers (> 0)

```
Examples:
nb_year(1500, 5, 100, 5000) -> 15
nb_year(1500000, 2.5, 10000, 2000000) -> 10
```

Note: Don't forget to convert the percent parameter as a percentage in the body of your function: if the parameter percent is 2 you have to convert it to 0.02.

*source: [Codewars 7 kyu - Growth of a Population](https://www.codewars.com/kata/50654ddff44f800200000004)*

#### 8 Kyu
**8 kyu** a beginner level. At this level the kata is only challenging for users new to programming.
* Defining a simple function (i.e. hello world)
* Basic variable assignments
* Fixing basic syntax issues
* Trivial algorithms such as basic if/else statements

*source: [Codewars Wiki Kata Ranking](https://github.com/Codewars/codewars.com/wiki/Kata-Ranking#8-kyu)*

##### [Multiply](https://github.com/jeppestaerk/My-CodeWars-Solutions-Java/blob/master/src/main/java/kata/kyu8/Multiply.java)
The code does not execute properly. Try to figure out why.
*source: [Codewars 8 kyu - Multiply](https://www.codewars.com/kata/50654ddff44f800200000004)*
