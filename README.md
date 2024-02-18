# evocomp-hw2
Repository for Homework 2 in our Evolutionary Computation course.

All code present in commit [1ae2c28] is copyright "Developed by Hal Stringer & Annie Wu, UCF" 2004. Subsequent modifications are licensed under GPLv3. See LICENSE.md for complete terms binding additions.

## Modification

From the base provided code the following changes have been made:

1. Converting FitnessFunction from a base class to an interface to prevent initialization of a problem with no defined behavior.
2. Removed example problems after creating the skeleton for the Royal Road problem class.
3. Linted and formatted everything according to RedHat standards (using the Language Support for Java by Red Hat extension in VSCode).
4. Simplified comments by removing empty structural label comments (e.g. three line comment specifying the location for static methods in a class with none).

The class `RoyalRoad` will be a basic definition of the problem with no higher-order schema.

## Royal Road Functions

There are a number of potential RoyalRoad functions, this describes the implementation of each which is available in this code base.

### `RoyalRoad.java`

This is the basic RR1 function presented in the Forrest paper. It has 8, order-8 schemata and one order-64 schemata.