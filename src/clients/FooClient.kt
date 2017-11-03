package clients

class FooClient : BaseClient() {
    override fun contractMethod() {
        System.out.println("Calling ${this::contractMethod}")
    }
}