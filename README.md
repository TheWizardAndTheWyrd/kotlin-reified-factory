kotlin-reified-factory
======================

Let's use reified generics in `Kotlin` to implement a simple `Factory Method` pattern.

## Class Hierarchy

### BaseClient

Abstract base class.

### FooClient

Implements `BaseClient`.

### BarClient

Implements `BaseClient`.

### ClientFactory

Singleton object with a `::create()` method to create implementations of `BaseClient`.

## Testing

There is a `JUnit` test in `ClientFactoryTest`.