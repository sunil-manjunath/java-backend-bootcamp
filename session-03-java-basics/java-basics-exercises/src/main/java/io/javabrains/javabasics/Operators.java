package io.javabrains.javabasics;

import java.util.ArrayList;
import java.util.List;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
        int a = 10;
        int b = 20;

        // Step 2: Perform arithmetic operations
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;

        // Step 3: Print the results of the arithmetic operations
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // Step 4: Perform increment and decrement operations
        a++; // Increment a
        b--; // Decrement b
        int preIncrement = ++a; // Pre-increment a
        int postDecrement = b--; // Post-decrement b
        int preDecrement = --b; // Pre-decrement b
        int postIncrement = a++; // Post-increment a


        // Step 5: Print the results of the increment and decrement operations
        System.out.println("After incrementing a: " + a);
        System.out.println("After decrementing b: " + b);
        System.out.println("Pre-increment a: " + preIncrement);
        System.out.println("Post-decrement b: " + postDecrement);
        System.out.println("Pre-decrement b: " + preDecrement);
        System.out.println("Post-increment a: " + postIncrement);

        // Step 6: Perform comparison operations
        boolean isEqual = (a == b); // Check if a is equal to b
        boolean isNotEqual = (a != b); // Check if a is not equal to b
        boolean isGreater = (a > b); // Check if a is greater than b
        boolean isLess = (a < b); // Check if a is less than b
        boolean isGreaterOrEqual = (a >= b); // Check if a is greater than or equal to b
        boolean isLessOrEqual = (a <= b); // Check if a is less than or equal to b


        // Step 7: Print the results of the comparison operation
        System.out.println("Is a equal to b? " + isEqual);
        System.out.println("Is a not equal to b? " + isNotEqual);
        System.out.println("Is a greater than b? " + isGreater);
        System.out.println("Is a less than b? " + isLess);
        System.out.println("Is a greater than or equal to b? " + isGreaterOrEqual);
        System.out.println("Is a less than or equal to b? " + isLessOrEqual);


        // Step 8: Perform logical operations
        boolean x = true;
        boolean y = false;
        boolean andOperation = x && y; // Logical AND
        boolean orOperation = x || y; // Logical OR
        boolean notOperation = !x; // Logical NOT
        boolean xorOperation = x ^ y; // Logical XOR
        boolean conditionalOperation = (a > b) ? x : y; // Conditional operation (ternary operator)boolean nullCheck = (x != null) && (y != null); // Null check
    //    boolean nullSafeOperation = (x != null) || (y != null); // Null-safe operation
        boolean shortCircuitAnd = (x && (a > b)); // Short-circuit AND
        boolean shortCircuitOr = (x || (a < b)); // Short-circuit OR
        boolean complexCondition = (x && (a > b)) || (y || (a < b)); // Complex condition
    //    boolean complexConditionWithNull = (x != null && (a > b)) || (y != null || (a < b)); // Complex condition with null check
        boolean complexConditionWithShortCircuit = (x && (a > b)) || (y || (a < b)); // Complex condition with short-circuit evaluation
        boolean complexConditionWithTernary = (x ? (a > b) : (y || (a < b))); // Complex condition with ternary operator
    //    boolean complexConditionWithNullSafe = (x != null ? (a > b) : (y != null || (a < b))); // Complex condition with null-safe operation
        boolean complexConditionWithShortCircuitAnd = (x && (a > b)) || (y || (a < b)); // Complex condition with short-circuit AND
        boolean complexConditionWithShortCircuitOr = (x || (a < b)) && (y || (a > b)); // Complex condition with short-circuit OR
        boolean complexConditionWithMultipleOperations = (x && (a > b)) || (y || (a < b)) && (x || (y && (a < b))); // Complex condition with multiple operations
    //    boolean complexConditionWithMultipleOperationsAndNull = (x != null && (a > b)) || (y != null || (a < b)) && (x != null || (y != null && (a < b))); // Complex condition with multiple operations and null check
        boolean complexConditionWithMultipleOperationsAndShortCircuit = (x && (a > b)) || (y || (a < b)) && (x || (y && (a < b))); // Complex condition with multiple operations and short-circuit evaluation
        boolean complexConditionWithMultipleOperationsAndTernary = (x ? (a > b) : (y || (a < b))) && (x ? (y || (a < b)) : (x || (y && (a < b)))); // Complex condition with multiple operations and ternary operator
    //    boolean complexConditionWithMultipleOperationsAndNullSafe = (x != null ? (a > b) : (y != null || (a< b))) && (x != null ? (y || (a < b)) : (x != null || (y != null && (a < b)))); // Complex condition with multiple operations and null-safe operation
        boolean complexConditionWithMultipleOperationsAndShortCircuitAnd = (x && (a > b)) || (y || (a < b)) && (x || (y && (a < b))); // Complex condition with multiple operations and short-circuit AND
        boolean complexConditionWithMultipleOperationsAndShortCircuitOr = (x || (a < b)) && (y || (a > b)); // Complex condition with multiple operations and short-circuit OR
    //    boolean complexConditionWithMultipleOperationsAndNullCheck = (x != null && (a > b)) || (y != null || (a < b)); // Complex condition with multiple operations and null check
    //    boolean complexConditionWithMultipleOperationsAndNullSafe = (x != null ? (a > b) : (y != null || (a < b))) && (x != null ? (y || (a < b)) : (x != null || (y != null && (a < b)))); // Complex condition with multiple operations and null-safe operation
        boolean complexConditionWithMultipleOperationsAndShortCircuitAndNull = (x && (a > b)) || (y || (a < b)) && (x || (y && (a < b))); // Complex condition with multiple operations, short-circuit AND, and null check


        // Step 9: Print the results of the logical operations
        System.out.println("Logical AND: " + andOperation);
        System.out.println("Logical OR: " + orOperation);
        System.out.println("Logical NOT: " + notOperation);
        System.out.println("Logical XOR: " + xorOperation);
        System.out.println("Conditional operation: " + conditionalOperation);
    //    System.out.println("Null check: " + nullCheck);
    //    System.out.println("Null-safe operation: " + nullSafeOperation);
        System.out.println("Short-circuit AND: " + shortCircuitAnd);
        System.out.println("Short-circuit OR: " + shortCircuitOr);
        System.out.println("Complex condition: " + complexCondition);
    //    System.out.println("Complex condition with null check: " + complexConditionWithNull);
        System.out.println("Complex condition with short-circuit evaluation: " + complexConditionWithShortCircuit);
        System.out.println("Complex condition with ternary operator: " + complexConditionWithTernary);
    //    System.out.println("Complex condition with null-safe operation: " + complexConditionWithNullSafe);
        System.out.println("Complex condition with short-circuit AND: " + complexConditionWithShortCircuitAnd);
        System.out.println("Complex condition with short-circuit OR: " + complexConditionWithShortCircuitOr);
        System.out.println("Complex condition with multiple operations: " + complexConditionWithMultipleOperations);
    //    System.out.println("Complex condition with multiple operations and null check: " + complexConditionWithMultipleOperationsAndNull);
        System.out.println("Complex condition with multiple operations and short-circuit evaluation: " + complexConditionWithMultipleOperationsAndShortCircuit);
        System.out.println("Complex condition with multiple operations and ternary operator: " + complexConditionWithMultipleOperationsAndTernary);
   //     System.out.println("Complex condition with multiple operations and null-safe operation: " + complexConditionWithMultipleOperationsAndNullSafe);
        System.out.println("Complex condition with multiple operations and short-circuit AND: " + complexConditionWithMultipleOperationsAndShortCircuitAnd);
        System.out.println("Complex condition with multiple operations and short-circuit OR: " + complexConditionWithMultipleOperationsAndShortCircuitOr);
    //    System.out.println("Complex condition with multiple operations and null check: " + complexConditionWithMultipleOperationsAndNullCheck);
    //    System.out.println("Complex condition with multiple operations and null-safe operation: " + complexConditionWithMultipleOperationsAndNullSafe);
        System.out.println("Complex condition with multiple operations, short-circuit AND, and null check: " + complexConditionWithMultipleOperationsAndShortCircuitAndNull);
        // Step 10: Perform bitwise operations
        int bitwiseAnd = a & b; // Bitwise AND
        int bitwiseOr = a | b; // Bitwise OR
        int bitwiseXor = a ^ b; // Bitwise XOR
        int bitwiseNotA = ~a; // Bitwise NOT on a
        int bitwiseNotB = ~b; // Bitwise NOT on b
        int leftShiftA = a << 2; // Left shift a by 2 bits
        int rightShiftB = b >> 2; // Right shift b by 2 bits
        int unsignedRightShiftB = b >>> 2; // Unsigned right shift b by 2 bits
        int bitwiseAndWithNull = (a != 0) ? (a & b) : 0; // Bitwise AND with null check
        int bitwiseOrWithNull = (a != 0) ? (a | b) : 0; // Bitwise OR with null check
        int bitwiseXorWithNull = (a != 0) ? (a ^ b) : 0; // Bitwise XOR with null check
        int bitwiseNotAWithNull = (a != 0) ? ~a : 0; // Bitwise NOT on a with null check
        int bitwiseNotBWithNull = (b != 0) ? ~b : 0; // Bitwise NOT on b with null check
        int leftShiftAWithNull = (a != 0) ? (a << 2) : 0; // Left shift a by 2 bits with null check
        int rightShiftBWithNull = (b != 0) ? (b >> 2) : 0; // Right shift b by 2 bits with null check
        int unsignedRightShiftBWithNull = (b != 0) ? (b >>> 2) : 0; // Unsigned right shift b by 2 bits with null check
        // Step 11: Print the results of the bitwise operations
        System.out.println("Bitwise AND: " + bitwiseAnd);
        System.out.println("Bitwise OR: " + bitwiseOr);
        System.out.println("Bitwise XOR: " + bitwiseXor);
        System.out.println("Bitwise NOT on a: " + bitwiseNotA);
        System.out.println("Bitwise NOT on b: " + bitwiseNotB);
        System.out.println("Left shift a by 2 bits: " + leftShiftA);
        System.out.println("Right shift b by 2 bits: " + rightShiftB);
        System.out.println("Unsigned right shift b by 2 bits: " + unsignedRightShiftB);
        System.out.println("Bitwise AND with null check: " + bitwiseAndWithNull);
        System.out.println("Bitwise OR with null check: " + bitwiseOrWithNull);
        System.out.println("Bitwise XOR with null check: " + bitwiseXorWithNull);
        System.out.println("Bitwise NOT on a with null check: " + bitwiseNotAWithNull);
        System.out.println("Bitwise NOT on b with null check: " + bitwiseNotBWithNull);
        System.out.println("Left shift a by 2 bits with null check: " + leftShiftAWithNull);
        System.out.println("Right shift b by 2 bits with null check: " + rightShiftBWithNull);
        System.out.println("Unsigned right shift b by 2 bits with null check: " + unsignedRightShiftBWithNull);
        // Step 12: Perform assignment operations
        int c = 30; // Assign value to c
        c += a; // Add a to c
        c -= b; // Subtract b from c
        c *= a; // Multiply c by a
        c /= b; // Divide c by b
        c %= a; // Modulus of c by a
        c &= a; // Bitwise AND with a
        c |= b; // Bitwise OR with b
        c ^= a; // Bitwise XOR with a
        c <<= 2; // Left shift c by 2 bits
        c >>= 2; // Right shift c by 2 bits
        c >>>= 2; // Unsigned right shift c by 2 bits
        // Step 13: Print the results of the assignment operations
        System.out.println("Value of c after assignment operations: " + c);
        // Step 14: Perform type casting operations
        double d = 10.5; // Declare a double variable
        int e = (int) d; // Cast double to int
        long f = 100L; // Declare a long variable
        float g = (float) f; // Cast long to float
        byte h = (byte) e; // Cast int to byte
        short i = (short) g; // Cast float to short
        // Step 15: Print the results of the type casting operations
        System.out.println("Value of d: " + d);
        System.out.println("Value of e (double to int): " + e);
        System.out.println("Value of f: " + f);
        System.out.println("Value of g (long to float): " + g);
        System.out.println("Value of h (int to byte): " + h);
        System.out.println("Value of i (float to short): " + i);
        // Step 16: Perform instanceof operator
        List<String> list = new ArrayList<>(); // Create a list of strings
        boolean isListInstance = list instanceof List; // Check if list is an instance of List
        boolean isArrayListInstance = list instanceof ArrayList; // Check if list is an instance of ArrayList
