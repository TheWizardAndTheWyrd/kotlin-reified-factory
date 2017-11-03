package clients

class BarClient : BaseClient() {
    override fun contractMethod() {
        System.out.println("Calling ${this::contractMethod}")
    }
}