package factories

import clients.BarClient
import clients.BaseClient
import clients.FooClient

object ClientFactory {
    inline fun <reified T : BaseClient> create() : BaseClient? {

        return when (T::class) {
            BarClient::class -> {
                createMessage<T>()
                return BarClient()
            }

            FooClient::class -> {
                createMessage<T>()
                return FooClient()
            }

            else -> null
        }
    }

    inline fun <reified T : BaseClient> createMessage() {
        System.out.println("Creating ${T::class}")
    }
}