//        boolean isStringInstance = list instanceof String; // Check if list is an instance of String
        boolean isNullInstance = null instanceof List; // Check if null is an instance of List
        boolean isNullArrayListInstance = null instanceof ArrayList; // Check if null is an instance of ArrayList
        boolean isNullStringInstance = null instanceof String; // Check if null is an instance of String
        boolean isNullListInstance = null instanceof List; // Check if null is an instance of List
        boolean isNullArrayListInstance2 = null instanceof ArrayList; // Check if null is an instance of ArrayList
        boolean isNullStringInstance2 = null instanceof String; // Check if null is an instance of String
        boolean isNullListInstance2 = null instanceof List; // Check if null is an instance of List
        boolean isNullArrayListInstance3 = null instanceof ArrayList; // Check if null is an instance of ArrayList
        boolean isNullStringInstance3 = null instanceof String; // Check if null is an instance of String
        boolean isNullListInstance3 = null instanceof List; // Check if null is an instance of List
        boolean isNullArrayListInstance4 = null instanceof ArrayList; // Check if null is an instance of ArrayList
        boolean isNullStringInstance4 = null instanceof String; // Check if null is an instance of String
        boolean isNullListInstance4 = null instanceof List; // Check if null is an instance of List
        boolean isNullArrayListInstance5 = null instanceof ArrayList; // Check if null is an instance of ArrayList
        boolean isNullStringInstance5 = null instanceof String; // Check if null is an instance of String
        boolean isNullListInstance5 = null instanceof List; // Check if null is an instance of List
        boolean isNullArrayListInstance6 = null instanceof ArrayList; // Check if null is an instance of ArrayList
        boolean isNullStringInstance6 = null instanceof String; // Check if null is an instance of String
        boolean isNullListInstance6 = null instanceof List; // Check if null is an instance of List
        boolean isNullArrayListInstance7 = null instanceof ArrayList; // Check if null is an instance of ArrayList
        boolean isNullStringInstance7 = null instanceof String; // Check if null is an instance of String
        boolean isNullListInstance7 = null instanceof List; // Check if null is an instance of List
        boolean isNullArrayListInstance8 = null instanceof ArrayList; // Check if null is an instance of ArrayList
        boolean isNullStringInstance8 = null instanceof String; // Check if null is an instance of String
        boolean isNullListInstance8 = null instanceof List; // Check if null is an instance of List
        // Step 17: Print the results of the instanceof operator
        System.out.println("Is list an instance of List? " + isListInstance);
        System.out.println("Is list an instance of ArrayList? " + isArrayListInstance);
   //     System.out.println("Is list an instance of String? " + isStringInstance);
        System.out.println("Is null an instance of List? " + isNullInstance);
        System.out.println("Is null an instance of ArrayList? " + isNullArrayListInstance);
        System.out.println("Is null an instance of String? " + isNullStringInstance);
        System.out.println("Is null an instance of List? " + isNullListInstance);
        System.out.println("Is null an instance of ArrayList? " + isNullArrayListInstance2);
        System.out.println("Is null an instance of String? " + isNullStringInstance2);
        System.out.println("Is null an instance of List? " + isNullListInstance2);
        System.out.println("Is null an instance of ArrayList? " + isNullArrayListInstance3);
        System.out.println("Is null an instance of String? " + isNullStringInstance3);
        System.out.println("Is null an instance of List? " + isNullListInstance3);
        System.out.println("Is null an instance of ArrayList? " + isNullArrayListInstance4);
        System.out.println("Is null an instance of String? " + isNullStringInstance4);
        System.out.println("Is null an instance of List? " + isNullListInstance4);
        System.out.println("Is null an instance of ArrayList? " + isNullArrayListInstance5);
        System.out.println("Is null an instance of String? " + isNullStringInstance5);
        System.out.println("Is null an instance of List? " + isNullListInstance5);
        System.out.println("Is null an instance of ArrayList? " + isNullArrayListInstance6);
        System.out.println("Is null an instance of String? " + isNullStringInstance6);
        System.out.println("Is null an instance of List? " + isNullListInstance6);
        System.out.println("Is null an instance of ArrayList? " + isNullArrayListInstance7);
        System.out.println("Is null an instance of String? " + isNullStringInstance7);
        System.out.println("Is null an instance of List? " + isNullListInstance7);
        System.out.println("Is null an instance of ArrayList? " + isNullArrayListInstance8);
        System.out.println("Is null an instance of String? " + isNullStringInstance8);
        System.out.println("Is null an instance of List? " + isNullListInstance8);
        // Step 18: Perform instanceof operator with null checks
        boolean isListInstanceWithNullCheck = (list != null) && (list instanceof List); // Check if list is not null and is an instance of List
        boolean isArrayListInstanceWithNullCheck = (list != null) && (list instanceof ArrayList); // Check if list is not null and is an instance of ArrayList
//        boolean isStringInstanceWithNullCheck = (list != null) && (list instanceof String); // Check if list is not null and is an instance of String
        boolean isNullInstanceWithNullCheck = (list == null) && (list instanceof List); // Check if list is null and is an instance of List
        boolean isNullArrayListInstanceWithNullCheck = (list == null) && (list instanceof ArrayList); // Check if list is null and is an instance of ArrayList
//        boolean isNullStringInstanceWithNullCheck = (list == null) && (list instanceof String); // Check if list is null and is an instance of String
        boolean isNullListInstanceWithNullCheck = (list == null) && (list instanceof List); // Check if list is null and is an instance of List
        boolean isNullArrayListInstanceWithNullCheck2 = (list  == null) && (list instanceof ArrayList); // Check if list is null and is an instance of ArrayList
//        boolean isNullStringInstanceWithNullCheck2 = (list == null) && (list instanceof String); // Check if list is null and is an instance of String
        boolean isNullListInstanceWithNullCheck2 = (list == null) && (list instanceof List); // Check if list is null and is an instance of List
        boolean isNullArrayListInstanceWithNullCheck3 = (list == null) && (list instanceof ArrayList); // Check if list is null and is an instance of ArrayList
//        boolean isNullStringInstanceWithNullCheck3 = (list == null) && (list instanceof String); // Check if list is null and is an instance of String
        boolean isNullListInstanceWithNullCheck3 = (list == null) && (list instanceof List); // Check if list is null and is an instance of List
        boolean isNullArrayListInstanceWithNullCheck4 = (list == null) && (list instanceof ArrayList); // Check if list is null and is an instance of ArrayList
//        boolean isNullStringInstanceWithNullCheck4 = (list == null) && (list instanceof String); // Check if list is null and is an instance of String
        boolean isNullListInstanceWithNullCheck4 = (list == null) && (list instanceof List); // Check if list is null and is an instance of List
        boolean isNullArrayListInstanceWithNullCheck5 = (list == null) && (list instanceof ArrayList); // Check if list is null and is an instance of ArrayList
//        boolean isNullStringInstanceWithNullCheck5 = (list == null) && (list instanceof String); // Check if list is null and is an

        System.out.println("Is list an instance of List with null check? " + isListInstanceWithNullCheck);
        System.out.println("Is list an instance of ArrayList with null check? " + isArrayListInstanceWithNullCheck);
//        System.out.println("Is list an instance of String with null check? " + isStringInstanceWithNullCheck);
        System.out.println("Is null an instance of List with null check? " + isNullInstanceWithNullCheck);
        System.out.println("Is null an instance of ArrayList with null check? " + isNullArrayListInstanceWithNullCheck);
//        System.out.println("Is null an instance of String with null check? " + isNullStringInstanceWithNullCheck);
        System.out.println("Is null an instance of List with null check? " + isNullListInstanceWithNullCheck);
        System.out.println("Is null an instance of ArrayList with null check? " + isNullArrayListInstanceWithNullCheck2);//       System.out.println("Is null an instance of String with null check? " + isNullStringInstanceWithNullCheck2);
//        System.out.println("Is null an instance of List with null check? " + isNullListInstanceWithNullCheck2);
        System.out.println("Is null an instance of ArrayList with null check? " + isNullArrayListInstanceWithNullCheck3);
//        System.out.println("Is null an instance of String with null check? " + isNullStringInstanceWithNullCheck3);
//        System.out.println("Is null an instance of List with null check? " + isNullListInstanceWithNullCheck3);
        System.out.println("Is null an instance of ArrayList with null check? " + isNullArrayListInstanceWithNullCheck4);
//        System.out.println("Is null an instance of String with null check? " + isNullStringInstanceWithNullCheck4);
//        System.out.println("Is null an instance of List with null check? " + isNullListInstanceWithNullCheck4);
        System.out.println("Is null an instance of ArrayList with null check? " + isNullArrayListInstanceWithNullCheck5);
//        System.out.println("Is null an instance of String with null check? " + isNullStringInstanceWithNullCheck5);
//        System.out.println("Is null an instance of List with null check? " + isNullListInstanceWithNullCheck5);
        // Step 19: Perform instanceof operator with null checks and type casting
        boolean isListInstanceWithNullCheckAndCasting = (list != null) && (list instanceof List); // Check if list is not null and is an instance of List
        boolean isArrayListInstanceWithNullCheckAndCasting = (list != null) && (list instanceof ArrayList); // Check if list is not null and is an instance of ArrayList
//        boolean isStringInstanceWithNullCheckAndCasting = (list != null) && (list instanceof String); // Check if list is not null and is an instance of String
        boolean isNullInstanceWithNullCheckAndCasting = (list == null) && (list instanceof List); // Check if list is null and is an instance of List
        boolean isNullArrayListInstanceWithNullCheckAndCasting = (list == null) && (list instanceof ArrayList); // Check if list is null and is an instance of ArrayList
//        boolean isNullStringInstanceWithNullCheckAndCasting = (list == null) && (list instanceof String); // Check if list is null and is an instance of String
        boolean isNullListInstanceWithNullCheckAndCasting = (list == null) && (list instanceof List); // Check if list is null and is an instance of List
        boolean isNullArrayListInstanceWithNullCheckAndCasting2 = (list  == null) && (list instanceof ArrayList); // Check if list is null

        System.out.println("Is list an instance of List with null check and casting? " + isListInstanceWithNullCheckAndCasting);
        System.out.println("Is list an instance of ArrayList with null check and casting? " + isArrayListInstanceWithNullCheckAndCasting);
//        System.out.println("Is list an instance of String with null check and casting? " + isStringInstanceWithNullCheckAndCasting);
//        System.out.println("Is null an instance of List with null check and casting? " + isNullInstanceWithNullCheckAndCasting);
        System.out.println("Is null an instance of ArrayList with null check and casting? " + isNullArrayListInstanceWithNullCheckAndCasting);
//        System.out.println("Is null an instance of String with null check and casting? " + isNullStringInstanceWithNullCheckAndCasting);
 //       System.out.println("Is null an instance of List with null check and casting? " + isNullListInstanceWithNullCheckAndCasting);
        System.out.println("Is null an instance of ArrayList with null check and casting? " + isNullArrayListInstanceWithNullCheckAndCasting2);
//        System.out.println("Is null an instance of String with null check and casting? " + isNullStringInstanceWithNullCheckAndCasting2);
//        System.out.println("Is null an instance of List with null check and casting? " + isNullListInstanceWithNullCheckAndCasting2);
//        System.out.println("Is null an instance of ArrayList with null check and casting? " + isNullArrayListInstanceWithNullCheckAndCasting3);
//        System.out.println("Is null an instance of String with null check and casting? " + isNullStringInstanceWithNullCheckAndCasting3);
//        System.out.println("Is null an instance of List with null check and casting? " + isNullListInstanceWithNullCheckAndCasting3);
//        System.out.println("Is null an instance of ArrayList with null check and casting? " + isNullArrayListInstanceWithNullCheckAndCasting4);
//        System.out.println("Is null an instance of String with null check and casting? " + isNullStringInstanceWithNullCheckAndCasting4);
//        System.out.println("Is null an instance of List with null check and casting? " + isNullListInstanceWithNullCheckAndCasting4);
//        System.out.println("Is null an instance of ArrayList with null check and casting? " + isNullArrayListInstanceWithNullCheckAndCasting5);
//        System.out.println("Is null an instance of String with null check and casting? " + isNullStringInstanceWithNullCheckAndCasting5);
//        System.out.println("Is null an instance of List with null check and casting? " + isNullListInstanceWithNullCheckAndCasting5);


    }
}
